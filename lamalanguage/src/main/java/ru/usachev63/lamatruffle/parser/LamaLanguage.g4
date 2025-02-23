grammar LamaLanguage;

@parser::header
{
// DO NOT MODIFY - generated from LamaLanguage.g4 using antlr4

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.oracle.truffle.api.*;
import com.oracle.truffle.api.source.*;
import ru.usachev63.lamatruffle.*;
import ru.usachev63.lamatruffle.nodes.*;
}

@parser::members
{
private LamaNodeFactory factory;

private static final class BailoutErrorListener extends BaseErrorListener {
    private final Source source;
    BailoutErrorListener(Source source) {
        this.source = source;
    }
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        throwParseError(source, line, charPositionInLine, (Token) offendingSymbol, msg);
    }
}

private static void throwParseError(Source source, int line, int charPositionInLine, Token token, String message) {
    int col = charPositionInLine + 1;
    String location = "-- line " + line + " col " + col + ": ";
    int length = token == null ? 1 : Math.max(token.getStopIndex() - token.getStartIndex(), 0);
    throw new LamaParseError(source, line, col, length, String.format("Error(s) parsing script:%n" + location + message));
}

public static RootCallTarget parseLama(LamaLanguage language, Source source) {
    LamaLanguageLexer lexer = new LamaLanguageLexer(CharStreams.fromString(source.getCharacters().toString()));
    LamaLanguageParser parser = new LamaLanguageParser(new CommonTokenStream(lexer));
    lexer.removeErrorListeners();
    parser.removeErrorListeners();
    BailoutErrorListener listener = new BailoutErrorListener(source);
    lexer.addErrorListener(listener);
    parser.addErrorListener(listener);
    parser.factory = new LamaNodeFactory(language, source);
    parser.lama();
    return parser.factory.getMain().getCallTarget();
}
}

// parser

lama
:
scopeExpr { factory.createMain($scopeExpr.result); }
EOF
;

scopeExpr returns [ScopeExpr result]
: { factory.startScope(); }
definition*
primary? { Expr body = null;
           if ($primary.ctx != null)
             body = $primary.result;
           $result = factory.finishScope(body);
         }
;

definition
:
'var'
LIDENT { factory.addVarDef($LIDENT); }
(
  ','
  LIDENT { factory.addVarDef($LIDENT); }
) *
';'
;

primary returns [Expr result]
:
const_ { $result = $const_.result; }
|
stringLiteral { $result = $stringLiteral.result; }
;

const_ returns [Const result]
:
DECIMAL { $result = factory.createConst($DECIMAL); }
;

stringLiteral returns [StringLiteral result]
:
STRING { $result = factory.createStringLiteral($STRING); }
;

// lexer

WS : [ \t\r\n\u000C]+ -> skip;
COMMENT : '(*' .*? '*)' -> skip;
LINE_COMMENT : '--' ~[\r\n]* -> skip;

fragment NON_ZERO_DIGIT : [1-9];
fragment DIGIT : [0-9];

UIDENT : [A-Z][a-zA-Z_0-9]*;
LIDENT : [a-z][a-zA-Z_0-9]*;
DECIMAL : '-'? [0-9]+;
STRING : '"' (~["\r\n] | '""')* '"';
