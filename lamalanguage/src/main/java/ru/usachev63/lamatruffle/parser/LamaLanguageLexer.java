// Generated from /home/danila/SPbU/year4/VM/simplelanguage/lamalanguage/src/main/java/ru/usachev63/lamatruffle/parser/LamaLanguage.g4 by ANTLR 4.13.2
package ru.usachev63.lamatruffle.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LamaLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, WS=7, COMMENT=8, LINE_COMMENT=9, 
		UIDENT=10, LIDENT=11, DECIMAL=12, STRING=13, CHAR=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "WS", "COMMENT", "LINE_COMMENT", 
			"NON_ZERO_DIGIT", "DIGIT", "UIDENT", "LIDENT", "DECIMAL", "STRING", "CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "','", "';'", "':='", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
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


	public LamaLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LamaLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000e\u0088\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0004\u00069\b\u0006\u000b\u0006\f\u0006:\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007C\b"+
		"\u0007\n\u0007\f\u0007F\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bQ\b\b\n\b\f"+
		"\bT\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0005\u000b^\b\u000b\n\u000b\f\u000ba\t\u000b\u0001\f\u0001\f\u0005"+
		"\fe\b\f\n\f\f\fh\t\f\u0001\r\u0003\rk\b\r\u0001\r\u0004\rn\b\r\u000b\r"+
		"\f\ro\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000ev\b\u000e"+
		"\n\u000e\f\u000ey\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0085\b\u000f\u0001\u000f\u0001\u000f\u0001D\u0000\u0010"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\u0000\u0015\u0000\u0017\n\u0019\u000b\u001b"+
		"\f\u001d\r\u001f\u000e\u0001\u0000\t\u0003\u0000\t\n\f\r  \u0002\u0000"+
		"\n\n\r\r\u0001\u000019\u0001\u000009\u0001\u0000AZ\u0004\u000009AZ__a"+
		"z\u0001\u0000az\u0003\u0000\n\n\r\r\"\"\u0001\u0000\'\'\u0091\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001!\u0001\u0000\u0000"+
		"\u0000\u0003%\u0001\u0000\u0000\u0000\u0005\'\u0001\u0000\u0000\u0000"+
		"\u0007)\u0001\u0000\u0000\u0000\t,\u0001\u0000\u0000\u0000\u000b1\u0001"+
		"\u0000\u0000\u0000\r8\u0001\u0000\u0000\u0000\u000f>\u0001\u0000\u0000"+
		"\u0000\u0011L\u0001\u0000\u0000\u0000\u0013W\u0001\u0000\u0000\u0000\u0015"+
		"Y\u0001\u0000\u0000\u0000\u0017[\u0001\u0000\u0000\u0000\u0019b\u0001"+
		"\u0000\u0000\u0000\u001bj\u0001\u0000\u0000\u0000\u001dq\u0001\u0000\u0000"+
		"\u0000\u001f|\u0001\u0000\u0000\u0000!\"\u0005v\u0000\u0000\"#\u0005a"+
		"\u0000\u0000#$\u0005r\u0000\u0000$\u0002\u0001\u0000\u0000\u0000%&\u0005"+
		",\u0000\u0000&\u0004\u0001\u0000\u0000\u0000\'(\u0005;\u0000\u0000(\u0006"+
		"\u0001\u0000\u0000\u0000)*\u0005:\u0000\u0000*+\u0005=\u0000\u0000+\b"+
		"\u0001\u0000\u0000\u0000,-\u0005t\u0000\u0000-.\u0005r\u0000\u0000./\u0005"+
		"u\u0000\u0000/0\u0005e\u0000\u00000\n\u0001\u0000\u0000\u000012\u0005"+
		"f\u0000\u000023\u0005a\u0000\u000034\u0005l\u0000\u000045\u0005s\u0000"+
		"\u000056\u0005e\u0000\u00006\f\u0001\u0000\u0000\u000079\u0007\u0000\u0000"+
		"\u000087\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000"+
		"\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0006"+
		"\u0006\u0000\u0000=\u000e\u0001\u0000\u0000\u0000>?\u0005(\u0000\u0000"+
		"?@\u0005*\u0000\u0000@D\u0001\u0000\u0000\u0000AC\t\u0000\u0000\u0000"+
		"BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000EG\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000GH\u0005*\u0000\u0000HI\u0005)\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000JK\u0006\u0007\u0000\u0000K\u0010\u0001\u0000\u0000\u0000LM\u0005"+
		"-\u0000\u0000MN\u0005-\u0000\u0000NR\u0001\u0000\u0000\u0000OQ\b\u0001"+
		"\u0000\u0000PO\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000UV\u0006\b\u0000\u0000V\u0012\u0001\u0000\u0000"+
		"\u0000WX\u0007\u0002\u0000\u0000X\u0014\u0001\u0000\u0000\u0000YZ\u0007"+
		"\u0003\u0000\u0000Z\u0016\u0001\u0000\u0000\u0000[_\u0007\u0004\u0000"+
		"\u0000\\^\u0007\u0005\u0000\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000"+
		"\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\u0018"+
		"\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bf\u0007\u0006\u0000"+
		"\u0000ce\u0007\u0005\u0000\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u001a"+
		"\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ik\u0005-\u0000\u0000"+
		"ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000"+
		"\u0000ln\u0007\u0003\u0000\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p\u001c"+
		"\u0001\u0000\u0000\u0000qw\u0005\"\u0000\u0000rv\b\u0007\u0000\u0000s"+
		"t\u0005\"\u0000\u0000tv\u0005\"\u0000\u0000ur\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000z{\u0005\"\u0000\u0000{\u001e\u0001\u0000\u0000\u0000|\u0084"+
		"\u0005\'\u0000\u0000}\u0085\b\b\u0000\u0000~\u007f\u0005\'\u0000\u0000"+
		"\u007f\u0085\u0005\'\u0000\u0000\u0080\u0081\u0005\\\u0000\u0000\u0081"+
		"\u0085\u0005n\u0000\u0000\u0082\u0083\u0005\\\u0000\u0000\u0083\u0085"+
		"\u0005t\u0000\u0000\u0084}\u0001\u0000\u0000\u0000\u0084~\u0001\u0000"+
		"\u0000\u0000\u0084\u0080\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0005\'\u0000"+
		"\u0000\u0087 \u0001\u0000\u0000\u0000\u000b\u0000:DR_fjouw\u0084\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}