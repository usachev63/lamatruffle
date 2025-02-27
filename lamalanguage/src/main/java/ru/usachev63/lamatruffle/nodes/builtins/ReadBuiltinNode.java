package ru.usachev63.lamatruffle.nodes.builtins;

import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.nodes.expr.ExprNode;
import ru.usachev63.lamatruffle.runtime.LamaContext;

import java.io.IOException;

public class ReadBuiltinNode extends ExprNode {
    @Override
    public long executeLong(VirtualFrame frame) {
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

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return executeLong(frame);
    }
}
