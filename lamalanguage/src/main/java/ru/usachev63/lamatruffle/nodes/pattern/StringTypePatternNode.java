package ru.usachev63.lamatruffle.nodes.pattern;

import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.runtime.LamaString;

public class StringTypePatternNode extends PatternNode {
    @Override
    public boolean isMatchedBy(Object value, VirtualFrame frame) {
        return value instanceof LamaString;
    }
}
