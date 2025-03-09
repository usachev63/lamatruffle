package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import ru.usachev63.lamatruffle.nodes.FunctionDispatchNode;
import ru.usachev63.lamatruffle.nodes.FunctionDispatchNodeGen;
import ru.usachev63.lamatruffle.runtime.FunctionObject;

import java.util.List;

public class CallExprNode extends ExprNode {
    @Child
    private ExprNode calleeNode;
    @Children
    private final ExprNode[] argumentNodes;
    @Child
    private FunctionDispatchNode dispatchNode;

    public CallExprNode(ExprNode calleeNode, ExprNode[] arguments) {
        this.calleeNode = calleeNode;
        this.argumentNodes = arguments;
        this.dispatchNode = FunctionDispatchNodeGen.create();
    }

    @Override
    @ExplodeLoop
    public Object executeGeneric(VirtualFrame frame) {
        FunctionObject function = (FunctionObject) this.calleeNode.executeGeneric(frame);
        Object[] argumentValues = new Object[this.argumentNodes.length + (function.isClosure() ? 1 : 0)];
        for (int i = 0; i < this.argumentNodes.length; i++)
            argumentValues[i] = this.argumentNodes[i].executeGeneric(frame);
        if (function.isClosure())
            argumentValues[this.argumentNodes.length] = function.closureContext;
        return this.dispatchNode.executeDispatch(function, argumentValues);
    }
}
