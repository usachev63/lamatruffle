package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;

@NodeChild("leftNode")
@NodeChild("rightNode")
public abstract class Rem extends Expr {
    @Specialization
    protected long doLong(long leftValue, long rightValue) {
        return leftValue % rightValue;
    }
}
