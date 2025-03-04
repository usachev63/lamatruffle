package ru.usachev63.lamatruffle.nodes.pattern;

import com.oracle.truffle.api.frame.VirtualFrame;

public final class BindingPattern extends PatternNode {
    private final int frameSlot;
    @Child
    private PatternNode subpattern;

    public BindingPattern(int frameSlot, PatternNode subpattern) {
        this.frameSlot = frameSlot;
        this.subpattern = subpattern;
    }

    @Override
    public boolean isMatchedBy(Object value, VirtualFrame frame) {
        if (subpattern == null || subpattern.isMatchedBy(value, frame)) {
            frame.setObject(frameSlot, value);
            return true;
        }
        return false;
    }
}
