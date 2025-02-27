package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.nodes.expr.ExprNode;

public final class LocalVarRefNode extends ExprNode {
    private final int frameSlot;

    public LocalVarRefNode(int frameSlot) {
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
