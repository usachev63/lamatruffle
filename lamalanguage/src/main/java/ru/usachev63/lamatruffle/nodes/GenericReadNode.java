package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.nodes.expr.ExprNode;
import ru.usachev63.lamatruffle.runtime.*;

@NodeChild(value = "refNode", type = RefNode.class)
public abstract class GenericReadNode extends ExprNode {
    @Specialization
    @CompilerDirectives.TruffleBoundary
    protected Object read(String globalName) {
        var value = LamaContext
            .get(this)
            .getGlobalScopeObject()
            .getVariable(globalName);
        if (value == null)
            throw new RuntimeException();
        return value;
    }

    @Specialization
    protected Object read(VirtualFrame frame, int localFrameSlot) {
        Object result = frame.getObject(localFrameSlot);
        if (result == null)
            return 0;
        return result;
    }

    @Specialization
    @CompilerDirectives.TruffleBoundary
    protected long read(LamaString.ElemDescriptor descriptor) {
        return descriptor.string().data[(int)descriptor.index()];
    }

    @Specialization
    @CompilerDirectives.TruffleBoundary
    protected Object read(LamaArray.ElemDescriptor descriptor) {
        return descriptor.array().elements[descriptor.index()];
    }

    @Specialization
    @CompilerDirectives.TruffleBoundary
    protected Object read(LamaSexp.ElemDescriptor descriptor) {
        return descriptor.sexp().elements[descriptor.index()];
    }

    @Specialization
    protected Object read(VirtualFrame frame, FunctionRef ref) {
        if (!ref.isClosure())
            return FunctionObject.makeFunction(ref.rootNode);
        Object[] closureVarInits = new Object[ref.closureVarInitNodes.length];
        for (int i = 0; i < ref.closureVarInitNodes.length; ++i)
            closureVarInits[i] = ref.closureVarInitNodes[i].executeGeneric(frame);
        return FunctionObject.makeClosure(ref.rootNode, closureVarInits);
    }
}
