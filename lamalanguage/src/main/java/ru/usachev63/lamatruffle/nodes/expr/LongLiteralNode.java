package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.frame.VirtualFrame;

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
