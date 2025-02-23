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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, WS=6, COMMENT=7, LINE_COMMENT=8, 
		UIDENT=9, LIDENT=10, DECIMAL=11, STRING=12, CHAR=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "WS", "COMMENT", "LINE_COMMENT", 
			"NON_ZERO_DIGIT", "DIGIT", "UIDENT", "LIDENT", "DECIMAL", "STRING", "CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "','", "';'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "WS", "COMMENT", "LINE_COMMENT", 
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
		"\u0004\u0000\r\u0083\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0004\u00054\b\u0005\u000b\u0005\f\u00055\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		">\b\u0006\n\u0006\f\u0006A\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007L\b\u0007\n\u0007\f\u0007O\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0005\nY\b\n\n\n\f\n"+
		"\\\t\n\u0001\u000b\u0001\u000b\u0005\u000b`\b\u000b\n\u000b\f\u000bc\t"+
		"\u000b\u0001\f\u0003\ff\b\f\u0001\f\u0004\fi\b\f\u000b\f\f\fj\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0005\rq\b\r\n\r\f\rt\t\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0080\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"?\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\u0000\u0013\u0000\u0015\t\u0017\n\u0019"+
		"\u000b\u001b\f\u001d\r\u0001\u0000\t\u0003\u0000\t\n\f\r  \u0002\u0000"+
		"\n\n\r\r\u0001\u000019\u0001\u000009\u0001\u0000AZ\u0004\u000009AZ__a"+
		"z\u0001\u0000az\u0003\u0000\n\n\r\r\"\"\u0001\u0000\'\'\u008c\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0003#\u0001\u0000\u0000"+
		"\u0000\u0005%\u0001\u0000\u0000\u0000\u0007\'\u0001\u0000\u0000\u0000"+
		"\t,\u0001\u0000\u0000\u0000\u000b3\u0001\u0000\u0000\u0000\r9\u0001\u0000"+
		"\u0000\u0000\u000fG\u0001\u0000\u0000\u0000\u0011R\u0001\u0000\u0000\u0000"+
		"\u0013T\u0001\u0000\u0000\u0000\u0015V\u0001\u0000\u0000\u0000\u0017]"+
		"\u0001\u0000\u0000\u0000\u0019e\u0001\u0000\u0000\u0000\u001bl\u0001\u0000"+
		"\u0000\u0000\u001dw\u0001\u0000\u0000\u0000\u001f \u0005v\u0000\u0000"+
		" !\u0005a\u0000\u0000!\"\u0005r\u0000\u0000\"\u0002\u0001\u0000\u0000"+
		"\u0000#$\u0005,\u0000\u0000$\u0004\u0001\u0000\u0000\u0000%&\u0005;\u0000"+
		"\u0000&\u0006\u0001\u0000\u0000\u0000\'(\u0005t\u0000\u0000()\u0005r\u0000"+
		"\u0000)*\u0005u\u0000\u0000*+\u0005e\u0000\u0000+\b\u0001\u0000\u0000"+
		"\u0000,-\u0005f\u0000\u0000-.\u0005a\u0000\u0000./\u0005l\u0000\u0000"+
		"/0\u0005s\u0000\u000001\u0005e\u0000\u00001\n\u0001\u0000\u0000\u0000"+
		"24\u0007\u0000\u0000\u000032\u0001\u0000\u0000\u000045\u0001\u0000\u0000"+
		"\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u000078\u0006\u0005\u0000\u00008\f\u0001\u0000\u0000\u00009:\u0005"+
		"(\u0000\u0000:;\u0005*\u0000\u0000;?\u0001\u0000\u0000\u0000<>\t\u0000"+
		"\u0000\u0000=<\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000BC\u0005*\u0000\u0000CD\u0005)\u0000\u0000D"+
		"E\u0001\u0000\u0000\u0000EF\u0006\u0006\u0000\u0000F\u000e\u0001\u0000"+
		"\u0000\u0000GH\u0005-\u0000\u0000HI\u0005-\u0000\u0000IM\u0001\u0000\u0000"+
		"\u0000JL\b\u0001\u0000\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000"+
		"\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0006\u0007\u0000\u0000Q\u0010"+
		"\u0001\u0000\u0000\u0000RS\u0007\u0002\u0000\u0000S\u0012\u0001\u0000"+
		"\u0000\u0000TU\u0007\u0003\u0000\u0000U\u0014\u0001\u0000\u0000\u0000"+
		"VZ\u0007\u0004\u0000\u0000WY\u0007\u0005\u0000\u0000XW\u0001\u0000\u0000"+
		"\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[\u0016\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"]a\u0007\u0006\u0000\u0000^`\u0007\u0005\u0000\u0000_^\u0001\u0000\u0000"+
		"\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000b\u0018\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"df\u0005-\u0000\u0000ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"fh\u0001\u0000\u0000\u0000gi\u0007\u0003\u0000\u0000hg\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000k\u001a\u0001\u0000\u0000\u0000lr\u0005\"\u0000\u0000mq\b"+
		"\u0007\u0000\u0000no\u0005\"\u0000\u0000oq\u0005\"\u0000\u0000pm\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000uv\u0005\"\u0000\u0000v\u001c\u0001\u0000"+
		"\u0000\u0000w\u007f\u0005\'\u0000\u0000x\u0080\b\b\u0000\u0000yz\u0005"+
		"\'\u0000\u0000z\u0080\u0005\'\u0000\u0000{|\u0005\\\u0000\u0000|\u0080"+
		"\u0005n\u0000\u0000}~\u0005\\\u0000\u0000~\u0080\u0005t\u0000\u0000\u007f"+
		"x\u0001\u0000\u0000\u0000\u007fy\u0001\u0000\u0000\u0000\u007f{\u0001"+
		"\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0005\'\u0000\u0000\u0082\u001e\u0001\u0000\u0000"+
		"\u0000\u000b\u00005?MZaejpr\u007f\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}