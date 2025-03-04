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

private static enum Attr {
    VAL,
    REF,
    VOID,
    WEAK,
};

public static class IfThenEntry {
  public ExprNode conditionNode;
  public ExprNode bodyNode;
  public IfThenEntry(ExprNode conditionNode, ExprNode bodyNode) {
    this.conditionNode = conditionNode;
    this.bodyNode = bodyNode;
  }
};

}

// parser

lama
:
  scopeExpression[Attr.VOID, true] { factory.createMain($scopeExpression.result); }
  EOF
;

scopeExpression[Attr attr, boolean popScope] returns [ScopeExprNode result] :
  { factory.startScope(); }
  scopeExpressionNoStart[attr, popScope] {
    $result = $scopeExpressionNoStart.result;
  }
;

scopeExpressionNoStart[Attr attr, boolean popScope] returns [ScopeExprNode result] :
  definition*
  expression[attr]? {
    ExprNode body = null;
    if ($expression.ctx != null)
      body = $expression.result;
    $result = factory.finishScope(body, popScope);
  }
;

definition
:
  variableDefinition
|
  functionDefinition
;

variableDefinition
:
  'var' variableDefinitionSequence ';'
;

variableDefinitionSequence
:
  variableDefinitionItem (',' variableDefinitionItem)*
;

variableDefinitionItem
:
  LIDENT ('=' basicExpression[Attr.VAL])? {
    factory.onVariableDefinition($LIDENT, $basicExpression.ctx != null ? $basicExpression.result : null);
  }
;

functionDefinition
:
  'fun' LIDENT {
    factory.startFrame($LIDENT);
    factory.startScope();
  }
  '(' functionParameters ')'
  '{' body=scopeExpressionNoStart[Attr.VOID, true] '}'
  { factory.finishFrame($body.result); }
;

functionParameters : (functionParameter (',' functionParameter)*)?;

functionParameter : LIDENT { factory.addFormalParameter($LIDENT); };

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
  lhs=maybeConjunction[Attr.REF] ':=' rhs=maybeAssignment[Attr.VAL] {
    $result = factory.createAssn($lhs.result, $rhs.result);
  }
|
  maybeConjunction[attr] { $result = $maybeConjunction.result; }
;

maybeConjunction[Attr attr] returns [ExprNode result]
:
  maybeCmp[attr] { $result = $maybeCmp.result; }
|
  maybeCmp[Attr.VAL] { $result = $maybeCmp.result; }
  (
    op='&&' rhs=maybeCmp[Attr.VAL] {
      $result = factory.createBinary($op, $result, $rhs.result);
    }
  )+
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
| {$attr == Attr.REF}?
  primary[Attr.VAL] { $result = $primary.result; }
  (
    '[' index=expression[Attr.VAL] ']' {
      $result = factory.createElemRef($result, $index.result);
    }
  )+
| {$attr != Attr.REF}?
  primary[Attr.VAL] { $result = $primary.result; }
  (
    '[' index=expression[Attr.VAL] ']' {
      $result = factory.createElemRead($result, $index.result);
    }
  )+
| {$attr != Attr.REF}?
  callee=varRef[Attr.VAL] { List<ExprNode> argumentNodes = new ArrayList<>(); }
  '('
    (
      expression[Attr.VAL] { argumentNodes.add($expression.result); }
      (
        ','
        expression[Attr.VAL] { argumentNodes.add($expression.result); }
      )*
    )?
  ')' {
    $result = factory.createCallExpr($callee.result, argumentNodes);
  }
| {$attr != Attr.REF}?
  { List<ExprNode> argumentNodes = new ArrayList<>(); }
  argument1=primary[Attr.VAL] { argumentNodes.add($argument1.result); }
  '.' callee=varRef[Attr.VAL]
  (
    '('
      expression[Attr.VAL] { argumentNodes.add($expression.result); }
      ( ',' expression[Attr.VAL] { argumentNodes.add($expression.result); } )*
    ')'
  )? {
    $result = factory.createCallExpr($callee.result, argumentNodes);
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
  {$attr == Attr.VOID}?
  'skip' { $result = new SkipNode(); }
|
  '(' scopeExpression[attr, true] ')' { $result = $scopeExpression.result; }
|
  ifExpression[attr] { $result = $ifExpression.result; }
|
  {$attr == Attr.VOID}?
  whileDoExpression { $result = $whileDoExpression.result; }
|
  {$attr == Attr.VOID}?
  doWhileExpression { $result = $doWhileExpression.result; }
|
  {$attr == Attr.VOID}?
  forExpression { $result = $forExpression.result; }
;

const_ returns [LongLiteralNode result]
:
  minus='-'? DECIMAL {
    long value = Long.parseLong($DECIMAL.getText());
    if ($minus != null)
      value = -value;
    $result = new LongLiteralNode(value);
  }
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
    ExprNode refNode = factory.createVarRef($LIDENT);
    if (attr == Attr.REF)
      $result = refNode;
    else
      $result = factory.createVarRead(refNode);
  }
;

ifExpression[Attr attr] returns [ExprNode result]
:
  {
    List<IfThenEntry> ifThenEntries = new ArrayList<>();
  }
  'if' cond=expression[Attr.VAL] 'then' thenBody=expression[attr] {
    ifThenEntries.add(new IfThenEntry($cond.result, $thenBody.result));
  }
  (
    'elif' cond=expression[Attr.VAL] 'then' thenBody=expression[attr] {
      ifThenEntries.add(new IfThenEntry($cond.result, $thenBody.result));
    }
  )*
  elseBranch[attr] 'fi' {
    $result = factory.createIf(ifThenEntries, $elseBranch.result);
  }
;

elseBranch[Attr attr] returns [ExprNode result] // may be null
:
  'else' expression[attr] {
    $result = $expression.result;
  }
| {$attr == Attr.VOID}? { $result = null; }
;

whileDoExpression returns [ExprNode result]
:
  'while' cond=expression[Attr.VAL] 'do' body=scopeExpression[Attr.VOID, true] 'od' {
    $result = factory.createWhile($cond.result, $body.result);
  }
;

doWhileExpression returns [ExprNode result]
:
  'do' body=scopeExpression[Attr.VOID, false] 'while' cond=expression[Attr.VAL] 'od' {
    factory.popScope();
    $result = new SeqNode($body.result, factory.createWhile($cond.result, $body.result));
  }
;

forExpression returns [ExprNode result]
:
  'for' init=scopeExpression[Attr.VOID, false] ',' cond=expression[Attr.VAL] ',' incr=expression[Attr.VOID]
  'do' body=scopeExpression[Attr.VOID, true] 'od' {
    factory.popScope();
    $result = new SeqNode(
      $init.result,
      factory.createWhile(
        $cond.result,
        new SeqNode($body.result, $incr.result)
      )
    );
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
DECIMAL : [0-9]+;
STRING : '"' (~["\r\n] | '""')* '"';
CHAR : '\'' (
  ~'\''
| '\'\''
| '\\n'
| '\\t'
) '\'';