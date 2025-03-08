package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.runtime.LamaContext;

public class GlobalReadNode extends ExprNode {
    private final String name;

    public GlobalReadNode(String name) {
        this.name = name;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return impl();
    }

    @CompilerDirectives.TruffleBoundary
    public Object impl() {
        var value = LamaContext
            .get(this)
            .getGlobalScopeObject()
            .getVariable(name);
        if (value == null)
            throw new RuntimeException();
        return value;
    }
}
