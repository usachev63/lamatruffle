package ru.usachev63.lamatruffle.nodes.pattern;

import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.runtime.LamaString;

public final class StringLiteralPatternNode extends PatternNode {
    private final String expectedValue;

    public StringLiteralPatternNode(String expectedValue) {
        this.expectedValue = expectedValue;
    }

    @Override
    public boolean isMatchedBy(Object value, VirtualFrame frame) {
        if (value instanceof LamaString lamaString)
            return String.valueOf(lamaString.data).equals(expectedValue);
        return false;
    }
}
