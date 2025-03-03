package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.nodes.expr.ExprNode;

public class GlobalRefNode extends ExprNode {
    private final String name;

    public GlobalRefNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return name;
    }
}
