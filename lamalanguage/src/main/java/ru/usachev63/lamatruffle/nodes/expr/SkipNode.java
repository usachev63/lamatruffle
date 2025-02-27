package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.frame.VirtualFrame;

public final class SkipNode extends ExprNode {
    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return 0;
    }
}
