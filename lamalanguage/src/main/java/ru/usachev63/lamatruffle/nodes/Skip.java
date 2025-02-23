package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public final class Skip extends Expr {
    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return 0;
    }
}
