package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import ru.usachev63.lamatruffle.nodes.FunctionDispatchNode;
import ru.usachev63.lamatruffle.nodes.FunctionDispatchNodeGen;
import ru.usachev63.lamatruffle.runtime.FunctionObject;
import ru.usachev63.lamatruffle.runtime.FunctionRef;

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
        Object callee = this.calleeNode.executeGeneric(frame);
        FunctionObject function;
        if (callee instanceof FunctionObject asFunction)
            function = asFunction;
        else
            function = spawn(frame, (FunctionRef) callee);
        Object[] argumentValues = new Object[this.argumentNodes.length + (function.isClosure() ? 1 : 0)];
        for (int i = 0; i < this.argumentNodes.length; i++)
            argumentValues[i] = this.argumentNodes[i].executeGeneric(frame);
        if (function.isClosure())
            argumentValues[this.argumentNodes.length] = function.closureContext;
        return this.dispatchNode.executeDispatch(function, argumentValues);
    }

    private FunctionObject spawn(VirtualFrame frame, FunctionRef ref) {
        if (!ref.isClosure())
            return FunctionObject.makeFunction(ref.rootNode);
        Object[] closureVarInits = new Object[ref.closureVarInitNodes.length];
        for (int i = 0; i < ref.closureVarInitNodes.length; ++i)
            closureVarInits[i] = ref.closureVarInitNodes[i].executeGeneric(frame);
        return FunctionObject.makeClosure(ref.rootNode, closureVarInits);
    }
}
