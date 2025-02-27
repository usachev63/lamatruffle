// Generated from /home/danila/SPbU/year4/VM/simplelanguage/lamalanguage/src/main/java/ru/usachev63/lamatruffle/parser/LamaLanguage.g4 by ANTLR 4.13.2
package ru.usachev63.lamatruffle.parser;

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

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LamaLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, WS=33, COMMENT=34, LINE_COMMENT=35, UIDENT=36, LIDENT=37, DECIMAL=38, 
		STRING=39, CHAR=40;
	public static final int
		RULE_lama = 0, RULE_scopeExpr = 1, RULE_definition = 2, RULE_variableDefinition = 3, 
		RULE_variableDefinitionSequence = 4, RULE_variableDefinitionItem = 5, 
		RULE_expression = 6, RULE_basicExpression = 7, RULE_maybeAssignment = 8, 
		RULE_maybeConjunction = 9, RULE_maybeCmp = 10, RULE_maybeAddSub = 11, 
		RULE_maybeMulDivRem = 12, RULE_binaryOperand = 13, RULE_postfixExpression = 14, 
		RULE_primary = 15, RULE_const_ = 16, RULE_stringLiteral = 17, RULE_charLiteral = 18, 
		RULE_varRef = 19, RULE_ifExpression = 20, RULE_elseBranch = 21, RULE_whileDoExpression = 22, 
		RULE_doWhileExpression = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"lama", "scopeExpr", "definition", "variableDefinition", "variableDefinitionSequence", 
			"variableDefinitionItem", "expression", "basicExpression", "maybeAssignment", 
			"maybeConjunction", "maybeCmp", "maybeAddSub", "maybeMulDivRem", "binaryOperand", 
			"postfixExpression", "primary", "const_", "stringLiteral", "charLiteral", 
			"varRef", "ifExpression", "elseBranch", "whileDoExpression", "doWhileExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "';'", "','", "'='", "':='", "'&&'", "'=='", "'!='", "'<='", 
			"'<'", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'write'", "'('", 
			"')'", "'read'", "'true'", "'false'", "'skip'", "'if'", "'then'", "'elif'", 
			"'fi'", "'else'", "'while'", "'do'", "'od'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "WS", "COMMENT", 
			"LINE_COMMENT", "UIDENT", "LIDENT", "DECIMAL", "STRING", "CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LamaLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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


	public LamaLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LamaContext extends ParserRuleContext {
		public ScopeExprContext scopeExpr;
		public ScopeExprContext scopeExpr() {
			return getRuleContext(ScopeExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LamaLanguageParser.EOF, 0); }
		public LamaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lama; }
	}

	public final LamaContext lama() throws RecognitionException {
		LamaContext _localctx = new LamaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lama);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			((LamaContext)_localctx).scopeExpr = scopeExpr(Attr.VOID, true);
			 factory.createMain(((LamaContext)_localctx).scopeExpr.result); 
			setState(50);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScopeExprContext extends ParserRuleContext {
		public Attr attr;
		public boolean popScope;
		public ScopeExprNode result;
		public ExpressionContext expression;
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ScopeExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ScopeExprContext(ParserRuleContext parent, int invokingState, Attr attr, boolean popScope) {
			super(parent, invokingState);
			this.attr = attr;
			this.popScope = popScope;
		}
		@Override public int getRuleIndex() { return RULE_scopeExpr; }
	}

	public final ScopeExprContext scopeExpr(Attr attr,boolean popScope) throws RecognitionException {
		ScopeExprContext _localctx = new ScopeExprContext(_ctx, getState(), attr, popScope);
		enterRule(_localctx, 2, RULE_scopeExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 factory.startScope(); 
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(53);
					definition();
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(59);
				((ScopeExprContext)_localctx).expression = expression(attr);
				}
				break;
			}
			 ExprNode body = null;
			                    if (((ScopeExprContext)_localctx).expression != null)
			                      body = ((ScopeExprContext)_localctx).expression.result;
			                    ((ScopeExprContext)_localctx).result =  factory.finishScope(body, popScope);
			                  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			variableDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDefinitionContext extends ParserRuleContext {
		public VariableDefinitionSequenceContext variableDefinitionSequence() {
			return getRuleContext(VariableDefinitionSequenceContext.class,0);
		}
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__0);
			setState(67);
			variableDefinitionSequence();
			setState(68);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDefinitionSequenceContext extends ParserRuleContext {
		public List<VariableDefinitionItemContext> variableDefinitionItem() {
			return getRuleContexts(VariableDefinitionItemContext.class);
		}
		public VariableDefinitionItemContext variableDefinitionItem(int i) {
			return getRuleContext(VariableDefinitionItemContext.class,i);
		}
		public VariableDefinitionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinitionSequence; }
	}

	public final VariableDefinitionSequenceContext variableDefinitionSequence() throws RecognitionException {
		VariableDefinitionSequenceContext _localctx = new VariableDefinitionSequenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableDefinitionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			variableDefinitionItem();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(71);
				match(T__2);
				setState(72);
				variableDefinitionItem();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDefinitionItemContext extends ParserRuleContext {
		public Token LIDENT;
		public BasicExpressionContext basicExpression;
		public TerminalNode LIDENT() { return getToken(LamaLanguageParser.LIDENT, 0); }
		public BasicExpressionContext basicExpression() {
			return getRuleContext(BasicExpressionContext.class,0);
		}
		public VariableDefinitionItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinitionItem; }
	}

	public final VariableDefinitionItemContext variableDefinitionItem() throws RecognitionException {
		VariableDefinitionItemContext _localctx = new VariableDefinitionItemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDefinitionItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((VariableDefinitionItemContext)_localctx).LIDENT = match(LIDENT);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(79);
				match(T__3);
				setState(80);
				((VariableDefinitionItemContext)_localctx).basicExpression = basicExpression(Attr.VAL);
				}
			}


			  int frameSlot = factory.addVarDef(((VariableDefinitionItemContext)_localctx).LIDENT);
			  if (((VariableDefinitionItemContext)_localctx).basicExpression != null)
			    factory.addVarInitializer(frameSlot, ((VariableDefinitionItemContext)_localctx).basicExpression.result);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public BasicExpressionContext basicExpression;
		public ExpressionContext expression;
		public BasicExpressionContext basicExpression() {
			return getRuleContext(BasicExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression(Attr attr) throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState(), attr);
		enterRule(_localctx, 12, RULE_expression);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				((ExpressionContext)_localctx).basicExpression = basicExpression(attr);
				 ((ExpressionContext)_localctx).result =  ((ExpressionContext)_localctx).basicExpression.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				((ExpressionContext)_localctx).basicExpression = basicExpression(Attr.VOID);
				setState(89);
				match(T__1);
				setState(90);
				((ExpressionContext)_localctx).expression = expression(attr);
				 ((ExpressionContext)_localctx).result =  new SeqNode(((ExpressionContext)_localctx).basicExpression.result, ((ExpressionContext)_localctx).expression.result); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BasicExpressionContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public MaybeAssignmentContext maybeAssignment;
		public MaybeAssignmentContext maybeAssignment() {
			return getRuleContext(MaybeAssignmentContext.class,0);
		}
		public BasicExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BasicExpressionContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_basicExpression; }
	}

	public final BasicExpressionContext basicExpression(Attr attr) throws RecognitionException {
		BasicExpressionContext _localctx = new BasicExpressionContext(_ctx, getState(), attr);
		enterRule(_localctx, 14, RULE_basicExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			((BasicExpressionContext)_localctx).maybeAssignment = maybeAssignment(attr);
			 ((BasicExpressionContext)_localctx).result =  ((BasicExpressionContext)_localctx).maybeAssignment.result; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MaybeAssignmentContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public VarRefContext lhs;
		public MaybeAssignmentContext rhs;
		public MaybeConjunctionContext maybeConjunction;
		public VarRefContext varRef() {
			return getRuleContext(VarRefContext.class,0);
		}
		public MaybeAssignmentContext maybeAssignment() {
			return getRuleContext(MaybeAssignmentContext.class,0);
		}
		public MaybeConjunctionContext maybeConjunction() {
			return getRuleContext(MaybeConjunctionContext.class,0);
		}
		public MaybeAssignmentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MaybeAssignmentContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_maybeAssignment; }
	}

	public final MaybeAssignmentContext maybeAssignment(Attr attr) throws RecognitionException {
		MaybeAssignmentContext _localctx = new MaybeAssignmentContext(_ctx, getState(), attr);
		enterRule(_localctx, 16, RULE_maybeAssignment);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(99);
				((MaybeAssignmentContext)_localctx).lhs = varRef(Attr.REF);
				setState(100);
				match(T__4);
				setState(101);
				((MaybeAssignmentContext)_localctx).rhs = maybeAssignment(Attr.VAL);

				    ((MaybeAssignmentContext)_localctx).result =  factory.createAssn(((MaybeAssignmentContext)_localctx).lhs.result, ((MaybeAssignmentContext)_localctx).rhs.result);
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				((MaybeAssignmentContext)_localctx).maybeConjunction = maybeConjunction(attr);
				 ((MaybeAssignmentContext)_localctx).result =  ((MaybeAssignmentContext)_localctx).maybeConjunction.result; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MaybeConjunctionContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public MaybeCmpContext maybeCmp;
		public Token op;
		public MaybeCmpContext rhs;
		public List<MaybeCmpContext> maybeCmp() {
			return getRuleContexts(MaybeCmpContext.class);
		}
		public MaybeCmpContext maybeCmp(int i) {
			return getRuleContext(MaybeCmpContext.class,i);
		}
		public MaybeConjunctionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MaybeConjunctionContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_maybeConjunction; }
	}

	public final MaybeConjunctionContext maybeConjunction(Attr attr) throws RecognitionException {
		MaybeConjunctionContext _localctx = new MaybeConjunctionContext(_ctx, getState(), attr);
		enterRule(_localctx, 18, RULE_maybeConjunction);
		try {
			int _alt;
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				((MaybeConjunctionContext)_localctx).maybeCmp = maybeCmp(attr);
				 ((MaybeConjunctionContext)_localctx).result =  ((MaybeConjunctionContext)_localctx).maybeCmp.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				((MaybeConjunctionContext)_localctx).maybeCmp = maybeCmp(Attr.VAL);
				 ((MaybeConjunctionContext)_localctx).result =  ((MaybeConjunctionContext)_localctx).maybeCmp.result; 
				setState(118); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(114);
						((MaybeConjunctionContext)_localctx).op = match(T__5);
						setState(115);
						((MaybeConjunctionContext)_localctx).rhs = ((MaybeConjunctionContext)_localctx).maybeCmp = maybeCmp(Attr.VAL);

						      ((MaybeConjunctionContext)_localctx).result =  factory.createBinary(((MaybeConjunctionContext)_localctx).op, _localctx.result, ((MaybeConjunctionContext)_localctx).rhs.result);
						    
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(120); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MaybeCmpContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public MaybeAddSubContext lhs;
		public Token op;
		public MaybeAddSubContext rhs;
		public MaybeAddSubContext maybeAddSub;
		public List<MaybeAddSubContext> maybeAddSub() {
			return getRuleContexts(MaybeAddSubContext.class);
		}
		public MaybeAddSubContext maybeAddSub(int i) {
			return getRuleContext(MaybeAddSubContext.class,i);
		}
		public MaybeCmpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MaybeCmpContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_maybeCmp; }
	}

	public final MaybeCmpContext maybeCmp(Attr attr) throws RecognitionException {
		MaybeCmpContext _localctx = new MaybeCmpContext(_ctx, getState(), attr);
		enterRule(_localctx, 20, RULE_maybeCmp);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(125);
				((MaybeCmpContext)_localctx).lhs = maybeAddSub(Attr.VAL);
				setState(126);
				((MaybeCmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8064L) != 0)) ) {
					((MaybeCmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(127);
				((MaybeCmpContext)_localctx).rhs = maybeAddSub(Attr.VAL);

				    ((MaybeCmpContext)_localctx).result =  factory.createBinary(((MaybeCmpContext)_localctx).op, ((MaybeCmpContext)_localctx).lhs.result, ((MaybeCmpContext)_localctx).rhs.result);
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				((MaybeCmpContext)_localctx).maybeAddSub = maybeAddSub(attr);
				 ((MaybeCmpContext)_localctx).result =  ((MaybeCmpContext)_localctx).maybeAddSub.result; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MaybeAddSubContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public MaybeMulDivRemContext maybeMulDivRem;
		public Token op;
		public MaybeMulDivRemContext rhs;
		public List<MaybeMulDivRemContext> maybeMulDivRem() {
			return getRuleContexts(MaybeMulDivRemContext.class);
		}
		public MaybeMulDivRemContext maybeMulDivRem(int i) {
			return getRuleContext(MaybeMulDivRemContext.class,i);
		}
		public MaybeAddSubContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MaybeAddSubContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_maybeAddSub; }
	}

	public final MaybeAddSubContext maybeAddSub(Attr attr) throws RecognitionException {
		MaybeAddSubContext _localctx = new MaybeAddSubContext(_ctx, getState(), attr);
		enterRule(_localctx, 22, RULE_maybeAddSub);
		int _la;
		try {
			int _alt;
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				((MaybeAddSubContext)_localctx).maybeMulDivRem = maybeMulDivRem(attr);
				 ((MaybeAddSubContext)_localctx).result =  ((MaybeAddSubContext)_localctx).maybeMulDivRem.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(139);
				((MaybeAddSubContext)_localctx).maybeMulDivRem = maybeMulDivRem(Attr.VAL);
				 ((MaybeAddSubContext)_localctx).result =  ((MaybeAddSubContext)_localctx).maybeMulDivRem.result; 
				setState(145); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(141);
						((MaybeAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__13) ) {
							((MaybeAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(142);
						((MaybeAddSubContext)_localctx).rhs = ((MaybeAddSubContext)_localctx).maybeMulDivRem = maybeMulDivRem(Attr.VAL);

						      ((MaybeAddSubContext)_localctx).result =  factory.createBinary(((MaybeAddSubContext)_localctx).op, _localctx.result, ((MaybeAddSubContext)_localctx).rhs.result);
						    
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(147); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MaybeMulDivRemContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public BinaryOperandContext binaryOperand;
		public Token op;
		public BinaryOperandContext rhs;
		public List<BinaryOperandContext> binaryOperand() {
			return getRuleContexts(BinaryOperandContext.class);
		}
		public BinaryOperandContext binaryOperand(int i) {
			return getRuleContext(BinaryOperandContext.class,i);
		}
		public MaybeMulDivRemContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MaybeMulDivRemContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_maybeMulDivRem; }
	}

	public final MaybeMulDivRemContext maybeMulDivRem(Attr attr) throws RecognitionException {
		MaybeMulDivRemContext _localctx = new MaybeMulDivRemContext(_ctx, getState(), attr);
		enterRule(_localctx, 24, RULE_maybeMulDivRem);
		int _la;
		try {
			int _alt;
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				((MaybeMulDivRemContext)_localctx).binaryOperand = binaryOperand(attr);
				 ((MaybeMulDivRemContext)_localctx).result =  ((MaybeMulDivRemContext)_localctx).binaryOperand.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(155);
				((MaybeMulDivRemContext)_localctx).binaryOperand = binaryOperand(Attr.VAL);
				 ((MaybeMulDivRemContext)_localctx).result =  ((MaybeMulDivRemContext)_localctx).binaryOperand.result; 
				setState(161); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(157);
						((MaybeMulDivRemContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 229376L) != 0)) ) {
							((MaybeMulDivRemContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(158);
						((MaybeMulDivRemContext)_localctx).rhs = ((MaybeMulDivRemContext)_localctx).binaryOperand = binaryOperand(Attr.VAL);

						    ((MaybeMulDivRemContext)_localctx).result =  factory.createBinary(((MaybeMulDivRemContext)_localctx).op, _localctx.result, ((MaybeMulDivRemContext)_localctx).rhs.result);
						  
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(163); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryOperandContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public PostfixExpressionContext postfixExpression;
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public BinaryOperandContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BinaryOperandContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_binaryOperand; }
	}

	public final BinaryOperandContext binaryOperand(Attr attr) throws RecognitionException {
		BinaryOperandContext _localctx = new BinaryOperandContext(_ctx, getState(), attr);
		enterRule(_localctx, 26, RULE_binaryOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((BinaryOperandContext)_localctx).postfixExpression = postfixExpression(attr);

			    ((BinaryOperandContext)_localctx).result =  ((BinaryOperandContext)_localctx).postfixExpression.result;
			  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExpressionContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public PrimaryContext primary;
		public ExpressionContext arg;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	}

	public final PostfixExpressionContext postfixExpression(Attr attr) throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState(), attr);
		enterRule(_localctx, 28, RULE_postfixExpression);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				((PostfixExpressionContext)_localctx).primary = primary(attr);
				 ((PostfixExpressionContext)_localctx).result =  ((PostfixExpressionContext)_localctx).primary.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(174);
				match(T__17);
				setState(175);
				match(T__18);
				setState(176);
				((PostfixExpressionContext)_localctx).arg = expression(attr.VAL);
				setState(177);
				match(T__19);

				    ((PostfixExpressionContext)_localctx).result =  new WriteBuiltinNode(((PostfixExpressionContext)_localctx).arg.result);
				  
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(181);
				match(T__20);
				setState(182);
				match(T__18);
				setState(183);
				match(T__19);

				    ((PostfixExpressionContext)_localctx).result =  new ReadBuiltinNode();
				  
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public Const_Context const_;
		public StringLiteralContext stringLiteral;
		public CharLiteralContext charLiteral;
		public VarRefContext varRef;
		public ScopeExprContext scopeExpr;
		public IfExpressionContext ifExpression;
		public WhileDoExpressionContext whileDoExpression;
		public DoWhileExpressionContext doWhileExpression;
		public Const_Context const_() {
			return getRuleContext(Const_Context.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public VarRefContext varRef() {
			return getRuleContext(VarRefContext.class,0);
		}
		public ScopeExprContext scopeExpr() {
			return getRuleContext(ScopeExprContext.class,0);
		}
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public WhileDoExpressionContext whileDoExpression() {
			return getRuleContext(WhileDoExpressionContext.class,0);
		}
		public DoWhileExpressionContext doWhileExpression() {
			return getRuleContext(DoWhileExpressionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PrimaryContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary(Attr attr) throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState(), attr);
		enterRule(_localctx, 30, RULE_primary);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(188);
				((PrimaryContext)_localctx).const_ = const_();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).const_.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(192);
				((PrimaryContext)_localctx).stringLiteral = stringLiteral();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).stringLiteral.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(196);
				((PrimaryContext)_localctx).charLiteral = charLiteral();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).charLiteral.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				((PrimaryContext)_localctx).varRef = varRef(attr);
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).varRef.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(203);
				match(T__21);
				 ((PrimaryContext)_localctx).result =  new LongLiteralNode(1); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(206);
				match(T__22);
				 ((PrimaryContext)_localctx).result =  new LongLiteralNode(0); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(208);
				if (!(_localctx.attr == Attr.VOID)) throw new FailedPredicateException(this, "$attr == Attr.VOID");
				setState(209);
				match(T__23);
				 ((PrimaryContext)_localctx).result =  new SkipNode(); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(211);
				match(T__18);
				setState(212);
				((PrimaryContext)_localctx).scopeExpr = scopeExpr(attr, true);
				setState(213);
				match(T__19);
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).scopeExpr.result; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(216);
				((PrimaryContext)_localctx).ifExpression = ifExpression(attr);
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).ifExpression.result; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(219);
				if (!(_localctx.attr == Attr.VOID)) throw new FailedPredicateException(this, "$attr == Attr.VOID");
				setState(220);
				((PrimaryContext)_localctx).whileDoExpression = whileDoExpression();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).whileDoExpression.result; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(223);
				if (!(_localctx.attr == Attr.VOID)) throw new FailedPredicateException(this, "$attr == Attr.VOID");
				setState(224);
				((PrimaryContext)_localctx).doWhileExpression = doWhileExpression();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).doWhileExpression.result; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Const_Context extends ParserRuleContext {
		public LongLiteralNode result;
		public Token DECIMAL;
		public TerminalNode DECIMAL() { return getToken(LamaLanguageParser.DECIMAL, 0); }
		public Const_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_; }
	}

	public final Const_Context const_() throws RecognitionException {
		Const_Context _localctx = new Const_Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_const_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			((Const_Context)_localctx).DECIMAL = match(DECIMAL);
			 ((Const_Context)_localctx).result =  factory.createConst(((Const_Context)_localctx).DECIMAL); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ParserRuleContext {
		public StringLiteralNode result;
		public Token STRING;
		public TerminalNode STRING() { return getToken(LamaLanguageParser.STRING, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			((StringLiteralContext)_localctx).STRING = match(STRING);
			 ((StringLiteralContext)_localctx).result =  factory.createStringLiteral(((StringLiteralContext)_localctx).STRING); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharLiteralContext extends ParserRuleContext {
		public LongLiteralNode result;
		public Token CHAR;
		public TerminalNode CHAR() { return getToken(LamaLanguageParser.CHAR, 0); }
		public CharLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral; }
	}

	public final CharLiteralContext charLiteral() throws RecognitionException {
		CharLiteralContext _localctx = new CharLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_charLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			((CharLiteralContext)_localctx).CHAR = match(CHAR);
			 ((CharLiteralContext)_localctx).result =  factory.createCharLiteral(((CharLiteralContext)_localctx).CHAR); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarRefContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public Token LIDENT;
		public TerminalNode LIDENT() { return getToken(LamaLanguageParser.LIDENT, 0); }
		public VarRefContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarRefContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_varRef; }
	}

	public final VarRefContext varRef(Attr attr) throws RecognitionException {
		VarRefContext _localctx = new VarRefContext(_ctx, getState(), attr);
		enterRule(_localctx, 38, RULE_varRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			((VarRefContext)_localctx).LIDENT = match(LIDENT);

			  LocalVarRefNode ref = factory.createLocalVarRef(((VarRefContext)_localctx).LIDENT);
			  if (attr == Attr.REF)
			    ((VarRefContext)_localctx).result =  ref;
			  else
			    ((VarRefContext)_localctx).result =  factory.createVarRead(ref);
			  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfExpressionContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public ExpressionContext cond;
		public ExpressionContext thenBody;
		public ElseBranchContext elseBranch;
		public ElseBranchContext elseBranch() {
			return getRuleContext(ElseBranchContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IfExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public IfExpressionContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
	}

	public final IfExpressionContext ifExpression(Attr attr) throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState(), attr);
		enterRule(_localctx, 40, RULE_ifExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

			    List<IfThenEntry> ifThenEntries = new ArrayList<>();
			  
			setState(242);
			match(T__24);
			setState(243);
			((IfExpressionContext)_localctx).cond = expression(Attr.VAL);
			setState(244);
			match(T__25);
			setState(245);
			((IfExpressionContext)_localctx).thenBody = expression(attr);

			    ifThenEntries.add(new IfThenEntry(((IfExpressionContext)_localctx).cond.result, ((IfExpressionContext)_localctx).thenBody.result));
			  
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					match(T__26);
					setState(248);
					((IfExpressionContext)_localctx).cond = expression(Attr.VAL);
					setState(249);
					match(T__25);
					setState(250);
					((IfExpressionContext)_localctx).thenBody = expression(attr);

					      ifThenEntries.add(new IfThenEntry(((IfExpressionContext)_localctx).cond.result, ((IfExpressionContext)_localctx).thenBody.result));
					    
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(258);
			((IfExpressionContext)_localctx).elseBranch = elseBranch(attr);
			setState(259);
			match(T__27);

			    ((IfExpressionContext)_localctx).result =  factory.createIf(ifThenEntries, ((IfExpressionContext)_localctx).elseBranch.result);
			  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseBranchContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElseBranchContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElseBranchContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_elseBranch; }
	}

	public final ElseBranchContext elseBranch(Attr attr) throws RecognitionException {
		ElseBranchContext _localctx = new ElseBranchContext(_ctx, getState(), attr);
		enterRule(_localctx, 42, RULE_elseBranch);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(T__28);
				setState(263);
				((ElseBranchContext)_localctx).expression = expression(attr);

				    ((ElseBranchContext)_localctx).result =  ((ElseBranchContext)_localctx).expression.result;
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				if (!(_localctx.attr == Attr.VOID)) throw new FailedPredicateException(this, "$attr == Attr.VOID");
				 ((ElseBranchContext)_localctx).result =  null; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileDoExpressionContext extends ParserRuleContext {
		public ExprNode result;
		public ExpressionContext cond;
		public ScopeExprContext body;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ScopeExprContext scopeExpr() {
			return getRuleContext(ScopeExprContext.class,0);
		}
		public WhileDoExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileDoExpression; }
	}

	public final WhileDoExpressionContext whileDoExpression() throws RecognitionException {
		WhileDoExpressionContext _localctx = new WhileDoExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_whileDoExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T__29);
			setState(271);
			((WhileDoExpressionContext)_localctx).cond = expression(Attr.VAL);
			setState(272);
			match(T__30);
			setState(273);
			((WhileDoExpressionContext)_localctx).body = scopeExpr(Attr.VOID, true);
			setState(274);
			match(T__31);

			    ((WhileDoExpressionContext)_localctx).result =  factory.createWhile(((WhileDoExpressionContext)_localctx).cond.result, ((WhileDoExpressionContext)_localctx).body.result);
			  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileExpressionContext extends ParserRuleContext {
		public ExprNode result;
		public ScopeExprContext body;
		public ExpressionContext cond;
		public ScopeExprContext scopeExpr() {
			return getRuleContext(ScopeExprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileExpression; }
	}

	public final DoWhileExpressionContext doWhileExpression() throws RecognitionException {
		DoWhileExpressionContext _localctx = new DoWhileExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_doWhileExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__30);
			setState(278);
			((DoWhileExpressionContext)_localctx).body = scopeExpr(Attr.VOID, false);
			setState(279);
			match(T__29);
			setState(280);
			((DoWhileExpressionContext)_localctx).cond = expression(Attr.VAL);
			setState(281);
			match(T__31);

			    factory.popScope();
			    ((DoWhileExpressionContext)_localctx).result =  new SeqNode(((DoWhileExpressionContext)_localctx).body.result, factory.createWhile(((DoWhileExpressionContext)_localctx).cond.result, ((DoWhileExpressionContext)_localctx).body.result));
			  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return maybeAssignment_sempred((MaybeAssignmentContext)_localctx, predIndex);
		case 10:
			return maybeCmp_sempred((MaybeCmpContext)_localctx, predIndex);
		case 11:
			return maybeAddSub_sempred((MaybeAddSubContext)_localctx, predIndex);
		case 12:
			return maybeMulDivRem_sempred((MaybeMulDivRemContext)_localctx, predIndex);
		case 14:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 15:
			return primary_sempred((PrimaryContext)_localctx, predIndex);
		case 21:
			return elseBranch_sempred((ElseBranchContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean maybeAssignment_sempred(MaybeAssignmentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return _localctx.attr != Attr.REF;
		}
		return true;
	}
	private boolean maybeCmp_sempred(MaybeCmpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return _localctx.attr != Attr.REF;
		}
		return true;
	}
	private boolean maybeAddSub_sempred(MaybeAddSubContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return _localctx.attr != Attr.REF;
		}
		return true;
	}
	private boolean maybeMulDivRem_sempred(MaybeMulDivRemContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return _localctx.attr != Attr.REF;
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return _localctx.attr != Attr.REF;
		case 5:
			return _localctx.attr != Attr.REF;
		}
		return true;
	}
	private boolean primary_sempred(PrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return _localctx.attr != Attr.REF;
		case 7:
			return _localctx.attr != Attr.REF;
		case 8:
			return _localctx.attr != Attr.REF;
		case 9:
			return _localctx.attr != Attr.REF;
		case 10:
			return _localctx.attr != Attr.REF;
		case 11:
			return _localctx.attr == Attr.VOID;
		case 12:
			return _localctx.attr == Attr.VOID;
		case 13:
			return _localctx.attr == Attr.VOID;
		}
		return true;
	}
	private boolean elseBranch_sempred(ElseBranchContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return _localctx.attr == Attr.VOID;
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001(\u011d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u00017\b\u0001"+
		"\n\u0001\f\u0001:\t\u0001\u0001\u0001\u0003\u0001=\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004J\b\u0004"+
		"\n\u0004\f\u0004M\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"R\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"^\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bl\b\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004"+
		"\tw\b\t\u000b\t\f\tx\u0003\t{\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0086\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u0092\b\u000b\u000b\u000b\f"+
		"\u000b\u0093\u0003\u000b\u0096\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u00a2\b\f\u000b"+
		"\f\f\f\u00a3\u0003\f\u00a6\b\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00ba\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00e4\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00fe\b\u0014\n"+
		"\u0014\f\u0014\u0101\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u010d\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0000"+
		"\u0000\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.\u0000\u0003\u0001\u0000\u0007\f\u0001"+
		"\u0000\r\u000e\u0001\u0000\u000f\u0011\u011f\u00000\u0001\u0000\u0000"+
		"\u0000\u00024\u0001\u0000\u0000\u0000\u0004@\u0001\u0000\u0000\u0000\u0006"+
		"B\u0001\u0000\u0000\u0000\bF\u0001\u0000\u0000\u0000\nN\u0001\u0000\u0000"+
		"\u0000\f]\u0001\u0000\u0000\u0000\u000e_\u0001\u0000\u0000\u0000\u0010"+
		"k\u0001\u0000\u0000\u0000\u0012z\u0001\u0000\u0000\u0000\u0014\u0085\u0001"+
		"\u0000\u0000\u0000\u0016\u0095\u0001\u0000\u0000\u0000\u0018\u00a5\u0001"+
		"\u0000\u0000\u0000\u001a\u00a7\u0001\u0000\u0000\u0000\u001c\u00b9\u0001"+
		"\u0000\u0000\u0000\u001e\u00e3\u0001\u0000\u0000\u0000 \u00e5\u0001\u0000"+
		"\u0000\u0000\"\u00e8\u0001\u0000\u0000\u0000$\u00eb\u0001\u0000\u0000"+
		"\u0000&\u00ee\u0001\u0000\u0000\u0000(\u00f1\u0001\u0000\u0000\u0000*"+
		"\u010c\u0001\u0000\u0000\u0000,\u010e\u0001\u0000\u0000\u0000.\u0115\u0001"+
		"\u0000\u0000\u000001\u0003\u0002\u0001\u000012\u0006\u0000\uffff\uffff"+
		"\u000023\u0005\u0000\u0000\u00013\u0001\u0001\u0000\u0000\u000048\u0006"+
		"\u0001\uffff\uffff\u000057\u0003\u0004\u0002\u000065\u0001\u0000\u0000"+
		"\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000"+
		"\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;=\u0003"+
		"\f\u0006\u0000<;\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0001"+
		"\u0000\u0000\u0000>?\u0006\u0001\uffff\uffff\u0000?\u0003\u0001\u0000"+
		"\u0000\u0000@A\u0003\u0006\u0003\u0000A\u0005\u0001\u0000\u0000\u0000"+
		"BC\u0005\u0001\u0000\u0000CD\u0003\b\u0004\u0000DE\u0005\u0002\u0000\u0000"+
		"E\u0007\u0001\u0000\u0000\u0000FK\u0003\n\u0005\u0000GH\u0005\u0003\u0000"+
		"\u0000HJ\u0003\n\u0005\u0000IG\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\t\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000NQ\u0005%\u0000\u0000OP\u0005\u0004"+
		"\u0000\u0000PR\u0003\u000e\u0007\u0000QO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0006\u0005\uffff\uffff"+
		"\u0000T\u000b\u0001\u0000\u0000\u0000UV\u0003\u000e\u0007\u0000VW\u0006"+
		"\u0006\uffff\uffff\u0000W^\u0001\u0000\u0000\u0000XY\u0003\u000e\u0007"+
		"\u0000YZ\u0005\u0002\u0000\u0000Z[\u0003\f\u0006\u0000[\\\u0006\u0006"+
		"\uffff\uffff\u0000\\^\u0001\u0000\u0000\u0000]U\u0001\u0000\u0000\u0000"+
		"]X\u0001\u0000\u0000\u0000^\r\u0001\u0000\u0000\u0000_`\u0003\u0010\b"+
		"\u0000`a\u0006\u0007\uffff\uffff\u0000a\u000f\u0001\u0000\u0000\u0000"+
		"bc\u0004\b\u0000\u0001cd\u0003&\u0013\u0000de\u0005\u0005\u0000\u0000"+
		"ef\u0003\u0010\b\u0000fg\u0006\b\uffff\uffff\u0000gl\u0001\u0000\u0000"+
		"\u0000hi\u0003\u0012\t\u0000ij\u0006\b\uffff\uffff\u0000jl\u0001\u0000"+
		"\u0000\u0000kb\u0001\u0000\u0000\u0000kh\u0001\u0000\u0000\u0000l\u0011"+
		"\u0001\u0000\u0000\u0000mn\u0003\u0014\n\u0000no\u0006\t\uffff\uffff\u0000"+
		"o{\u0001\u0000\u0000\u0000pq\u0003\u0014\n\u0000qv\u0006\t\uffff\uffff"+
		"\u0000rs\u0005\u0006\u0000\u0000st\u0003\u0014\n\u0000tu\u0006\t\uffff"+
		"\uffff\u0000uw\u0001\u0000\u0000\u0000vr\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"y{\u0001\u0000\u0000\u0000zm\u0001\u0000\u0000\u0000zp\u0001\u0000\u0000"+
		"\u0000{\u0013\u0001\u0000\u0000\u0000|}\u0004\n\u0001\u0001}~\u0003\u0016"+
		"\u000b\u0000~\u007f\u0007\u0000\u0000\u0000\u007f\u0080\u0003\u0016\u000b"+
		"\u0000\u0080\u0081\u0006\n\uffff\uffff\u0000\u0081\u0086\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0003\u0016\u000b\u0000\u0083\u0084\u0006\n\uffff\uffff"+
		"\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085|\u0001\u0000\u0000\u0000"+
		"\u0085\u0082\u0001\u0000\u0000\u0000\u0086\u0015\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0003\u0018\f\u0000\u0088\u0089\u0006\u000b\uffff\uffff\u0000"+
		"\u0089\u0096\u0001\u0000\u0000\u0000\u008a\u008b\u0004\u000b\u0002\u0001"+
		"\u008b\u008c\u0003\u0018\f\u0000\u008c\u0091\u0006\u000b\uffff\uffff\u0000"+
		"\u008d\u008e\u0007\u0001\u0000\u0000\u008e\u008f\u0003\u0018\f\u0000\u008f"+
		"\u0090\u0006\u000b\uffff\uffff\u0000\u0090\u0092\u0001\u0000\u0000\u0000"+
		"\u0091\u008d\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0087\u0001\u0000\u0000\u0000"+
		"\u0095\u008a\u0001\u0000\u0000\u0000\u0096\u0017\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0003\u001a\r\u0000\u0098\u0099\u0006\f\uffff\uffff\u0000"+
		"\u0099\u00a6\u0001\u0000\u0000\u0000\u009a\u009b\u0004\f\u0003\u0001\u009b"+
		"\u009c\u0003\u001a\r\u0000\u009c\u00a1\u0006\f\uffff\uffff\u0000\u009d"+
		"\u009e\u0007\u0002\u0000\u0000\u009e\u009f\u0003\u001a\r\u0000\u009f\u00a0"+
		"\u0006\f\uffff\uffff\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009d"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a5\u0097\u0001\u0000\u0000\u0000\u00a5\u009a"+
		"\u0001\u0000\u0000\u0000\u00a6\u0019\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0003\u001c\u000e\u0000\u00a8\u00a9\u0006\r\uffff\uffff\u0000\u00a9\u001b"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0003\u001e\u000f\u0000\u00ab\u00ac"+
		"\u0006\u000e\uffff\uffff\u0000\u00ac\u00ba\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0004\u000e\u0004\u0001\u00ae\u00af\u0005\u0012\u0000\u0000\u00af"+
		"\u00b0\u0005\u0013\u0000\u0000\u00b0\u00b1\u0003\f\u0006\u0000\u00b1\u00b2"+
		"\u0005\u0014\u0000\u0000\u00b2\u00b3\u0006\u000e\uffff\uffff\u0000\u00b3"+
		"\u00ba\u0001\u0000\u0000\u0000\u00b4\u00b5\u0004\u000e\u0005\u0001\u00b5"+
		"\u00b6\u0005\u0015\u0000\u0000\u00b6\u00b7\u0005\u0013\u0000\u0000\u00b7"+
		"\u00b8\u0005\u0014\u0000\u0000\u00b8\u00ba\u0006\u000e\uffff\uffff\u0000"+
		"\u00b9\u00aa\u0001\u0000\u0000\u0000\u00b9\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b9\u00b4\u0001\u0000\u0000\u0000\u00ba\u001d\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0004\u000f\u0006\u0001\u00bc\u00bd\u0003 \u0010\u0000\u00bd"+
		"\u00be\u0006\u000f\uffff\uffff\u0000\u00be\u00e4\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0004\u000f\u0007\u0001\u00c0\u00c1\u0003\"\u0011\u0000\u00c1"+
		"\u00c2\u0006\u000f\uffff\uffff\u0000\u00c2\u00e4\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0004\u000f\b\u0001\u00c4\u00c5\u0003$\u0012\u0000\u00c5"+
		"\u00c6\u0006\u000f\uffff\uffff\u0000\u00c6\u00e4\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0003&\u0013\u0000\u00c8\u00c9\u0006\u000f\uffff\uffff\u0000"+
		"\u00c9\u00e4\u0001\u0000\u0000\u0000\u00ca\u00cb\u0004\u000f\t\u0001\u00cb"+
		"\u00cc\u0005\u0016\u0000\u0000\u00cc\u00e4\u0006\u000f\uffff\uffff\u0000"+
		"\u00cd\u00ce\u0004\u000f\n\u0001\u00ce\u00cf\u0005\u0017\u0000\u0000\u00cf"+
		"\u00e4\u0006\u000f\uffff\uffff\u0000\u00d0\u00d1\u0004\u000f\u000b\u0001"+
		"\u00d1\u00d2\u0005\u0018\u0000\u0000\u00d2\u00e4\u0006\u000f\uffff\uffff"+
		"\u0000\u00d3\u00d4\u0005\u0013\u0000\u0000\u00d4\u00d5\u0003\u0002\u0001"+
		"\u0000\u00d5\u00d6\u0005\u0014\u0000\u0000\u00d6\u00d7\u0006\u000f\uffff"+
		"\uffff\u0000\u00d7\u00e4\u0001\u0000\u0000\u0000\u00d8\u00d9\u0003(\u0014"+
		"\u0000\u00d9\u00da\u0006\u000f\uffff\uffff\u0000\u00da\u00e4\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0004\u000f\f\u0001\u00dc\u00dd\u0003,\u0016"+
		"\u0000\u00dd\u00de\u0006\u000f\uffff\uffff\u0000\u00de\u00e4\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0004\u000f\r\u0001\u00e0\u00e1\u0003.\u0017"+
		"\u0000\u00e1\u00e2\u0006\u000f\uffff\uffff\u0000\u00e2\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e3\u00bb\u0001\u0000\u0000\u0000\u00e3\u00bf\u0001\u0000"+
		"\u0000\u0000\u00e3\u00c3\u0001\u0000\u0000\u0000\u00e3\u00c7\u0001\u0000"+
		"\u0000\u0000\u00e3\u00ca\u0001\u0000\u0000\u0000\u00e3\u00cd\u0001\u0000"+
		"\u0000\u0000\u00e3\u00d0\u0001\u0000\u0000\u0000\u00e3\u00d3\u0001\u0000"+
		"\u0000\u0000\u00e3\u00d8\u0001\u0000\u0000\u0000\u00e3\u00db\u0001\u0000"+
		"\u0000\u0000\u00e3\u00df\u0001\u0000\u0000\u0000\u00e4\u001f\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0005&\u0000\u0000\u00e6\u00e7\u0006\u0010\uffff"+
		"\uffff\u0000\u00e7!\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\'\u0000"+
		"\u0000\u00e9\u00ea\u0006\u0011\uffff\uffff\u0000\u00ea#\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0005(\u0000\u0000\u00ec\u00ed\u0006\u0012\uffff\uffff"+
		"\u0000\u00ed%\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005%\u0000\u0000\u00ef"+
		"\u00f0\u0006\u0013\uffff\uffff\u0000\u00f0\'\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0006\u0014\uffff\uffff\u0000\u00f2\u00f3\u0005\u0019\u0000\u0000"+
		"\u00f3\u00f4\u0003\f\u0006\u0000\u00f4\u00f5\u0005\u001a\u0000\u0000\u00f5"+
		"\u00f6\u0003\f\u0006\u0000\u00f6\u00ff\u0006\u0014\uffff\uffff\u0000\u00f7"+
		"\u00f8\u0005\u001b\u0000\u0000\u00f8\u00f9\u0003\f\u0006\u0000\u00f9\u00fa"+
		"\u0005\u001a\u0000\u0000\u00fa\u00fb\u0003\f\u0006\u0000\u00fb\u00fc\u0006"+
		"\u0014\uffff\uffff\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00f7"+
		"\u0001\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0102"+
		"\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0003*\u0015\u0000\u0103\u0104\u0005\u001c\u0000\u0000\u0104\u0105\u0006"+
		"\u0014\uffff\uffff\u0000\u0105)\u0001\u0000\u0000\u0000\u0106\u0107\u0005"+
		"\u001d\u0000\u0000\u0107\u0108\u0003\f\u0006\u0000\u0108\u0109\u0006\u0015"+
		"\uffff\uffff\u0000\u0109\u010d\u0001\u0000\u0000\u0000\u010a\u010b\u0004"+
		"\u0015\u000e\u0001\u010b\u010d\u0006\u0015\uffff\uffff\u0000\u010c\u0106"+
		"\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d+\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0005\u001e\u0000\u0000\u010f\u0110\u0003"+
		"\f\u0006\u0000\u0110\u0111\u0005\u001f\u0000\u0000\u0111\u0112\u0003\u0002"+
		"\u0001\u0000\u0112\u0113\u0005 \u0000\u0000\u0113\u0114\u0006\u0016\uffff"+
		"\uffff\u0000\u0114-\u0001\u0000\u0000\u0000\u0115\u0116\u0005\u001f\u0000"+
		"\u0000\u0116\u0117\u0003\u0002\u0001\u0000\u0117\u0118\u0005\u001e\u0000"+
		"\u0000\u0118\u0119\u0003\f\u0006\u0000\u0119\u011a\u0005 \u0000\u0000"+
		"\u011a\u011b\u0006\u0017\uffff\uffff\u0000\u011b/\u0001\u0000\u0000\u0000"+
		"\u00118<KQ]kxz\u0085\u0093\u0095\u00a3\u00a5\u00b9\u00e3\u00ff\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}