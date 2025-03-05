package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import ru.usachev63.lamatruffle.nodes.expr.ExprNode;
import ru.usachev63.lamatruffle.runtime.LamaArray;
import ru.usachev63.lamatruffle.runtime.LamaSexp;
import ru.usachev63.lamatruffle.runtime.LamaString;

@NodeChild(value = "container", type = ExprNode.class)
@NodeChild(value = "index", type = ExprNode.class)
public abstract class ElemRefNode extends ExprNode {
    @Specialization
    protected LamaString.ElemDescriptor stringElem(LamaString container, long index) {
        return new LamaString.ElemDescriptor(container, index);
    }

    @Specialization
    protected LamaArray.ElemDescriptor arrayElem(LamaArray container, long index) {
        return new LamaArray.ElemDescriptor(container, (int) index);
    }

    @Specialization
    protected LamaSexp.ElemDescriptor sexpElem(LamaSexp container, long index) {
        return new LamaSexp.ElemDescriptor(container, (int) index);
    }
}
