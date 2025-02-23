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
		WS=1, COMMENT=2, LINE_COMMENT=3, NUMERIC_LITERAL=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "COMMENT", "LINE_COMMENT", "LETTER", "NON_ZERO_DIGIT", "DIGIT", 
			"NUMERIC_LITERAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "LINE_COMMENT", "NUMERIC_LITERAL"
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
		"\u0004\u0000\u0004?\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"+
		"\u0004\u0000\u0011\b\u0000\u000b\u0000\f\u0000\u0012\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001b"+
		"\b\u0001\n\u0001\f\u0001\u001e\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002)\b\u0002\n\u0002\f\u0002,\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u00069\b\u0006\n\u0006\f\u0006"+
		"<\t\u0006\u0003\u0006>\b\u0006\u0001\u001c\u0000\u0007\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0000\t\u0000\u000b\u0000\r\u0004\u0001\u0000"+
		"\u0005\u0003\u0000\t\n\f\r  \u0002\u0000\n\n\r\r\u0001\u0000az\u0001\u0000"+
		"19\u0001\u000009@\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0001\u0010\u0001\u0000\u0000\u0000\u0003\u0016\u0001\u0000"+
		"\u0000\u0000\u0005$\u0001\u0000\u0000\u0000\u0007/\u0001\u0000\u0000\u0000"+
		"\t1\u0001\u0000\u0000\u0000\u000b3\u0001\u0000\u0000\u0000\r=\u0001\u0000"+
		"\u0000\u0000\u000f\u0011\u0007\u0000\u0000\u0000\u0010\u000f\u0001\u0000"+
		"\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0010\u0001\u0000"+
		"\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000"+
		"\u0000\u0000\u0014\u0015\u0006\u0000\u0000\u0000\u0015\u0002\u0001\u0000"+
		"\u0000\u0000\u0016\u0017\u0005(\u0000\u0000\u0017\u0018\u0005*\u0000\u0000"+
		"\u0018\u001c\u0001\u0000\u0000\u0000\u0019\u001b\t\u0000\u0000\u0000\u001a"+
		"\u0019\u0001\u0000\u0000\u0000\u001b\u001e\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001d"+
		"\u001f\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001f"+
		" \u0005*\u0000\u0000 !\u0005)\u0000\u0000!\"\u0001\u0000\u0000\u0000\""+
		"#\u0006\u0001\u0000\u0000#\u0004\u0001\u0000\u0000\u0000$%\u0005-\u0000"+
		"\u0000%&\u0005-\u0000\u0000&*\u0001\u0000\u0000\u0000\')\b\u0001\u0000"+
		"\u0000(\'\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000"+
		"\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,*\u0001"+
		"\u0000\u0000\u0000-.\u0006\u0002\u0000\u0000.\u0006\u0001\u0000\u0000"+
		"\u0000/0\u0007\u0002\u0000\u00000\b\u0001\u0000\u0000\u000012\u0007\u0003"+
		"\u0000\u00002\n\u0001\u0000\u0000\u000034\u0007\u0004\u0000\u00004\f\u0001"+
		"\u0000\u0000\u00005>\u00050\u0000\u00006:\u0003\t\u0004\u000079\u0003"+
		"\u000b\u0005\u000087\u0001\u0000\u0000\u00009<\u0001\u0000\u0000\u0000"+
		":8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000"+
		"\u0000<:\u0001\u0000\u0000\u0000=5\u0001\u0000\u0000\u0000=6\u0001\u0000"+
		"\u0000\u0000>\u000e\u0001\u0000\u0000\u0000\u0006\u0000\u0012\u001c*:"+
		"=\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}