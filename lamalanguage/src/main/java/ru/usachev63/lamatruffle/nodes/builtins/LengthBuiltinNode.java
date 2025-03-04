package ru.usachev63.lamatruffle.nodes.builtins;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.strings.TruffleString;
import ru.usachev63.lamatruffle.runtime.LamaString;

public abstract class LengthBuiltinNode extends LamaBuiltinBodyNode {
    @Specialization
    protected long length(LamaString argument) {
        return (long) argument.length();
    }
}
