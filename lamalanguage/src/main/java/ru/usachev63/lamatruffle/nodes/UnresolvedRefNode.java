package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public final class UnresolvedRefNode extends RefNode {
    public final String lident;

    public UnresolvedRefNode(String lident) {
        this.lident = lident;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        throw new RuntimeException("unresolved ref in runtime");
    }
}
