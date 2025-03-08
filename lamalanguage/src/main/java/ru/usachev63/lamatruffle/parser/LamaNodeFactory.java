package ru.usachev63.lamatruffle.parser;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlotKind;
import com.oracle.truffle.api.strings.TruffleString;
import org.antlr.v4.runtime.Token;
import ru.usachev63.lamatruffle.LamaLanguage;
import ru.usachev63.lamatruffle.nodes.*;
import ru.usachev63.lamatruffle.nodes.expr.*;
import ru.usachev63.lamatruffle.nodes.expr.numeric.*;
import ru.usachev63.lamatruffle.nodes.pattern.*;

import java.util.*;

public class LamaNodeFactory {
    public LamaNodeFactory(LamaLanguage language) {
        this.language = language;
    }

    public LamaRootNode getMain() {
        return main;
    }

    public void createMain(ScopeExprNode body) {
        this.main = new LamaRootNode(
            language,
            frame.frameDescriptorBuilder.build(),
            body,
            TruffleString.fromJavaStringUncached("main", TruffleString.Encoding.UTF_8),
            0
        );
        frame = null;
    }

    private final LamaLanguage language;
    private LamaRootNode main;

    private static class Frame {
        private final String functionName;
        private final Frame parent;
        private final Scope parentScope;
        private final FrameDescriptor.Builder frameDescriptorBuilder = FrameDescriptor.newBuilder();
        private int parameterCount = 0;
        private final List<ExprNode> prolog = new ArrayList<>();
        private final Scope topScope = new Scope(null);
        private Scope currentScope = topScope;
        private boolean isClosure = false;
        private ExprNode closureContextReadNode = null;
        private int closureVarNum = 0;
        private final FunctionRefNode thisRefNode = new FunctionRefNode();

        private Frame(String functionName, Frame parent, Scope parentScope) {
            this.functionName = functionName;
            this.parent = parent;
            this.parentScope = parentScope;
        }

        private boolean isGlobal() {
            return parent == null;
        }

        private LocalVarRefNode createLocal(String name, Scope scope) {
            var nameTruffleStr = TruffleString.fromJavaStringUncached(name, TruffleString.Encoding.US_ASCII);
            if (scope.variables.containsKey(nameTruffleStr))
                throw new RuntimeException(String.format("cannot redefine %s", name));
            int slot = frameDescriptorBuilder.addSlot(FrameSlotKind.Illegal, name, null);
            var refNode = new LocalVarRefNode(slot);
            scope.variables.put(nameTruffleStr, refNode);
            return refNode;
        }

        private LocalVarRefNode createLocalHere(String name) {
            return createLocal(name, currentScope);
        }

        private void makeClosure() {
            if (isClosure)
                return;
            isClosure = true;
            closureContextReadNode = new ArgReadNode(parameterCount);
        }

        private ElemRefNode createClosureVar(String name, ExprNode origin) {
            if (!isClosure)
                makeClosure();
            int closureVarIndex = closureVarNum++;
            this.thisRefNode.closureVarInitNodes.add(origin);
            var closureVarRef = ElemRefNodeGen.create(
                closureContextReadNode,
                new LongLiteralNode(closureVarIndex)
            );
            var nameAsTruffleStr = TruffleString.fromJavaStringUncached(name, TruffleString.Encoding.US_ASCII);
            topScope.variables.put(nameAsTruffleStr, closureVarRef);
            return closureVarRef;
        }

        private void buildRootNode(ScopeExprNode body, LamaLanguage language) {
            Collections.reverse(prolog);
            for (var expr : prolog)
                body.setBody(new SeqNode(expr, body.getBody()));
            thisRefNode.rootNode = new LamaRootNode(
                language,
                frameDescriptorBuilder.build(),
                body,
                TruffleString.fromJavaStringUncached(functionName, TruffleString.Encoding.UTF_8),
                parameterCount
            );
            thisRefNode.rootNode.adoptChildren();
        }
    }

    static class Scope {
        private final Scope outer;
        private final List<ExprNode> prolog = new ArrayList<>();
        private final Map<TruffleString, RefNode> variables = new HashMap<>();

        private Scope(Scope outer) {
            this.outer = outer;
        }

