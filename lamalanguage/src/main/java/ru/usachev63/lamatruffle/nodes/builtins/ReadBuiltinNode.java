package ru.usachev63.lamatruffle.nodes.builtins;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.dsl.Specialization;
import ru.usachev63.lamatruffle.runtime.LamaContext;

import java.io.IOException;

public abstract class ReadBuiltinNode extends LamaBuiltinBodyNode {
    @Specialization
    @CompilerDirectives.TruffleBoundary
    public long read() {
        var context = LamaContext.get(this);
        var output = context.getOutput();
        output.print("> ");
        output.flush();
        var input = context.getInput();
        try {
            return Long.parseLong(input.readLine().trim());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
