package ru.usachev63.lamatruffle.nodes.pattern;

public class WildcardPatternNode extends PatternNode {
    @Override
    public boolean isMatchedBy(Object value) {
        return true;
    }
}
