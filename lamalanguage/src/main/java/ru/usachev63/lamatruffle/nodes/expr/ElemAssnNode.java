package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import ru.usachev63.lamatruffle.nodes.ElemRefNode;
import ru.usachev63.lamatruffle.runtime.LamaArray;
import ru.usachev63.lamatruffle.runtime.LamaSexp;
import ru.usachev63.lamatruffle.runtime.LamaString;

@NodeChild(value = "elemRefNode", type = ElemRefNode.class)
@NodeChild(value = "rhsNode", type = ExprNode.class)
public abstract class ElemAssnNode extends ExprNode {
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
