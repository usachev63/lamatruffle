package ru.usachev63.lamatruffle.nodes.expr.numeric;

import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.nodes.expr.ExprNode;

public final class LongLiteralNode extends ExprNode {
    private final long value;

    public LongLiteralNode(long value) {
        this.value = value;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return value;
    }

    @Override
    public long executeLong(VirtualFrame frame) {
        return value;
    }
}
