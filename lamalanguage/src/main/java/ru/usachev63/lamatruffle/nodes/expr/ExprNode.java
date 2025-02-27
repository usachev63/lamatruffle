package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.dsl.TypeSystemReference;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import ru.usachev63.lamatruffle.nodes.LamaNode;
import ru.usachev63.lamatruffle.LamaTypes;
import ru.usachev63.lamatruffle.LamaTypesGen;

@TypeSystemReference(LamaTypes.class)
public abstract class ExprNode extends LamaNode {
    public abstract Object executeGeneric(VirtualFrame frame);

    public long executeLong(VirtualFrame frame) {
        try {
            return LamaTypesGen.expectLong(executeGeneric(frame));
        } catch (UnexpectedResultException e) {
            throw new RuntimeException(e);
        }
    }
}
