package ru.usachev63.lamatruffle.nodes.builtins;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.dsl.Specialization;
import ru.usachev63.lamatruffle.runtime.LamaContext;

public abstract class WriteBuiltinNode extends LamaBuiltinBodyNode {
    @Specialization
    @CompilerDirectives.TruffleBoundary
    public long write(long argument) {
        var context = LamaContext.get(this);
        context.getOutput().println(argument);
        return 0;
    }
}
