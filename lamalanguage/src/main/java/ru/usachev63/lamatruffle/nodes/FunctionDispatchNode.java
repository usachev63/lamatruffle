package ru.usachev63.lamatruffle.nodes;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.dsl.Cached;
import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.DirectCallNode;
import com.oracle.truffle.api.nodes.IndirectCallNode;
import com.oracle.truffle.api.nodes.Node;
import ru.usachev63.lamatruffle.runtime.FunctionObject;

public abstract class FunctionDispatchNode extends Node {
    public abstract Object executeDispatch(Object function, Object[] arguments);

    @Specialization(guards = "function.callTarget == directCallNode.getCallTarget()", limit = "2")
    @CompilerDirectives.TruffleBoundary
    protected static Object dispatchDirectly(
            FunctionObject function,
            Object[] arguments,
            @Cached("create(function.callTarget)") DirectCallNode directCallNode) {
        return directCallNode.call(arguments);
    }

    @Specialization(replaces = "dispatchDirectly")
    @CompilerDirectives.TruffleBoundary
    protected static Object dispatchIndirectly(
            FunctionObject function,
            Object[] arguments,
            @Cached IndirectCallNode indirectCallNode) {
        return indirectCallNode.call(function.callTarget, arguments);
    }

    @Fallback
    @CompilerDirectives.TruffleBoundary
    protected static Object targetIsNotAFunction(
            Object nonFunction,
            @SuppressWarnings("unused") Object[] arguments) {
        throw new RuntimeException();
    }

}
