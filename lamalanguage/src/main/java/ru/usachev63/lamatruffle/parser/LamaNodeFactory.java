package ru.usachev63.lamatruffle.parser;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlotKind;
import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.api.strings.TruffleString;
import org.antlr.v4.runtime.Token;
import ru.usachev63.lamatruffle.LamaLanguage;
import ru.usachev63.lamatruffle.nodes.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LamaNodeFactory {
    public LamaNodeFactory(LamaLanguage language, Source source) {
        this.language = language;
        this.source=source;
    }

    public LamaRootNode getMain() {return main;}

    public void createMain(ScopeExpr body) {
        this.main = new LamaRootNode(language, frameDescriptorBuilder.build(), body, null, TruffleString.fromJavaStringUncached("main", TruffleString.Encoding.UTF_8));
        frameDescriptorBuilder = null;
    }

    private final LamaLanguage language;
    private final Source source;
    private LamaRootNode main;

    /* State while parsing a function. */
    private FrameDescriptor.Builder frameDescriptorBuilder = FrameDescriptor.newBuilder();

    static class LexicalScope {
        protected final LexicalScope outer;
        protected final Map<TruffleString, Integer> locals = new HashMap<>();

        LexicalScope(LexicalScope outer) {
            this.outer = outer;
        }

        public Integer find(TruffleString name) {
            Integer result = locals.get(name);
            if (result != null) {
                return result;
            } else if (outer != null) {
                return outer.find(name);
            } else {
                return null;
            }
        }
    }

    /* parsing scope begin */

    private LexicalScope lexicalScope;

    public void startScope() {
        lexicalScope = new LexicalScope(lexicalScope);
    }

    public void addVarDef(Token varNameToken) {
        TruffleString name = TruffleString.fromJavaStringUncached(varNameToken.getText(), TruffleString.Encoding.US_ASCII);
        if (lexicalScope.find(name) != null) {
            throw new LamaParseError(source, varNameToken.getLine(), varNameToken.getCharPositionInLine(), 1, String.format("cannot redefine %s", name));
        }
        int slot = frameDescriptorBuilder.addSlot(FrameSlotKind.Illegal, name, null);
        lexicalScope.locals.put(name, slot);
    }

    public ScopeExpr finishScope(Expr body) {
        ScopeExpr result = new ScopeExpr(null, body);
        lexicalScope = null;
        return result;
    }

    /* parsing scope end */

    public Const createConst(Token literalToken) {
        try {
            return new Const(Long.parseLong(literalToken.getText()));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public StringLiteral createStringLiteral(Token literalToken) {
        return new StringLiteral(TruffleString.fromJavaStringUncached(stringLiteralValueOf(literalToken.getText()), TruffleString.Encoding.US_ASCII));
    }

    private String stringLiteralValueOf(String rawText) {
        assert rawText.length() >= 2;
        return rawText.substring(1, rawText.length() - 1).replaceAll("\"\"", "\"");
    }

    public Const createCharLiteral(Token literalToken) {
        String tokenText = literalToken.getText();
        assert tokenText.length() >= 3;
        assert tokenText.charAt(0) == '\'';
        assert tokenText.charAt(literalToken.getText().length() - 1) == '\'';
        String innerText = tokenText.substring(1, tokenText.length() - 1);
        switch (innerText) {
            case "''" -> {
                return new Const((int) '\'');
            }
            case "\\n" -> {
                return new Const((int) '\n');
            }
            case "\\t" -> {
                return new Const((int) '\t');
            }
            default -> {
                assert innerText.length() == 1;
                return new Const((int)innerText.charAt(0));
            }
        }
    }
}
