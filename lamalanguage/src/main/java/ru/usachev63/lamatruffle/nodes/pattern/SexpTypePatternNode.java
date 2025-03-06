package ru.usachev63.lamatruffle.nodes.pattern;

import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.runtime.LamaSexp;

public class SexpTypePatternNode extends PatternNode{
    @Override
    public boolean isMatchedBy(Object value, VirtualFrame frame) {
        return value instanceof LamaSexp;
    }
}
