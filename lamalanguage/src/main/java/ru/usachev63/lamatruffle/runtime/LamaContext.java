package ru.usachev63.lamatruffle.runtime;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.nodes.Node;
import ru.usachev63.lamatruffle.LamaLanguage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public final class LamaContext {
    private final LamaLanguage language;
    @CompilerDirectives.CompilationFinal
    private TruffleLanguage.Env env;
    private final BufferedReader input;
    private final PrintWriter output;

    public LamaContext(LamaLanguage language, TruffleLanguage.Env env) {
        this.language = language;
        this.env = env;
        this.input = new BufferedReader(new InputStreamReader(env.in()));
        this.output = new PrintWriter(env.out(), true);
    }

    private static final TruffleLanguage.ContextReference<LamaContext> REFERENCE = TruffleLanguage.ContextReference.create(LamaLanguage.class);

    public static LamaContext get(Node node) {
        return REFERENCE.get(node);
    }

    public BufferedReader getInput() {
        return input;
    }

    public PrintWriter getOutput() {
        return output;
    }
}