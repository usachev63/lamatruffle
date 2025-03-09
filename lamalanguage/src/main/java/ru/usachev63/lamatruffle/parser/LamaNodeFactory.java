package ru.usachev63.lamatruffle.parser;

import com.oracle.truffle.api.strings.TruffleString;
import org.antlr.v4.runtime.Token;
import ru.usachev63.lamatruffle.LamaLanguage;
import ru.usachev63.lamatruffle.nodes.*;
import ru.usachev63.lamatruffle.nodes.expr.*;
import ru.usachev63.lamatruffle.nodes.expr.numeric.*;
import ru.usachev63.lamatruffle.nodes.pattern.*;

import java.util.*;

public class LamaNodeFactory {
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
    private final Resolver resolver = new Resolver();
    private LamaRootNode main;
    private Frame frame = new Frame("main", null, null);

    public LamaNodeFactory(LamaLanguage language) {
        this.language = language;
        for (String name : language.builtinNames) {
            var ref = Ref.GlobalRef.createOriginal(frame, name);
            frame.originalRefs.add(ref);
            frame.currentScope.originalVariables.put(name, ref);
        }
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
        frame.addParameter(lident.getText());
    }

    public void finishFuncDecl(ScopeExprNode body) {
        var lastFrame = popFrame();
        lastFrame.buildRootNode(body, language);
        if (frame.isGlobalScope()) {
            var node = new UnresolvedFunctionSpawnNode();
            resolver.addResolveFunctionSpawnRequest(node, lastFrame, frame);
            frame.currentScope.originalVariables.put(
                lastFrame.functionName,
                Ref.GlobalRef.createOriginal(frame, lastFrame.functionName)
            );
            frame.currentScope.prolog.add(new GlobalDefNode(lastFrame.functionName));
            frame.currentScope.prolog.add(
                new GlobalAssnNode(lastFrame.functionName, node)
            );
        } else {
            var functionRef = Ref.FunctionRef.createOriginal(frame, frame.currentScope, lastFrame);
            frame.currentScope.originalVariables.put(lastFrame.functionName, functionRef);
        }
    }

    public ExprNode finishAnonFunction(ScopeExprNode body) {
        var lastFrame = popFrame();
        lastFrame.buildRootNode(body, language);
        var node = new UnresolvedFunctionSpawnNode();
        resolver.addResolveFunctionSpawnRequest(node, lastFrame, frame);
        return node;
    }

    /* parsing scope begin */

    public void startScope() {
        frame.currentScope = new Scope(frame.currentScope);
    }

    public void onVariableDefinition(Token lident, ExprNode rhs /*maybe null*/) {
        String name = lident.getText();
        frame.addVariableDefinition(name, rhs);
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
        return StringLiteralNodeGen.create(stringLiteralValueOf(literalToken.getText()));
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
        resolver.addResolveNameRequest(node, frame, frame.currentScope);
        return node;
    }

    public ElemRefNode createElemRef(ExprNode base, ExprNode index) {
        return ElemRefNodeGen.create(base, index);
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

    public void resolveAll() {
        resolver.resolveAll();
    }
}
