package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.frame.VirtualFrame;

public final class SeqNode extends ExprNode {
    @Child
    ExprNode first;
    @Child
    ExprNode second;

    public SeqNode(ExprNode first, ExprNode second){
        this.first=first;
        this.second=second;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        first.executeGeneric(frame);
        return second.executeGeneric(frame);
    }
}
