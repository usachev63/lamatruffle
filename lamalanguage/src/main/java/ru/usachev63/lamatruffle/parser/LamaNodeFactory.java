package ru.usachev63.lamatruffle.parser;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlotKind;
import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.api.strings.TruffleString;
import org.antlr.v4.runtime.Token;
import ru.usachev63.lamatruffle.LamaLanguage;
import ru.usachev63.lamatruffle.nodes.*;
import ru.usachev63.lamatruffle.nodes.expr.*;

import java.util.*;

public class LamaNodeFactory {
    public LamaNodeFactory(LamaLanguage language, Source source) {
        this.language = language;
        this.source=source;
    }

    public LamaRootNode getMain() {return main;}

    public void createMain(ScopeExprNode body) {
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
    private List<AssnNode> scopeInitializers;

    public void startScope() {
        lexicalScope = new LexicalScope(lexicalScope);
        scopeInitializers = new ArrayList<>();
    }

    public int addVarDef(Token varNameToken) {
        TruffleString name = TruffleString.fromJavaStringUncached(varNameToken.getText(), TruffleString.Encoding.US_ASCII);
        if (lexicalScope.find(name) != null) {
            throw new LamaParseError(source, varNameToken.getLine(), varNameToken.getCharPositionInLine(), 1, String.format("cannot redefine %s", name));
        }
        int slot = frameDescriptorBuilder.addSlot(FrameSlotKind.Illegal, name, null);
        lexicalScope.locals.put(name, slot);
        return slot;
    }

    public void addVarInitializer(int frameSlot, ExprNode value) {
        scopeInitializers.add(new AssnNode(new LocalVarRefNode(frameSlot), value));
    }

    public ScopeExprNode finishScope(ExprNode body) {
        if (body == null)
            body = new SkipNode();
        Collections.reverse(scopeInitializers);
        for (AssnNode init : scopeInitializers) {
            body = new SeqNode(init, body);
        }
        ScopeExprNode result = new ScopeExprNode(null, body);
        lexicalScope = null;
        scopeInitializers = null;
        return result;
    }

    /* parsing scope end */

    public LongLiteralNode createConst(Token literalToken) {
        try {
            return new LongLiteralNode(Long.parseLong(literalToken.getText()));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public StringLiteralNode createStringLiteral(Token literalToken) {
        return new StringLiteralNode(TruffleString.fromJavaStringUncached(stringLiteralValueOf(literalToken.getText()), TruffleString.Encoding.US_ASCII));
    }

    private String stringLiteralValueOf(String rawText) {
        assert rawText.length() >= 2;
        return rawText.substring(1, rawText.length() - 1).replaceAll("\"\"", "\"");
    }

    public LongLiteralNode createCharLiteral(Token literalToken) {
        String tokenText = literalToken.getText();
        assert tokenText.length() >= 3;
        assert tokenText.charAt(0) == '\'';
        assert tokenText.charAt(literalToken.getText().length() - 1) == '\'';
        String innerText = tokenText.substring(1, tokenText.length() - 1);
        switch (innerText) {
            case "''" -> {
                return new LongLiteralNode((int) '\'');
            }
            case "\\n" -> {
                return new LongLiteralNode((int) '\n');
            }
            case "\\t" -> {
                return new LongLiteralNode((int) '\t');
            }
            default -> {
                assert innerText.length() == 1;
                return new LongLiteralNode((int)innerText.charAt(0));
            }
        }
    }

    public LocalVarRefNode createLocalVarRef(Token varNameToken) {
        String varName = varNameToken.getText();
        Integer frameSlot = lexicalScope.find(TruffleString.fromJavaStringUncached(varName, TruffleString.Encoding.US_ASCII));
        if (frameSlot == null) {
            throw new LamaParseError(source, varNameToken.getLine(), varNameToken.getCharPositionInLine(), 1, String.format("failed to resolve %s", varName));
        }
        return new LocalVarRefNode(frameSlot);
    }

    public AssnNode createAssn(ExprNode lhs, ExprNode rhs) {
        return new AssnNode((LocalVarRefNode) lhs, rhs);
    }

    public VarReadNode createVarRead(LocalVarRefNode var) {
        return new VarReadNode(var);
    }

    public ExprNode createBinary(Token opToken, ExprNode lhs, ExprNode rhs) {
        return switch (opToken.getText()) {
            case "+" -> AddNodeGen.create(lhs, rhs);
            case "-" -> SubNodeGen.create(lhs, rhs);
            case "*" -> MulNodeGen.create(lhs, rhs);
            case "/" -> DivNodeGen.create(lhs, rhs);
            case "%" -> RemNodeGen.create(lhs, rhs);
            default -> throw new IllegalStateException();
        };
    }
}
