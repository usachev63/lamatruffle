package ru.usachev63.lamatruffle.runtime;

import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.InvalidArrayIndexException;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.api.interop.UnknownIdentifierException;
import com.oracle.truffle.api.library.ExportLibrary;
import com.oracle.truffle.api.library.ExportMessage;
import ru.usachev63.lamatruffle.LamaLanguage;

import java.util.*;

/**
 * This is the Truffle interop object that represents the global-level scope
 * that contains all of the global variables.
 */
@ExportLibrary(InteropLibrary.class)
public final class GlobalScopeObject implements TruffleObject {
    private final Map<String, Object> variables = new HashMap<>();

    public boolean newVariable(String name, Object value) {
        Object existingValue = this.variables.put(name, value);
        return existingValue == null;
    }

    public boolean updateVariable(String name, Object value) {
        Object existingValue = this.variables.computeIfPresent(name, (k, v) -> value);
        return existingValue != null;
    }

    public Object getVariable(String name) {
        return this.variables.get(name);
    }

    @ExportMessage
    boolean isScope() {
        return true;
    }

    @ExportMessage
    boolean hasMembers() {
        return true;
    }

    @ExportMessage
    Object getMembers(@SuppressWarnings("unused") boolean includeInternal) {
        return new GlobalVariableNamesObject(this.variables.keySet());
    }

    @ExportMessage
    boolean isMemberReadable(String member) {
        return this.variables.containsKey(member);
    }

    @ExportMessage
    Object readMember(String member) throws UnknownIdentifierException {
        Object value = this.variables.get(member);
        if (null == value) {
            throw UnknownIdentifierException.create(member);
        }
        return value;
    }

    @ExportMessage
    Object toDisplayString(@SuppressWarnings("unused") boolean allowSideEffects) {
        return "global";
    }

    @ExportMessage
    boolean hasLanguage() {
        return true;
    }

    @ExportMessage
    Class<? extends TruffleLanguage<?>> getLanguage() {
        return LamaLanguage.class;
    }
}

/**
 * The class that implements the collection of member names of the global scope.
 * Used in the {@link GlobalScopeObject#getMembers} method.
 */
@ExportLibrary(InteropLibrary.class)
final class GlobalVariableNamesObject implements TruffleObject {
    private final List<String> names;

    GlobalVariableNamesObject(Set<String> names) {
        this.names = new ArrayList<>(names);
    }

    @ExportMessage
    boolean hasArrayElements() {
        return true;
    }

    @ExportMessage
    long getArraySize() {
        return this.names.size();
    }

    @ExportMessage
    boolean isArrayElementReadable(long index) {
        return index >= 0 && index < this.names.size();
    }

    @ExportMessage
    Object readArrayElement(long index) throws InvalidArrayIndexException {
        if (!this.isArrayElementReadable(index)) {
            throw InvalidArrayIndexException.create(index);
        }
        return this.names.get((int) index);
    }
}
