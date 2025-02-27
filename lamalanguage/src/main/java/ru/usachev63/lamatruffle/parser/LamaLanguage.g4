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
import ru.usachev63.lamatruffle.nodes.expr.*;
import ru.usachev63.lamatruffle.nodes.expr.numeric.*;
import ru.usachev63.lamatruffle.nodes.builtins.*;
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

scopeExpr[Attr attr] returns [ScopeExprNode result]
: { factory.startScope(); }
definition*
expression[attr]? { ExprNode body = null;
                    if ($expression.ctx != null)
                      body = $expression.result;
                    $result = factory.finishScope(body);
                  }
;

definition
:
variableDefinition
;

variableDefinition
:
'var'
variableDefinitionSequence
';'
;

variableDefinitionSequence
:
variableDefinitionItem
(
  ','
  variableDefinitionItem
) *
;

variableDefinitionItem
:
LIDENT ('=' basicExpression[Attr.VAL])? {
  int frameSlot = factory.addVarDef($LIDENT);
  if ($basicExpression.ctx != null)
    factory.addVarInitializer(frameSlot, $basicExpression.result);
}
;

expression[Attr attr] returns [ExprNode result]
:
  basicExpression[attr] { $result = $basicExpression.result; }
|
  basicExpression[Attr.VOID]
  ';'
  expression[attr] { $result = new SeqNode($basicExpression.result, $expression.result); }
;

basicExpression[Attr attr] returns [ExprNode result]
:
  maybeAssignment[attr] { $result = $maybeAssignment.result; }
;

maybeAssignment[Attr attr] returns [ExprNode result]
:
  {$attr != Attr.REF}?
  lhs=varRef[Attr.REF] ':=' rhs=maybeAssignment[Attr.VAL] {
    $result = factory.createAssn($lhs.result, $rhs.result);
  }
|
  maybeCmp[attr] { $result = $maybeCmp.result; }
;

maybeCmp[Attr attr] returns [ExprNode result]
:
  {$attr != Attr.REF}?
  lhs=maybeAddSub[Attr.VAL]
  op=('==' | '!=' | '<=' | '<' | '>=' | '>')
  rhs=maybeAddSub[Attr.VAL] {
    $result = factory.createBinary($op, $lhs.result, $rhs.result);
  }
|
  maybeAddSub[attr] { $result = $maybeAddSub.result; }
;

maybeAddSub[Attr attr] returns [ExprNode result]
:
  maybeMulDivRem[attr] { $result = $maybeMulDivRem.result; }
|
  {$attr != Attr.REF}?
  maybeMulDivRem[Attr.VAL] { $result = $maybeMulDivRem.result; }
  (
    op=('+' | '-') rhs=maybeMulDivRem[Attr.VAL] {
      $result = factory.createBinary($op, $result, $rhs.result);
    }
  )+
;

maybeMulDivRem[Attr attr] returns [ExprNode result]
:
binaryOperand[attr] { $result = $binaryOperand.result; }
|
{$attr != Attr.REF}? binaryOperand[Attr.VAL] { $result = $binaryOperand.result; }
(
  op=('*' | '/' | '%') rhs=binaryOperand[Attr.VAL] {
    $result = factory.createBinary($op, $result, $rhs.result);
  }
)+
;

binaryOperand[Attr attr] returns [ExprNode result]
:
  postfixExpression[attr] {
    $result = $postfixExpression.result;
  }
;

postfixExpression[Attr attr] returns [ExprNode result]
:
  primary[attr] { $result = $primary.result; }
| {$attr != Attr.REF}?
  'write' '(' arg=expression[attr.VAL] ')' {
    $result = new WriteBuiltinNode($arg.result);
  }
| {$attr != Attr.REF}?
  'read' '(' ')' {
    $result = new ReadBuiltinNode();
  }
;

primary[Attr attr] returns [ExprNode result]
:
  {$attr != Attr.REF}?
  const_ { $result = $const_.result; }
|
  {$attr != Attr.REF}?
  stringLiteral { $result = $stringLiteral.result; }
|
  {$attr != Attr.REF}?
  charLiteral { $result = $charLiteral.result; }
|
  varRef[attr] { $result = $varRef.result; }
|
  {$attr != Attr.REF}?
  'true' { $result = new LongLiteralNode(1); }
|
  {$attr != Attr.REF}?
  'false' { $result = new LongLiteralNode(0); }
|
  '(' scopeExpr[attr] ')' { $result = $scopeExpr.result; }
| {$attr == Attr.VOID}?
  whileDoExpression { $result = $whileDoExpression.result; }
;

const_ returns [LongLiteralNode result]
:
DECIMAL { $result = factory.createConst($DECIMAL); }
;

stringLiteral returns [StringLiteralNode result]
:
STRING { $result = factory.createStringLiteral($STRING); }
;

charLiteral returns [LongLiteralNode result]
:
CHAR { $result = factory.createCharLiteral($CHAR); }
;

varRef[Attr attr] returns [ExprNode result]
:
LIDENT {
  LocalVarRefNode ref = factory.createLocalVarRef($LIDENT);
  if (attr == Attr.REF)
    $result = ref;
  else
    $result = factory.createVarRead(ref);
  }
;

whileDoExpression returns [ExprNode result]
:
  'while' cond=expression[Attr.VAL] 'do' body=scopeExpr[Attr.VOID] 'od' {
    $result = factory.createWhile($cond.result, $body.result);
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