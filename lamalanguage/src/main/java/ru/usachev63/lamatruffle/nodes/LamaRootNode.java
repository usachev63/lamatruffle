package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.SourceSection;
import com.oracle.truffle.api.strings.TruffleString;
import ru.usachev63.lamatruffle.LamaLanguage;
import ru.usachev63.lamatruffle.nodes.expr.ExprNode;
import ru.usachev63.lamatruffle.nodes.expr.ScopeExprNode;


@NodeInfo(language = "lama")
public class LamaRootNode extends RootNode {
    @Child private ScopeExprNode bodyNode;
    private final TruffleString name;
    public final int parametersNum;

    public LamaRootNode(LamaLanguage language, FrameDescriptor frameDescriptor, ScopeExprNode bodyNode, TruffleString name, int parametersNum) {
        super(language, frameDescriptor);
        this.bodyNode = bodyNode;
        this.name = name;
        this.parametersNum = parametersNum;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        //assert LamaContext.get(this) != null;
        return bodyNode.executeGeneric(frame);
    }

    @Override
    public String getName() {
        return name.toJavaStringUncached();
    }

    @Override
    public String toString() {
        return "root " + name;
    }
}
