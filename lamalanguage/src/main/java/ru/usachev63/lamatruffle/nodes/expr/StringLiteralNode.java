package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.strings.TruffleString;

public final class StringLiteralNode extends ExprNode {
    private final TruffleString value;

    public StringLiteralNode(TruffleString value){this.value=value;}

    @Override
    public TruffleString executeGeneric(VirtualFrame frame) {
        return value;
    }
}
