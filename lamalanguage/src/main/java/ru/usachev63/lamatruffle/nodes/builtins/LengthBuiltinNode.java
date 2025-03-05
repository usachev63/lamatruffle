package ru.usachev63.lamatruffle.nodes.builtins;

import com.oracle.truffle.api.dsl.Specialization;
import ru.usachev63.lamatruffle.runtime.LamaArray;
import ru.usachev63.lamatruffle.runtime.LamaSexp;
import ru.usachev63.lamatruffle.runtime.LamaString;

public abstract class LengthBuiltinNode extends LamaBuiltinBodyNode {
    @Specialization
    protected long length(LamaString argument) {
        return argument.data.length;
    }
    @Specialization
    protected long length(LamaArray argument) {
        return argument.elements.length;
    }
    @Specialization
    protected long length(LamaSexp argument) {
        return argument.elements.length;
    }
}
