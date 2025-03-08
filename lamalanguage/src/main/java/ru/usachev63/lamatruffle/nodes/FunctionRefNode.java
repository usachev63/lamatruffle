package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.nodes.expr.ExprNode;
import ru.usachev63.lamatruffle.runtime.FunctionRef;

public final class FunctionRefNode extends RefNode {
    @Child
    private LamaRootNode rootNode;
    @Children
    private ExprNode[] closureVarInitNodes;

    public static FunctionRefNode create(LamaRootNode rootNode) {
        return new FunctionRefNode(rootNode, null);
    }

    public static FunctionRefNode createClosure(LamaRootNode rootNode, ExprNode[] closureVarInitNodes) {
        return new FunctionRefNode(rootNode, closureVarInitNodes);
    }

    private FunctionRefNode(LamaRootNode rootNode, ExprNode[] closureVarInitNodes) {
        this.rootNode = rootNode;
        this.closureVarInitNodes = closureVarInitNodes;
    }

    @Override
    public FunctionRef executeGeneric(VirtualFrame frame) {
        return new FunctionRef(rootNode, closureVarInitNodes);
    }
}
