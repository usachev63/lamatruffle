package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public final class UnresolvedRefNode extends RefNode {
    public final String identifier;

    public UnresolvedRefNode(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        throw new RuntimeException("unresolved ref in runtime");
    }
}
