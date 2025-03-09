package ru.usachev63.lamatruffle.runtime;

import com.oracle.truffle.api.CallTarget;
import ru.usachev63.lamatruffle.nodes.LamaRootNode;
import ru.usachev63.lamatruffle.nodes.expr.ExprNode;

public class FunctionRef {
    public final CallTarget callTarget;
    public final int parametersNum;
    public final ExprNode[] closureVarInitNodes;

    public boolean isClosure() {
        return closureVarInitNodes != null;
    }

    public FunctionRef(LamaRootNode rootNode, ExprNode[] closureVarInitNodes) {
        this.callTarget = rootNode.getCallTarget();
        this.parametersNum = rootNode.parametersNum;
        this.closureVarInitNodes = closureVarInitNodes;
    }
}
