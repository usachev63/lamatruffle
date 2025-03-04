package ru.usachev63.lamatruffle.nodes.pattern;

import com.oracle.truffle.api.frame.VirtualFrame;

public class WildcardPatternNode extends PatternNode {
    @Override
    public boolean isMatchedBy(Object value, VirtualFrame frame) {
        return true;
    }
}
