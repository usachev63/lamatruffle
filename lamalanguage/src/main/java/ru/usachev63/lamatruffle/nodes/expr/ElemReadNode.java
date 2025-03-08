package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import ru.usachev63.lamatruffle.nodes.ElemRefNode;
import ru.usachev63.lamatruffle.runtime.LamaArray;
import ru.usachev63.lamatruffle.runtime.LamaSexp;
import ru.usachev63.lamatruffle.runtime.LamaString;

@NodeChild(value = "elemRefNode", type = ElemRefNode.class)
public abstract class ElemReadNode extends ExprNode {
    @Specialization
    @CompilerDirectives.TruffleBoundary
    protected long readStringElem(LamaString.ElemDescriptor descriptor) {
        return descriptor.string().data[(int)descriptor.index()];
    }
    @Specialization
    @CompilerDirectives.TruffleBoundary
    protected Object readArrayElem(LamaArray.ElemDescriptor descriptor) {
        return descriptor.array().elements[descriptor.index()];
    }
    @Specialization
    @CompilerDirectives.TruffleBoundary
    protected Object readSexpElem(LamaSexp.ElemDescriptor descriptor) {
        return descriptor.sexp().elements[descriptor.index()];
    }
}
