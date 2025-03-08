package ru.usachev63.lamatruffle.runtime;

import ru.usachev63.lamatruffle.nodes.LamaRootNode;
import ru.usachev63.lamatruffle.nodes.expr.ExprNode;

public class FunctionRef {
    public final LamaRootNode rootNode;
    public final ExprNode[] closureVarInitNodes;

    public boolean isClosure() {
        return closureVarInitNodes != null;
    }

    public FunctionRef(LamaRootNode rootNode, ExprNode[] closureVarInitNodes) {
        this.rootNode = rootNode;
        this.closureVarInitNodes = closureVarInitNodes;
    }
}
