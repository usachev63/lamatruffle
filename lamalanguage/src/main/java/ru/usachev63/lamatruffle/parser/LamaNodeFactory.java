package ru.usachev63.lamatruffle.parser;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlotKind;
import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.api.strings.TruffleString;
import org.antlr.v4.runtime.Token;
import ru.usachev63.lamatruffle.LamaLanguage;
import ru.usachev63.lamatruffle.nodes.*;
import ru.usachev63.lamatruffle.nodes.expr.*;
import ru.usachev63.lamatruffle.nodes.expr.numeric.*;

import java.util.*;

public class LamaNodeFactory {
    public LamaNodeFactory(LamaLanguage language, Source source) {
        this.language = language;
        this.source = source;
    }

    public LamaRootNode getMain() {
        return main;
    }

    public void createMain(ScopeExprNode body) {
        this.main = new LamaRootNode(language, frame.frameDescriptorBuilder.build(), body, null, TruffleString.fromJavaStringUncached("main", TruffleString.Encoding.UTF_8));
        frame = null;
    }

    private final LamaLanguage language;
    private final Source source;
    private LamaRootNode main;
    private final Map<TruffleString, LamaRootNode> allFunctions = new HashMap<>();

    static class Frame {
        protected final String functionName;
        protected final Frame parent;
        protected FrameDescriptor.Builder frameDescriptorBuilder = FrameDescriptor.newBuilder();
        protected int parameterCount = 0;
        protected final List<ExprNode> prolog = new ArrayList<>();
        protected Scope currentScope = null;

        Frame(String functionName, Frame parent) {
            this.functionName = functionName;
            this.parent = parent;
        }

        public boolean isGlobal() {
            return parent == null;
        }
    }

    static class Scope {
        protected final Scope outer;
        private final List<ExprNode> prolog = new ArrayList<>();
        protected final Map<TruffleString, Integer> locals = new HashMap<>();

        Scope(Scope outer) {
            this.outer = outer;
        }

        public Integer find(TruffleString name) {
            Integer result = locals.get(name);
            if (result != null) {
                return result;
            } else if (outer != null) {
                return outer.find(name);
            } else {
                return null;
            }
        }
    }

    Frame frame = new Frame("main", null);

    public boolean isGlobalScope() {
        return frame.isGlobal() && frame.currentScope.outer == null;
    }

    public void startFrame(Token lident) {
        frame = new Frame(lident.getText(), frame);
    }

    public void addFormalParameter(Token lident) {
        int parameterIndex = frame.parameterCount++;
        int frameSlot = addLocalVarDef(lident);
        ExprNode assn = createAssn(
            new LocalVarRefNode(frameSlot),
            new ArgReadNode(parameterIndex)
        );
        frame.prolog.add(assn);
    }

    public void finishFrame(ScopeExprNode body) {
        assert frame != null;
        TruffleString name = TruffleString.fromJavaStringUncached(frame.functionName, TruffleString.Encoding.UTF_8);
        if (allFunctions.containsKey(name)) {
            throw new RuntimeException("multiple definition");
        }
        Collections.reverse(frame.prolog);
        for (var expr : frame.prolog) {
            body.setBody(new SeqNode(expr, body.getBody()));
        }
        var rootNode = new LamaRootNode(
            language,
            frame.frameDescriptorBuilder.build(),
            body,
            null,
            name
        );
        allFunctions.put(name, rootNode);
        frame = frame.parent;
    }

    /* parsing scope begin */

    public void startScope() {
        frame.currentScope = new Scope(frame.currentScope);
    }

    public void onVariableDefinition(Token lident, ExprNode rhs /*maybe null*/) {
        String name = lident.getText();
        if (isGlobalScope()) {
            frame.currentScope.prolog.add(new GlobalDefNode(name));
            if (rhs != null)
              frame.currentScope.prolog.add(new GlobalAssnNode(name, rhs));
        } else {
            int frameSlot = addLocalVarDef(lident);
            if (rhs != null)
              addLocalVarInitializer(frameSlot, rhs);
        }
    }

    private int addLocalVarDef(Token varNameToken) {
        TruffleString name = TruffleString.fromJavaStringUncached(varNameToken.getText(), TruffleString.Encoding.US_ASCII);
        if (frame.currentScope.find(name) != null)
            throw new LamaParseError(source, varNameToken.getLine(), varNameToken.getCharPositionInLine(), 1, String.format("cannot redefine %s", name));
        int slot = frame.frameDescriptorBuilder.addSlot(FrameSlotKind.Illegal, name, null);
        frame.currentScope.locals.put(name, slot);
        return slot;
    }

