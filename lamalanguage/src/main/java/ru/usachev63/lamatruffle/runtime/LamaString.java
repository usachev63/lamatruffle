package ru.usachev63.lamatruffle.runtime;

import com.oracle.truffle.api.interop.TruffleObject;

public class LamaString implements TruffleObject {
    private char[] data;

    public LamaString(char[] data) {
        this.data = data;
    }

    public char get(int index) {
        return data[index];
    }

    public void set(int index, long value) {
        data[index] = (char) value;
    }

    public int length() { return data.length; }

    public record ElemDescriptor(LamaString string, long index) {
    }
}
