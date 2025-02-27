package ru.usachev63.lamatruffle.nodes.builtins;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import ru.usachev63.lamatruffle.nodes.expr.ExprNode;
import ru.usachev63.lamatruffle.runtime.LamaContext;

public class WriteBuiltinNode extends ExprNode {
    @Child
    ExprNode argumentNode;

    public WriteBuiltinNode(ExprNode argumentNode) {
        this.argumentNode = argumentNode;
    }

    @Override
    public long executeLong(VirtualFrame frame) {
        var context = LamaContext.get(this);
        long argument;
        try {
            argument = argumentNode.executeLong(frame);
        } catch (UnexpectedResultException e) {
            throw new RuntimeException("Expected long argument to write. " + e.getMessage());
        }
        context.getOutput().println(argument);
        return 0;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return executeLong(frame);
    }
}
