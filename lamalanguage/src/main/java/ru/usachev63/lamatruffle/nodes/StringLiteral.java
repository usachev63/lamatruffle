package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.strings.TruffleString;

public final class StringLiteral extends Expr {
    private final TruffleString value;

    public StringLiteral(TruffleString value){this.value=value;}

    @Override
    public TruffleString executeGeneric(VirtualFrame frame) {
        return value;
    }
}
