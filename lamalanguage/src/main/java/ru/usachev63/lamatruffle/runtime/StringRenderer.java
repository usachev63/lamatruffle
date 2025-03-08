package ru.usachev63.lamatruffle.runtime;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.strings.TruffleStringBuilder;

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
        else {
            builder.appendJavaStringUTF16Uncached("invalid value ");
            builder.appendIntNumberUncached(value.hashCode());
        }
    }

    private void renderLong(Long value) {
        builder.appendIntNumberUncached(value.intValue());
    }

    private void renderString(LamaString stringValue) {
        builder.appendCharUTF16Uncached('"');
        builder.appendJavaStringUTF16Uncached(stringValue.data.toString());
        builder.appendCharUTF16Uncached('"');
    }

    private void renderArray(LamaArray arrayValue) {
        builder.appendCharUTF16Uncached('[');
        for (int i = 0; i < arrayValue.elements.length; ++i) {
            if (i > 0)
                builder.appendJavaStringUTF16Uncached(", ");
            renderObject(arrayValue.elements[i]);
        }
        builder.appendCharUTF16Uncached(']');
    }

    private void renderSexp(LamaSexp sexpValue) {
        builder.appendJavaStringUTF16Uncached(sexpValue.uident);
        if (sexpValue.elements.length > 0) {
            builder.appendJavaStringUTF16Uncached(" (");
            for (int i = 0; i < sexpValue.elements.length; ++i) {
                if (i > 0)
                    builder.appendJavaStringUTF16Uncached(", ");
                renderObject(sexpValue.elements[i]);
            }
            builder.appendJavaStringUTF16Uncached(")");
        }
    }

    private TruffleStringBuilder builder = TruffleStringBuilder.createUTF8();
}
