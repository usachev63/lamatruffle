package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.nodes.LocalVarRefNode;

public final class VarReadNode extends ExprNode {
    @Child
    LocalVarRefNode var;

    public VarReadNode(LocalVarRefNode var) {
        this.var = var;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        // TODO execute generic var if complex
        Object result = frame.getObject(var.getFrameSlot());
        if (result == null)
            return 0;
        return result;
    }
}
