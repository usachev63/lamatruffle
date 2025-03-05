package ru.usachev63.lamatruffle.runtime;

import com.oracle.truffle.api.interop.TruffleObject;

public class LamaString implements TruffleObject {
    public char[] data;

    public LamaString(char[] data) {
        this.data = data;
    }

    public LamaString(String string) {
        this(string.toCharArray());
    }

    public record ElemDescriptor(LamaString string, long index) {
    }
}
