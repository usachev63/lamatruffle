package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.profiles.ConditionProfile;

public class IfNode extends ExprNode {
    @Child
    ExprNode conditionNode;
    @Child
    ExprNode thenNode;
    @Child
    ExprNode elseNode;
    private final ConditionProfile conditionProfile = ConditionProfile.create();

    public IfNode(
        ExprNode conditionNode,
        ExprNode thenNode,
        ExprNode elseNode
    ) {
        this.conditionNode = conditionNode;
        this.thenNode = thenNode;
        this.elseNode = elseNode;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        boolean conditionValue = conditionNode.executeLong(frame) != 0;
        if (conditionProfile.profile(conditionValue)) {
            return thenNode.executeGeneric(frame);
        } else if (elseNode != null) {
            return elseNode.executeGeneric(frame);
        }
        return 0;
    }
}
