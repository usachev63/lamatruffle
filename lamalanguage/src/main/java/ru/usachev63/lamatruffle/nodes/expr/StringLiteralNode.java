package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.dsl.NodeField;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.strings.TruffleString;
import ru.usachev63.lamatruffle.runtime.LamaString;

@NodeField(name = "stringValue", type=java.lang.String.class)
public abstract class StringLiteralNode extends ExprNode {
    protected abstract String getStringValue();

    @Specialization
    @CompilerDirectives.TruffleBoundary
    protected LamaString make() {
        return new LamaString(getStringValue().toCharArray());
    }
}
