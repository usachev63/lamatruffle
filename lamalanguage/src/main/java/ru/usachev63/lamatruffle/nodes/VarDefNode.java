package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.strings.TruffleString;

public final class VarDefNode extends DefNode {
    private final TruffleString[] vars;

    public VarDefNode(TruffleString[] vars) {
        this.vars = vars;
    }
}
