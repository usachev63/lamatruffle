package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.nodes.LocalVarRefNode;

public final class AssnNode extends ExprNode {
    @Child
    LocalVarRefNode lhs;
    @Child
    ExprNode rhs;

    public AssnNode(LocalVarRefNode lhs, ExprNode rhs) {
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
