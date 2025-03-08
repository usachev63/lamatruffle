package ru.usachev63.lamatruffle.nodes.expr;

import com.oracle.truffle.api.frame.VirtualFrame;
import ru.usachev63.lamatruffle.nodes.LamaRootNode;
import ru.usachev63.lamatruffle.runtime.FunctionObject;
import ru.usachev63.lamatruffle.runtime.LamaContext;

public class FuncDeclNode extends ExprNode {
   private final String funcName;
   @Child private LamaRootNode rootNode;

   public FuncDeclNode(String funcName, LamaRootNode rootNode) {
       this.funcName = funcName;
       this.rootNode = rootNode;
   }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        var globalScopeObject = LamaContext.get(this).getGlobalScopeObject();
        var func = FunctionObject.makeFunction(rootNode);
        globalScopeObject.newVariable(funcName, func);
        return 0;
    }
}
