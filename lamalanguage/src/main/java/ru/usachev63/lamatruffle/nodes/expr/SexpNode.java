package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.runtime.LamaSexp;

public class SexpNode extends ExprNode {
    private final String uident;
    @Children
    private ExprNode[] elementNodes;

    public SexpNode(String uident, ExprNode[] elementNodes) {
        this.uident = uident;
        this.elementNodes = elementNodes;
    }

    @Override
    public LamaSexp executeGeneric(VirtualFrame frame) {
        Object[] elements = new Object[elementNodes.length];
        for (int i = 0; i < elementNodes.length; ++i)
            elements[i] = elementNodes[i].executeGeneric(frame);
        return new LamaSexp(uident, elements);
    }
}
