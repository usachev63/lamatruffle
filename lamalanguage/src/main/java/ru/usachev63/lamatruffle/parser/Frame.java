package ru.usachev63.lamatruffle.parser;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlotKind;
import com.oracle.truffle.api.strings.TruffleString;
import ru.usachev63.lamatruffle.LamaLanguage;
import ru.usachev63.lamatruffle.nodes.LamaRootNode;
import ru.usachev63.lamatruffle.nodes.LocalVarRefNode;
import ru.usachev63.lamatruffle.nodes.expr.*;

import java.util.*;

public class Frame {
    public final String functionName;
    public final Frame parent;
    public final Scope parentScope;
    public final FrameDescriptor.Builder frameDescriptorBuilder = FrameDescriptor.newBuilder();
    private int parameterCount = 0;
    private final List<ExprNode> prolog = new ArrayList<>();
    public final Scope topScope = new Scope(null);
    public Scope currentScope = topScope;
    public LamaRootNode rootNode = null;

    public boolean isClosure = false;
    public ExprNode closureContextReadNode = null;
    public int capturedVarsNum = 0;
    public final Map<Ref, Ref> capturedRefs = new HashMap<>(); // origin to here
    public final Set<Ref> originalRefs = new HashSet<>();
    public record ReferencePoint(Frame contextFrame, Scope contextScope) {}
    public final Set<ReferencePoint> referencedIn = new HashSet<>();

    public Frame(String functionName, Frame parent, Scope parentScope) {
        this.functionName = functionName;
        this.parent = parent;
        this.parentScope = parentScope;
        this.referencedIn.add(new ReferencePoint(this.parent, this.parentScope));
    }

    public boolean isGlobalFrame() {
        return parent == null;
    }

    public boolean isGlobalScope() {
        return isGlobalFrame() && currentScope.outer == null;
    }

    public void addParameter(String name) {
        int parameterIndex = parameterCount++;
        LocalVarRefNode localRefNode = createLocalHere(name);
        var assn = new LocalVarAssnNode(localRefNode, new ArgReadNode(parameterIndex));
        prolog.add(assn);
    }

    public void addVariableDefinition(String name, ExprNode rhs /* maybe null*/) {
        if (isGlobalScope()) {
            var ref = Ref.GlobalRef.createOriginal(this, name);
            originalRefs.add(ref);
            currentScope.originalVariables.put(name, ref);
            currentScope.prolog.add(new GlobalDefNode(name));
            if (rhs != null)
                currentScope.prolog.add(new GlobalAssnNode(name, rhs));
            return;
        }
        LocalVarRefNode localRefNode = createLocalHere(name);
        if (rhs != null) {
            currentScope.prolog.add(
                new LocalVarAssnNode(localRefNode, rhs)
            );
        }
    }

    private LocalVarRefNode createLocal(String name, Scope scope) {
        if (scope.originalVariables.containsKey(name))
            throw new RuntimeException(String.format("cannot redefine %s", name));
        int slot = frameDescriptorBuilder.addSlot(FrameSlotKind.Illegal, name, null);
        var ref = Ref.LocalVarRef.createOriginal(this, scope, slot);
        originalRefs.add(ref);
        scope.originalVariables.put(name, ref);
        return new LocalVarRefNode(slot);
    }

    public LocalVarRefNode createLocalHere(String name) {
        return createLocal(name, currentScope);
    }

    private void makeClosure() {
        if (isClosure)
            return;
        isClosure = true;
        closureContextReadNode = new ArgReadNode(parameterCount);
    }

    public Ref.ClosureRef capture(Ref originRef) {
        if (!isClosure)
            makeClosure();
        int capturedVarIndex = capturedVarsNum++;
        return Ref.ClosureRef.createLowered(originRef, this, capturedVarIndex);
    }

//        private Ref captureImpl(Ref parentRef, Frame parentFrame) {
//            if (parentRef instanceof FunctionRef)
//                return captureFunction((FunctionRef) parentRef, parentFrame);
//            int closureVarIndex = capturedVarsNum++;
//            return new ClosureRef(closureVarIndex);
//        }

//        private FunctionRef captureFunction(FunctionRef parentRef, Frame parentFrame) {
//            if (!parentRef.isClosure())
//                return new FunctionRef(parentRef.rootNode, null);
//            var newCapturedRefs = new ArrayList<Ref>();
//            for (Ref ref : parentRef.capturedRefs)
//                newCapturedRefs.add(captureImpl(ref, parentFrame));
//            return new FunctionRef(parentRef.rootNode, newCapturedRefs);
//        }

    public void buildRootNode(ScopeExprNode body, LamaLanguage language) {
        Collections.reverse(prolog);
        for (var expr : prolog)
            body.setBody(new SeqNode(expr, body.getBody()));
        this.rootNode = new LamaRootNode(
            language,
            frameDescriptorBuilder.build(),
            body,
            TruffleString.fromJavaStringUncached(functionName, TruffleString.Encoding.UTF_8),
            parameterCount
        );
    }

    public FunctionSpawnNode createFunctionSpawnNode() {
//            if (!isClosure)
        return FunctionSpawnNode.createFunction(rootNode);
//            return FunctionSpawnNode.createClosure(rootNode, capturedRefNodes.toArray(new ExprNode[0]));
    }

//        private ExprNode buildNodeOfRef(Ref ref) {
//            if (ref instanceof LocalVarRef localVarRef)
//                return new LocalVarRefNode(localVarRef.frameSlot);
//            if (ref instanceof ClosureRef closureRef) {
//                return ElemRefNodeGen.create(
//                    closureContextReadNode,
//                    new LongLiteralNode(closureRef.capturedVarIndex)
//                );
//            }
//            var functionRef = (FunctionRef) ref;
//            if (!functionRef.isClosure())
//                return FunctionSpawnNode.createFunction(functionRef.rootNode);
//            var capturedRefNodes = new ExprNode[functionRef.capturedRefs.size()];
//            for (int i = 0; i < functionRef.capturedRefs.size(); ++i)
//                capturedRefNodes[i] = buildNodeOfRef(functionRef.capturedRefs.get(i));
//            return FunctionSpawnNode.createClosure(functionRef.rootNode, capturedRefNodes);
//        }
}
