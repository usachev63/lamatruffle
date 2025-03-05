package ru.usachev63.lamatruffle.nodes.pattern;

import com.oracle.truffle.api.frame.VirtualFrame;

public class LongLiteralPatternNode extends PatternNode {
    private final long expectedValue;

    public LongLiteralPatternNode(long expectedValue) {
        this.expectedValue = expectedValue;
    }

    @Override
    public boolean isMatchedBy(Object value, VirtualFrame frame) {
        if (value instanceof Long longValue)
            return longValue == expectedValue;
        return false;
    }
}
