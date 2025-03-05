package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.nodes.GlobalRefNode;
import ru.usachev63.lamatruffle.nodes.LocalVarRefNode;
import ru.usachev63.lamatruffle.runtime.LamaArray;
import ru.usachev63.lamatruffle.runtime.LamaContext;
import ru.usachev63.lamatruffle.runtime.LamaSexp;
import ru.usachev63.lamatruffle.runtime.LamaString;

@NodeChild(value = "lhsNode", type = ExprNode.class)
@NodeChild(value = "rhsNode", type = ExprNode.class)
public abstract class IndirectAssnNode extends ExprNode {
    @Specialization
    protected Object assign(VirtualFrame frame, long frameSlot, Object rhs) {
        frame.setObject((int) frameSlot, rhs);
        return rhs;
    }

    @Specialization
    protected Object assign(String globalName, Object rhs) {
        boolean result = LamaContext
            .get(this)
            .getGlobalScopeObject()
            .updateVariable(globalName, rhs);
        if (!result)
            throw new RuntimeException("'" + globalName + "' ain't defined");
        return rhs;
    }

    @Specialization
    protected Object assign(LamaString.ElemDescriptor descriptor, long rhs) {
        descriptor.string().data[(int) descriptor.index()] = (char) rhs;
        return rhs;
    }
    @Specialization
    protected Object assign(LamaArray.ElemDescriptor descriptor, Object rhs) {
        descriptor.array().elements[descriptor.index()] = rhs;
        return rhs;
    }
    @Specialization
    protected Object assign(LamaSexp.ElemDescriptor descriptor, Object rhs) {
        descriptor.sexp().elements[descriptor.index()] = rhs;
        return rhs;
    }
}
