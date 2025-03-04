package ru.usachev63.lamatruffle.runtime;

import com.oracle.truffle.api.interop.TruffleObject;

public final class LamaArray implements TruffleObject {
    public Object[] elements;

    public LamaArray(Object[] elements) {
        this.elements = elements;
    }

    public record ElemDescriptor(LamaArray array, int index) {}
}
