package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.strings.TruffleString;

public final class VarDef extends Def {
    private final TruffleString[] vars;

    public VarDef(TruffleString[] vars) {
        this.vars = vars;
    }
}
