package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public class GlobalRefNode extends RefNode {
    private final String name;

    public GlobalRefNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return name;
    }
}
