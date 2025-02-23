package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public final class ScopeExpr extends Expr {
    private final Def[] defs;
    @Child private Expr body;

    public ScopeExpr(Def[] defs, Expr body) {
        this.defs = defs;
        this.body = body;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        // TODO add definitions
        if (body != null)
          return body.executeGeneric(frame);
        return 0;
    }
}
