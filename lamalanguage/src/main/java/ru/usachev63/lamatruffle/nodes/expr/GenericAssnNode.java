package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.runtime.LamaArray;
import ru.usachev63.lamatruffle.runtime.LamaContext;
import ru.usachev63.lamatruffle.runtime.LamaSexp;
import ru.usachev63.lamatruffle.runtime.LamaString;

@NodeChild(value = "refNode", type = ExprNode.class)
@NodeChild(value = "valueNode", type = ExprNode.class)
public abstract class GenericAssnNode extends ExprNode {
    @Specialization
    protected Object assn(String globalName, Object value) {
        boolean result = LamaContext
            .get(this)
            .getGlobalScopeObject()
            .updateVariable(globalName, value);
        if (!result)
            throw new RuntimeException("Global '" + globalName + "' ain't defined");
        return value;
    }

    @Specialization
    protected Object assn(VirtualFrame frame, int localFrameSlot, Object value) {
        frame.setObject(localFrameSlot, value);
        return value;
    }

    @Specialization
    protected long assnStringElem(LamaString.ElemDescriptor descriptor, long rhs) {
        descriptor.string().data[(int) descriptor.index()] = (char) rhs;
        return rhs;
    }

    @Specialization
    protected Object assnArrayElem(LamaArray.ElemDescriptor descriptor, Object rhs) {
        descriptor.array().elements[descriptor.index()] = rhs;
        return rhs;
    }

    @Specialization
    protected Object assnSexpElem(LamaSexp.ElemDescriptor descriptor, Object rhs) {
        descriptor.sexp().elements[descriptor.index()] = rhs;
        return rhs;
    }
}
