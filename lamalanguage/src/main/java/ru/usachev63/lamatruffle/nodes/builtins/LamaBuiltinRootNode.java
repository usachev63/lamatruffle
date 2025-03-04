package ru.usachev63.lamatruffle.nodes.builtins;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.RootNode;
import ru.usachev63.lamatruffle.LamaLanguage;
import ru.usachev63.lamatruffle.nodes.expr.ExprNode;

public class LamaBuiltinRootNode extends RootNode {
    @Child
    private ExprNode bodyNode;

    public LamaBuiltinRootNode(LamaLanguage language, ExprNode bodyNode) {
        super(language);
        this.bodyNode = bodyNode;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        return bodyNode.executeGeneric(frame);
    }
}
