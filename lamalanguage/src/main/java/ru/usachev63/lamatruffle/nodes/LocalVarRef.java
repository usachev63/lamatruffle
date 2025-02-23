package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public final class LocalVarRef extends Expr {
    private final int frameSlot;

    public LocalVarRef(int frameSlot) {
        this.frameSlot = frameSlot;
    }

    public int getFrameSlot() {
        return frameSlot;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return frameSlot;
    }
}
