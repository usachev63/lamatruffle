package ru.usachev63.lamatruffle.nodes.builtins;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.NodeChild;
import ru.usachev63.lamatruffle.nodes.expr.ArgReadNode;
import ru.usachev63.lamatruffle.nodes.expr.ExprNode;

@NodeChild(value = "arguments", type = ArgReadNode[].class)
@GenerateNodeFactory
public abstract class LamaBuiltinBodyNode extends ExprNode {
}
