package ru.usachev63.lamatruffle.parser;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlotKind;
import com.oracle.truffle.api.strings.TruffleString;
import ru.usachev63.lamatruffle.LamaLanguage;
import ru.usachev63.lamatruffle.nodes.LamaRootNode;
import ru.usachev63.lamatruffle.nodes.LocalVarRefNode;
import ru.usachev63.lamatruffle.nodes.expr.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Frame {
    public final String functionName;
    public final Frame parent;
    private final Scope parentScope;
    public final FrameDescriptor.Builder frameDescriptorBuilder = FrameDescriptor.newBuilder();
    private int parameterCount = 0;
    private final List<ExprNode> prolog = new ArrayList<>();
    private final Scope topScope = new Scope(null);
    public Scope currentScope = topScope;
    //        private boolean isClosure = false;
//        private ExprNode closureContextReadNode = null;
//        private int capturedVarsNum = 0;
    //private final List<ExprNode> capturedRefNodes = new ArrayList<>();
    private LamaRootNode rootNode = null;

    public Frame(String functionName, Frame parent, Scope parentScope) {
        this.functionName = functionName;
        this.parent = parent;
        this.parentScope = parentScope;
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
        if (scope.variables.containsKey(name))
            throw new RuntimeException(String.format("cannot redefine %s", name));
        int slot = frameDescriptorBuilder.addSlot(FrameSlotKind.Illegal, name, null);
        scope.variables.put(name, new Ref.LocalVarRef(slot));
        return new LocalVarRefNode(slot);
    }

    public LocalVarRefNode createLocalHere(String name) {
        return createLocal(name, currentScope);
    }

//        private void makeClosure() {
//            if (isClosure)
//                return;
//            isClosure = true;
//            closureContextReadNode = new ArgReadNode(parameterCount);
//        }

//        private Ref capture(String name, Ref parentRef, Frame parentFrame) {
//            if (!isClosure)
//                makeClosure();
//            Ref capturedRef = captureImpl(parentRef, parentFrame);
//            var nameAsTruffleStr = TruffleString.fromJavaStringUncached(name, TruffleString.Encoding.US_ASCII);
//            topScope.variables.put(nameAsTruffleStr, capturedRef);
//            return capturedRef;
//        }

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
