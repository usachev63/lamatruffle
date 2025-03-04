package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import ru.usachev63.lamatruffle.nodes.ElemRefNode;
import ru.usachev63.lamatruffle.runtime.LamaString;

@NodeChild(value = "elemRefNode", type = ElemRefNode.class)
public abstract class ElemReadNode extends ExprNode {
    @Specialization
    protected long readStringElem(LamaString.ElemDescriptor descriptor) {
        return descriptor.string().get((int)descriptor.index());
    }
}
