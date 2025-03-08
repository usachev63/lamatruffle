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
import ru.usachev63.lamatruffle.nodes.pattern.*;

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

    private static class Frame {
        private final String functionName;
        private final Frame parent;
        private final FrameDescriptor.Builder frameDescriptorBuilder = FrameDescriptor.newBuilder();
        private int parameterCount = 0;
        private final List<ExprNode> prolog = new ArrayList<>();
        private final Scope topScope = new Scope(null);
        private Scope currentScope = topScope;

        private Frame(String functionName, Frame parent) {
            this.functionName = functionName;
            this.parent = parent;
        }

        private boolean isGlobal() {
            return parent == null;
        }

//        private boolean isClosure() {
//            return !closureBinds.isEmpty();
//        }

        private LocalVarRefNode createLocal(String name, Scope scope) {
            var nameTruffleStr = TruffleString.fromJavaStringUncached(name, TruffleString.Encoding.US_ASCII);
            if (scope.locals.containsKey(name))
                throw new RuntimeException(String.format("cannot redefine %s", name));
            int slot = frameDescriptorBuilder.addSlot(FrameSlotKind.Illegal, name, null);
            var refNode = new LocalVarRefNode(slot);
            scope.locals.put(nameTruffleStr, refNode);
            return refNode;
        }

        private LocalVarRefNode createLocalHere(String name) {
            return createLocal(name, currentScope);
        }
    }

    static class Scope {
        private final Scope outer;
        private final List<ExprNode> prolog = new ArrayList<>();
        private final Map<TruffleString, RefNode> locals = new HashMap<>();

        private Scope(Scope outer) {
            this.outer = outer;
        }

        private RefNode find(TruffleString name) {
            var result = locals.get(name);
            if (result != null)
                return result;
            if (outer != null)
                return outer.find(name);
            return null;
        }
    }

    Frame frame = new Frame("main", null);

    public boolean isGlobalScope() {
        return frame.isGlobal() && frame.currentScope.outer == null;
    }

    public void startFrame(Token lident) {
        frame = new Frame(lident.getText(), frame);
    }

    private int anonFunctionCount = 1;
    public void startAnonFrame() { frame = new Frame("anon" + (anonFunctionCount++), frame); }

    public void addFormalParameter(Token lident) {
        int parameterIndex = frame.parameterCount++;
        LocalVarRefNode localRefNode = frame.createLocalHere(lident.getText());
        ExprNode assn = createAssn(localRefNode, new ArgReadNode(parameterIndex));
        frame.prolog.add(assn);
    }

    public void finishFuncDecl(ScopeExprNode body) {
        var frameAndRootNode = finishFrame(body);
        var frame = frameAndRootNode.frame;
        var rootNode = frameAndRootNode.rootNode;
        this.frame.currentScope.prolog.add(new FuncDeclNode(frame.functionName, frame.parameterCount, rootNode));
    }

    public ExprNode finishAnonFunction(ScopeExprNode body) {
        var frameAndRootNode = finishFrame(body);
        return new AnonFunctionNode(frameAndRootNode.frame.parameterCount, frameAndRootNode.rootNode);
    }

    private record FrameAndRootNode(Frame frame, LamaRootNode rootNode) {}

    private FrameAndRootNode finishFrame(ScopeExprNode body) {
        assert frame != null;
        Collections.reverse(frame.prolog);
        for (var expr : frame.prolog) {
            body.setBody(new SeqNode(expr, body.getBody()));
        }
        var rootNode = new LamaRootNode(
            language,
            frame.frameDescriptorBuilder.build(),
            body,
            null,
            TruffleString.fromJavaStringUncached(frame.functionName, TruffleString.Encoding.UTF_8)
        );
        var result = new FrameAndRootNode(frame, rootNode);
        frame = frame.parent;
        return result;
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
            LocalVarRefNode localRefNode = frame.createLocalHere(lident.getText());
            if (rhs != null) {
                frame.currentScope.prolog.add(
                    new LocalVarAssnNode(localRefNode, rhs)
                );
            }
        }
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
        ScopeExprNode result = new ScopeExprNode(body);
        if (popScope)
            popScope();
        return result;
    }

    public void popScope() {
        assert frame.currentScope != null;
        frame.currentScope = frame.currentScope.outer;
    }

    /* parsing scope end */

    public CallExprNode createCallExpr(ExprNode calleeNode, List<ExprNode> argumentNodes) {
        return new CallExprNode(calleeNode, argumentNodes);
    }

    public StringLiteralNode createStringLiteral(Token literalToken) {
        return new StringLiteralNode(stringLiteralValueOf(literalToken.getText()));
    }

    private String stringLiteralValueOf(String rawText) {
        assert rawText.length() >= 2;
        return rawText.substring(1, rawText.length() - 1).replaceAll("\"\"", "\"");
    }

    private int evaluateCharLiteral(Token literalToken) {
        String tokenText = literalToken.getText();
        assert tokenText.length() >= 3;
        assert tokenText.charAt(0) == '\'';
        assert tokenText.charAt(literalToken.getText().length() - 1) == '\'';
        String innerText = tokenText.substring(1, tokenText.length() - 1);
        switch (innerText) {
            case "''" -> {
                return '\'';
            }
            case "\\n" -> {
                return '\n';
            }
            case "\\t" -> {
                return '\t';
            }
            default -> {
                assert innerText.length() == 1;
                return innerText.charAt(0);
            }
        }

    }

    public LongLiteralNode createCharLiteral(Token literalToken) {
        return new LongLiteralNode(evaluateCharLiteral(literalToken));
    }

    public RefNode resolveRef(Token lident) {
        String varName = lident.getText();
        var varNameTruffleStr = TruffleString.fromJavaStringUncached(varName, TruffleString.Encoding.US_ASCII);
        RefNode origin = null;
        var frameStack = new ArrayList<Frame>();
        Frame originFrame = frame;
        while (originFrame != null) {
            frameStack.add(originFrame);
            RefNode ref = frame.currentScope.find(varNameTruffleStr);
            if (ref != null) {
                origin = ref;
                break;
            }
            originFrame = originFrame.parent;
        }
        if (originFrame == null)
            return new GlobalRefNode(varName);
        if (originFrame == frame)
            return origin;
        Collections.reverse(frameStack);
        RefNode current = origin;
        for (int i = 0; i < frameStack.size() - 1; ++i) {
            var currentFrame = frameStack.get(i + 1);
            RefNode newFrameSlot = currentFrame.createLocal(varName, currentFrame.topScope);
            current = newFrameSlot;
        }
        return current;
    }

    public ElemRefNode createElemRef(ExprNode base, ExprNode index) {
        return ElemRefNodeGen.create(base, index);
    }

    public ExprNode createAssn(ExprNode lhs, ExprNode rhs) {
        if (lhs instanceof GlobalRefNode globalRefNode)
            return new GlobalAssnNode(globalRefNode.getName(), rhs);
        if (lhs instanceof LocalVarRefNode localVarRefNode)
            return new LocalVarAssnNode(localVarRefNode, rhs);
        if (lhs instanceof ElemRefNode elemRefNode)
            return ElemAssnNodeGen.create(elemRefNode, rhs);
        return IndirectAssnNodeGen.create(lhs, rhs);
    }

    public ExprNode createRead(ExprNode refNode) {
        if (refNode instanceof GlobalRefNode globalRefNode)
            return new GlobalReadNode(globalRefNode.getName());
        if (refNode instanceof LocalVarRefNode localVarRefNode)
            return new LocalVarReadNode(localVarRefNode);
        throw new IllegalStateException("wrong refNode in createVarRead");
    }

    public ElemReadNode createElemRead(ExprNode container, ExprNode index) {
        return ElemReadNodeGen.create(createElemRef(container, index));
    }

    public SexpNode createCons(ExprNode lhs, ExprNode rhs) {
        return new SexpNode("Cons", new ExprNode[]{lhs, rhs});
    }

    public ExprNode createBinary(Token opToken, ExprNode lhs, ExprNode rhs) {
        return switch (opToken.getText()) {
            case "!!" -> DisjunctionNodeGen.create(lhs, rhs);
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

    public ArrayExprNode createArrayExpr(List<ExprNode> elements) {
        return new ArrayExprNode(elements.toArray(new ExprNode[0]));
    }

    public ExprNode createListExpr(List<ExprNode> elements) {
        ExprNode result = new LongLiteralNode(0);
        Collections.reverse(elements);
        for (ExprNode element : elements)
            result = new SexpNode("Cons", new ExprNode[]{element, result});
        return result;
    }

    public SexpNode createSexp(Token uidentToken, List<ExprNode> elementNodes) {
        return new SexpNode(uidentToken.getText(), elementNodes.toArray(new ExprNode[0]));
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

    public CaseNode createCase(ExprNode scrutineeNode, List<CaseNode.Branch> branches) {
        return new CaseNode(scrutineeNode, branches.toArray(new CaseNode.Branch[0]));
    }

    public SexpPatternNode createConsPattern(PatternNode head, PatternNode tail) {
        return new SexpPatternNode("Cons", new PatternNode[]{head, tail});
    }

    public SexpPatternNode createSexpPattern(Token uident, List<PatternNode> subpatterns) {
        return new SexpPatternNode(uident.getText(), subpatterns.toArray(new PatternNode[0]));
    }

    public ArrayPatternNode createArrayPattern(List<PatternNode> subpatterns) {
        return new ArrayPatternNode(subpatterns.toArray(new PatternNode[0]));
    }

    public PatternNode createListPattern(List<PatternNode> subpatterns) {
        PatternNode result = new LongLiteralPatternNode(0);
        Collections.reverse(subpatterns);
        for (PatternNode subpattern : subpatterns)
            result = new SexpPatternNode("Cons", new PatternNode[]{subpattern, result});
        return result;
    }

    public BindingPatternNode createBindingPattern(Token lident, PatternNode subpattern) {
        LocalVarRefNode local = frame.createLocalHere(lident.getText());
        return new BindingPatternNode(local.getFrameSlot(), subpattern);
    }

    public LongLiteralPatternNode createCharLiteralPattern(Token literalToken) {
        return new LongLiteralPatternNode(evaluateCharLiteral(literalToken));
    }

    public StringLiteralPatternNode createStringLiteralPattern(Token literalToken) {
        return new StringLiteralPatternNode(stringLiteralValueOf(literalToken.getText()));
    }
}
