package ru.usachev63.lamatruffle.runtime;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.InvalidArrayIndexException;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.api.interop.UnknownIdentifierException;
import com.oracle.truffle.api.library.ExportLibrary;
import com.oracle.truffle.api.library.ExportMessage;
import ru.usachev63.lamatruffle.LamaLanguage;

import java.util.*;

public final class GlobalScopeObject implements TruffleObject {
    private final Map<String, Object> variables = new HashMap<>();

    @CompilerDirectives.TruffleBoundary
    public boolean newVariable(String name, Object value) {
        Object existingValue = this.variables.put(name, value);
        return existingValue == null;
    }

    @CompilerDirectives.TruffleBoundary
    public boolean updateVariable(String name, Object value) {
        Object existingValue = this.variables.computeIfPresent(name, (k, v) -> value);
        return existingValue != null;
    }

    @CompilerDirectives.TruffleBoundary
    public Object getVariable(String name) {
        return this.variables.get(name);
    }
}
