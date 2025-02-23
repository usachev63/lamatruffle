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
    parser.factory = new LamaNodeFactory(language);
    parser.lama();
    return parser.factory.getMain().getCallTarget();
}
}

// parser

lama
:
const_ { factory.createMain($const_.result); }
;

const_ returns [Const result]
:
NUMERIC_LITERAL { $result = factory.createConst($NUMERIC_LITERAL); }
;

// lexer

WS : [ \t\r\n\u000C]+ -> skip;
COMMENT : '(*' .*? '*)' -> skip;
LINE_COMMENT : '--' ~[\r\n]* -> skip;

fragment LETTER : [a-z];
fragment NON_ZERO_DIGIT : [1-9];
fragment DIGIT : [0-9];

NUMERIC_LITERAL : '0' | NON_ZERO_DIGIT DIGIT*;
