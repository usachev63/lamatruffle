package ru.usachev63.lamatruffle.nodes.builtins;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.dsl.Specialization;
import ru.usachev63.lamatruffle.runtime.LamaString;
import ru.usachev63.lamatruffle.runtime.StringRenderer;

public abstract class StringBuiltinNode extends LamaBuiltinBodyNode {
    @Specialization
    @CompilerDirectives.TruffleBoundary
    protected LamaString renderToString(Object value) {
        return new LamaString(StringRenderer.render(value));
    }
}
