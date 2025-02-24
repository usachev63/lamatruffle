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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		WS=10, COMMENT=11, LINE_COMMENT=12, UIDENT=13, LIDENT=14, DECIMAL=15, 
		STRING=16, CHAR=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"WS", "COMMENT", "LINE_COMMENT", "NON_ZERO_DIGIT", "DIGIT", "UIDENT", 
			"LIDENT", "DECIMAL", "STRING", "CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "';'", "','", "'='", "':='", "'+'", "'-'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "WS", "COMMENT", 
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
		"\u0004\u0000\u0011\u0094\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0004\tE\b\t"+
		"\u000b\t\f\tF\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n"+
		"O\b\n\n\n\f\nR\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b]\b\u000b\n\u000b\f\u000b"+
		"`\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0005\u000ej\b\u000e\n\u000e\f\u000em\t\u000e\u0001"+
		"\u000f\u0001\u000f\u0005\u000fq\b\u000f\n\u000f\f\u000ft\t\u000f\u0001"+
		"\u0010\u0003\u0010w\b\u0010\u0001\u0010\u0004\u0010z\b\u0010\u000b\u0010"+
		"\f\u0010{\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u0082\b\u0011\n\u0011\f\u0011\u0085\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0091\b\u0012\u0001\u0012\u0001\u0012\u0001"+
		"P\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\u0000\u001b\u0000\u001d\r\u001f\u000e!\u000f#\u0010%\u0011\u0001\u0000"+
		"\t\u0003\u0000\t\n\f\r  \u0002\u0000\n\n\r\r\u0001\u000019\u0001\u0000"+
		"09\u0001\u0000AZ\u0004\u000009AZ__az\u0001\u0000az\u0003\u0000\n\n\r\r"+
		"\"\"\u0001\u0000\'\'\u009d\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003"+
		"+\u0001\u0000\u0000\u0000\u0005-\u0001\u0000\u0000\u0000\u0007/\u0001"+
		"\u0000\u0000\u0000\t1\u0001\u0000\u0000\u0000\u000b4\u0001\u0000\u0000"+
		"\u0000\r6\u0001\u0000\u0000\u0000\u000f8\u0001\u0000\u0000\u0000\u0011"+
		"=\u0001\u0000\u0000\u0000\u0013D\u0001\u0000\u0000\u0000\u0015J\u0001"+
		"\u0000\u0000\u0000\u0017X\u0001\u0000\u0000\u0000\u0019c\u0001\u0000\u0000"+
		"\u0000\u001be\u0001\u0000\u0000\u0000\u001dg\u0001\u0000\u0000\u0000\u001f"+
		"n\u0001\u0000\u0000\u0000!v\u0001\u0000\u0000\u0000#}\u0001\u0000\u0000"+
		"\u0000%\u0088\u0001\u0000\u0000\u0000\'(\u0005v\u0000\u0000()\u0005a\u0000"+
		"\u0000)*\u0005r\u0000\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0005;\u0000"+
		"\u0000,\u0004\u0001\u0000\u0000\u0000-.\u0005,\u0000\u0000.\u0006\u0001"+
		"\u0000\u0000\u0000/0\u0005=\u0000\u00000\b\u0001\u0000\u0000\u000012\u0005"+
		":\u0000\u000023\u0005=\u0000\u00003\n\u0001\u0000\u0000\u000045\u0005"+
		"+\u0000\u00005\f\u0001\u0000\u0000\u000067\u0005-\u0000\u00007\u000e\u0001"+
		"\u0000\u0000\u000089\u0005t\u0000\u00009:\u0005r\u0000\u0000:;\u0005u"+
		"\u0000\u0000;<\u0005e\u0000\u0000<\u0010\u0001\u0000\u0000\u0000=>\u0005"+
		"f\u0000\u0000>?\u0005a\u0000\u0000?@\u0005l\u0000\u0000@A\u0005s\u0000"+
		"\u0000AB\u0005e\u0000\u0000B\u0012\u0001\u0000\u0000\u0000CE\u0007\u0000"+
		"\u0000\u0000DC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"HI\u0006\t\u0000\u0000I\u0014\u0001\u0000\u0000\u0000JK\u0005(\u0000\u0000"+
		"KL\u0005*\u0000\u0000LP\u0001\u0000\u0000\u0000MO\t\u0000\u0000\u0000"+
		"NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000ST\u0005*\u0000\u0000TU\u0005)\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000VW\u0006\n\u0000\u0000W\u0016\u0001\u0000\u0000\u0000XY\u0005-\u0000"+
		"\u0000YZ\u0005-\u0000\u0000Z^\u0001\u0000\u0000\u0000[]\b\u0001\u0000"+
		"\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000ab\u0006\u000b\u0000\u0000b\u0018\u0001\u0000\u0000"+
		"\u0000cd\u0007\u0002\u0000\u0000d\u001a\u0001\u0000\u0000\u0000ef\u0007"+
		"\u0003\u0000\u0000f\u001c\u0001\u0000\u0000\u0000gk\u0007\u0004\u0000"+
		"\u0000hj\u0007\u0005\u0000\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\u001e"+
		"\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000nr\u0007\u0006\u0000"+
		"\u0000oq\u0007\u0005\u0000\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s \u0001"+
		"\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uw\u0005-\u0000\u0000vu\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000"+
		"xz\u0007\u0003\u0000\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\"\u0001\u0000"+
		"\u0000\u0000}\u0083\u0005\"\u0000\u0000~\u0082\b\u0007\u0000\u0000\u007f"+
		"\u0080\u0005\"\u0000\u0000\u0080\u0082\u0005\"\u0000\u0000\u0081~\u0001"+
		"\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0085\u0001"+
		"\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0005\"\u0000\u0000\u0087$\u0001\u0000"+
		"\u0000\u0000\u0088\u0090\u0005\'\u0000\u0000\u0089\u0091\b\b\u0000\u0000"+
		"\u008a\u008b\u0005\'\u0000\u0000\u008b\u0091\u0005\'\u0000\u0000\u008c"+
		"\u008d\u0005\\\u0000\u0000\u008d\u0091\u0005n\u0000\u0000\u008e\u008f"+
		"\u0005\\\u0000\u0000\u008f\u0091\u0005t\u0000\u0000\u0090\u0089\u0001"+
		"\u0000\u0000\u0000\u0090\u008a\u0001\u0000\u0000\u0000\u0090\u008c\u0001"+
		"\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0005\'\u0000\u0000\u0093&\u0001\u0000"+
		"\u0000\u0000\u000b\u0000FP^krv{\u0081\u0083\u0090\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}