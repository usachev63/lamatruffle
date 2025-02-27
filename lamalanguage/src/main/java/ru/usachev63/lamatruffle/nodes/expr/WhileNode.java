package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.LoopNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.RepeatingNode;
import com.oracle.truffle.api.nodes.UnexpectedResultException;

public class WhileNode extends ExprNode {
    @Child private LoopNode loopNode;

    public WhileNode(ExprNode conditionNode, ExprNode bodyNode) {
        this.loopNode = Truffle.getRuntime().createLoopNode(new WhileRepeatingNode(conditionNode, bodyNode));
    }

    @Override
    public Long executeGeneric(VirtualFrame frame) {
        this.loopNode.execute(frame);
        return 0l;
    }

    private static final class WhileRepeatingNode extends Node implements RepeatingNode {
        @SuppressWarnings("FieldMayBeFinal")
        @Child
        private ExprNode conditionNode;

        @SuppressWarnings("FieldMayBeFinal")
        @Child
        private ExprNode bodyNode;

        public WhileRepeatingNode(ExprNode conditionNode, ExprNode bodyNode) {
            this.conditionNode = conditionNode;
            this.bodyNode = bodyNode;
        }

        @Override
        public boolean executeRepeating(VirtualFrame frame) {
            boolean conditionValue;
            try {
                conditionValue = this.conditionNode.executeLong(frame) != 0;
            } catch (UnexpectedResultException e) {
                throw new RuntimeException(e);
            }
            if (!conditionValue)
                return false;
            this.bodyNode.executeGeneric(frame);
            return true;
        }
    }
}
