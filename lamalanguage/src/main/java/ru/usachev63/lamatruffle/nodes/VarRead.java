package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public final class VarRead extends Expr {
    @Child LocalVarRef var;

    public VarRead(LocalVarRef var) {
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
