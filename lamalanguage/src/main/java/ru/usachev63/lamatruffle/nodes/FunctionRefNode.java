package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.nodes.expr.ExprNode;
import ru.usachev63.lamatruffle.runtime.FunctionRef;

import java.util.ArrayList;
import java.util.List;

public final class FunctionRefNode extends RefNode {
    @Child
    public LamaRootNode rootNode = null;
    public final List<ExprNode> closureVarInitNodes;

    @CompilerDirectives.TruffleBoundary
    public FunctionRefNode() {
        this.rootNode = null;
        closureVarInitNodes = new ArrayList<>();
    }

    @Override
    public FunctionRef executeGeneric(VirtualFrame frame) {
        return impl();
    }

    @CompilerDirectives.TruffleBoundary
    private FunctionRef impl() {
        return new FunctionRef(rootNode, closureVarInitNodes.isEmpty() ? null : closureVarInitNodes.toArray(ExprNode[]::new));
    }
}
