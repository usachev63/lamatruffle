package ru.usachev63.lamatruffle.nodes.pattern;

import ru.usachev63.lamatruffle.runtime.LamaSexp;

public final class SexpPatternNode extends PatternNode {
    private final String uident;

    public SexpPatternNode(String uident) {
        this.uident = uident;
    }

    @Override
    public boolean isMatchedBy(Object value) {
        if (value instanceof LamaSexp sexp) {
            return sexp.elements.length == 0 && sexp.uident.equals(uident);
        }
        return false;
    }
}
