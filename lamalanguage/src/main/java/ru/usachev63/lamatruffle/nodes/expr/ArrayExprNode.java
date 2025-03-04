package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.runtime.LamaArray;

public class ArrayExprNode extends ExprNode {
    @Children
    private ExprNode[] elementNodes;

    public ArrayExprNode(ExprNode[] elementNodes) {
        this.elementNodes = elementNodes;
    }

    @Override
    public LamaArray executeGeneric(VirtualFrame frame) {
        Object[] elements = new Object[elementNodes.length];
        for (int i = 0; i < elementNodes.length; ++i)
            elements[i] = elementNodes[i].executeGeneric(frame);
        return new LamaArray(elements);
    }
}
