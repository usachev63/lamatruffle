package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.nodes.LamaRootNode;
import ru.usachev63.lamatruffle.runtime.FunctionObject;
import ru.usachev63.lamatruffle.runtime.FunctionRef;

@NodeChild(value = "functionNode", type=ExprNode.class)
public abstract class FunctionSpawnNode extends ExprNode {
    @Specialization
    protected FunctionObject spawn(VirtualFrame frame, FunctionRef ref) {
        if (!ref.isClosure())
            return FunctionObject.makeFunction(ref.callTarget, ref.parametersNum);
        Object[] closureVarInits = new Object[ref.closureVarInitNodes.length];
        for (int i = 0; i < ref.closureVarInitNodes.length; ++i)
            closureVarInits[i] = ref.closureVarInitNodes[i].executeGeneric(frame);
        return FunctionObject.makeClosure(ref.callTarget, ref.parametersNum, closureVarInits);
    }
}
