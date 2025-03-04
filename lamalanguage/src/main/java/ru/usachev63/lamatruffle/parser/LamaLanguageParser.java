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
		T__38=39, T__39=40, T__40=41, T__41=42, WS=43, COMMENT=44, LINE_COMMENT=45, 
		UIDENT=46, LIDENT=47, DECIMAL=48, STRING=49, CHAR=50;
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
		RULE_caseBranch = 34, RULE_pattern = 35, RULE_simplePattern = 36, RULE_sexpPattern = 37;
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
			"simplePattern", "sexpPattern"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "';'", "','", "'='", "'fun'", "'('", "')'", "'{'", "'}'", 
			"':='", "'&&'", "'=='", "'!='", "'<='", "'<'", "'>='", "'>'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'['", "']'", "'.'", "'true'", "'false'", 
			"'skip'", "'if'", "'then'", "'elif'", "'fi'", "'else'", "'while'", "'do'", 
			"'od'", "'for'", "'case'", "'of'", "'esac'", "'|'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "WS", "COMMENT", "LINE_COMMENT", 
			"UIDENT", "LIDENT", "DECIMAL", "STRING", "CHAR"
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
			setState(76);
			((LamaContext)_localctx).scopeExpression = scopeExpression(Attr.VOID, true);
			 factory.createMain(((LamaContext)_localctx).scopeExpression.result); 
			setState(78);
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
			setState(81);
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
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					definition();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(90);
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
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				variableDefinition();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
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
			setState(99);
			match(T__0);
			setState(100);
			variableDefinitionSequence();
			setState(101);
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
			setState(103);
			variableDefinitionItem();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(104);
				match(T__2);
				setState(105);
				variableDefinitionItem();
				}
				}
				setState(110);
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
			setState(111);
			((VariableDefinitionItemContext)_localctx).LIDENT = match(LIDENT);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(112);
				match(T__3);
				setState(113);
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
			setState(118);
			match(T__4);
			setState(119);
			((FunctionDefinitionContext)_localctx).LIDENT = match(LIDENT);

			    factory.startFrame(((FunctionDefinitionContext)_localctx).LIDENT);
			    factory.startScope();
			  
			setState(121);
			match(T__5);
			setState(122);
			functionParameters();
			setState(123);
			match(T__6);
			setState(124);
			match(T__7);
			setState(125);
			((FunctionDefinitionContext)_localctx).body = scopeExpressionNoStart(Attr.VOID, true);
			setState(126);
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
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIDENT) {
				{
				setState(129);
				functionParameter();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(130);
					match(T__2);
					setState(131);
					functionParameter();
					}
					}
					setState(136);
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
			setState(139);
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
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				((ExpressionContext)_localctx).basicExpression = basicExpression(attr);
				 ((ExpressionContext)_localctx).result =  ((ExpressionContext)_localctx).basicExpression.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				((ExpressionContext)_localctx).basicExpression = basicExpression(Attr.VOID);
				setState(146);
				match(T__1);
				setState(147);
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
			setState(152);
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
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(156);
				((MaybeAssignmentContext)_localctx).lhs = maybeConjunction(Attr.REF);
				setState(157);
				match(T__9);
				setState(158);
				((MaybeAssignmentContext)_localctx).rhs = maybeAssignment(Attr.VAL);

				    ((MaybeAssignmentContext)_localctx).result =  factory.createAssn(((MaybeAssignmentContext)_localctx).lhs.result, ((MaybeAssignmentContext)_localctx).rhs.result);
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
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
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				((MaybeConjunctionContext)_localctx).maybeCmp = maybeCmp(attr);
				 ((MaybeConjunctionContext)_localctx).result =  ((MaybeConjunctionContext)_localctx).maybeCmp.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				((MaybeConjunctionContext)_localctx).maybeCmp = maybeCmp(Attr.VAL);
				 ((MaybeConjunctionContext)_localctx).result =  ((MaybeConjunctionContext)_localctx).maybeCmp.result; 
				setState(175); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(171);
						((MaybeConjunctionContext)_localctx).op = match(T__10);
						setState(172);
						((MaybeConjunctionContext)_localctx).rhs = ((MaybeConjunctionContext)_localctx).maybeCmp = maybeCmp(Attr.VAL);

						      ((MaybeConjunctionContext)_localctx).result =  factory.createBinary(((MaybeConjunctionContext)_localctx).op, _localctx.result, ((MaybeConjunctionContext)_localctx).rhs.result);
						    
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(177); 
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
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(182);
				((MaybeCmpContext)_localctx).lhs = maybeAddSub(Attr.VAL);
				setState(183);
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
				setState(184);
				((MaybeCmpContext)_localctx).rhs = maybeAddSub(Attr.VAL);

				    ((MaybeCmpContext)_localctx).result =  factory.createBinary(((MaybeCmpContext)_localctx).op, ((MaybeCmpContext)_localctx).lhs.result, ((MaybeCmpContext)_localctx).rhs.result);
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
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
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				((MaybeAddSubContext)_localctx).maybeMulDivRem = maybeMulDivRem(attr);
				 ((MaybeAddSubContext)_localctx).result =  ((MaybeAddSubContext)_localctx).maybeMulDivRem.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(196);
				((MaybeAddSubContext)_localctx).maybeMulDivRem = maybeMulDivRem(Attr.VAL);
				 ((MaybeAddSubContext)_localctx).result =  ((MaybeAddSubContext)_localctx).maybeMulDivRem.result; 
				setState(202); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(198);
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
						setState(199);
						((MaybeAddSubContext)_localctx).rhs = ((MaybeAddSubContext)_localctx).maybeMulDivRem = maybeMulDivRem(Attr.VAL);

						      ((MaybeAddSubContext)_localctx).result =  factory.createBinary(((MaybeAddSubContext)_localctx).op, _localctx.result, ((MaybeAddSubContext)_localctx).rhs.result);
						    
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(204); 
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
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				((MaybeMulDivRemContext)_localctx).binaryOperand = binaryOperand(attr);
				 ((MaybeMulDivRemContext)_localctx).result =  ((MaybeMulDivRemContext)_localctx).binaryOperand.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(212);
				((MaybeMulDivRemContext)_localctx).binaryOperand = binaryOperand(Attr.VAL);
				 ((MaybeMulDivRemContext)_localctx).result =  ((MaybeMulDivRemContext)_localctx).binaryOperand.result; 
				setState(218); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(214);
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
						setState(215);
						((MaybeMulDivRemContext)_localctx).rhs = ((MaybeMulDivRemContext)_localctx).binaryOperand = binaryOperand(Attr.VAL);

						    ((MaybeMulDivRemContext)_localctx).result =  factory.createBinary(((MaybeMulDivRemContext)_localctx).op, _localctx.result, ((MaybeMulDivRemContext)_localctx).rhs.result);
						  
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(220); 
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
			setState(224);
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
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				((PostfixExpressionContext)_localctx).primary = primary(attr);
				 ((PostfixExpressionContext)_localctx).result =  ((PostfixExpressionContext)_localctx).primary.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				((PostfixExpressionContext)_localctx).primary = primary(Attr.VAL);
				 ((PostfixExpressionContext)_localctx).result =  ((PostfixExpressionContext)_localctx).primary.result; 
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(232);
						((PostfixExpressionContext)_localctx).postfixItem = postfixItem(_localctx.result, Attr.VAL);
						 ((PostfixExpressionContext)_localctx).result =  ((PostfixExpressionContext)_localctx).postfixItem.result; 
						}
						} 
					}
					setState(239);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(240);
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
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(T__22);
				setState(246);
				((PostfixItemContext)_localctx).index = expression(Attr.VAL);
				setState(247);
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
				setState(250);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				 List<ExprNode> argumentNodes = new ArrayList<>(); 
				setState(252);
				match(T__5);
				setState(264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(253);
					((PostfixItemContext)_localctx).expression = expression(Attr.VAL);
					 argumentNodes.add(((PostfixItemContext)_localctx).expression.result); 
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(255);
						match(T__2);
						setState(256);
						((PostfixItemContext)_localctx).expression = expression(Attr.VAL);
						 argumentNodes.add(((PostfixItemContext)_localctx).expression.result); 
						}
						}
						setState(263);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(266);
				match(T__6);

				    ((PostfixItemContext)_localctx).result =  factory.createCallExpr(_localctx.base, argumentNodes);
				  
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				 List<ExprNode> argumentNodes = new ArrayList<>(); argumentNodes.add(_localctx.base); 
				setState(270);
				match(T__24);
				setState(271);
				((PostfixItemContext)_localctx).callee = varRef(Attr.VAL);
				setState(286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(272);
					match(T__5);
					setState(273);
					((PostfixItemContext)_localctx).expression = expression(Attr.VAL);
					 argumentNodes.add(((PostfixItemContext)_localctx).expression.result); 
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(275);
						match(T__2);
						setState(276);
						((PostfixItemContext)_localctx).expression = expression(Attr.VAL);
						 argumentNodes.add(((PostfixItemContext)_localctx).expression.result); 
						}
						}
						setState(283);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(284);
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
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(293);
				((PrimaryContext)_localctx).const_ = const_();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).const_.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(297);
				((PrimaryContext)_localctx).stringLiteral = stringLiteral();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).stringLiteral.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(301);
				((PrimaryContext)_localctx).charLiteral = charLiteral();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).charLiteral.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
				((PrimaryContext)_localctx).varRef = varRef(attr);
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).varRef.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(307);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(308);
				match(T__25);
				 ((PrimaryContext)_localctx).result =  new LongLiteralNode(1); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(310);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(311);
				match(T__26);
				 ((PrimaryContext)_localctx).result =  new LongLiteralNode(0); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(313);
				if (!(_localctx.attr == Attr.VOID)) throw new FailedPredicateException(this, "$attr == Attr.VOID");
				setState(314);
				match(T__27);
				 ((PrimaryContext)_localctx).result =  new SkipNode(); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(316);
				match(T__5);
				setState(317);
				((PrimaryContext)_localctx).scopeExpression = scopeExpression(attr, true);
				setState(318);
				match(T__6);
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).scopeExpression.result; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(321);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(322);
				((PrimaryContext)_localctx).arrayExpression = arrayExpression();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).arrayExpression.result; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(325);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(326);
				((PrimaryContext)_localctx).sExpression = sExpression();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).sExpression.result; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(329);
				((PrimaryContext)_localctx).ifExpression = ifExpression(attr);
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).ifExpression.result; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(332);
				if (!(_localctx.attr == Attr.VOID)) throw new FailedPredicateException(this, "$attr == Attr.VOID");
				setState(333);
				((PrimaryContext)_localctx).whileDoExpression = whileDoExpression();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).whileDoExpression.result; 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(336);
				if (!(_localctx.attr == Attr.VOID)) throw new FailedPredicateException(this, "$attr == Attr.VOID");
				setState(337);
				((PrimaryContext)_localctx).doWhileExpression = doWhileExpression();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).doWhileExpression.result; 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(340);
				if (!(_localctx.attr == Attr.VOID)) throw new FailedPredicateException(this, "$attr == Attr.VOID");
				setState(341);
				((PrimaryContext)_localctx).forExpression = forExpression();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).forExpression.result; 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(344);
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
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(349);
				((Const_Context)_localctx).minus = match(T__18);
				}
			}

			setState(352);
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
			setState(355);
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
			setState(358);
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
			setState(361);
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
			setState(365);
			match(T__22);
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(366);
				((ArrayExpressionContext)_localctx).expression = expression(Attr.VAL);
				 elements.add(((ArrayExpressionContext)_localctx).expression.result); 
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(368);
					match(T__2);
					setState(369);
					((ArrayExpressionContext)_localctx).expression = expression(Attr.VAL);
					 elements.add(((ArrayExpressionContext)_localctx).expression.result); 
					}
					}
					setState(376);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(379);
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
			setState(383);
			((SExpressionContext)_localctx).UIDENT = match(UIDENT);
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(384);
				match(T__5);
				setState(385);
				((SExpressionContext)_localctx).expression = expression(Attr.VAL);
				 elementNodes.add(((SExpressionContext)_localctx).expression.result); 
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(387);
					match(T__2);
					setState(388);
					((SExpressionContext)_localctx).expression = expression(Attr.VAL);
					 elementNodes.add(((SExpressionContext)_localctx).expression.result); 
					}
					}
					setState(395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(396);
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
			  
			setState(403);
			match(T__28);
			setState(404);
			((IfExpressionContext)_localctx).cond = expression(Attr.VAL);
			setState(405);
			match(T__29);
			setState(406);
			((IfExpressionContext)_localctx).thenBody = expression(attr);

			    ifThenEntries.add(new IfThenEntry(((IfExpressionContext)_localctx).cond.result, ((IfExpressionContext)_localctx).thenBody.result));
			  
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(408);
					match(T__30);
					setState(409);
					((IfExpressionContext)_localctx).cond = expression(Attr.VAL);
					setState(410);
					match(T__29);
					setState(411);
					((IfExpressionContext)_localctx).thenBody = expression(attr);

					      ifThenEntries.add(new IfThenEntry(((IfExpressionContext)_localctx).cond.result, ((IfExpressionContext)_localctx).thenBody.result));
					    
					}
					} 
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(419);
			((IfExpressionContext)_localctx).elseBranch = elseBranch(attr);
			setState(420);
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
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				match(T__32);
				setState(424);
				((ElseBranchContext)_localctx).expression = expression(attr);

				    ((ElseBranchContext)_localctx).result =  ((ElseBranchContext)_localctx).expression.result;
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
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
			setState(431);
			match(T__33);
			setState(432);
			((WhileDoExpressionContext)_localctx).cond = expression(Attr.VAL);
			setState(433);
			match(T__34);
			setState(434);
			((WhileDoExpressionContext)_localctx).body = scopeExpression(Attr.VOID, true);
			setState(435);
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
			setState(438);
			match(T__34);
			setState(439);
			((DoWhileExpressionContext)_localctx).body = scopeExpression(Attr.VOID, false);
			setState(440);
			match(T__33);
			setState(441);
			((DoWhileExpressionContext)_localctx).cond = expression(Attr.VAL);
			setState(442);
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
			setState(445);
			match(T__36);
			setState(446);
			((ForExpressionContext)_localctx).init = scopeExpression(Attr.VOID, false);
			setState(447);
			match(T__2);
			setState(448);
			((ForExpressionContext)_localctx).cond = expression(Attr.VAL);
			setState(449);
			match(T__2);
			setState(450);
			((ForExpressionContext)_localctx).incr = expression(Attr.VOID);
			setState(451);
			match(T__34);
			setState(452);
			((ForExpressionContext)_localctx).body = scopeExpression(Attr.VOID, true);
			setState(453);
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
			setState(456);
			match(T__37);
			setState(457);
			((CaseExpressionContext)_localctx).scrutinee = expression(Attr.VAL);
			setState(458);
			match(T__38);
			setState(459);
			((CaseExpressionContext)_localctx).caseBranches = caseBranches(attr);
			setState(460);
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
			setState(464);
			((CaseBranchesContext)_localctx).caseBranch = caseBranch(attr);
			 _localctx.result.add(((CaseBranchesContext)_localctx).caseBranch.result); 
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__40) {
				{
				{
				setState(466);
				match(T__40);
				setState(467);
				((CaseBranchesContext)_localctx).caseBranch = caseBranch(attr);
				 _localctx.result.add(((CaseBranchesContext)_localctx).caseBranch.result); 
				}
				}
				setState(474);
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
		public ScopeExpressionContext scopeExpression;
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
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
			setState(475);
			((CaseBranchContext)_localctx).pattern = pattern();
			setState(476);
			match(T__41);
			setState(477);
			((CaseBranchContext)_localctx).scopeExpression = scopeExpression(attr, true);

			    ((CaseBranchContext)_localctx).result =  new CaseNode.Branch(((CaseBranchContext)_localctx).pattern.result, ((CaseBranchContext)_localctx).scopeExpression.result);
			  
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
			setState(480);
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
		public SexpPatternContext sexpPattern;
		public SexpPatternContext sexpPattern() {
			return getRuleContext(SexpPatternContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			((SimplePatternContext)_localctx).sexpPattern = sexpPattern();
			 ((SimplePatternContext)_localctx).result =  ((SimplePatternContext)_localctx).sexpPattern.result; 
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
		public TerminalNode UIDENT() { return getToken(LamaLanguageParser.UIDENT, 0); }
		public SexpPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sexpPattern; }
	}

	public final SexpPatternContext sexpPattern() throws RecognitionException {
		SexpPatternContext _localctx = new SexpPatternContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sexpPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			((SexpPatternContext)_localctx).UIDENT = match(UIDENT);

			    ((SexpPatternContext)_localctx).result =  factory.createSexpPattern(((SexpPatternContext)_localctx).UIDENT);
			  
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
		"\u0004\u00012\u01ea\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0005\u0002V\b\u0002\n\u0002\f\u0002Y\t\u0002\u0001\u0002\u0003\u0002"+
		"\\\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"b\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005k\b\u0005\n\u0005\f\u0005n\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006s\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0005\b\u0085\b\b\n\b\f\b\u0088\t\b\u0003\b\u008a"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u0097\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00a5\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0004\r\u00b0\b\r\u000b\r\f\r\u00b1\u0003\r\u00b4\b"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00bf\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u00cb\b\u000f\u000b\u000f"+
		"\f\u000f\u00cc\u0003\u000f\u00cf\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0004\u0010\u00db\b\u0010\u000b\u0010\f\u0010\u00dc"+
		"\u0003\u0010\u00df\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u00ec\b\u0012\n\u0012\f\u0012\u00ef\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00f4\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u0104\b\u0013\n\u0013\f\u0013\u0107\t\u0013\u0003\u0013"+
		"\u0109\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u0118\b\u0013\n\u0013\f\u0013\u011b"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u011f\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0123\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u015c\b\u0014"+
		"\u0001\u0015\u0003\u0015\u015f\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u0175\b\u0019\n\u0019\f\u0019\u0178\t\u0019\u0003\u0019\u017a\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u0188\b\u001a\n\u001a\f\u001a\u018b\t\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u018f\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u019f"+
		"\b\u001b\n\u001b\f\u001b\u01a2\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u01ae\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0005!\u01d7\b!\n!\f!\u01da\t!\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0001%\u0000\u0000&\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJ\u0000\u0003"+
		"\u0001\u0000\f\u0011\u0001\u0000\u0012\u0013\u0001\u0000\u0014\u0016\u01f1"+
		"\u0000L\u0001\u0000\u0000\u0000\u0002P\u0001\u0000\u0000\u0000\u0004W"+
		"\u0001\u0000\u0000\u0000\u0006a\u0001\u0000\u0000\u0000\bc\u0001\u0000"+
		"\u0000\u0000\ng\u0001\u0000\u0000\u0000\fo\u0001\u0000\u0000\u0000\u000e"+
		"v\u0001\u0000\u0000\u0000\u0010\u0089\u0001\u0000\u0000\u0000\u0012\u008b"+
		"\u0001\u0000\u0000\u0000\u0014\u0096\u0001\u0000\u0000\u0000\u0016\u0098"+
		"\u0001\u0000\u0000\u0000\u0018\u00a4\u0001\u0000\u0000\u0000\u001a\u00b3"+
		"\u0001\u0000\u0000\u0000\u001c\u00be\u0001\u0000\u0000\u0000\u001e\u00ce"+
		"\u0001\u0000\u0000\u0000 \u00de\u0001\u0000\u0000\u0000\"\u00e0\u0001"+
		"\u0000\u0000\u0000$\u00f3\u0001\u0000\u0000\u0000&\u0122\u0001\u0000\u0000"+
		"\u0000(\u015b\u0001\u0000\u0000\u0000*\u015e\u0001\u0000\u0000\u0000,"+
		"\u0163\u0001\u0000\u0000\u0000.\u0166\u0001\u0000\u0000\u00000\u0169\u0001"+
		"\u0000\u0000\u00002\u016c\u0001\u0000\u0000\u00004\u017e\u0001\u0000\u0000"+
		"\u00006\u0192\u0001\u0000\u0000\u00008\u01ad\u0001\u0000\u0000\u0000:"+
		"\u01af\u0001\u0000\u0000\u0000<\u01b6\u0001\u0000\u0000\u0000>\u01bd\u0001"+
		"\u0000\u0000\u0000@\u01c8\u0001\u0000\u0000\u0000B\u01cf\u0001\u0000\u0000"+
		"\u0000D\u01db\u0001\u0000\u0000\u0000F\u01e0\u0001\u0000\u0000\u0000H"+
		"\u01e3\u0001\u0000\u0000\u0000J\u01e6\u0001\u0000\u0000\u0000LM\u0003"+
		"\u0002\u0001\u0000MN\u0006\u0000\uffff\uffff\u0000NO\u0005\u0000\u0000"+
		"\u0001O\u0001\u0001\u0000\u0000\u0000PQ\u0006\u0001\uffff\uffff\u0000"+
		"QR\u0003\u0004\u0002\u0000RS\u0006\u0001\uffff\uffff\u0000S\u0003\u0001"+
		"\u0000\u0000\u0000TV\u0003\u0006\u0003\u0000UT\u0001\u0000\u0000\u0000"+
		"VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z\\\u0003\u0014"+
		"\n\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]^\u0006\u0002\uffff\uffff\u0000^\u0005\u0001\u0000"+
		"\u0000\u0000_b\u0003\b\u0004\u0000`b\u0003\u000e\u0007\u0000a_\u0001\u0000"+
		"\u0000\u0000a`\u0001\u0000\u0000\u0000b\u0007\u0001\u0000\u0000\u0000"+
		"cd\u0005\u0001\u0000\u0000de\u0003\n\u0005\u0000ef\u0005\u0002\u0000\u0000"+
		"f\t\u0001\u0000\u0000\u0000gl\u0003\f\u0006\u0000hi\u0005\u0003\u0000"+
		"\u0000ik\u0003\f\u0006\u0000jh\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u000b\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000or\u0005/\u0000\u0000pq\u0005"+
		"\u0004\u0000\u0000qs\u0003\u0016\u000b\u0000rp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0006\u0006\uffff"+
		"\uffff\u0000u\r\u0001\u0000\u0000\u0000vw\u0005\u0005\u0000\u0000wx\u0005"+
		"/\u0000\u0000xy\u0006\u0007\uffff\uffff\u0000yz\u0005\u0006\u0000\u0000"+
		"z{\u0003\u0010\b\u0000{|\u0005\u0007\u0000\u0000|}\u0005\b\u0000\u0000"+
		"}~\u0003\u0004\u0002\u0000~\u007f\u0005\t\u0000\u0000\u007f\u0080\u0006"+
		"\u0007\uffff\uffff\u0000\u0080\u000f\u0001\u0000\u0000\u0000\u0081\u0086"+
		"\u0003\u0012\t\u0000\u0082\u0083\u0005\u0003\u0000\u0000\u0083\u0085\u0003"+
		"\u0012\t\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000"+
		"\u0000\u0000\u0089\u0081\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u0011\u0001\u0000\u0000\u0000\u008b\u008c\u0005/\u0000"+
		"\u0000\u008c\u008d\u0006\t\uffff\uffff\u0000\u008d\u0013\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0003\u0016\u000b\u0000\u008f\u0090\u0006\n\uffff\uffff"+
		"\u0000\u0090\u0097\u0001\u0000\u0000\u0000\u0091\u0092\u0003\u0016\u000b"+
		"\u0000\u0092\u0093\u0005\u0002\u0000\u0000\u0093\u0094\u0003\u0014\n\u0000"+
		"\u0094\u0095\u0006\n\uffff\uffff\u0000\u0095\u0097\u0001\u0000\u0000\u0000"+
		"\u0096\u008e\u0001\u0000\u0000\u0000\u0096\u0091\u0001\u0000\u0000\u0000"+
		"\u0097\u0015\u0001\u0000\u0000\u0000\u0098\u0099\u0003\u0018\f\u0000\u0099"+
		"\u009a\u0006\u000b\uffff\uffff\u0000\u009a\u0017\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0004\f\u0000\u0001\u009c\u009d\u0003\u001a\r\u0000\u009d"+
		"\u009e\u0005\n\u0000\u0000\u009e\u009f\u0003\u0018\f\u0000\u009f\u00a0"+
		"\u0006\f\uffff\uffff\u0000\u00a0\u00a5\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0003\u001a\r\u0000\u00a2\u00a3\u0006\f\uffff\uffff\u0000\u00a3\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a4\u009b\u0001\u0000\u0000\u0000\u00a4\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a5\u0019\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0003\u001c\u000e\u0000\u00a7\u00a8\u0006\r\uffff\uffff\u0000\u00a8\u00b4"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0003\u001c\u000e\u0000\u00aa\u00af"+
		"\u0006\r\uffff\uffff\u0000\u00ab\u00ac\u0005\u000b\u0000\u0000\u00ac\u00ad"+
		"\u0003\u001c\u000e\u0000\u00ad\u00ae\u0006\r\uffff\uffff\u0000\u00ae\u00b0"+
		"\u0001\u0000\u0000\u0000\u00af\u00ab\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00a6"+
		"\u0001\u0000\u0000\u0000\u00b3\u00a9\u0001\u0000\u0000\u0000\u00b4\u001b"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0004\u000e\u0001\u0001\u00b6\u00b7"+
		"\u0003\u001e\u000f\u0000\u00b7\u00b8\u0007\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0003\u001e\u000f\u0000\u00b9\u00ba\u0006\u000e\uffff\uffff\u0000\u00ba"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bb\u00bc\u0003\u001e\u000f\u0000\u00bc"+
		"\u00bd\u0006\u000e\uffff\uffff\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000"+
		"\u00be\u00b5\u0001\u0000\u0000\u0000\u00be\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bf\u001d\u0001\u0000\u0000\u0000\u00c0\u00c1\u0003 \u0010\u0000\u00c1"+
		"\u00c2\u0006\u000f\uffff\uffff\u0000\u00c2\u00cf\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0004\u000f\u0002\u0001\u00c4\u00c5\u0003 \u0010\u0000\u00c5"+
		"\u00ca\u0006\u000f\uffff\uffff\u0000\u00c6\u00c7\u0007\u0001\u0000\u0000"+
		"\u00c7\u00c8\u0003 \u0010\u0000\u00c8\u00c9\u0006\u000f\uffff\uffff\u0000"+
		"\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c6\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000"+
		"\u00ce\u00c0\u0001\u0000\u0000\u0000\u00ce\u00c3\u0001\u0000\u0000\u0000"+
		"\u00cf\u001f\u0001\u0000\u0000\u0000\u00d0\u00d1\u0003\"\u0011\u0000\u00d1"+
		"\u00d2\u0006\u0010\uffff\uffff\u0000\u00d2\u00df\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0004\u0010\u0003\u0001\u00d4\u00d5\u0003\"\u0011\u0000\u00d5"+
		"\u00da\u0006\u0010\uffff\uffff\u0000\u00d6\u00d7\u0007\u0002\u0000\u0000"+
		"\u00d7\u00d8\u0003\"\u0011\u0000\u00d8\u00d9\u0006\u0010\uffff\uffff\u0000"+
		"\u00d9\u00db\u0001\u0000\u0000\u0000\u00da\u00d6\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000"+
		"\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00df\u0001\u0000\u0000\u0000"+
		"\u00de\u00d0\u0001\u0000\u0000\u0000\u00de\u00d3\u0001\u0000\u0000\u0000"+
		"\u00df!\u0001\u0000\u0000\u0000\u00e0\u00e1\u0003$\u0012\u0000\u00e1\u00e2"+
		"\u0006\u0011\uffff\uffff\u0000\u00e2#\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0003(\u0014\u0000\u00e4\u00e5\u0006\u0012\uffff\uffff\u0000\u00e5\u00f4"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003(\u0014\u0000\u00e7\u00ed\u0006"+
		"\u0012\uffff\uffff\u0000\u00e8\u00e9\u0003&\u0013\u0000\u00e9\u00ea\u0006"+
		"\u0012\uffff\uffff\u0000\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb\u00e8"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f0"+
		"\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0003&\u0013\u0000\u00f1\u00f2\u0006\u0012\uffff\uffff\u0000\u00f2\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f3\u00e3\u0001\u0000\u0000\u0000\u00f3\u00e6"+
		"\u0001\u0000\u0000\u0000\u00f4%\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005"+
		"\u0017\u0000\u0000\u00f6\u00f7\u0003\u0014\n\u0000\u00f7\u00f8\u0005\u0018"+
		"\u0000\u0000\u00f8\u00f9\u0006\u0013\uffff\uffff\u0000\u00f9\u0123\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0004\u0013\u0004\u0001\u00fb\u00fc\u0006"+
		"\u0013\uffff\uffff\u0000\u00fc\u0108\u0005\u0006\u0000\u0000\u00fd\u00fe"+
		"\u0003\u0014\n\u0000\u00fe\u0105\u0006\u0013\uffff\uffff\u0000\u00ff\u0100"+
		"\u0005\u0003\u0000\u0000\u0100\u0101\u0003\u0014\n\u0000\u0101\u0102\u0006"+
		"\u0013\uffff\uffff\u0000\u0102\u0104\u0001\u0000\u0000\u0000\u0103\u00ff"+
		"\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0109"+
		"\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u00fd"+
		"\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0005\u0007\u0000\u0000\u010b\u0123"+
		"\u0006\u0013\uffff\uffff\u0000\u010c\u010d\u0004\u0013\u0005\u0001\u010d"+
		"\u010e\u0006\u0013\uffff\uffff\u0000\u010e\u010f\u0005\u0019\u0000\u0000"+
		"\u010f\u011e\u00030\u0018\u0000\u0110\u0111\u0005\u0006\u0000\u0000\u0111"+
		"\u0112\u0003\u0014\n\u0000\u0112\u0119\u0006\u0013\uffff\uffff\u0000\u0113"+
		"\u0114\u0005\u0003\u0000\u0000\u0114\u0115\u0003\u0014\n\u0000\u0115\u0116"+
		"\u0006\u0013\uffff\uffff\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117"+
		"\u0113\u0001\u0000\u0000\u0000\u0118\u011b\u0001\u0000\u0000\u0000\u0119"+
		"\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a"+
		"\u011c\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0005\u0007\u0000\u0000\u011d\u011f\u0001\u0000\u0000\u0000\u011e"+
		"\u0110\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0006\u0013\uffff\uffff\u0000"+
		"\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u00f5\u0001\u0000\u0000\u0000"+
		"\u0122\u00fa\u0001\u0000\u0000\u0000\u0122\u010c\u0001\u0000\u0000\u0000"+
		"\u0123\'\u0001\u0000\u0000\u0000\u0124\u0125\u0004\u0014\u0006\u0001\u0125"+
		"\u0126\u0003*\u0015\u0000\u0126\u0127\u0006\u0014\uffff\uffff\u0000\u0127"+
		"\u015c\u0001\u0000\u0000\u0000\u0128\u0129\u0004\u0014\u0007\u0001\u0129"+
		"\u012a\u0003,\u0016\u0000\u012a\u012b\u0006\u0014\uffff\uffff\u0000\u012b"+
		"\u015c\u0001\u0000\u0000\u0000\u012c\u012d\u0004\u0014\b\u0001\u012d\u012e"+
		"\u0003.\u0017\u0000\u012e\u012f\u0006\u0014\uffff\uffff\u0000\u012f\u015c"+
		"\u0001\u0000\u0000\u0000\u0130\u0131\u00030\u0018\u0000\u0131\u0132\u0006"+
		"\u0014\uffff\uffff\u0000\u0132\u015c\u0001\u0000\u0000\u0000\u0133\u0134"+
		"\u0004\u0014\t\u0001\u0134\u0135\u0005\u001a\u0000\u0000\u0135\u015c\u0006"+
		"\u0014\uffff\uffff\u0000\u0136\u0137\u0004\u0014\n\u0001\u0137\u0138\u0005"+
		"\u001b\u0000\u0000\u0138\u015c\u0006\u0014\uffff\uffff\u0000\u0139\u013a"+
		"\u0004\u0014\u000b\u0001\u013a\u013b\u0005\u001c\u0000\u0000\u013b\u015c"+
		"\u0006\u0014\uffff\uffff\u0000\u013c\u013d\u0005\u0006\u0000\u0000\u013d"+
		"\u013e\u0003\u0002\u0001\u0000\u013e\u013f\u0005\u0007\u0000\u0000\u013f"+
		"\u0140\u0006\u0014\uffff\uffff\u0000\u0140\u015c\u0001\u0000\u0000\u0000"+
		"\u0141\u0142\u0004\u0014\f\u0001\u0142\u0143\u00032\u0019\u0000\u0143"+
		"\u0144\u0006\u0014\uffff\uffff\u0000\u0144\u015c\u0001\u0000\u0000\u0000"+
		"\u0145\u0146\u0004\u0014\r\u0001\u0146\u0147\u00034\u001a\u0000\u0147"+
		"\u0148\u0006\u0014\uffff\uffff\u0000\u0148\u015c\u0001\u0000\u0000\u0000"+
		"\u0149\u014a\u00036\u001b\u0000\u014a\u014b\u0006\u0014\uffff\uffff\u0000"+
		"\u014b\u015c\u0001\u0000\u0000\u0000\u014c\u014d\u0004\u0014\u000e\u0001"+
		"\u014d\u014e\u0003:\u001d\u0000\u014e\u014f\u0006\u0014\uffff\uffff\u0000"+
		"\u014f\u015c\u0001\u0000\u0000\u0000\u0150\u0151\u0004\u0014\u000f\u0001"+
		"\u0151\u0152\u0003<\u001e\u0000\u0152\u0153\u0006\u0014\uffff\uffff\u0000"+
		"\u0153\u015c\u0001\u0000\u0000\u0000\u0154\u0155\u0004\u0014\u0010\u0001"+
		"\u0155\u0156\u0003>\u001f\u0000\u0156\u0157\u0006\u0014\uffff\uffff\u0000"+
		"\u0157\u015c\u0001\u0000\u0000\u0000\u0158\u0159\u0003@ \u0000\u0159\u015a"+
		"\u0006\u0014\uffff\uffff\u0000\u015a\u015c\u0001\u0000\u0000\u0000\u015b"+
		"\u0124\u0001\u0000\u0000\u0000\u015b\u0128\u0001\u0000\u0000\u0000\u015b"+
		"\u012c\u0001\u0000\u0000\u0000\u015b\u0130\u0001\u0000\u0000\u0000\u015b"+
		"\u0133\u0001\u0000\u0000\u0000\u015b\u0136\u0001\u0000\u0000\u0000\u015b"+
		"\u0139\u0001\u0000\u0000\u0000\u015b\u013c\u0001\u0000\u0000\u0000\u015b"+
		"\u0141\u0001\u0000\u0000\u0000\u015b\u0145\u0001\u0000\u0000\u0000\u015b"+
		"\u0149\u0001\u0000\u0000\u0000\u015b\u014c\u0001\u0000\u0000\u0000\u015b"+
		"\u0150\u0001\u0000\u0000\u0000\u015b\u0154\u0001\u0000\u0000\u0000\u015b"+
		"\u0158\u0001\u0000\u0000\u0000\u015c)\u0001\u0000\u0000\u0000\u015d\u015f"+
		"\u0005\u0013\u0000\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015e\u015f"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161"+
		"\u00050\u0000\u0000\u0161\u0162\u0006\u0015\uffff\uffff\u0000\u0162+\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u00051\u0000\u0000\u0164\u0165\u0006\u0016"+
		"\uffff\uffff\u0000\u0165-\u0001\u0000\u0000\u0000\u0166\u0167\u00052\u0000"+
		"\u0000\u0167\u0168\u0006\u0017\uffff\uffff\u0000\u0168/\u0001\u0000\u0000"+
		"\u0000\u0169\u016a\u0005/\u0000\u0000\u016a\u016b\u0006\u0018\uffff\uffff"+
		"\u0000\u016b1\u0001\u0000\u0000\u0000\u016c\u016d\u0006\u0019\uffff\uffff"+
		"\u0000\u016d\u0179\u0005\u0017\u0000\u0000\u016e\u016f\u0003\u0014\n\u0000"+
		"\u016f\u0176\u0006\u0019\uffff\uffff\u0000\u0170\u0171\u0005\u0003\u0000"+
		"\u0000\u0171\u0172\u0003\u0014\n\u0000\u0172\u0173\u0006\u0019\uffff\uffff"+
		"\u0000\u0173\u0175\u0001\u0000\u0000\u0000\u0174\u0170\u0001\u0000\u0000"+
		"\u0000\u0175\u0178\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000"+
		"\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u017a\u0001\u0000\u0000"+
		"\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0179\u016e\u0001\u0000\u0000"+
		"\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000"+
		"\u0000\u017b\u017c\u0005\u0018\u0000\u0000\u017c\u017d\u0006\u0019\uffff"+
		"\uffff\u0000\u017d3\u0001\u0000\u0000\u0000\u017e\u017f\u0006\u001a\uffff"+
		"\uffff\u0000\u017f\u018e\u0005.\u0000\u0000\u0180\u0181\u0005\u0006\u0000"+
		"\u0000\u0181\u0182\u0003\u0014\n\u0000\u0182\u0189\u0006\u001a\uffff\uffff"+
		"\u0000\u0183\u0184\u0005\u0003\u0000\u0000\u0184\u0185\u0003\u0014\n\u0000"+
		"\u0185\u0186\u0006\u001a\uffff\uffff\u0000\u0186\u0188\u0001\u0000\u0000"+
		"\u0000\u0187\u0183\u0001\u0000\u0000\u0000\u0188\u018b\u0001\u0000\u0000"+
		"\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000"+
		"\u0000\u018a\u018c\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000"+
		"\u0000\u018c\u018d\u0005\u0007\u0000\u0000\u018d\u018f\u0001\u0000\u0000"+
		"\u0000\u018e\u0180\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000"+
		"\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0191\u0006\u001a\uffff"+
		"\uffff\u0000\u01915\u0001\u0000\u0000\u0000\u0192\u0193\u0006\u001b\uffff"+
		"\uffff\u0000\u0193\u0194\u0005\u001d\u0000\u0000\u0194\u0195\u0003\u0014"+
		"\n\u0000\u0195\u0196\u0005\u001e\u0000\u0000\u0196\u0197\u0003\u0014\n"+
		"\u0000\u0197\u01a0\u0006\u001b\uffff\uffff\u0000\u0198\u0199\u0005\u001f"+
		"\u0000\u0000\u0199\u019a\u0003\u0014\n\u0000\u019a\u019b\u0005\u001e\u0000"+
		"\u0000\u019b\u019c\u0003\u0014\n\u0000\u019c\u019d\u0006\u001b\uffff\uffff"+
		"\u0000\u019d\u019f\u0001\u0000\u0000\u0000\u019e\u0198\u0001\u0000\u0000"+
		"\u0000\u019f\u01a2\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a3\u01a4\u00038\u001c\u0000"+
		"\u01a4\u01a5\u0005 \u0000\u0000\u01a5\u01a6\u0006\u001b\uffff\uffff\u0000"+
		"\u01a67\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005!\u0000\u0000\u01a8\u01a9"+
		"\u0003\u0014\n\u0000\u01a9\u01aa\u0006\u001c\uffff\uffff\u0000\u01aa\u01ae"+
		"\u0001\u0000\u0000\u0000\u01ab\u01ac\u0004\u001c\u0011\u0001\u01ac\u01ae"+
		"\u0006\u001c\uffff\uffff\u0000\u01ad\u01a7\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ab\u0001\u0000\u0000\u0000\u01ae9\u0001\u0000\u0000\u0000\u01af\u01b0"+
		"\u0005\"\u0000\u0000\u01b0\u01b1\u0003\u0014\n\u0000\u01b1\u01b2\u0005"+
		"#\u0000\u0000\u01b2\u01b3\u0003\u0002\u0001\u0000\u01b3\u01b4\u0005$\u0000"+
		"\u0000\u01b4\u01b5\u0006\u001d\uffff\uffff\u0000\u01b5;\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b7\u0005#\u0000\u0000\u01b7\u01b8\u0003\u0002\u0001\u0000"+
		"\u01b8\u01b9\u0005\"\u0000\u0000\u01b9\u01ba\u0003\u0014\n\u0000\u01ba"+
		"\u01bb\u0005$\u0000\u0000\u01bb\u01bc\u0006\u001e\uffff\uffff\u0000\u01bc"+
		"=\u0001\u0000\u0000\u0000\u01bd\u01be\u0005%\u0000\u0000\u01be\u01bf\u0003"+
		"\u0002\u0001\u0000\u01bf\u01c0\u0005\u0003\u0000\u0000\u01c0\u01c1\u0003"+
		"\u0014\n\u0000\u01c1\u01c2\u0005\u0003\u0000\u0000\u01c2\u01c3\u0003\u0014"+
		"\n\u0000\u01c3\u01c4\u0005#\u0000\u0000\u01c4\u01c5\u0003\u0002\u0001"+
		"\u0000\u01c5\u01c6\u0005$\u0000\u0000\u01c6\u01c7\u0006\u001f\uffff\uffff"+
		"\u0000\u01c7?\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005&\u0000\u0000\u01c9"+
		"\u01ca\u0003\u0014\n\u0000\u01ca\u01cb\u0005\'\u0000\u0000\u01cb\u01cc"+
		"\u0003B!\u0000\u01cc\u01cd\u0005(\u0000\u0000\u01cd\u01ce\u0006 \uffff"+
		"\uffff\u0000\u01ceA\u0001\u0000\u0000\u0000\u01cf\u01d0\u0006!\uffff\uffff"+
		"\u0000\u01d0\u01d1\u0003D\"\u0000\u01d1\u01d8\u0006!\uffff\uffff\u0000"+
		"\u01d2\u01d3\u0005)\u0000\u0000\u01d3\u01d4\u0003D\"\u0000\u01d4\u01d5"+
		"\u0006!\uffff\uffff\u0000\u01d5\u01d7\u0001\u0000\u0000\u0000\u01d6\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d7\u01da\u0001\u0000\u0000\u0000\u01d8\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9C\u0001"+
		"\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01db\u01dc\u0003"+
		"F#\u0000\u01dc\u01dd\u0005*\u0000\u0000\u01dd\u01de\u0003\u0002\u0001"+
		"\u0000\u01de\u01df\u0006\"\uffff\uffff\u0000\u01dfE\u0001\u0000\u0000"+
		"\u0000\u01e0\u01e1\u0003H$\u0000\u01e1\u01e2\u0006#\uffff\uffff\u0000"+
		"\u01e2G\u0001\u0000\u0000\u0000\u01e3\u01e4\u0003J%\u0000\u01e4\u01e5"+
		"\u0006$\uffff\uffff\u0000\u01e5I\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005"+
		".\u0000\u0000\u01e7\u01e8\u0006%\uffff\uffff\u0000\u01e8K\u0001\u0000"+
		"\u0000\u0000 W[alr\u0086\u0089\u0096\u00a4\u00b1\u00b3\u00be\u00cc\u00ce"+
		"\u00dc\u00de\u00ed\u00f3\u0105\u0108\u0119\u011e\u0122\u015b\u015e\u0176"+
		"\u0179\u0189\u018e\u01a0\u01ad\u01d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}