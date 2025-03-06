package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.nodes.LamaRootNode;
import ru.usachev63.lamatruffle.runtime.FunctionObject;

public final class AnonFunctionNode extends ExprNode {
    private final int argumentCount;
    @Child private LamaRootNode rootNode;

    public AnonFunctionNode(int argumentCount, LamaRootNode rootNode) {
        this.argumentCount = argumentCount;
        this.rootNode = rootNode;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return new FunctionObject(rootNode.getCallTarget(), this.argumentCount);
    }
}
