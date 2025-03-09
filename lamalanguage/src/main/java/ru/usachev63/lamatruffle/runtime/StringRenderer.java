package ru.usachev63.lamatruffle.runtime;

import com.oracle.truffle.api.CompilerDirectives;

public class StringRenderer {

    @CompilerDirectives.TruffleBoundary
    public static String render(Object value) {
        return new StringRenderer().renderImpl(value);
    }

    private String renderImpl(Object value) {
        renderObject(value);
        return builder.toString();
    }

    private void renderObject(Object value) {
        if (value instanceof Long longValue)
            renderLong(longValue);
        else if (value instanceof LamaString stringValue)
            renderString(stringValue);
        else if (value instanceof LamaArray arrayValue)
            renderArray(arrayValue);
        else if (value instanceof LamaSexp sexpValue)
            renderSexp(sexpValue);
        else
            builder.append("invalid value ").append(value.hashCode());
    }

    private void renderLong(Long value) {
        builder.append(value);
    }

    private void renderString(LamaString stringValue) {
        builder.append('"');
        builder.append(stringValue.data);
        builder.append('"');
    }

    private void renderArray(LamaArray arrayValue) {
        builder.append('[');
        for (int i = 0; i < arrayValue.elements.length; ++i) {
            if (i > 0)
                builder.append(", ");
            renderObject(arrayValue.elements[i]);
        }
        builder.append(']');
    }

    private void renderSexp(LamaSexp sexpValue) {
        builder.append(sexpValue.uident);
        if (sexpValue.elements.length > 0) {
            builder.append(" (");
            for (int i = 0; i < sexpValue.elements.length; ++i) {
                if (i > 0)
                    builder.append(", ");
                renderObject(sexpValue.elements[i]);
            }
            builder.append(")");
        }
    }

    private StringBuilder builder = new StringBuilder();
}
