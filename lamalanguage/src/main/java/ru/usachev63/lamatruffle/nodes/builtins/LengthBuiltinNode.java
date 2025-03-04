package ru.usachev63.lamatruffle.nodes.builtins;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.strings.TruffleString;

public abstract class LengthBuiltinNode extends LamaBuiltinBodyNode {
    @Specialization
    protected long length(TruffleString argument) {
        return argument.codePointLengthUncached(TruffleString.Encoding.US_ASCII);
    }
}
