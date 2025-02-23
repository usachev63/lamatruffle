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

private enum Attr {
    VAL,
    REF,
    VOID,
    WEAK,
};
}

// parser

lama
:
scopeExpr[Attr.VOID] { factory.createMain($scopeExpr.result); }
EOF
;

scopeExpr[Attr attr] returns [ScopeExpr result]
: { factory.startScope(); }
definition*
expression[attr]? { Expr body = null;
                    if ($expression.ctx != null)
                      body = $expression.result;
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

expression[Attr attr] returns [Expr result]
:
basicExpression[attr] { $result = $basicExpression.result; }
|
basicExpression[Attr.VOID]
';'
expression[attr] { $result = new Seq($basicExpression.result, $expression.result); }
;

basicExpression[Attr attr] returns [Expr result]
:
binaryExpression[attr] { $result = $binaryExpression.result; }
;

binaryExpression[Attr attr] returns [Expr result]
:
varRef[Attr.REF] ':=' binaryOperand[Attr.VAL] { $result = factory.createAssn($varRef.result, $binaryOperand.result); }
|
binaryOperand[attr] { $result = $binaryOperand.result; }
;

binaryOperand[Attr attr] returns [Expr result]
:
postfixExpression[attr] { $result = $postfixExpression.result; }
;

postfixExpression[Attr attr] returns [Expr result]
:
primary[attr] { $result = $primary.result; }
;

primary[Attr attr] returns [Expr result]
:
{$attr != Attr.REF}? const_ { $result = $const_.result; }
|
{$attr != Attr.REF}? stringLiteral { $result = $stringLiteral.result; }
|
{$attr != Attr.REF}? charLiteral { $result = $charLiteral.result; }
|
varRef[attr] { $result = $varRef.result; }
|
{$attr != Attr.REF}? 'true' { $result = new Const(1); }
|
{$attr != Attr.REF}? 'false' { $result = new Const(0); }
;

const_ returns [Const result]
:
DECIMAL { $result = factory.createConst($DECIMAL); }
;

stringLiteral returns [StringLiteral result]
:
STRING { $result = factory.createStringLiteral($STRING); }
;

charLiteral returns [Const result]
:
CHAR { $result = factory.createCharLiteral($CHAR); }
;

varRef[Attr attr] returns [Expr result]
:
LIDENT {
  if (attr == Attr.VOID)
    $result = new Skip();
  else {
    LocalVarRef ref = factory.createLocalVarRef($LIDENT);
    if (attr == Attr.REF)
      $result = ref;
    else
      $result = factory.createVarRead(ref);
  }
}
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
CHAR : '\'' (
  ~'\''
| '\'\''
| '\\n'
| '\\t'
) '\'';