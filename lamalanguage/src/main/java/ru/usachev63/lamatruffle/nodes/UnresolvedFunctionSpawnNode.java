package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.nodes.expr.ExprNode;

public class UnresolvedFunctionSpawnNode extends ExprNode {
    @Override
    public Object executeGeneric(VirtualFrame frame) {
        throw new RuntimeException();
    }
}
