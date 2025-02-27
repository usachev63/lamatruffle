package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;

@NodeChild("leftNode")
@NodeChild("rightNode")
public abstract class AddNode extends ExprNode {
    @Specialization
    protected long doLong(long leftValue, long rightValue) {
        return leftValue + rightValue;
    }
}
