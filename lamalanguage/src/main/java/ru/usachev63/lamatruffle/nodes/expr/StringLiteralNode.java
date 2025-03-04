package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.strings.TruffleString;
import ru.usachev63.lamatruffle.runtime.LamaString;

public final class StringLiteralNode extends ExprNode {
    private final String value;

    public StringLiteralNode(String value) {
        this.value = value;
    }

    @Override
    public LamaString executeGeneric(VirtualFrame frame) {
        return new LamaString(value.toCharArray());
    }
}
