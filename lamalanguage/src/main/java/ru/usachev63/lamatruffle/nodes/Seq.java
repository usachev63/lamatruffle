package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public final class Seq extends Expr {
    @Child Expr first;
    @Child Expr second;

    public Seq(Expr first, Expr second){
        this.first=first;
        this.second=second;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        first.executeGeneric(frame);
        return second.executeGeneric(frame);
    }
}
