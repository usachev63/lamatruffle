package ru.usachev63.lamatruffle;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.dsl.NodeFactory;
import com.oracle.truffle.api.source.Source;
import ru.usachev63.lamatruffle.nodes.builtins.*;
import ru.usachev63.lamatruffle.nodes.expr.ArgReadNode;
import ru.usachev63.lamatruffle.parser.LamaLanguageParser;
import ru.usachev63.lamatruffle.runtime.FunctionObject;
import ru.usachev63.lamatruffle.runtime.LamaContext;

import java.util.stream.IntStream;

@TruffleLanguage.Registration(id = "lama", name = "lama")
public final class LamaLanguage extends TruffleLanguage<LamaContext> {
    @Override
    protected LamaContext createContext(Env env) {
        var context = new LamaContext(this, env);
        defineBuiltins(context);
        return context;
    }

    @Override
    protected CallTarget parse(ParsingRequest request) throws Exception {
        Source source = request.getSource();
        return LamaLanguageParser.parseLama(this, source);
    }

    private void defineBuiltins(LamaContext context) {
        defineBuiltInFunction(
            context,
            "write",
            WriteBuiltinNodeFactory.getInstance()
        );
        defineBuiltInFunction(
            context,
            "read",
            ReadBuiltinNodeFactory.getInstance()
        );
        defineBuiltInFunction(
            context,
            "length",
            LengthBuiltinNodeFactory.getInstance()
        );
        defineBuiltInFunction(
            context,
            "string",
            StringBuiltinNodeFactory.getInstance()
        );
    }

    private void defineBuiltInFunction(LamaContext context, String name,
                                       NodeFactory<? extends LamaBuiltinBodyNode> nodeFactory) {
        var argumentsNum = nodeFactory.getExecutionSignature().size();
        ArgReadNode[] functionArguments = IntStream.range(0, argumentsNum)
            .mapToObj(ArgReadNode::new)
            .toArray(ArgReadNode[]::new);
        var builtInFuncRootNode = new LamaBuiltinRootNode(this,
            nodeFactory.createNode((Object) functionArguments));
        context.getGlobalScopeObject().newVariable(name,
            new FunctionObject(builtInFuncRootNode.getCallTarget(), argumentsNum));
    }
}
