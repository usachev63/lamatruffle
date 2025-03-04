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
import ru.usachev63.lamatruffle.nodes.pattern.*;

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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, WS=45, COMMENT=46, 
		LINE_COMMENT=47, UIDENT=48, LIDENT=49, DECIMAL=50, STRING=51, CHAR=52;
	public static final int
		RULE_lama = 0, RULE_scopeExpression = 1, RULE_scopeExpressionNoStart = 2, 
		RULE_definition = 3, RULE_variableDefinition = 4, RULE_variableDefinitionSequence = 5, 
		RULE_variableDefinitionItem = 6, RULE_functionDefinition = 7, RULE_functionParameters = 8, 
		RULE_functionParameter = 9, RULE_expression = 10, RULE_basicExpression = 11, 
		RULE_maybeAssignment = 12, RULE_maybeConjunction = 13, RULE_maybeCmp = 14, 
		RULE_maybeAddSub = 15, RULE_maybeMulDivRem = 16, RULE_binaryOperand = 17, 
		RULE_postfixExpression = 18, RULE_postfixItem = 19, RULE_primary = 20, 
		RULE_const_ = 21, RULE_stringLiteral = 22, RULE_charLiteral = 23, RULE_varRef = 24, 
		RULE_arrayExpression = 25, RULE_sExpression = 26, RULE_ifExpression = 27, 
		RULE_elseBranch = 28, RULE_whileDoExpression = 29, RULE_doWhileExpression = 30, 
		RULE_forExpression = 31, RULE_caseExpression = 32, RULE_caseBranches = 33, 
		RULE_caseBranch = 34, RULE_pattern = 35, RULE_simplePattern = 36, RULE_wildcardPattern = 37, 
		RULE_sexpPattern = 38, RULE_bindingPattern = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"lama", "scopeExpression", "scopeExpressionNoStart", "definition", "variableDefinition", 
			"variableDefinitionSequence", "variableDefinitionItem", "functionDefinition", 
			"functionParameters", "functionParameter", "expression", "basicExpression", 
			"maybeAssignment", "maybeConjunction", "maybeCmp", "maybeAddSub", "maybeMulDivRem", 
			"binaryOperand", "postfixExpression", "postfixItem", "primary", "const_", 
			"stringLiteral", "charLiteral", "varRef", "arrayExpression", "sExpression", 
			"ifExpression", "elseBranch", "whileDoExpression", "doWhileExpression", 
			"forExpression", "caseExpression", "caseBranches", "caseBranch", "pattern", 
			"simplePattern", "wildcardPattern", "sexpPattern", "bindingPattern"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "';'", "','", "'='", "'fun'", "'('", "')'", "'{'", "'}'", 
			"':='", "'&&'", "'=='", "'!='", "'<='", "'<'", "'>='", "'>'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'['", "']'", "'.'", "'true'", "'false'", 
			"'skip'", "'if'", "'then'", "'elif'", "'fi'", "'else'", "'while'", "'do'", 
			"'od'", "'for'", "'case'", "'of'", "'esac'", "'|'", "'->'", "'_'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
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
		public ScopeExpressionContext scopeExpression;
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
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
			setState(80);
			((LamaContext)_localctx).scopeExpression = scopeExpression(Attr.VOID, true);
			 factory.createMain(((LamaContext)_localctx).scopeExpression.result); 
			setState(82);
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
	public static class ScopeExpressionContext extends ParserRuleContext {
		public Attr attr;
		public boolean popScope;
		public ScopeExprNode result;
		public ScopeExpressionNoStartContext scopeExpressionNoStart;
		public ScopeExpressionNoStartContext scopeExpressionNoStart() {
			return getRuleContext(ScopeExpressionNoStartContext.class,0);
		}
		public ScopeExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ScopeExpressionContext(ParserRuleContext parent, int invokingState, Attr attr, boolean popScope) {
			super(parent, invokingState);
			this.attr = attr;
			this.popScope = popScope;
		}
		@Override public int getRuleIndex() { return RULE_scopeExpression; }
	}

	public final ScopeExpressionContext scopeExpression(Attr attr,boolean popScope) throws RecognitionException {
		ScopeExpressionContext _localctx = new ScopeExpressionContext(_ctx, getState(), attr, popScope);
		enterRule(_localctx, 2, RULE_scopeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 factory.startScope(); 
			setState(85);
			((ScopeExpressionContext)_localctx).scopeExpressionNoStart = scopeExpressionNoStart(attr, popScope);

			    ((ScopeExpressionContext)_localctx).result =  ((ScopeExpressionContext)_localctx).scopeExpressionNoStart.result;
			  
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
	public static class ScopeExpressionNoStartContext extends ParserRuleContext {
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
		public ScopeExpressionNoStartContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ScopeExpressionNoStartContext(ParserRuleContext parent, int invokingState, Attr attr, boolean popScope) {
			super(parent, invokingState);
			this.attr = attr;
			this.popScope = popScope;
		}
		@Override public int getRuleIndex() { return RULE_scopeExpressionNoStart; }
	}

	public final ScopeExpressionNoStartContext scopeExpressionNoStart(Attr attr,boolean popScope) throws RecognitionException {
		ScopeExpressionNoStartContext _localctx = new ScopeExpressionNoStartContext(_ctx, getState(), attr, popScope);
		enterRule(_localctx, 4, RULE_scopeExpressionNoStart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					definition();
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(94);
				((ScopeExpressionNoStartContext)_localctx).expression = expression(attr);
				}
				break;
			}

			    ExprNode body = null;
			    if (((ScopeExpressionNoStartContext)_localctx).expression != null)
			      body = ((ScopeExpressionNoStartContext)_localctx).expression.result;
			    ((ScopeExpressionNoStartContext)_localctx).result =  factory.finishScope(body, popScope);
			  
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
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definition);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				variableDefinition();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				functionDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 8, RULE_variableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__0);
			setState(104);
			variableDefinitionSequence();
			setState(105);
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
		enterRule(_localctx, 10, RULE_variableDefinitionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			variableDefinitionItem();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(108);
				match(T__2);
				setState(109);
				variableDefinitionItem();
				}
				}
				setState(114);
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
		enterRule(_localctx, 12, RULE_variableDefinitionItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			((VariableDefinitionItemContext)_localctx).LIDENT = match(LIDENT);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(116);
				match(T__3);
				setState(117);
				((VariableDefinitionItemContext)_localctx).basicExpression = basicExpression(Attr.VAL);
				}
			}


			    factory.onVariableDefinition(((VariableDefinitionItemContext)_localctx).LIDENT, ((VariableDefinitionItemContext)_localctx).basicExpression != null ? ((VariableDefinitionItemContext)_localctx).basicExpression.result : null);
			  
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
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public Token LIDENT;
		public ScopeExpressionNoStartContext body;
		public TerminalNode LIDENT() { return getToken(LamaLanguageParser.LIDENT, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public ScopeExpressionNoStartContext scopeExpressionNoStart() {
			return getRuleContext(ScopeExpressionNoStartContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__4);
			setState(123);
			((FunctionDefinitionContext)_localctx).LIDENT = match(LIDENT);

			    factory.startFrame(((FunctionDefinitionContext)_localctx).LIDENT);
			    factory.startScope();
			  
			setState(125);
			match(T__5);
			setState(126);
			functionParameters();
			setState(127);
			match(T__6);
			setState(128);
			match(T__7);
			setState(129);
			((FunctionDefinitionContext)_localctx).body = scopeExpressionNoStart(Attr.VOID, true);
			setState(130);
			match(T__8);
			 factory.finishFrame(((FunctionDefinitionContext)_localctx).body.result); 
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
	public static class FunctionParametersContext extends ParserRuleContext {
		public List<FunctionParameterContext> functionParameter() {
			return getRuleContexts(FunctionParameterContext.class);
		}
		public FunctionParameterContext functionParameter(int i) {
			return getRuleContext(FunctionParameterContext.class,i);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIDENT) {
				{
				setState(133);
				functionParameter();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(134);
					match(T__2);
					setState(135);
					functionParameter();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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
	public static class FunctionParameterContext extends ParserRuleContext {
		public Token LIDENT;
		public TerminalNode LIDENT() { return getToken(LamaLanguageParser.LIDENT, 0); }
		public FunctionParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameter; }
	}

	public final FunctionParameterContext functionParameter() throws RecognitionException {
		FunctionParameterContext _localctx = new FunctionParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			((FunctionParameterContext)_localctx).LIDENT = match(LIDENT);
			 factory.addFormalParameter(((FunctionParameterContext)_localctx).LIDENT); 
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
		enterRule(_localctx, 20, RULE_expression);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				((ExpressionContext)_localctx).basicExpression = basicExpression(attr);
				 ((ExpressionContext)_localctx).result =  ((ExpressionContext)_localctx).basicExpression.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				((ExpressionContext)_localctx).basicExpression = basicExpression(Attr.VOID);
				setState(150);
				match(T__1);
				setState(151);
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
		enterRule(_localctx, 22, RULE_basicExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
		public MaybeConjunctionContext lhs;
		public MaybeAssignmentContext rhs;
		public MaybeConjunctionContext maybeConjunction;
		public MaybeConjunctionContext maybeConjunction() {
			return getRuleContext(MaybeConjunctionContext.class,0);
		}
		public MaybeAssignmentContext maybeAssignment() {
			return getRuleContext(MaybeAssignmentContext.class,0);
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
		enterRule(_localctx, 24, RULE_maybeAssignment);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(160);
				((MaybeAssignmentContext)_localctx).lhs = maybeConjunction(Attr.REF);
				setState(161);
				match(T__9);
				setState(162);
				((MaybeAssignmentContext)_localctx).rhs = maybeAssignment(Attr.VAL);

				    ((MaybeAssignmentContext)_localctx).result =  factory.createAssn(((MaybeAssignmentContext)_localctx).lhs.result, ((MaybeAssignmentContext)_localctx).rhs.result);
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
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
		enterRule(_localctx, 26, RULE_maybeConjunction);
		try {
			int _alt;
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				((MaybeConjunctionContext)_localctx).maybeCmp = maybeCmp(attr);
				 ((MaybeConjunctionContext)_localctx).result =  ((MaybeConjunctionContext)_localctx).maybeCmp.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				((MaybeConjunctionContext)_localctx).maybeCmp = maybeCmp(Attr.VAL);
				 ((MaybeConjunctionContext)_localctx).result =  ((MaybeConjunctionContext)_localctx).maybeCmp.result; 
				setState(179); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(175);
						((MaybeConjunctionContext)_localctx).op = match(T__10);
						setState(176);
						((MaybeConjunctionContext)_localctx).rhs = ((MaybeConjunctionContext)_localctx).maybeCmp = maybeCmp(Attr.VAL);

						      ((MaybeConjunctionContext)_localctx).result =  factory.createBinary(((MaybeConjunctionContext)_localctx).op, _localctx.result, ((MaybeConjunctionContext)_localctx).rhs.result);
						    
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(181); 
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
		enterRule(_localctx, 28, RULE_maybeCmp);
		int _la;
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(186);
				((MaybeCmpContext)_localctx).lhs = maybeAddSub(Attr.VAL);
				setState(187);
				((MaybeCmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 258048L) != 0)) ) {
					((MaybeCmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(188);
				((MaybeCmpContext)_localctx).rhs = maybeAddSub(Attr.VAL);

				    ((MaybeCmpContext)_localctx).result =  factory.createBinary(((MaybeCmpContext)_localctx).op, ((MaybeCmpContext)_localctx).lhs.result, ((MaybeCmpContext)_localctx).rhs.result);
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
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
		enterRule(_localctx, 30, RULE_maybeAddSub);
		int _la;
		try {
			int _alt;
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				((MaybeAddSubContext)_localctx).maybeMulDivRem = maybeMulDivRem(attr);
				 ((MaybeAddSubContext)_localctx).result =  ((MaybeAddSubContext)_localctx).maybeMulDivRem.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(200);
				((MaybeAddSubContext)_localctx).maybeMulDivRem = maybeMulDivRem(Attr.VAL);
				 ((MaybeAddSubContext)_localctx).result =  ((MaybeAddSubContext)_localctx).maybeMulDivRem.result; 
				setState(206); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(202);
						((MaybeAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((MaybeAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(203);
						((MaybeAddSubContext)_localctx).rhs = ((MaybeAddSubContext)_localctx).maybeMulDivRem = maybeMulDivRem(Attr.VAL);

						      ((MaybeAddSubContext)_localctx).result =  factory.createBinary(((MaybeAddSubContext)_localctx).op, _localctx.result, ((MaybeAddSubContext)_localctx).rhs.result);
						    
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(208); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 32, RULE_maybeMulDivRem);
		int _la;
		try {
			int _alt;
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				((MaybeMulDivRemContext)_localctx).binaryOperand = binaryOperand(attr);
				 ((MaybeMulDivRemContext)_localctx).result =  ((MaybeMulDivRemContext)_localctx).binaryOperand.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(216);
				((MaybeMulDivRemContext)_localctx).binaryOperand = binaryOperand(Attr.VAL);
				 ((MaybeMulDivRemContext)_localctx).result =  ((MaybeMulDivRemContext)_localctx).binaryOperand.result; 
				setState(222); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(218);
						((MaybeMulDivRemContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
							((MaybeMulDivRemContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(219);
						((MaybeMulDivRemContext)_localctx).rhs = ((MaybeMulDivRemContext)_localctx).binaryOperand = binaryOperand(Attr.VAL);

						    ((MaybeMulDivRemContext)_localctx).result =  factory.createBinary(((MaybeMulDivRemContext)_localctx).op, _localctx.result, ((MaybeMulDivRemContext)_localctx).rhs.result);
						  
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(224); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 34, RULE_binaryOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
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
		public PostfixItemContext postfixItem;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<PostfixItemContext> postfixItem() {
			return getRuleContexts(PostfixItemContext.class);
		}
		public PostfixItemContext postfixItem(int i) {
			return getRuleContext(PostfixItemContext.class,i);
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
		enterRule(_localctx, 36, RULE_postfixExpression);
		try {
			int _alt;
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				((PostfixExpressionContext)_localctx).primary = primary(attr);
				 ((PostfixExpressionContext)_localctx).result =  ((PostfixExpressionContext)_localctx).primary.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				((PostfixExpressionContext)_localctx).primary = primary(Attr.VAL);
				 ((PostfixExpressionContext)_localctx).result =  ((PostfixExpressionContext)_localctx).primary.result; 
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(236);
						((PostfixExpressionContext)_localctx).postfixItem = postfixItem(_localctx.result, Attr.VAL);
						 ((PostfixExpressionContext)_localctx).result =  ((PostfixExpressionContext)_localctx).postfixItem.result; 
						}
						} 
					}
					setState(243);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(244);
				((PostfixExpressionContext)_localctx).postfixItem = postfixItem(_localctx.result, attr);
				 ((PostfixExpressionContext)_localctx).result =  ((PostfixExpressionContext)_localctx).postfixItem.result; 
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
	public static class PostfixItemContext extends ParserRuleContext {
		public ExprNode base;
		public Attr attr;
		public ExprNode result;
		public ExpressionContext index;
		public ExpressionContext expression;
		public VarRefContext callee;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VarRefContext varRef() {
			return getRuleContext(VarRefContext.class,0);
		}
		public PostfixItemContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PostfixItemContext(ParserRuleContext parent, int invokingState, ExprNode base, Attr attr) {
			super(parent, invokingState);
			this.base = base;
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_postfixItem; }
	}

	public final PostfixItemContext postfixItem(ExprNode base,Attr attr) throws RecognitionException {
		PostfixItemContext _localctx = new PostfixItemContext(_ctx, getState(), base, attr);
		enterRule(_localctx, 38, RULE_postfixItem);
		int _la;
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(T__22);
				setState(250);
				((PostfixItemContext)_localctx).index = expression(Attr.VAL);
				setState(251);
				match(T__23);

				    if (_localctx.attr == Attr.REF)
				      ((PostfixItemContext)_localctx).result =  factory.createElemRef(_localctx.base, ((PostfixItemContext)_localctx).index.result);
				    else
				      ((PostfixItemContext)_localctx).result =  factory.createElemRead(_localctx.base, ((PostfixItemContext)_localctx).index.result);
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				 List<ExprNode> argumentNodes = new ArrayList<>(); 
				setState(256);
				match(T__5);
				setState(268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(257);
					((PostfixItemContext)_localctx).expression = expression(Attr.VAL);
					 argumentNodes.add(((PostfixItemContext)_localctx).expression.result); 
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(259);
						match(T__2);
						setState(260);
						((PostfixItemContext)_localctx).expression = expression(Attr.VAL);
						 argumentNodes.add(((PostfixItemContext)_localctx).expression.result); 
						}
						}
						setState(267);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(270);
				match(T__6);

				    ((PostfixItemContext)_localctx).result =  factory.createCallExpr(_localctx.base, argumentNodes);
				  
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				 List<ExprNode> argumentNodes = new ArrayList<>(); argumentNodes.add(_localctx.base); 
				setState(274);
				match(T__24);
				setState(275);
				((PostfixItemContext)_localctx).callee = varRef(Attr.VAL);
				setState(290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(276);
					match(T__5);
					setState(277);
					((PostfixItemContext)_localctx).expression = expression(Attr.VAL);
					 argumentNodes.add(((PostfixItemContext)_localctx).expression.result); 
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(279);
						match(T__2);
						setState(280);
						((PostfixItemContext)_localctx).expression = expression(Attr.VAL);
						 argumentNodes.add(((PostfixItemContext)_localctx).expression.result); 
						}
						}
						setState(287);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(288);
					match(T__6);
					}
					break;
				}

				    ((PostfixItemContext)_localctx).result =  factory.createCallExpr(((PostfixItemContext)_localctx).callee.result, argumentNodes);
				  
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
		public ScopeExpressionContext scopeExpression;
		public ArrayExpressionContext arrayExpression;
		public SExpressionContext sExpression;
		public IfExpressionContext ifExpression;
		public WhileDoExpressionContext whileDoExpression;
		public DoWhileExpressionContext doWhileExpression;
		public ForExpressionContext forExpression;
		public CaseExpressionContext caseExpression;
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
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public ArrayExpressionContext arrayExpression() {
			return getRuleContext(ArrayExpressionContext.class,0);
		}
		public SExpressionContext sExpression() {
			return getRuleContext(SExpressionContext.class,0);
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
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
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
		enterRule(_localctx, 40, RULE_primary);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(297);
				((PrimaryContext)_localctx).const_ = const_();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).const_.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(301);
				((PrimaryContext)_localctx).stringLiteral = stringLiteral();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).stringLiteral.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(305);
				((PrimaryContext)_localctx).charLiteral = charLiteral();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).charLiteral.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				((PrimaryContext)_localctx).varRef = varRef(attr);
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).varRef.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(311);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(312);
				match(T__25);
				 ((PrimaryContext)_localctx).result =  new LongLiteralNode(1); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(314);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(315);
				match(T__26);
				 ((PrimaryContext)_localctx).result =  new LongLiteralNode(0); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(317);
				if (!(_localctx.attr == Attr.VOID)) throw new FailedPredicateException(this, "$attr == Attr.VOID");
				setState(318);
				match(T__27);
				 ((PrimaryContext)_localctx).result =  new SkipNode(); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(320);
				match(T__5);
				setState(321);
				((PrimaryContext)_localctx).scopeExpression = scopeExpression(attr, true);
				setState(322);
				match(T__6);
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).scopeExpression.result; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(325);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(326);
				((PrimaryContext)_localctx).arrayExpression = arrayExpression();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).arrayExpression.result; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(329);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(330);
				((PrimaryContext)_localctx).sExpression = sExpression();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).sExpression.result; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(333);
				((PrimaryContext)_localctx).ifExpression = ifExpression(attr);
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).ifExpression.result; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(336);
				if (!(_localctx.attr == Attr.VOID)) throw new FailedPredicateException(this, "$attr == Attr.VOID");
				setState(337);
				((PrimaryContext)_localctx).whileDoExpression = whileDoExpression();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).whileDoExpression.result; 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(340);
				if (!(_localctx.attr == Attr.VOID)) throw new FailedPredicateException(this, "$attr == Attr.VOID");
				setState(341);
				((PrimaryContext)_localctx).doWhileExpression = doWhileExpression();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).doWhileExpression.result; 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(344);
				if (!(_localctx.attr == Attr.VOID)) throw new FailedPredicateException(this, "$attr == Attr.VOID");
				setState(345);
				((PrimaryContext)_localctx).forExpression = forExpression();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).forExpression.result; 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(348);
				((PrimaryContext)_localctx).caseExpression = caseExpression(attr);
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).caseExpression.result; 
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
		public Token minus;
		public Token DECIMAL;
		public TerminalNode DECIMAL() { return getToken(LamaLanguageParser.DECIMAL, 0); }
		public Const_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_; }
	}

	public final Const_Context const_() throws RecognitionException {
		Const_Context _localctx = new Const_Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_const_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(353);
				((Const_Context)_localctx).minus = match(T__18);
				}
			}

			setState(356);
			((Const_Context)_localctx).DECIMAL = match(DECIMAL);

			    long value = Long.parseLong(((Const_Context)_localctx).DECIMAL.getText());
			    if (((Const_Context)_localctx).minus != null)
			      value = -value;
			    ((Const_Context)_localctx).result =  new LongLiteralNode(value);
			  
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
		enterRule(_localctx, 44, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
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
		enterRule(_localctx, 46, RULE_charLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
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
		enterRule(_localctx, 48, RULE_varRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			((VarRefContext)_localctx).LIDENT = match(LIDENT);

			    ExprNode refNode = factory.createVarRef(((VarRefContext)_localctx).LIDENT);
			    if (attr == Attr.REF)
			      ((VarRefContext)_localctx).result =  refNode;
			    else
			      ((VarRefContext)_localctx).result =  factory.createVarRead(refNode);
			  
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
	public static class ArrayExpressionContext extends ParserRuleContext {
		public ArrayExprNode result;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpression; }
	}

	public final ArrayExpressionContext arrayExpression() throws RecognitionException {
		ArrayExpressionContext _localctx = new ArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arrayExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List<ExprNode> elements = new ArrayList<>(); 
			setState(369);
			match(T__22);
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(370);
				((ArrayExpressionContext)_localctx).expression = expression(Attr.VAL);
				 elements.add(((ArrayExpressionContext)_localctx).expression.result); 
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(372);
					match(T__2);
					setState(373);
					((ArrayExpressionContext)_localctx).expression = expression(Attr.VAL);
					 elements.add(((ArrayExpressionContext)_localctx).expression.result); 
					}
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(383);
			match(T__23);
			 ((ArrayExpressionContext)_localctx).result =  factory.createArrayExpr(elements); 
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
	public static class SExpressionContext extends ParserRuleContext {
		public SexpNode result;
		public Token UIDENT;
		public ExpressionContext expression;
		public TerminalNode UIDENT() { return getToken(LamaLanguageParser.UIDENT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sExpression; }
	}

	public final SExpressionContext sExpression() throws RecognitionException {
		SExpressionContext _localctx = new SExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List<ExprNode> elementNodes = new ArrayList<>(); 
			setState(387);
			((SExpressionContext)_localctx).UIDENT = match(UIDENT);
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(388);
				match(T__5);
				setState(389);
				((SExpressionContext)_localctx).expression = expression(Attr.VAL);
				 elementNodes.add(((SExpressionContext)_localctx).expression.result); 
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(391);
					match(T__2);
					setState(392);
					((SExpressionContext)_localctx).expression = expression(Attr.VAL);
					 elementNodes.add(((SExpressionContext)_localctx).expression.result); 
					}
					}
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(400);
				match(T__6);
				}
				break;
			}
			 ((SExpressionContext)_localctx).result =  factory.createSexp(((SExpressionContext)_localctx).UIDENT, elementNodes); 
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
		enterRule(_localctx, 54, RULE_ifExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

			    List<IfThenEntry> ifThenEntries = new ArrayList<>();
			  
			setState(407);
			match(T__28);
			setState(408);
			((IfExpressionContext)_localctx).cond = expression(Attr.VAL);
			setState(409);
			match(T__29);
			setState(410);
			((IfExpressionContext)_localctx).thenBody = expression(attr);

			    ifThenEntries.add(new IfThenEntry(((IfExpressionContext)_localctx).cond.result, ((IfExpressionContext)_localctx).thenBody.result));
			  
			setState(420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(412);
					match(T__30);
					setState(413);
					((IfExpressionContext)_localctx).cond = expression(Attr.VAL);
					setState(414);
					match(T__29);
					setState(415);
					((IfExpressionContext)_localctx).thenBody = expression(attr);

					      ifThenEntries.add(new IfThenEntry(((IfExpressionContext)_localctx).cond.result, ((IfExpressionContext)_localctx).thenBody.result));
					    
					}
					} 
				}
				setState(422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(423);
			((IfExpressionContext)_localctx).elseBranch = elseBranch(attr);
			setState(424);
			match(T__31);

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
		enterRule(_localctx, 56, RULE_elseBranch);
		try {
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				match(T__32);
				setState(428);
				((ElseBranchContext)_localctx).expression = expression(attr);

				    ((ElseBranchContext)_localctx).result =  ((ElseBranchContext)_localctx).expression.result;
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
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
		public ScopeExpressionContext body;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public WhileDoExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileDoExpression; }
	}

	public final WhileDoExpressionContext whileDoExpression() throws RecognitionException {
		WhileDoExpressionContext _localctx = new WhileDoExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_whileDoExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(T__33);
			setState(436);
			((WhileDoExpressionContext)_localctx).cond = expression(Attr.VAL);
			setState(437);
			match(T__34);
			setState(438);
			((WhileDoExpressionContext)_localctx).body = scopeExpression(Attr.VOID, true);
			setState(439);
			match(T__35);

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
		public ScopeExpressionContext body;
		public ExpressionContext cond;
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
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
		enterRule(_localctx, 60, RULE_doWhileExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(T__34);
			setState(443);
			((DoWhileExpressionContext)_localctx).body = scopeExpression(Attr.VOID, false);
			setState(444);
			match(T__33);
			setState(445);
			((DoWhileExpressionContext)_localctx).cond = expression(Attr.VAL);
			setState(446);
			match(T__35);

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

	@SuppressWarnings("CheckReturnValue")
	public static class ForExpressionContext extends ParserRuleContext {
		public ExprNode result;
		public ScopeExpressionContext init;
		public ExpressionContext cond;
		public ExpressionContext incr;
		public ScopeExpressionContext body;
		public List<ScopeExpressionContext> scopeExpression() {
			return getRuleContexts(ScopeExpressionContext.class);
		}
		public ScopeExpressionContext scopeExpression(int i) {
			return getRuleContext(ScopeExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_forExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(T__36);
			setState(450);
			((ForExpressionContext)_localctx).init = scopeExpression(Attr.VOID, false);
			setState(451);
			match(T__2);
			setState(452);
			((ForExpressionContext)_localctx).cond = expression(Attr.VAL);
			setState(453);
			match(T__2);
			setState(454);
			((ForExpressionContext)_localctx).incr = expression(Attr.VOID);
			setState(455);
			match(T__34);
			setState(456);
			((ForExpressionContext)_localctx).body = scopeExpression(Attr.VOID, true);
			setState(457);
			match(T__35);

			    factory.popScope();
			    ((ForExpressionContext)_localctx).result =  new SeqNode(
			      ((ForExpressionContext)_localctx).init.result,
			      factory.createWhile(
			        ((ForExpressionContext)_localctx).cond.result,
			        new SeqNode(((ForExpressionContext)_localctx).body.result, ((ForExpressionContext)_localctx).incr.result)
			      )
			    );
			  
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
	public static class CaseExpressionContext extends ParserRuleContext {
		public Attr attr;
		public CaseNode result;
		public ExpressionContext scrutinee;
		public CaseBranchesContext caseBranches;
		public CaseBranchesContext caseBranches() {
			return getRuleContext(CaseBranchesContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CaseExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CaseExpressionContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_caseExpression; }
	}

	public final CaseExpressionContext caseExpression(Attr attr) throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState(), attr);
		enterRule(_localctx, 64, RULE_caseExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(T__37);
			setState(461);
			((CaseExpressionContext)_localctx).scrutinee = expression(Attr.VAL);
			setState(462);
			match(T__38);
			setState(463);
			((CaseExpressionContext)_localctx).caseBranches = caseBranches(attr);
			setState(464);
			match(T__39);

			    ((CaseExpressionContext)_localctx).result =  factory.createCase(((CaseExpressionContext)_localctx).scrutinee.result, ((CaseExpressionContext)_localctx).caseBranches.result);
			  
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
	public static class CaseBranchesContext extends ParserRuleContext {
		public Attr attr;
		public List<CaseNode.Branch> result;
		public CaseBranchContext caseBranch;
		public List<CaseBranchContext> caseBranch() {
			return getRuleContexts(CaseBranchContext.class);
		}
		public CaseBranchContext caseBranch(int i) {
			return getRuleContext(CaseBranchContext.class,i);
		}
		public CaseBranchesContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CaseBranchesContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_caseBranches; }
	}

	public final CaseBranchesContext caseBranches(Attr attr) throws RecognitionException {
		CaseBranchesContext _localctx = new CaseBranchesContext(_ctx, getState(), attr);
		enterRule(_localctx, 66, RULE_caseBranches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((CaseBranchesContext)_localctx).result =  new ArrayList<CaseNode.Branch>(); 
			setState(468);
			((CaseBranchesContext)_localctx).caseBranch = caseBranch(attr);
			 _localctx.result.add(((CaseBranchesContext)_localctx).caseBranch.result); 
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__40) {
				{
				{
				setState(470);
				match(T__40);
				setState(471);
				((CaseBranchesContext)_localctx).caseBranch = caseBranch(attr);
				 _localctx.result.add(((CaseBranchesContext)_localctx).caseBranch.result); 
				}
				}
				setState(478);
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
	public static class CaseBranchContext extends ParserRuleContext {
		public Attr attr;
		public CaseNode.Branch result;
		public PatternContext pattern;
		public ScopeExpressionNoStartContext outcome;
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ScopeExpressionNoStartContext scopeExpressionNoStart() {
			return getRuleContext(ScopeExpressionNoStartContext.class,0);
		}
		public CaseBranchContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CaseBranchContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_caseBranch; }
	}

	public final CaseBranchContext caseBranch(Attr attr) throws RecognitionException {
		CaseBranchContext _localctx = new CaseBranchContext(_ctx, getState(), attr);
		enterRule(_localctx, 68, RULE_caseBranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 factory.startScope(); 
			setState(480);
			((CaseBranchContext)_localctx).pattern = pattern();
			setState(481);
			match(T__41);
			setState(482);
			((CaseBranchContext)_localctx).outcome = scopeExpressionNoStart(attr, true);

			    ((CaseBranchContext)_localctx).result =  new CaseNode.Branch(((CaseBranchContext)_localctx).pattern.result, ((CaseBranchContext)_localctx).outcome.result);
			  
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
	public static class PatternContext extends ParserRuleContext {
		public PatternNode result;
		public SimplePatternContext simplePattern;
		public SimplePatternContext simplePattern() {
			return getRuleContext(SimplePatternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			((PatternContext)_localctx).simplePattern = simplePattern();
			 ((PatternContext)_localctx).result =  ((PatternContext)_localctx).simplePattern.result; 
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
	public static class SimplePatternContext extends ParserRuleContext {
		public PatternNode result;
		public WildcardPatternContext wildcardPattern;
		public SexpPatternContext sexpPattern;
		public BindingPatternContext bindingPattern;
		public WildcardPatternContext wildcardPattern() {
			return getRuleContext(WildcardPatternContext.class,0);
		}
		public SexpPatternContext sexpPattern() {
			return getRuleContext(SexpPatternContext.class,0);
		}
		public BindingPatternContext bindingPattern() {
			return getRuleContext(BindingPatternContext.class,0);
		}
		public SimplePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplePattern; }
	}

	public final SimplePatternContext simplePattern() throws RecognitionException {
		SimplePatternContext _localctx = new SimplePatternContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_simplePattern);
		try {
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				((SimplePatternContext)_localctx).wildcardPattern = wildcardPattern();
				 ((SimplePatternContext)_localctx).result =  ((SimplePatternContext)_localctx).wildcardPattern.result; 
				}
				break;
			case UIDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				((SimplePatternContext)_localctx).sexpPattern = sexpPattern();
				 ((SimplePatternContext)_localctx).result =  ((SimplePatternContext)_localctx).sexpPattern.result; 
				}
				break;
			case LIDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(494);
				((SimplePatternContext)_localctx).bindingPattern = bindingPattern();
				 ((SimplePatternContext)_localctx).result =  ((SimplePatternContext)_localctx).bindingPattern.result; 
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class WildcardPatternContext extends ParserRuleContext {
		public PatternNode result;
		public WildcardPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardPattern; }
	}

	public final WildcardPatternContext wildcardPattern() throws RecognitionException {
		WildcardPatternContext _localctx = new WildcardPatternContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_wildcardPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(T__42);
			 ((WildcardPatternContext)_localctx).result =  new WildcardPatternNode(); 
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
	public static class SexpPatternContext extends ParserRuleContext {
		public PatternNode result;
		public Token UIDENT;
		public PatternContext pattern;
		public TerminalNode UIDENT() { return getToken(LamaLanguageParser.UIDENT, 0); }
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public SexpPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sexpPattern; }
	}

	public final SexpPatternContext sexpPattern() throws RecognitionException {
		SexpPatternContext _localctx = new SexpPatternContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_sexpPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List<PatternNode> subpatterns = new ArrayList<>(); 
			setState(503);
			((SexpPatternContext)_localctx).UIDENT = match(UIDENT);
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(504);
				match(T__5);
				setState(505);
				((SexpPatternContext)_localctx).pattern = pattern();
				 subpatterns.add(((SexpPatternContext)_localctx).pattern.result); 
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(507);
					match(T__2);
					setState(508);
					((SexpPatternContext)_localctx).pattern = pattern();
					 subpatterns.add(((SexpPatternContext)_localctx).pattern.result); 
					}
					}
					setState(515);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(516);
				match(T__6);
				}
			}

			 ((SexpPatternContext)_localctx).result =  factory.createSexpPattern(((SexpPatternContext)_localctx).UIDENT, subpatterns); 
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
	public static class BindingPatternContext extends ParserRuleContext {
		public PatternNode result;
		public Token LIDENT;
		public PatternContext pattern;
		public TerminalNode LIDENT() { return getToken(LamaLanguageParser.LIDENT, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public BindingPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingPattern; }
	}

	public final BindingPatternContext bindingPattern() throws RecognitionException {
		BindingPatternContext _localctx = new BindingPatternContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_bindingPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			((BindingPatternContext)_localctx).LIDENT = match(LIDENT);
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__43) {
				{
				setState(523);
				match(T__43);
				setState(524);
				((BindingPatternContext)_localctx).pattern = pattern();
				}
			}


			    ((BindingPatternContext)_localctx).result =  factory.createBindingPattern(((BindingPatternContext)_localctx).LIDENT, ((BindingPatternContext)_localctx).pattern != null ? ((BindingPatternContext)_localctx).pattern.result : null);
			  
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
		case 12:
			return maybeAssignment_sempred((MaybeAssignmentContext)_localctx, predIndex);
		case 14:
			return maybeCmp_sempred((MaybeCmpContext)_localctx, predIndex);
		case 15:
			return maybeAddSub_sempred((MaybeAddSubContext)_localctx, predIndex);
		case 16:
			return maybeMulDivRem_sempred((MaybeMulDivRemContext)_localctx, predIndex);
		case 19:
			return postfixItem_sempred((PostfixItemContext)_localctx, predIndex);
		case 20:
			return primary_sempred((PrimaryContext)_localctx, predIndex);
		case 28:
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
	private boolean postfixItem_sempred(PostfixItemContext _localctx, int predIndex) {
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
			return _localctx.attr != Attr.REF;
		case 13:
			return _localctx.attr != Attr.REF;
		case 14:
			return _localctx.attr == Attr.VOID;
		case 15:
			return _localctx.attr == Attr.VOID;
		case 16:
			return _localctx.attr == Attr.VOID;
		}
		return true;
	}
	private boolean elseBranch_sempred(ElseBranchContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return _localctx.attr == Attr.VOID;
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00014\u0212\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0005\u0002Z\b\u0002\n\u0002\f\u0002]\t"+
		"\u0002\u0001\u0002\u0003\u0002`\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0003\u0003f\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005o\b"+
		"\u0005\n\u0005\f\u0005r\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006w\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u0089\b"+
		"\b\n\b\f\b\u008c\t\b\u0003\b\u008e\b\b\u0001\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u009b"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a9\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u00b4"+
		"\b\r\u000b\r\f\r\u00b5\u0003\r\u00b8\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00c3\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0004\u000f\u00cf\b\u000f\u000b\u000f\f\u000f\u00d0\u0003\u000f"+
		"\u00d3\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010"+
		"\u00df\b\u0010\u000b\u0010\f\u0010\u00e0\u0003\u0010\u00e3\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00f0"+
		"\b\u0012\n\u0012\f\u0012\u00f3\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00f8\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0108\b\u0013"+
		"\n\u0013\f\u0013\u010b\t\u0013\u0003\u0013\u010d\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u011c\b\u0013\n\u0013\f\u0013\u011f\t\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0123\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0127\b"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u0160\b\u0014\u0001\u0015\u0003\u0015\u0163"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0179\b\u0019\n\u0019\f\u0019"+
		"\u017c\t\u0019\u0003\u0019\u017e\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u018c\b\u001a\n"+
		"\u001a\f\u001a\u018f\t\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0193"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01a3\b\u001b\n\u001b\f\u001b"+
		"\u01a6\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u01b2\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u01db\b!\n!"+
		"\f!\u01de\t!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u01f2\b$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0005&\u0200\b&\n&\f&\u0203\t&\u0001&\u0001"+
		"&\u0003&\u0207\b&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0003\'\u020e"+
		"\b\'\u0001\'\u0001\'\u0001\'\u0000\u0000(\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BDFHJLN\u0000\u0003\u0001\u0000\f\u0011\u0001\u0000\u0012\u0013\u0001"+
		"\u0000\u0014\u0016\u021c\u0000P\u0001\u0000\u0000\u0000\u0002T\u0001\u0000"+
		"\u0000\u0000\u0004[\u0001\u0000\u0000\u0000\u0006e\u0001\u0000\u0000\u0000"+
		"\bg\u0001\u0000\u0000\u0000\nk\u0001\u0000\u0000\u0000\fs\u0001\u0000"+
		"\u0000\u0000\u000ez\u0001\u0000\u0000\u0000\u0010\u008d\u0001\u0000\u0000"+
		"\u0000\u0012\u008f\u0001\u0000\u0000\u0000\u0014\u009a\u0001\u0000\u0000"+
		"\u0000\u0016\u009c\u0001\u0000\u0000\u0000\u0018\u00a8\u0001\u0000\u0000"+
		"\u0000\u001a\u00b7\u0001\u0000\u0000\u0000\u001c\u00c2\u0001\u0000\u0000"+
		"\u0000\u001e\u00d2\u0001\u0000\u0000\u0000 \u00e2\u0001\u0000\u0000\u0000"+
		"\"\u00e4\u0001\u0000\u0000\u0000$\u00f7\u0001\u0000\u0000\u0000&\u0126"+
		"\u0001\u0000\u0000\u0000(\u015f\u0001\u0000\u0000\u0000*\u0162\u0001\u0000"+
		"\u0000\u0000,\u0167\u0001\u0000\u0000\u0000.\u016a\u0001\u0000\u0000\u0000"+
		"0\u016d\u0001\u0000\u0000\u00002\u0170\u0001\u0000\u0000\u00004\u0182"+
		"\u0001\u0000\u0000\u00006\u0196\u0001\u0000\u0000\u00008\u01b1\u0001\u0000"+
		"\u0000\u0000:\u01b3\u0001\u0000\u0000\u0000<\u01ba\u0001\u0000\u0000\u0000"+
		">\u01c1\u0001\u0000\u0000\u0000@\u01cc\u0001\u0000\u0000\u0000B\u01d3"+
		"\u0001\u0000\u0000\u0000D\u01df\u0001\u0000\u0000\u0000F\u01e5\u0001\u0000"+
		"\u0000\u0000H\u01f1\u0001\u0000\u0000\u0000J\u01f3\u0001\u0000\u0000\u0000"+
		"L\u01f6\u0001\u0000\u0000\u0000N\u020a\u0001\u0000\u0000\u0000PQ\u0003"+
		"\u0002\u0001\u0000QR\u0006\u0000\uffff\uffff\u0000RS\u0005\u0000\u0000"+
		"\u0001S\u0001\u0001\u0000\u0000\u0000TU\u0006\u0001\uffff\uffff\u0000"+
		"UV\u0003\u0004\u0002\u0000VW\u0006\u0001\uffff\uffff\u0000W\u0003\u0001"+
		"\u0000\u0000\u0000XZ\u0003\u0006\u0003\u0000YX\u0001\u0000\u0000\u0000"+
		"Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^`\u0003\u0014"+
		"\n\u0000_^\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000ab\u0006\u0002\uffff\uffff\u0000b\u0005\u0001\u0000\u0000"+
		"\u0000cf\u0003\b\u0004\u0000df\u0003\u000e\u0007\u0000ec\u0001\u0000\u0000"+
		"\u0000ed\u0001\u0000\u0000\u0000f\u0007\u0001\u0000\u0000\u0000gh\u0005"+
		"\u0001\u0000\u0000hi\u0003\n\u0005\u0000ij\u0005\u0002\u0000\u0000j\t"+
		"\u0001\u0000\u0000\u0000kp\u0003\f\u0006\u0000lm\u0005\u0003\u0000\u0000"+
		"mo\u0003\f\u0006\u0000nl\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000q\u000b\u0001\u0000"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000sv\u00051\u0000\u0000tu\u0005\u0004"+
		"\u0000\u0000uw\u0003\u0016\u000b\u0000vt\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0006\u0006\uffff\uffff"+
		"\u0000y\r\u0001\u0000\u0000\u0000z{\u0005\u0005\u0000\u0000{|\u00051\u0000"+
		"\u0000|}\u0006\u0007\uffff\uffff\u0000}~\u0005\u0006\u0000\u0000~\u007f"+
		"\u0003\u0010\b\u0000\u007f\u0080\u0005\u0007\u0000\u0000\u0080\u0081\u0005"+
		"\b\u0000\u0000\u0081\u0082\u0003\u0004\u0002\u0000\u0082\u0083\u0005\t"+
		"\u0000\u0000\u0083\u0084\u0006\u0007\uffff\uffff\u0000\u0084\u000f\u0001"+
		"\u0000\u0000\u0000\u0085\u008a\u0003\u0012\t\u0000\u0086\u0087\u0005\u0003"+
		"\u0000\u0000\u0087\u0089\u0003\u0012\t\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u0085\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0011\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u00051\u0000\u0000\u0090\u0091\u0006\t\uffff\uffff"+
		"\u0000\u0091\u0013\u0001\u0000\u0000\u0000\u0092\u0093\u0003\u0016\u000b"+
		"\u0000\u0093\u0094\u0006\n\uffff\uffff\u0000\u0094\u009b\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0003\u0016\u000b\u0000\u0096\u0097\u0005\u0002\u0000"+
		"\u0000\u0097\u0098\u0003\u0014\n\u0000\u0098\u0099\u0006\n\uffff\uffff"+
		"\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0092\u0001\u0000\u0000"+
		"\u0000\u009a\u0095\u0001\u0000\u0000\u0000\u009b\u0015\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0003\u0018\f\u0000\u009d\u009e\u0006\u000b\uffff\uffff"+
		"\u0000\u009e\u0017\u0001\u0000\u0000\u0000\u009f\u00a0\u0004\f\u0000\u0001"+
		"\u00a0\u00a1\u0003\u001a\r\u0000\u00a1\u00a2\u0005\n\u0000\u0000\u00a2"+
		"\u00a3\u0003\u0018\f\u0000\u00a3\u00a4\u0006\f\uffff\uffff\u0000\u00a4"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a5\u00a6\u0003\u001a\r\u0000\u00a6\u00a7"+
		"\u0006\f\uffff\uffff\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u009f"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a5\u0001\u0000\u0000\u0000\u00a9\u0019"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0003\u001c\u000e\u0000\u00ab\u00ac"+
		"\u0006\r\uffff\uffff\u0000\u00ac\u00b8\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0003\u001c\u000e\u0000\u00ae\u00b3\u0006\r\uffff\uffff\u0000\u00af\u00b0"+
		"\u0005\u000b\u0000\u0000\u00b0\u00b1\u0003\u001c\u000e\u0000\u00b1\u00b2"+
		"\u0006\r\uffff\uffff\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00af"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b7\u00aa\u0001\u0000\u0000\u0000\u00b7\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b8\u001b\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0004\u000e\u0001\u0001\u00ba\u00bb\u0003\u001e\u000f\u0000\u00bb\u00bc"+
		"\u0007\u0000\u0000\u0000\u00bc\u00bd\u0003\u001e\u000f\u0000\u00bd\u00be"+
		"\u0006\u000e\uffff\uffff\u0000\u00be\u00c3\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0003\u001e\u000f\u0000\u00c0\u00c1\u0006\u000e\uffff\uffff\u0000"+
		"\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00b9\u0001\u0000\u0000\u0000"+
		"\u00c2\u00bf\u0001\u0000\u0000\u0000\u00c3\u001d\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0003 \u0010\u0000\u00c5\u00c6\u0006\u000f\uffff\uffff\u0000"+
		"\u00c6\u00d3\u0001\u0000\u0000\u0000\u00c7\u00c8\u0004\u000f\u0002\u0001"+
		"\u00c8\u00c9\u0003 \u0010\u0000\u00c9\u00ce\u0006\u000f\uffff\uffff\u0000"+
		"\u00ca\u00cb\u0007\u0001\u0000\u0000\u00cb\u00cc\u0003 \u0010\u0000\u00cc"+
		"\u00cd\u0006\u000f\uffff\uffff\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000"+
		"\u00ce\u00ca\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00c4\u0001\u0000\u0000\u0000"+
		"\u00d2\u00c7\u0001\u0000\u0000\u0000\u00d3\u001f\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0003\"\u0011\u0000\u00d5\u00d6\u0006\u0010\uffff\uffff\u0000"+
		"\u00d6\u00e3\u0001\u0000\u0000\u0000\u00d7\u00d8\u0004\u0010\u0003\u0001"+
		"\u00d8\u00d9\u0003\"\u0011\u0000\u00d9\u00de\u0006\u0010\uffff\uffff\u0000"+
		"\u00da\u00db\u0007\u0002\u0000\u0000\u00db\u00dc\u0003\"\u0011\u0000\u00dc"+
		"\u00dd\u0006\u0010\uffff\uffff\u0000\u00dd\u00df\u0001\u0000\u0000\u0000"+
		"\u00de\u00da\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2\u00d4\u0001\u0000\u0000\u0000"+
		"\u00e2\u00d7\u0001\u0000\u0000\u0000\u00e3!\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0003$\u0012\u0000\u00e5\u00e6\u0006\u0011\uffff\uffff\u0000\u00e6"+
		"#\u0001\u0000\u0000\u0000\u00e7\u00e8\u0003(\u0014\u0000\u00e8\u00e9\u0006"+
		"\u0012\uffff\uffff\u0000\u00e9\u00f8\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0003(\u0014\u0000\u00eb\u00f1\u0006\u0012\uffff\uffff\u0000\u00ec\u00ed"+
		"\u0003&\u0013\u0000\u00ed\u00ee\u0006\u0012\uffff\uffff\u0000\u00ee\u00f0"+
		"\u0001\u0000\u0000\u0000\u00ef\u00ec\u0001\u0000\u0000\u0000\u00f0\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f5\u0003&\u0013\u0000\u00f5\u00f6\u0006"+
		"\u0012\uffff\uffff\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00e7"+
		"\u0001\u0000\u0000\u0000\u00f7\u00ea\u0001\u0000\u0000\u0000\u00f8%\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0005\u0017\u0000\u0000\u00fa\u00fb\u0003"+
		"\u0014\n\u0000\u00fb\u00fc\u0005\u0018\u0000\u0000\u00fc\u00fd\u0006\u0013"+
		"\uffff\uffff\u0000\u00fd\u0127\u0001\u0000\u0000\u0000\u00fe\u00ff\u0004"+
		"\u0013\u0004\u0001\u00ff\u0100\u0006\u0013\uffff\uffff\u0000\u0100\u010c"+
		"\u0005\u0006\u0000\u0000\u0101\u0102\u0003\u0014\n\u0000\u0102\u0109\u0006"+
		"\u0013\uffff\uffff\u0000\u0103\u0104\u0005\u0003\u0000\u0000\u0104\u0105"+
		"\u0003\u0014\n\u0000\u0105\u0106\u0006\u0013\uffff\uffff\u0000\u0106\u0108"+
		"\u0001\u0000\u0000\u0000\u0107\u0103\u0001\u0000\u0000\u0000\u0108\u010b"+
		"\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109"+
		"\u0001\u0000\u0000\u0000\u010c\u0101\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f"+
		"\u0005\u0007\u0000\u0000\u010f\u0127\u0006\u0013\uffff\uffff\u0000\u0110"+
		"\u0111\u0004\u0013\u0005\u0001\u0111\u0112\u0006\u0013\uffff\uffff\u0000"+
		"\u0112\u0113\u0005\u0019\u0000\u0000\u0113\u0122\u00030\u0018\u0000\u0114"+
		"\u0115\u0005\u0006\u0000\u0000\u0115\u0116\u0003\u0014\n\u0000\u0116\u011d"+
		"\u0006\u0013\uffff\uffff\u0000\u0117\u0118\u0005\u0003\u0000\u0000\u0118"+
		"\u0119\u0003\u0014\n\u0000\u0119\u011a\u0006\u0013\uffff\uffff\u0000\u011a"+
		"\u011c\u0001\u0000\u0000\u0000\u011b\u0117\u0001\u0000\u0000\u0000\u011c"+
		"\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0001\u0000\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f"+
		"\u011d\u0001\u0000\u0000\u0000\u0120\u0121\u0005\u0007\u0000\u0000\u0121"+
		"\u0123\u0001\u0000\u0000\u0000\u0122\u0114\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0006\u0013\uffff\uffff\u0000\u0125\u0127\u0001\u0000\u0000\u0000"+
		"\u0126\u00f9\u0001\u0000\u0000\u0000\u0126\u00fe\u0001\u0000\u0000\u0000"+
		"\u0126\u0110\u0001\u0000\u0000\u0000\u0127\'\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0004\u0014\u0006\u0001\u0129\u012a\u0003*\u0015\u0000\u012a\u012b"+
		"\u0006\u0014\uffff\uffff\u0000\u012b\u0160\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0004\u0014\u0007\u0001\u012d\u012e\u0003,\u0016\u0000\u012e\u012f"+
		"\u0006\u0014\uffff\uffff\u0000\u012f\u0160\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0004\u0014\b\u0001\u0131\u0132\u0003.\u0017\u0000\u0132\u0133"+
		"\u0006\u0014\uffff\uffff\u0000\u0133\u0160\u0001\u0000\u0000\u0000\u0134"+
		"\u0135\u00030\u0018\u0000\u0135\u0136\u0006\u0014\uffff\uffff\u0000\u0136"+
		"\u0160\u0001\u0000\u0000\u0000\u0137\u0138\u0004\u0014\t\u0001\u0138\u0139"+
		"\u0005\u001a\u0000\u0000\u0139\u0160\u0006\u0014\uffff\uffff\u0000\u013a"+
		"\u013b\u0004\u0014\n\u0001\u013b\u013c\u0005\u001b\u0000\u0000\u013c\u0160"+
		"\u0006\u0014\uffff\uffff\u0000\u013d\u013e\u0004\u0014\u000b\u0001\u013e"+
		"\u013f\u0005\u001c\u0000\u0000\u013f\u0160\u0006\u0014\uffff\uffff\u0000"+
		"\u0140\u0141\u0005\u0006\u0000\u0000\u0141\u0142\u0003\u0002\u0001\u0000"+
		"\u0142\u0143\u0005\u0007\u0000\u0000\u0143\u0144\u0006\u0014\uffff\uffff"+
		"\u0000\u0144\u0160\u0001\u0000\u0000\u0000\u0145\u0146\u0004\u0014\f\u0001"+
		"\u0146\u0147\u00032\u0019\u0000\u0147\u0148\u0006\u0014\uffff\uffff\u0000"+
		"\u0148\u0160\u0001\u0000\u0000\u0000\u0149\u014a\u0004\u0014\r\u0001\u014a"+
		"\u014b\u00034\u001a\u0000\u014b\u014c\u0006\u0014\uffff\uffff\u0000\u014c"+
		"\u0160\u0001\u0000\u0000\u0000\u014d\u014e\u00036\u001b\u0000\u014e\u014f"+
		"\u0006\u0014\uffff\uffff\u0000\u014f\u0160\u0001\u0000\u0000\u0000\u0150"+
		"\u0151\u0004\u0014\u000e\u0001\u0151\u0152\u0003:\u001d\u0000\u0152\u0153"+
		"\u0006\u0014\uffff\uffff\u0000\u0153\u0160\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u0004\u0014\u000f\u0001\u0155\u0156\u0003<\u001e\u0000\u0156\u0157"+
		"\u0006\u0014\uffff\uffff\u0000\u0157\u0160\u0001\u0000\u0000\u0000\u0158"+
		"\u0159\u0004\u0014\u0010\u0001\u0159\u015a\u0003>\u001f\u0000\u015a\u015b"+
		"\u0006\u0014\uffff\uffff\u0000\u015b\u0160\u0001\u0000\u0000\u0000\u015c"+
		"\u015d\u0003@ \u0000\u015d\u015e\u0006\u0014\uffff\uffff\u0000\u015e\u0160"+
		"\u0001\u0000\u0000\u0000\u015f\u0128\u0001\u0000\u0000\u0000\u015f\u012c"+
		"\u0001\u0000\u0000\u0000\u015f\u0130\u0001\u0000\u0000\u0000\u015f\u0134"+
		"\u0001\u0000\u0000\u0000\u015f\u0137\u0001\u0000\u0000\u0000\u015f\u013a"+
		"\u0001\u0000\u0000\u0000\u015f\u013d\u0001\u0000\u0000\u0000\u015f\u0140"+
		"\u0001\u0000\u0000\u0000\u015f\u0145\u0001\u0000\u0000\u0000\u015f\u0149"+
		"\u0001\u0000\u0000\u0000\u015f\u014d\u0001\u0000\u0000\u0000\u015f\u0150"+
		"\u0001\u0000\u0000\u0000\u015f\u0154\u0001\u0000\u0000\u0000\u015f\u0158"+
		"\u0001\u0000\u0000\u0000\u015f\u015c\u0001\u0000\u0000\u0000\u0160)\u0001"+
		"\u0000\u0000\u0000\u0161\u0163\u0005\u0013\u0000\u0000\u0162\u0161\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u00052\u0000\u0000\u0165\u0166\u0006\u0015"+
		"\uffff\uffff\u0000\u0166+\u0001\u0000\u0000\u0000\u0167\u0168\u00053\u0000"+
		"\u0000\u0168\u0169\u0006\u0016\uffff\uffff\u0000\u0169-\u0001\u0000\u0000"+
		"\u0000\u016a\u016b\u00054\u0000\u0000\u016b\u016c\u0006\u0017\uffff\uffff"+
		"\u0000\u016c/\u0001\u0000\u0000\u0000\u016d\u016e\u00051\u0000\u0000\u016e"+
		"\u016f\u0006\u0018\uffff\uffff\u0000\u016f1\u0001\u0000\u0000\u0000\u0170"+
		"\u0171\u0006\u0019\uffff\uffff\u0000\u0171\u017d\u0005\u0017\u0000\u0000"+
		"\u0172\u0173\u0003\u0014\n\u0000\u0173\u017a\u0006\u0019\uffff\uffff\u0000"+
		"\u0174\u0175\u0005\u0003\u0000\u0000\u0175\u0176\u0003\u0014\n\u0000\u0176"+
		"\u0177\u0006\u0019\uffff\uffff\u0000\u0177\u0179\u0001\u0000\u0000\u0000"+
		"\u0178\u0174\u0001\u0000\u0000\u0000\u0179\u017c\u0001\u0000\u0000\u0000"+
		"\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000"+
		"\u017b\u017e\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000"+
		"\u017d\u0172\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000"+
		"\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0180\u0005\u0018\u0000\u0000"+
		"\u0180\u0181\u0006\u0019\uffff\uffff\u0000\u01813\u0001\u0000\u0000\u0000"+
		"\u0182\u0183\u0006\u001a\uffff\uffff\u0000\u0183\u0192\u00050\u0000\u0000"+
		"\u0184\u0185\u0005\u0006\u0000\u0000\u0185\u0186\u0003\u0014\n\u0000\u0186"+
		"\u018d\u0006\u001a\uffff\uffff\u0000\u0187\u0188\u0005\u0003\u0000\u0000"+
		"\u0188\u0189\u0003\u0014\n\u0000\u0189\u018a\u0006\u001a\uffff\uffff\u0000"+
		"\u018a\u018c\u0001\u0000\u0000\u0000\u018b\u0187\u0001\u0000\u0000\u0000"+
		"\u018c\u018f\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u0190\u0001\u0000\u0000\u0000"+
		"\u018f\u018d\u0001\u0000\u0000\u0000\u0190\u0191\u0005\u0007\u0000\u0000"+
		"\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u0184\u0001\u0000\u0000\u0000"+
		"\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000"+
		"\u0194\u0195\u0006\u001a\uffff\uffff\u0000\u01955\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u0006\u001b\uffff\uffff\u0000\u0197\u0198\u0005\u001d\u0000"+
		"\u0000\u0198\u0199\u0003\u0014\n\u0000\u0199\u019a\u0005\u001e\u0000\u0000"+
		"\u019a\u019b\u0003\u0014\n\u0000\u019b\u01a4\u0006\u001b\uffff\uffff\u0000"+
		"\u019c\u019d\u0005\u001f\u0000\u0000\u019d\u019e\u0003\u0014\n\u0000\u019e"+
		"\u019f\u0005\u001e\u0000\u0000\u019f\u01a0\u0003\u0014\n\u0000\u01a0\u01a1"+
		"\u0006\u001b\uffff\uffff\u0000\u01a1\u01a3\u0001\u0000\u0000\u0000\u01a2"+
		"\u019c\u0001\u0000\u0000\u0000\u01a3\u01a6\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a8\u00038\u001c\u0000\u01a8\u01a9\u0005 \u0000\u0000\u01a9\u01aa\u0006"+
		"\u001b\uffff\uffff\u0000\u01aa7\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005"+
		"!\u0000\u0000\u01ac\u01ad\u0003\u0014\n\u0000\u01ad\u01ae\u0006\u001c"+
		"\uffff\uffff\u0000\u01ae\u01b2\u0001\u0000\u0000\u0000\u01af\u01b0\u0004"+
		"\u001c\u0011\u0001\u01b0\u01b2\u0006\u001c\uffff\uffff\u0000\u01b1\u01ab"+
		"\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b29\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b4\u0005\"\u0000\u0000\u01b4\u01b5\u0003\u0014"+
		"\n\u0000\u01b5\u01b6\u0005#\u0000\u0000\u01b6\u01b7\u0003\u0002\u0001"+
		"\u0000\u01b7\u01b8\u0005$\u0000\u0000\u01b8\u01b9\u0006\u001d\uffff\uffff"+
		"\u0000\u01b9;\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005#\u0000\u0000\u01bb"+
		"\u01bc\u0003\u0002\u0001\u0000\u01bc\u01bd\u0005\"\u0000\u0000\u01bd\u01be"+
		"\u0003\u0014\n\u0000\u01be\u01bf\u0005$\u0000\u0000\u01bf\u01c0\u0006"+
		"\u001e\uffff\uffff\u0000\u01c0=\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005"+
		"%\u0000\u0000\u01c2\u01c3\u0003\u0002\u0001\u0000\u01c3\u01c4\u0005\u0003"+
		"\u0000\u0000\u01c4\u01c5\u0003\u0014\n\u0000\u01c5\u01c6\u0005\u0003\u0000"+
		"\u0000\u01c6\u01c7\u0003\u0014\n\u0000\u01c7\u01c8\u0005#\u0000\u0000"+
		"\u01c8\u01c9\u0003\u0002\u0001\u0000\u01c9\u01ca\u0005$\u0000\u0000\u01ca"+
		"\u01cb\u0006\u001f\uffff\uffff\u0000\u01cb?\u0001\u0000\u0000\u0000\u01cc"+
		"\u01cd\u0005&\u0000\u0000\u01cd\u01ce\u0003\u0014\n\u0000\u01ce\u01cf"+
		"\u0005\'\u0000\u0000\u01cf\u01d0\u0003B!\u0000\u01d0\u01d1\u0005(\u0000"+
		"\u0000\u01d1\u01d2\u0006 \uffff\uffff\u0000\u01d2A\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d4\u0006!\uffff\uffff\u0000\u01d4\u01d5\u0003D\"\u0000\u01d5"+
		"\u01dc\u0006!\uffff\uffff\u0000\u01d6\u01d7\u0005)\u0000\u0000\u01d7\u01d8"+
		"\u0003D\"\u0000\u01d8\u01d9\u0006!\uffff\uffff\u0000\u01d9\u01db\u0001"+
		"\u0000\u0000\u0000\u01da\u01d6\u0001\u0000\u0000\u0000\u01db\u01de\u0001"+
		"\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001"+
		"\u0000\u0000\u0000\u01ddC\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000"+
		"\u0000\u0000\u01df\u01e0\u0006\"\uffff\uffff\u0000\u01e0\u01e1\u0003F"+
		"#\u0000\u01e1\u01e2\u0005*\u0000\u0000\u01e2\u01e3\u0003\u0004\u0002\u0000"+
		"\u01e3\u01e4\u0006\"\uffff\uffff\u0000\u01e4E\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e6\u0003H$\u0000\u01e6\u01e7\u0006#\uffff\uffff\u0000\u01e7"+
		"G\u0001\u0000\u0000\u0000\u01e8\u01e9\u0003J%\u0000\u01e9\u01ea\u0006"+
		"$\uffff\uffff\u0000\u01ea\u01f2\u0001\u0000\u0000\u0000\u01eb\u01ec\u0003"+
		"L&\u0000\u01ec\u01ed\u0006$\uffff\uffff\u0000\u01ed\u01f2\u0001\u0000"+
		"\u0000\u0000\u01ee\u01ef\u0003N\'\u0000\u01ef\u01f0\u0006$\uffff\uffff"+
		"\u0000\u01f0\u01f2\u0001\u0000\u0000\u0000\u01f1\u01e8\u0001\u0000\u0000"+
		"\u0000\u01f1\u01eb\u0001\u0000\u0000\u0000\u01f1\u01ee\u0001\u0000\u0000"+
		"\u0000\u01f2I\u0001\u0000\u0000\u0000\u01f3\u01f4\u0005+\u0000\u0000\u01f4"+
		"\u01f5\u0006%\uffff\uffff\u0000\u01f5K\u0001\u0000\u0000\u0000\u01f6\u01f7"+
		"\u0006&\uffff\uffff\u0000\u01f7\u0206\u00050\u0000\u0000\u01f8\u01f9\u0005"+
		"\u0006\u0000\u0000\u01f9\u01fa\u0003F#\u0000\u01fa\u0201\u0006&\uffff"+
		"\uffff\u0000\u01fb\u01fc\u0005\u0003\u0000\u0000\u01fc\u01fd\u0003F#\u0000"+
		"\u01fd\u01fe\u0006&\uffff\uffff\u0000\u01fe\u0200\u0001\u0000\u0000\u0000"+
		"\u01ff\u01fb\u0001\u0000\u0000\u0000\u0200\u0203\u0001\u0000\u0000\u0000"+
		"\u0201\u01ff\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000"+
		"\u0202\u0204\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000"+
		"\u0204\u0205\u0005\u0007\u0000\u0000\u0205\u0207\u0001\u0000\u0000\u0000"+
		"\u0206\u01f8\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000"+
		"\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u0209\u0006&\uffff\uffff\u0000"+
		"\u0209M\u0001\u0000\u0000\u0000\u020a\u020d\u00051\u0000\u0000\u020b\u020c"+
		"\u0005,\u0000\u0000\u020c\u020e\u0003F#\u0000\u020d\u020b\u0001\u0000"+
		"\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000"+
		"\u0000\u0000\u020f\u0210\u0006\'\uffff\uffff\u0000\u0210O\u0001\u0000"+
		"\u0000\u0000$[_epv\u008a\u008d\u009a\u00a8\u00b5\u00b7\u00c2\u00d0\u00d2"+
		"\u00e0\u00e2\u00f1\u00f7\u0109\u010c\u011d\u0122\u0126\u015f\u0162\u017a"+
		"\u017d\u018d\u0192\u01a4\u01b1\u01dc\u01f1\u0201\u0206\u020d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}