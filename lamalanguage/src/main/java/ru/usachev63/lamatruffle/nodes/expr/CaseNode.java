package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.nodes.LamaNode;
import ru.usachev63.lamatruffle.nodes.pattern.PatternNode;

public class CaseNode extends ExprNode {
    @Child
    private ExprNode scrutineeNode;
    @Children
    private Branch[] branches;

    public static class Branch extends LamaNode {
        @Child
        public PatternNode patternNode;
        @Child
        public ExprNode outcomeNode;

        public Branch(PatternNode patternNode, ExprNode outcomeNode) {
            this.patternNode = patternNode;
            this.outcomeNode = outcomeNode;
        }
    }

    public CaseNode(ExprNode scrutineeNode, Branch[] branches) {
        assert branches.length >= 1;
        this.scrutineeNode = scrutineeNode;
        this.branches = branches;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        Object scrutinee = scrutineeNode.executeGeneric(frame);
        for (Branch branch : branches) {
            if (branch.patternNode.isMatchedBy(scrutinee)) {
                return branch.outcomeNode.executeGeneric(frame);
            }
        }
        throw new RuntimeException("case expression fail");
    }
}
