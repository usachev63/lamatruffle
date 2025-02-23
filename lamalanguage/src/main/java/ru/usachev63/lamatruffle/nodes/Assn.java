package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public final class Assn extends Expr {
    @Child
    LocalVarRef lhs;
    @Child
    Expr rhs;

    public Assn(LocalVarRef lhs, Expr rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        // TODO execute lhs if not simple
        int frameSlot = lhs.getFrameSlot();
        Object value = rhs.executeGeneric(frame);
        frame.setObject(frameSlot, value);
        return value;
    }
}
