package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.runtime.LamaContext;

public class GlobalAssnNode extends ExprNode {
    private final String name;
    @Child ExprNode rhs;

    public GlobalAssnNode(String name, ExprNode rhs) {
        this.name = name;
        this.rhs = rhs;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        Object value = rhs.executeGeneric(frame);
        boolean result = LamaContext
            .get(this)
            .getGlobalScopeObject()
            .updateVariable(name, value);
        if (!result)
            throw new RuntimeException("'" + name + "' ain't defined");
        return value;
    }
}
