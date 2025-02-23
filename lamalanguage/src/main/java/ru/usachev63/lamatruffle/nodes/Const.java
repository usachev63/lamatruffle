package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public final class Const extends Expr {
    private final long value;

    public Const(long value) {
        this.value = value;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return value;
    }
}