        private RefNode find(TruffleString name) {
            var result = variables.get(name);
            if (result != null)
                return result;
            if (outer != null)
                return outer.find(name);
            return null;
        }
    }

    private record UnresolvedRef(UnresolvedRefNode node, Frame frame, Scope scope) {}
    private final List<UnresolvedRef> unresolvedRefs = new ArrayList<>();
    private Frame frame = new Frame("main", null, null);

    public boolean isGlobalScope() {
        return frame.isGlobal() && frame.currentScope.outer == null;
    }

    public void startFrame(Token lident) {
        frame = new Frame(lident.getText(), frame, frame.currentScope);
    }

    private Frame popFrame() {
        var result = frame;
        frame = frame.parent;
        return result;
    }

    private int anonFunctionCount = 1;

    public void startAnonFrame() {
        frame = new Frame("anon" + (anonFunctionCount++), frame, frame.currentScope);
    }

    public void addFormalParameter(Token lident) {
        int parameterIndex = frame.parameterCount++;
        LocalVarRefNode localRefNode = frame.createLocalHere(lident.getText());
        ExprNode assn = createAssn(localRefNode, new ArgReadNode(parameterIndex));
        frame.prolog.add(assn);
    }

    public void finishFuncDecl(ScopeExprNode body) {
        var lastFrame = popFrame();
        lastFrame.buildRootNode(body, language);
        var nameAsTruffleStr = TruffleString.fromJavaStringUncached(lastFrame.functionName, TruffleString.Encoding.US_ASCII);
        var functionRefNode = lastFrame.thisRefNode;
        if (isGlobalScope()) {
            frame.currentScope.prolog.add(new GlobalDefNode(lastFrame.functionName));
            frame.currentScope.prolog.add(new GlobalAssnNode(lastFrame.functionName, FunctionSpawnNodeGen.create(functionRefNode)));
        } else {
            frame.currentScope.variables.put(nameAsTruffleStr, functionRefNode);
        }
    }

    public ExprNode finishAnonFunction(ScopeExprNode body) {
        var lastFrame = popFrame();
        lastFrame.buildRootNode(body, language);
        FunctionRefNode refNode = lastFrame.thisRefNode;
        return FunctionSpawnNodeGen.create(refNode);
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

    public UnresolvedRefNode createUnresolvedRef(Token lident) {
        var node = new UnresolvedRefNode(lident.getText());
        unresolvedRefs.add(new UnresolvedRef(node, frame, frame.currentScope));
        return node;
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
        if (refNode instanceof ElemRefNode elemRefNode)
            return ElemReadNodeGen.create(elemRefNode);
        if (refNode instanceof FunctionRefNode functionRefNode)
            return refNode;
        throw new IllegalStateException("wrong refNode in createRead");
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

    public void resolveAllRefs() {
        for (UnresolvedRef unresolvedRef : unresolvedRefs) {
            RefNode resolvedRefNode = resolveRef(unresolvedRef);
            unresolvedRef.node.replace(resolvedRefNode);
        }
    }

    private RefNode resolveRef(UnresolvedRef unresolvedRef) {
        String varName = unresolvedRef.node.lident;
        var varNameTruffleStr = TruffleString.fromJavaStringUncached(varName, TruffleString.Encoding.US_ASCII);
        RefNode origin = null;
        var frameStack = new ArrayList<Frame>();
        Frame originFrame = unresolvedRef.frame;
        Scope originScope = unresolvedRef.scope;
        while (originFrame != null) {
            frameStack.add(originFrame);
            RefNode ref = originScope.find(varNameTruffleStr);
            if (ref != null) {
                origin = ref;
                break;
            }
            originScope = originFrame.parentScope;
            originFrame = originFrame.parent;
        }
        if (originFrame == null)
            return new GlobalRefNode(varName);
        if (originFrame == unresolvedRef.frame)
            return origin;
        Collections.reverse(frameStack);
        RefNode current = origin;
        for (int i = 0; i < frameStack.size() - 1; ++i) {
            var currentFrame = frameStack.get(i + 1);
            current = currentFrame.createClosureVar(
                varName,
                createRead(current)
            );
        }
        return current;
    }
}
