package ru.usachev63.lamatruffle.runtime;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.api.library.ExportLibrary;
import ru.usachev63.lamatruffle.nodes.LamaRootNode;

@ExportLibrary(InteropLibrary.class)
public final class FunctionObject implements TruffleObject {
    public final CallTarget callTarget;
    public final int argumentCount;
    public final LamaArray closureContext;

    public boolean isClosure() { return closureContext != null; }

    public static FunctionObject makeFunction(CallTarget callTarget, int parametersNum) {
        return new FunctionObject(callTarget, parametersNum, null);
    }

    public static FunctionObject makeClosure(CallTarget callTarget, int parametersNum, Object[] initialClosureVariables) {
        return new FunctionObject(callTarget, parametersNum, new LamaArray(initialClosureVariables));
    }

    private FunctionObject(
        CallTarget callTarget,
        int argumentCount,
        LamaArray closureContext
    ) {
        this.callTarget = callTarget;
        this.argumentCount = argumentCount;
        this.closureContext = closureContext;
    }
}
