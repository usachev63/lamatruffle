package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.frame.VirtualFrame;

public final class ScopeExprNode extends ExprNode {
    @Child
    private ExprNode body;

    public ScopeExprNode(ExprNode body) {
        this.body = body;
    }

    public ExprNode getBody() {
        return body;
    }

    public void setBody(ExprNode newBody) {
        this.body = newBody;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        if (body != null)
            return body.executeGeneric(frame);
        return 0;
    }
}
