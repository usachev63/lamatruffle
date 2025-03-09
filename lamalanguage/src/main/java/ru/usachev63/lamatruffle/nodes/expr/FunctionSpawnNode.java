package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.nodes.GenericReadNodeGen;
import ru.usachev63.lamatruffle.nodes.LamaRootNode;
import ru.usachev63.lamatruffle.nodes.RefNode;
import ru.usachev63.lamatruffle.runtime.FunctionObject;

public final class FunctionSpawnNode extends ExprNode {
    private final CallTarget callee;
    private final int parametersNum;
    @Children
    private final ExprNode[] capturedValueNodes;

    public boolean isClosure() {
        return capturedValueNodes != null;
    }

    public static FunctionSpawnNode createFunction(LamaRootNode rootNode) {
        return new FunctionSpawnNode(rootNode.getCallTarget(), rootNode.parametersNum, null);
    }

    public static FunctionSpawnNode createClosure(LamaRootNode rootNode, ExprNode[] capturedRefNodes) {
        ExprNode[] capturedValueNodes = new ExprNode[capturedRefNodes.length];
        for (int i = 0; i < capturedRefNodes.length; ++i)
            capturedValueNodes[i] = GenericReadNodeGen.create(capturedRefNodes[i]);
        return new FunctionSpawnNode(rootNode.getCallTarget(), rootNode.parametersNum, capturedValueNodes);
    }

    private FunctionSpawnNode(CallTarget callee, int parametersNum, ExprNode[] capturedValueNodes) {
        this.callee = callee;
        this.parametersNum = parametersNum;
        this.capturedValueNodes = capturedValueNodes;
    }

    @Override
    public FunctionObject executeGeneric(VirtualFrame frame) {
        if (!isClosure())
            return FunctionObject.makeFunction(callee, parametersNum);
        Object[] capturedValues = new Object[capturedValueNodes.length];
        for (int i = 0; i < capturedValueNodes.length; ++i)
            capturedValues[i] = capturedValueNodes[i].executeGeneric(frame);
        return FunctionObject.makeClosure(callee, parametersNum, capturedValues);
    }
}
