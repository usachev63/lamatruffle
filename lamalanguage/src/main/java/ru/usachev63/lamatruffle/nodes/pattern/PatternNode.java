package ru.usachev63.lamatruffle.nodes.pattern;

import ru.usachev63.lamatruffle.nodes.LamaNode;

public abstract class PatternNode extends LamaNode {
    public abstract boolean isMatchedBy(Object value);
}
