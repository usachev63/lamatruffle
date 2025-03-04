package ru.usachev63.lamatruffle.nodes.pattern;

import ru.usachev63.lamatruffle.runtime.LamaSexp;

public final class SexpPatternNode extends PatternNode {
    private final String uident;
    @Children
    private final PatternNode[] subpatterns;

    public SexpPatternNode(String uident, PatternNode[] subpatterns) {
        this.uident = uident;
        this.subpatterns = subpatterns;
    }

    @Override
    public boolean isMatchedBy(Object value) {
        if (value instanceof LamaSexp sexp) {
            if (sexp.elements.length != subpatterns.length)
                return false;
            if (!sexp.uident.equals(uident))
                return false;
            for (int i = 0; i < subpatterns.length; ++i)
                if (!subpatterns[i].isMatchedBy(sexp.elements[i]))
                    return false;
            return true;
        }
        return false;
    }
}
