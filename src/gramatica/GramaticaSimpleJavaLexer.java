// Generated from C:\Users\layca\Documents\NetBeansProjects\SimpleJava2017_1\src\gramatica\GramaticaSimpleJava.g4 by ANTLR 4.2.2
package gramatica;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaSimpleJavaLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__36=1, T__35=2, T__34=3, T__33=4, T__32=5, T__31=6, T__30=7, T__29=8, 
		T__28=9, T__27=10, T__26=11, T__25=12, T__24=13, T__23=14, T__22=15, T__21=16, 
		T__20=17, T__19=18, T__18=19, T__17=20, T__16=21, T__15=22, T__14=23, 
		T__13=24, T__12=25, T__11=26, T__10=27, T__9=28, T__8=29, T__7=30, T__6=31, 
		T__5=32, T__4=33, T__3=34, T__2=35, T__1=36, T__0=37, STRING=38, BOOL=39, 
		ID=40, REAL=41, INT=42, WS=43, LINE_COMMENT=44, COMMENT=45;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'/'", "'return'", "'!='", "'Bool'", "'||'", "'while'", "';'", "'{'", 
		"'&&'", "'='", "'}'", "'^'", "'for'", "'if'", "'<='", "'break'", "'print'", 
		"'('", "'*'", "','", "'Static'", "'Real'", "'Int'", "'to'", "'>='", "'scan'", 
		"'<'", "'=='", "'String'", "'>'", "'Prog'", "'!'", "'else'", "')'", "'+'", 
		"'step'", "'-'", "STRING", "BOOL", "ID", "REAL", "INT", "WS", "LINE_COMMENT", 
		"COMMENT"
	};
	public static final String[] ruleNames = {
		"T__36", "T__35", "T__34", "T__33", "T__32", "T__31", "T__30", "T__29", 
		"T__28", "T__27", "T__26", "T__25", "T__24", "T__23", "T__22", "T__21", 
		"T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", 
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "STRING", "BOOL", "ID", "REAL", "INT", 
		"WS", "LINE_COMMENT", "COMMENT"
	};


	public GramaticaSimpleJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GramaticaSimpleJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2/\u0132\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\7\'\u00e3\n\'\f\'\16\'\u00e6"+
		"\13\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u00f3\n(\3)\3)\7)\u00f7\n"+
		")\f)\16)\u00fa\13)\3*\6*\u00fd\n*\r*\16*\u00fe\3*\3*\6*\u0103\n*\r*\16"+
		"*\u0104\5*\u0107\n*\3+\6+\u010a\n+\r+\16+\u010b\3,\6,\u010f\n,\r,\16,"+
		"\u0110\3,\3,\3-\3-\3-\3-\7-\u0119\n-\f-\16-\u011c\13-\3-\5-\u011f\n-\3"+
		"-\3-\3-\3-\3.\3.\3.\3.\7.\u0129\n.\f.\16.\u012c\13.\3.\3.\3.\3.\3.\5\u00e4"+
		"\u011a\u012a\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\6\4\2C\\c|\6\2"+
		"\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\u013c\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7f\3\2\2\2\ti\3\2\2\2\13n\3\2"+
		"\2\2\rq\3\2\2\2\17w\3\2\2\2\21y\3\2\2\2\23{\3\2\2\2\25~\3\2\2\2\27\u0080"+
		"\3\2\2\2\31\u0082\3\2\2\2\33\u0084\3\2\2\2\35\u0088\3\2\2\2\37\u008b\3"+
		"\2\2\2!\u008e\3\2\2\2#\u0094\3\2\2\2%\u009a\3\2\2\2\'\u009c\3\2\2\2)\u009e"+
		"\3\2\2\2+\u00a0\3\2\2\2-\u00a7\3\2\2\2/\u00ac\3\2\2\2\61\u00b0\3\2\2\2"+
		"\63\u00b3\3\2\2\2\65\u00b6\3\2\2\2\67\u00bb\3\2\2\29\u00bd\3\2\2\2;\u00c0"+
		"\3\2\2\2=\u00c7\3\2\2\2?\u00c9\3\2\2\2A\u00ce\3\2\2\2C\u00d0\3\2\2\2E"+
		"\u00d5\3\2\2\2G\u00d7\3\2\2\2I\u00d9\3\2\2\2K\u00de\3\2\2\2M\u00e0\3\2"+
		"\2\2O\u00f2\3\2\2\2Q\u00f4\3\2\2\2S\u00fc\3\2\2\2U\u0109\3\2\2\2W\u010e"+
		"\3\2\2\2Y\u0114\3\2\2\2[\u0124\3\2\2\2]^\7\61\2\2^\4\3\2\2\2_`\7t\2\2"+
		"`a\7g\2\2ab\7v\2\2bc\7w\2\2cd\7t\2\2de\7p\2\2e\6\3\2\2\2fg\7#\2\2gh\7"+
		"?\2\2h\b\3\2\2\2ij\7D\2\2jk\7q\2\2kl\7q\2\2lm\7n\2\2m\n\3\2\2\2no\7~\2"+
		"\2op\7~\2\2p\f\3\2\2\2qr\7y\2\2rs\7j\2\2st\7k\2\2tu\7n\2\2uv\7g\2\2v\16"+
		"\3\2\2\2wx\7=\2\2x\20\3\2\2\2yz\7}\2\2z\22\3\2\2\2{|\7(\2\2|}\7(\2\2}"+
		"\24\3\2\2\2~\177\7?\2\2\177\26\3\2\2\2\u0080\u0081\7\177\2\2\u0081\30"+
		"\3\2\2\2\u0082\u0083\7`\2\2\u0083\32\3\2\2\2\u0084\u0085\7h\2\2\u0085"+
		"\u0086\7q\2\2\u0086\u0087\7t\2\2\u0087\34\3\2\2\2\u0088\u0089\7k\2\2\u0089"+
		"\u008a\7h\2\2\u008a\36\3\2\2\2\u008b\u008c\7>\2\2\u008c\u008d\7?\2\2\u008d"+
		" \3\2\2\2\u008e\u008f\7d\2\2\u008f\u0090\7t\2\2\u0090\u0091\7g\2\2\u0091"+
		"\u0092\7c\2\2\u0092\u0093\7m\2\2\u0093\"\3\2\2\2\u0094\u0095\7r\2\2\u0095"+
		"\u0096\7t\2\2\u0096\u0097\7k\2\2\u0097\u0098\7p\2\2\u0098\u0099\7v\2\2"+
		"\u0099$\3\2\2\2\u009a\u009b\7*\2\2\u009b&\3\2\2\2\u009c\u009d\7,\2\2\u009d"+
		"(\3\2\2\2\u009e\u009f\7.\2\2\u009f*\3\2\2\2\u00a0\u00a1\7U\2\2\u00a1\u00a2"+
		"\7v\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7k\2\2\u00a5"+
		"\u00a6\7e\2\2\u00a6,\3\2\2\2\u00a7\u00a8\7T\2\2\u00a8\u00a9\7g\2\2\u00a9"+
		"\u00aa\7c\2\2\u00aa\u00ab\7n\2\2\u00ab.\3\2\2\2\u00ac\u00ad\7K\2\2\u00ad"+
		"\u00ae\7p\2\2\u00ae\u00af\7v\2\2\u00af\60\3\2\2\2\u00b0\u00b1\7v\2\2\u00b1"+
		"\u00b2\7q\2\2\u00b2\62\3\2\2\2\u00b3\u00b4\7@\2\2\u00b4\u00b5\7?\2\2\u00b5"+
		"\64\3\2\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7c\2\2\u00b9"+
		"\u00ba\7p\2\2\u00ba\66\3\2\2\2\u00bb\u00bc\7>\2\2\u00bc8\3\2\2\2\u00bd"+
		"\u00be\7?\2\2\u00be\u00bf\7?\2\2\u00bf:\3\2\2\2\u00c0\u00c1\7U\2\2\u00c1"+
		"\u00c2\7v\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7p\2\2"+
		"\u00c5\u00c6\7i\2\2\u00c6<\3\2\2\2\u00c7\u00c8\7@\2\2\u00c8>\3\2\2\2\u00c9"+
		"\u00ca\7R\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7i\2\2"+
		"\u00cd@\3\2\2\2\u00ce\u00cf\7#\2\2\u00cfB\3\2\2\2\u00d0\u00d1\7g\2\2\u00d1"+
		"\u00d2\7n\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7g\2\2\u00d4D\3\2\2\2\u00d5"+
		"\u00d6\7+\2\2\u00d6F\3\2\2\2\u00d7\u00d8\7-\2\2\u00d8H\3\2\2\2\u00d9\u00da"+
		"\7u\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7r\2\2\u00dd"+
		"J\3\2\2\2\u00de\u00df\7/\2\2\u00dfL\3\2\2\2\u00e0\u00e4\7$\2\2\u00e1\u00e3"+
		"\13\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e5\3\2\2\2"+
		"\u00e4\u00e2\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8"+
		"\7$\2\2\u00e8N\3\2\2\2\u00e9\u00ea\7V\2\2\u00ea\u00eb\7T\2\2\u00eb\u00ec"+
		"\7W\2\2\u00ec\u00f3\7G\2\2\u00ed\u00ee\7H\2\2\u00ee\u00ef\7C\2\2\u00ef"+
		"\u00f0\7N\2\2\u00f0\u00f1\7U\2\2\u00f1\u00f3\7G\2\2\u00f2\u00e9\3\2\2"+
		"\2\u00f2\u00ed\3\2\2\2\u00f3P\3\2\2\2\u00f4\u00f8\t\2\2\2\u00f5\u00f7"+
		"\t\3\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9R\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\t\4\2\2"+
		"\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u0106\3\2\2\2\u0100\u0102\7\60\2\2\u0101\u0103\t\4\2\2"+
		"\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0100\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"T\3\2\2\2\u0108\u010a\t\4\2\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2"+
		"\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010cV\3\2\2\2\u010d\u010f\t"+
		"\5\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\b,\2\2\u0113X\3\2\2\2\u0114"+
		"\u0115\7\61\2\2\u0115\u0116\7\61\2\2\u0116\u011a\3\2\2\2\u0117\u0119\13"+
		"\2\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u011b\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f\7\17"+
		"\2\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0121\7\f\2\2\u0121\u0122\3\2\2\2\u0122\u0123\b-\2\2\u0123Z\3\2\2\2\u0124"+
		"\u0125\7\61\2\2\u0125\u0126\7,\2\2\u0126\u012a\3\2\2\2\u0127\u0129\13"+
		"\2\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u012b\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7,"+
		"\2\2\u012e\u012f\7\61\2\2\u012f\u0130\3\2\2\2\u0130\u0131\b.\2\2\u0131"+
		"\\\3\2\2\2\16\2\u00e4\u00f2\u00f8\u00fe\u0104\u0106\u010b\u0110\u011a"+
		"\u011e\u012a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}