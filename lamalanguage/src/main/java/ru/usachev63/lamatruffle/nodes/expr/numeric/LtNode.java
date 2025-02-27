package ru.usachev63.lamatruffle.nodes.expr.numeric;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import ru.usachev63.lamatruffle.nodes.expr.ExprNode;

@NodeChild("leftNode")
@NodeChild("rightNode")
public abstract class LtNode extends ExprNode {
    @Specialization
    protected long doLong(long leftValue, long rightValue) {
        return leftValue < rightValue ? 1 : 0;
    }
}
