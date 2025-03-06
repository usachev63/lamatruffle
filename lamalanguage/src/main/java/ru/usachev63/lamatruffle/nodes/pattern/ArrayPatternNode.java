package ru.usachev63.lamatruffle.nodes.pattern;

import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.runtime.LamaArray;

public final class ArrayPatternNode extends PatternNode {
    @Children
    private final PatternNode[] subpatterns;

    public ArrayPatternNode(PatternNode[] subpatterns) {
        this.subpatterns = subpatterns;
    }

    @Override
    public boolean isMatchedBy(Object value, VirtualFrame frame) {
        if (value instanceof LamaArray array) {
            if (array.elements.length != subpatterns.length)
                return false;
            for (int i = 0; i < subpatterns.length; ++i)
                if (!subpatterns[i].isMatchedBy(array.elements[i], frame))
                    return false;
            return true;
        }
        return false;
    }
}
