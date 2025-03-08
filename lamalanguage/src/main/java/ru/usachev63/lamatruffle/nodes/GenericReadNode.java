package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.nodes.expr.ExprNode;
import ru.usachev63.lamatruffle.runtime.LamaArray;
import ru.usachev63.lamatruffle.runtime.LamaContext;
import ru.usachev63.lamatruffle.runtime.LamaSexp;
import ru.usachev63.lamatruffle.runtime.LamaString;

@NodeChild(value = "refNode", type = RefNode.class)
public abstract class GenericReadNode extends ExprNode {
    @Specialization
    protected Object read(String globalName) {
        var value = LamaContext
            .get(this)
            .getGlobalScopeObject()
            .getVariable(globalName);
        if (value == null)
            throw new RuntimeException("Global '" + globalName + "' ain't defined");
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
    protected long read(LamaString.ElemDescriptor descriptor) {
        return descriptor.string().data[(int)descriptor.index()];
    }

    @Specialization
    protected Object read(LamaArray.ElemDescriptor descriptor) {
        return descriptor.array().elements[descriptor.index()];
    }

    @Specialization
    protected Object read(LamaSexp.ElemDescriptor descriptor) {
        return descriptor.sexp().elements[descriptor.index()];
    }
}
