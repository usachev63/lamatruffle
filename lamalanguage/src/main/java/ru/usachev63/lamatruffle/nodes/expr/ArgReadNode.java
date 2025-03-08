package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.frame.VirtualFrame;

public class ArgReadNode extends ExprNode {
    private final int index;

    public ArgReadNode(int index) {
        this.index = index;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        Object[] args = frame.getArguments();
        if (index < args.length) {
            return args[index];
        } else {
            throw new RuntimeException(String.format("ArgReadNode: invalid arg %d >= %d", index, args.length));
        }
    }
}
