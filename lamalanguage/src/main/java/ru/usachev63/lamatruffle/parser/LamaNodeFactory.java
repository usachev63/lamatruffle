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
        this.source=source;
    }

    public LamaRootNode getMain() {return main;}

    public void createMain(ScopeExprNode body) {
        this.main = new LamaRootNode(language, frameDescriptorBuilder.build(), body, null, TruffleString.fromJavaStringUncached("main", TruffleString.Encoding.UTF_8));
        frameDescriptorBuilder = null;
    }

    private final LamaLanguage language;
    private final Source source;
    private LamaRootNode main;

    /* State while parsing a function. */
    private FrameDescriptor.Builder frameDescriptorBuilder = FrameDescriptor.newBuilder();

    static class Scope {
        protected final Scope outer;
        private final List<AssnNode> initializers = new ArrayList<>();
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

    /* parsing scope begin */

    private Scope currentScope = null;

    public void startScope() {
        currentScope = new Scope(currentScope);
    }

    public int addVarDef(Token varNameToken) {
        TruffleString name = TruffleString.fromJavaStringUncached(varNameToken.getText(), TruffleString.Encoding.US_ASCII);
        if (currentScope.find(name) != null) {
            throw new LamaParseError(source, varNameToken.getLine(), varNameToken.getCharPositionInLine(), 1, String.format("cannot redefine %s", name));
        }
        int slot = frameDescriptorBuilder.addSlot(FrameSlotKind.Illegal, name, null);
        currentScope.locals.put(name, slot);
        return slot;
    }

    public void addVarInitializer(int frameSlot, ExprNode value) {
        currentScope.initializers.add(new AssnNode(new LocalVarRefNode(frameSlot), value));
    }

    public ScopeExprNode finishScope(ExprNode body, boolean popScope) {
        if (body == null)
            body = new SkipNode();
        Collections.reverse(currentScope.initializers);
        for (AssnNode init : currentScope.initializers) {
            body = new SeqNode(init, body);
        }
        ScopeExprNode result = new ScopeExprNode(null, body);
        if (popScope)
          popScope();
        return result;
    }

    public void popScope() {
        assert currentScope != null;
        currentScope = currentScope.outer;
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
                return new LongLiteralNode((int)innerText.charAt(0));
            }
        }
    }

    public LocalVarRefNode createLocalVarRef(Token varNameToken) {
        String varName = varNameToken.getText();
        Integer frameSlot = currentScope.find(TruffleString.fromJavaStringUncached(varName, TruffleString.Encoding.US_ASCII));
        if (frameSlot == null) {
            throw new LamaParseError(source, varNameToken.getLine(), varNameToken.getCharPositionInLine(), 1, String.format("failed to resolve %s", varName));
        }
        return new LocalVarRefNode(frameSlot);
    }

    public AssnNode createAssn(ExprNode lhs, ExprNode rhs) {
        return new AssnNode((LocalVarRefNode) lhs, rhs);
    }

    public VarReadNode createVarRead(LocalVarRefNode var) {
        return new VarReadNode(var);
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
