package ru.usachev63.lamatruffle.runtime;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.api.library.ExportLibrary;
import com.oracle.truffle.api.library.ExportMessage;
import ru.usachev63.lamatruffle.nodes.FunctionDispatchNode;
import ru.usachev63.lamatruffle.nodes.FunctionDispatchNodeGen;

/**
 * The object that represents a function in EasyScript.
 * Almost identical to the class with the same name from part 6,
 * except we save the number of arguments the function takes.
 *
 * @see #argumentCount
 */
@ExportLibrary(InteropLibrary.class)
public final class FunctionObject implements TruffleObject {
    public final CallTarget callTarget;

    /**
     * The number of declared arguments this function takes.
     * We check that from the {@link FunctionDispatchNode}
     * so we can extend the arguments with 'undefined's
     * if the function is called with less of them than this number.
     */
    public final int argumentCount;

    private final FunctionDispatchNode functionDispatchNode;

    public FunctionObject(CallTarget callTarget, int argumentCount) {
        this.callTarget = callTarget;
        this.argumentCount = argumentCount;
        this.functionDispatchNode = FunctionDispatchNodeGen.create();
    }

    @ExportMessage
    boolean isExecutable() {
        return true;
    }

    @ExportMessage
    Object execute(Object[] arguments) {
        return this.functionDispatchNode.executeDispatch(this, arguments);
    }
}
