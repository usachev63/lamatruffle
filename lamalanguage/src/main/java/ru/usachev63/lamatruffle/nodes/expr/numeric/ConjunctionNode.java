package ru.usachev63.lamatruffle.nodes.expr.numeric;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import ru.usachev63.lamatruffle.nodes.expr.ExprNode;

@NodeChild("leftNode")
@NodeChild("rightNode")
public abstract class ConjunctionNode extends ExprNode {
    @Specialization
    protected long doLong(long leftValue, long rightValue) {
        return leftValue != 0 && rightValue != 0 ? 1 : 0;
    }
}
