package ru.usachev63.lamatruffle.nodes.pattern;

import com.oracle.truffle.api.frame.VirtualFrame;

public class ValTypePatternNode extends PatternNode {
    @Override
    public boolean isMatchedBy(Object value, VirtualFrame frame) {
        return value instanceof Long;
    }
}
