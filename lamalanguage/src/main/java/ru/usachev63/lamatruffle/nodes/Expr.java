package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.dsl.TypeSystemReference;
import com.oracle.truffle.api.frame.VirtualFrame;

@TypeSystemReference(LamaTypes.class)
public abstract class Expr extends LamaNode {
    public abstract Object executeGeneric(VirtualFrame frame);
}
