package ru.usachev63.lamatruffle.runtime;

import com.oracle.truffle.api.interop.TruffleObject;

public class LamaSexp implements TruffleObject {
    String uident;
    public Object[] elements;

    public LamaSexp(String uident, Object[] elements) {
        this.uident = uident;
        this.elements = elements;
    }
}
