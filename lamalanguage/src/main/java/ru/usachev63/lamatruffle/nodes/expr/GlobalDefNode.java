package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.runtime.LamaContext;

public class GlobalDefNode extends ExprNode {
    private final String name;

    public GlobalDefNode(String name) {
        this.name = name;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        boolean result = LamaContext
            .get(this)
            .getGlobalScopeObject()
            .newVariable(name, 0, false);
        if (!result)
            throw new RuntimeException("double definition of global " + name);
        return 0;
    }
}
