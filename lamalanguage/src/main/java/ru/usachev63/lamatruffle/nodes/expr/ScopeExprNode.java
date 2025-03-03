package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.nodes.DefNode;

public final class ScopeExprNode extends ExprNode {
    private final DefNode[] defs;
    @Child
    private ExprNode body;

    public ScopeExprNode(DefNode[] defs, ExprNode body) {
        this.defs = defs;
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
        // TODO add definitions
        if (body != null)
            return body.executeGeneric(frame);
        return 0;
    }
}
