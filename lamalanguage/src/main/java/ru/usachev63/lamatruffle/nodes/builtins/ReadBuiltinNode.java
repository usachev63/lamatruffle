package ru.usachev63.lamatruffle.nodes.builtins;

import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.nodes.expr.ExprNode;
import ru.usachev63.lamatruffle.runtime.LamaContext;
import java.util.Scanner;

public class ReadBuiltinNode extends ExprNode {
    @Override
    public long executeLong(VirtualFrame frame) {
        var context = LamaContext.get(this);
        var input = context.getInput();
        var scanner = new Scanner(input);
        return scanner.nextLong();
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return executeLong(frame);
    }
}