    private void addLocalVarInitializer(int frameSlot, ExprNode value) {
        frame.currentScope.prolog.add(new LocalVarAssnNode(new LocalVarRefNode(frameSlot), value));
    }

    public ScopeExprNode finishScope(ExprNode body, boolean popScope) {
        if (body == null)
            body = new SkipNode();
        Collections.reverse(frame.currentScope.prolog);
        for (var expr : frame.currentScope.prolog)
            body = new SeqNode(expr, body);
        ScopeExprNode result = new ScopeExprNode(null, body);
        if (popScope)
            popScope();
        return result;
    }

    public void popScope() {
        assert frame.currentScope != null;
        frame.currentScope = frame.currentScope.outer;
    }

    /* parsing scope end */

    public StringLiteralNode createStringLiteral(Token literalToken) {
        return new StringLiteralNode(TruffleString.fromJavaStringUncached(stringLiteralValueOf(literalToken.getText()), TruffleString.Encoding.US_ASCII));
    }

    private String stringLiteralValueOf(String rawText) {
        assert rawText.length() >= 2;
        return rawText.substring(1, rawText.length() - 1).replaceAll("\"\"", "\"");
    }

    public LongLiteralNode createCharLiteral(Token literalToken) {
        String tokenText = literalToken.getText();
        assert tokenText.length() >= 3;
        assert tokenText.charAt(0) == '\'';
        assert tokenText.charAt(literalToken.getText().length() - 1) == '\'';
        String innerText = tokenText.substring(1, tokenText.length() - 1);
        switch (innerText) {
            case "''" -> {
                return new LongLiteralNode((int) '\'');
            }
            case "\\n" -> {
                return new LongLiteralNode((int) '\n');
            }
            case "\\t" -> {
                return new LongLiteralNode((int) '\t');
            }
            default -> {
                assert innerText.length() == 1;
                return new LongLiteralNode((int) innerText.charAt(0));
            }
        }
    }

    public ExprNode createVarRef(Token lident) {
        String varName = lident.getText();
        Integer frameSlot = frame.currentScope.find(TruffleString.fromJavaStringUncached(varName, TruffleString.Encoding.US_ASCII));
        if (frameSlot == null) {
            return new GlobalRefNode(varName);
        } else {
            return new LocalVarRefNode(frameSlot);
        }
    }

    public ExprNode createAssn(ExprNode lhs, ExprNode rhs) {
        if (lhs instanceof GlobalRefNode globalRefNode)
            return new GlobalAssnNode(globalRefNode.getName(), rhs);
        if (lhs instanceof LocalVarRefNode localVarRefNode)
            return new LocalVarAssnNode(localVarRefNode, rhs);
        throw new IllegalStateException("wrong lhs in createAssn");
    }

    public ExprNode createVarRead(ExprNode refNode) {
        if (refNode instanceof GlobalRefNode globalRefNode)
            return new GlobalReadNode(globalRefNode.getName());
        if (refNode instanceof LocalVarRefNode localVarRefNode)
            return new LocalVarReadNode(localVarRefNode);
        throw new IllegalStateException("wrong refNode in createVarRead");
    }

    public ExprNode createBinary(Token opToken, ExprNode lhs, ExprNode rhs) {
        return switch (opToken.getText()) {
            case "&&" -> ConjunctionNodeGen.create(lhs, rhs);
            case "==" -> EqNodeGen.create(lhs, rhs);
            case "!=" -> NeqNodeGen.create(lhs, rhs);
            case "<=" -> LeqNodeGen.create(lhs, rhs);
            case "<" -> LtNodeGen.create(lhs, rhs);
            case ">=" -> GeqNodeGen.create(lhs, rhs);
            case ">" -> GtNodeGen.create(lhs, rhs);
            case "+" -> AddNodeGen.create(lhs, rhs);
            case "-" -> SubNodeGen.create(lhs, rhs);
            case "*" -> MulNodeGen.create(lhs, rhs);
            case "/" -> DivNodeGen.create(lhs, rhs);
            case "%" -> RemNodeGen.create(lhs, rhs);
            default -> throw new IllegalStateException();
        };
    }

    public ExprNode createWhile(ExprNode conditionNode, ExprNode bodyNode) {
        return new WhileNode(conditionNode, bodyNode);
    }

    public ExprNode createIf(List<LamaLanguageParser.IfThenEntry> ifThenEntries, ExprNode elseNode) {
        ExprNode currentNode = elseNode;
        Collections.reverse(ifThenEntries);
        assert !ifThenEntries.isEmpty();
        for (var ifThenEntry : ifThenEntries) {
            currentNode = new IfNode(ifThenEntry.conditionNode, ifThenEntry.bodyNode, currentNode);
        }
        return currentNode;
    }
}
