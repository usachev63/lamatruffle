package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import ru.usachev63.lamatruffle.nodes.ElemRefNode;
import ru.usachev63.lamatruffle.runtime.LamaString;

@NodeChild(value = "elemRefNode", type = ElemRefNode.class)
@NodeChild(value = "rhsNode", type = ExprNode.class)
public abstract class ElemAssnNode extends ExprNode {
    @Specialization
    protected long assnStringElem(LamaString.ElemDescriptor descriptor, long rhs) {
        descriptor.string().set((int)descriptor.index(), rhs);
        return rhs;
    }
}
