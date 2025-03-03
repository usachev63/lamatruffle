package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import ru.usachev63.lamatruffle.nodes.FunctionDispatchNode;
import ru.usachev63.lamatruffle.nodes.FunctionDispatchNodeGen;

import java.util.List;

public class CallExprNode extends ExprNode {
    @Child
    private ExprNode calleeNode;
    @Children
    private final ExprNode[] argumentNodes;
    @Child
    private FunctionDispatchNode dispatchNode;

    public CallExprNode(ExprNode calleeNode, List<ExprNode> arguments) {
        this.calleeNode = calleeNode;
        this.argumentNodes = arguments.toArray(new ExprNode[0]);
        this.dispatchNode = FunctionDispatchNodeGen.create();
    }

    @Override
    @ExplodeLoop
    public Object executeGeneric(VirtualFrame frame) {
        Object function = this.calleeNode.executeGeneric(frame);

        Object[] argumentValues = new Object[this.argumentNodes.length];
        for (int i = 0; i < this.argumentNodes.length; i++) {
            argumentValues[i] = this.argumentNodes[i].executeGeneric(frame);
        }

        return this.dispatchNode.executeDispatch(function, argumentValues);
    }
}
