// Generated from C:\Users\layca\Documents\NetBeansProjects\SimpleJava2017_1\src\gramatica\GramaticaSimpleJava.g4 by ANTLR 4.2.2
package gramatica;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaSimpleJavaParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'return'", "'!='", "'Bool'", "'||'", "'while'", "';'", 
		"'{'", "'&&'", "'='", "'}'", "'^'", "'for'", "'if'", "'<='", "'break'", 
		"'print'", "'('", "'*'", "','", "'Static'", "'Real'", "'Int'", "'to'", 
		"'>='", "'scan'", "'<'", "'=='", "'String'", "'>'", "'Prog'", "'!'", "'else'", 
		"')'", "'+'", "'step'", "'-'", "STRING", "BOOL", "ID", "REAL", "INT", 
		"WS", "LINE_COMMENT", "COMMENT"
	};
	public static final int
		RULE_prog = 0, RULE_principal = 1, RULE_declaracao_var = 2, RULE_declaracao_const = 3, 
		RULE_lista_ids = 4, RULE_declaracao = 5, RULE_funcao = 6, RULE_retorno = 7, 
		RULE_lista_de_parametros = 8, RULE_parametro = 9, RULE_tipo = 10, RULE_lista_de_expr = 11, 
		RULE_comandos = 12, RULE_chamada_de_funcao = 13, RULE_chamada_de_funcao_aninhada = 14, 
		RULE_comando_else = 15, RULE_step_for = 16, RULE_comandos_controle = 17, 
		RULE_atribuicao = 18, RULE_expr = 19, RULE_opnot = 20, RULE_oprelacional = 21, 
		RULE_parentese = 22, RULE_fator = 23, RULE_valor = 24, RULE_numero = 25, 
		RULE_identificador = 26;
	public static final String[] ruleNames = {
		"prog", "principal", "declaracao_var", "declaracao_const", "lista_ids", 
		"declaracao", "funcao", "retorno", "lista_de_parametros", "parametro", 
		"tipo", "lista_de_expr", "comandos", "chamada_de_funcao", "chamada_de_funcao_aninhada", 
		"comando_else", "step_for", "comandos_controle", "atribuicao", "expr", 
		"opnot", "oprelacional", "parentese", "fator", "valor", "numero", "identificador"
	};

	@Override
	public String getGrammarFileName() { return "GramaticaSimpleJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaSimpleJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BodyContext extends ProgContext {
		public TerminalNode ID() { return getToken(GramaticaSimpleJavaParser.ID, 0); }
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public BodyContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			int _alt;
			_localctx = new BodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(31);
			setState(55); match(ID);
			setState(56); match(8);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(57); declaracao();
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(63); funcao();
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(69); principal();
			setState(70); match(11);
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

	public static class PrincipalContext extends ParserRuleContext {
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
	 
		public PrincipalContext() { }
		public void copyFrom(PrincipalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MainContext extends PrincipalContext {
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public MainContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_principal);
		int _la;
		try {
			_localctx = new MainContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 29))) != 0)) {
				{
				{
				setState(72); declaracao();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78); comandos();
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 13) | (1L << 14) | (1L << 16) | (1L << 17) | (1L << 26) | (1L << ID))) != 0) );
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

	public static class Declaracao_varContext extends ParserRuleContext {
		public Declaracao_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_var; }
	 
		public Declaracao_varContext() { }
		public void copyFrom(Declaracao_varContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariaveisContext extends Declaracao_varContext {
		public Lista_idsContext lista_ids() {
			return getRuleContext(Lista_idsContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public VariaveisContext(Declaracao_varContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterVariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitVariaveis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitVariaveis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_varContext declaracao_var() throws RecognitionException {
		Declaracao_varContext _localctx = new Declaracao_varContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao_var);
		try {
			_localctx = new VariaveisContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(83); tipo();
			setState(84); lista_ids();
			setState(85); match(7);
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

	public static class Declaracao_constContext extends ParserRuleContext {
		public Declaracao_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_const; }
	 
		public Declaracao_constContext() { }
		public void copyFrom(Declaracao_constContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ContantesContext extends Declaracao_constContext {
		public TerminalNode ID() { return getToken(GramaticaSimpleJavaParser.ID, 0); }
		public TerminalNode REAL() { return getToken(GramaticaSimpleJavaParser.REAL, 0); }
		public TerminalNode BOOL() { return getToken(GramaticaSimpleJavaParser.BOOL, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode STRING() { return getToken(GramaticaSimpleJavaParser.STRING, 0); }
		public ContantesContext(Declaracao_constContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterContantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitContantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitContantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_constContext declaracao_const() throws RecognitionException {
		Declaracao_constContext _localctx = new Declaracao_constContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_const);
		int _la;
		try {
			_localctx = new ContantesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(21);
			setState(88); tipo();
			setState(89); match(ID);
			setState(90); match(10);
			setState(91);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << BOOL) | (1L << REAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(92); match(7);
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

	public static class Lista_idsContext extends ParserRuleContext {
		public Lista_idsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_ids; }
	 
		public Lista_idsContext() { }
		public void copyFrom(Lista_idsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListaIdsIDContext extends Lista_idsContext {
		public TerminalNode ID() { return getToken(GramaticaSimpleJavaParser.ID, 0); }
		public ListaIdsIDContext(Lista_idsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterListaIdsID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitListaIdsID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitListaIdsID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListaIdsContext extends Lista_idsContext {
		public Lista_idsContext lista_ids() {
			return getRuleContext(Lista_idsContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaSimpleJavaParser.ID, 0); }
		public ListaIdsContext(Lista_idsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterListaIds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitListaIds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitListaIds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_idsContext lista_ids() throws RecognitionException {
		Lista_idsContext _localctx = new Lista_idsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lista_ids);
		try {
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ListaIdsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94); match(ID);
				setState(95); match(20);
				setState(96); lista_ids();
				}
				break;

			case 2:
				_localctx = new ListaIdsIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97); match(ID);
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	 
		public DeclaracaoContext() { }
		public void copyFrom(DeclaracaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclaracaoContantesContext extends DeclaracaoContext {
		public Declaracao_constContext declaracao_const() {
			return getRuleContext(Declaracao_constContext.class,0);
		}
		public DeclaracaoContantesContext(DeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterDeclaracaoContantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitDeclaracaoContantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitDeclaracaoContantes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaracaoVariaveisContext extends DeclaracaoContext {
		public Declaracao_varContext declaracao_var() {
			return getRuleContext(Declaracao_varContext.class,0);
		}
		public DeclaracaoVariaveisContext(DeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterDeclaracaoVariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitDeclaracaoVariaveis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitDeclaracaoVariaveis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracao);
		try {
			setState(102);
			switch (_input.LA(1)) {
			case 4:
			case 22:
			case 23:
			case 29:
				_localctx = new DeclaracaoVariaveisContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100); declaracao_var();
				}
				break;
			case 21:
				_localctx = new DeclaracaoContantesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101); declaracao_const();
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

	public static class FuncaoContext extends ParserRuleContext {
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
	 
		public FuncaoContext() { }
		public void copyFrom(FuncaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionContext extends FuncaoContext {
		public TerminalNode ID() { return getToken(GramaticaSimpleJavaParser.ID, 0); }
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public Lista_de_parametrosContext lista_de_parametros() {
			return getRuleContext(Lista_de_parametrosContext.class,0);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public FunctionContext(FuncaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcao);
		int _la;
		try {
			_localctx = new FunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(104); tipo();
			setState(105); match(ID);
			setState(106); match(18);
			setState(107); lista_de_parametros();
			setState(108); match(34);
			setState(109); match(8);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 29))) != 0)) {
				{
				{
				setState(110); declaracao();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 13) | (1L << 14) | (1L << 16) | (1L << 17) | (1L << 26) | (1L << ID))) != 0)) {
				{
				{
				setState(116); comandos();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122); match(11);
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

	public static class RetornoContext extends ParserRuleContext {
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
	 
		public RetornoContext() { }
		public void copyFrom(RetornoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnContext extends RetornoContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(RetornoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_retorno);
		try {
			_localctx = new ReturnContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(2);
			setState(125); match(18);
			setState(126); expr(0);
			setState(127); match(34);
			setState(128); match(7);
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

	public static class Lista_de_parametrosContext extends ParserRuleContext {
		public Lista_de_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_de_parametros; }
	 
		public Lista_de_parametrosContext() { }
		public void copyFrom(Lista_de_parametrosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyParamContext extends Lista_de_parametrosContext {
		public EmptyParamContext(Lista_de_parametrosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterEmptyParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitEmptyParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitEmptyParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListaParamContext extends Lista_de_parametrosContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Lista_de_parametrosContext lista_de_parametros() {
			return getRuleContext(Lista_de_parametrosContext.class,0);
		}
		public ListaParamContext(Lista_de_parametrosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterListaParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitListaParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitListaParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamContext extends Lista_de_parametrosContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public ParamContext(Lista_de_parametrosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_de_parametrosContext lista_de_parametros() throws RecognitionException {
		Lista_de_parametrosContext _localctx = new Lista_de_parametrosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lista_de_parametros);
		try {
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ListaParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130); parametro();
				setState(131); match(20);
				setState(132); lista_de_parametros();
				}
				break;

			case 2:
				_localctx = new ParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134); parametro();
				}
				break;

			case 3:
				_localctx = new EmptyParamContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
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

	public static class ParametroContext extends ParserRuleContext {
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	 
		public ParametroContext() { }
		public void copyFrom(ParametroContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParameterContext extends ParametroContext {
		public TerminalNode ID() { return getToken(GramaticaSimpleJavaParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParameterContext(ParametroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parametro);
		try {
			_localctx = new ParameterContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(138); tipo();
			setState(139); match(ID);
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	 
		public TipoContext() { }
		public void copyFrom(TipoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TipoIntContext extends TipoContext {
		public TipoIntContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterTipoInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitTipoInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitTipoInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoRealContext extends TipoContext {
		public TipoRealContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterTipoReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitTipoReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitTipoReal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoStringContext extends TipoContext {
		public TipoStringContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterTipoString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitTipoString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitTipoString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoBoolContext extends TipoContext {
		public TipoBoolContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterTipoBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitTipoBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitTipoBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo);
		try {
			setState(145);
			switch (_input.LA(1)) {
			case 23:
				_localctx = new TipoIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141); match(23);
				}
				break;
			case 22:
				_localctx = new TipoRealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(142); match(22);
				}
				break;
			case 29:
				_localctx = new TipoStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(143); match(29);
				}
				break;
			case 4:
				_localctx = new TipoBoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(144); match(4);
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

	public static class Lista_de_exprContext extends ParserRuleContext {
		public Lista_de_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_de_expr; }
	 
		public Lista_de_exprContext() { }
		public void copyFrom(Lista_de_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyExpressionContext extends Lista_de_exprContext {
		public EmptyExpressionContext(Lista_de_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterEmptyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitEmptyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitEmptyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionContext extends Lista_de_exprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionContext(Lista_de_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListExpressionContext extends Lista_de_exprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Lista_de_exprContext lista_de_expr() {
			return getRuleContext(Lista_de_exprContext.class,0);
		}
		public ListExpressionContext(Lista_de_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitListExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitListExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_de_exprContext lista_de_expr() throws RecognitionException {
		Lista_de_exprContext _localctx = new Lista_de_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lista_de_expr);
		try {
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ListExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147); expr(0);
				setState(148); match(20);
				setState(149); lista_de_expr();
				}
				break;

			case 2:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(151); expr(0);
				}
				break;

			case 3:
				_localctx = new EmptyExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
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

	public static class ComandosContext extends ParserRuleContext {
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
	 
		public ComandosContext() { }
		public void copyFrom(ComandosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComandoPrintContext extends ComandosContext {
		public Lista_de_exprContext lista_de_expr() {
			return getRuleContext(Lista_de_exprContext.class,0);
		}
		public ComandoPrintContext(ComandosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterComandoPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitComandoPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitComandoPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComandoAtribuicaoContext extends ComandosContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ComandoAtribuicaoContext(ComandosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterComandoAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitComandoAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitComandoAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComandoBreakContext extends ComandosContext {
		public ComandoBreakContext(ComandosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterComandoBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitComandoBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitComandoBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComandoRetornoContext extends ComandosContext {
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public ComandoRetornoContext(ComandosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterComandoRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitComandoRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitComandoRetorno(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComandoChamadaFuncaoContext extends ComandosContext {
		public Chamada_de_funcaoContext chamada_de_funcao() {
			return getRuleContext(Chamada_de_funcaoContext.class,0);
		}
		public ComandoChamadaFuncaoContext(ComandosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterComandoChamadaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitComandoChamadaFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitComandoChamadaFuncao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComadoScanContext extends ComandosContext {
		public Lista_idsContext lista_ids() {
			return getRuleContext(Lista_idsContext.class,0);
		}
		public ComadoScanContext(ComandosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterComadoScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitComadoScan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitComadoScan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComandoControleContext extends ComandosContext {
		public Comandos_controleContext comandos_controle() {
			return getRuleContext(Comandos_controleContext.class,0);
		}
		public ComandoControleContext(ComandosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterComandoControle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitComandoControle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitComandoControle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comandos);
		try {
			setState(173);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new ComandoPrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155); match(17);
				setState(156); match(18);
				setState(157); lista_de_expr();
				setState(158); match(34);
				setState(159); match(7);
				}
				break;

			case 2:
				_localctx = new ComadoScanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(161); match(26);
				setState(162); match(18);
				setState(163); lista_ids();
				setState(164); match(34);
				setState(165); match(7);
				}
				break;

			case 3:
				_localctx = new ComandoControleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(167); comandos_controle();
				}
				break;

			case 4:
				_localctx = new ComandoAtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(168); atribuicao();
				}
				break;

			case 5:
				_localctx = new ComandoBreakContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(169); match(16);
				setState(170); match(7);
				}
				break;

			case 6:
				_localctx = new ComandoChamadaFuncaoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(171); chamada_de_funcao();
				}
				break;

			case 7:
				_localctx = new ComandoRetornoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(172); retorno();
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

	public static class Chamada_de_funcaoContext extends ParserRuleContext {
		public Chamada_de_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_de_funcao; }
	 
		public Chamada_de_funcaoContext() { }
		public void copyFrom(Chamada_de_funcaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChamadaFuncaoContext extends Chamada_de_funcaoContext {
		public TerminalNode ID() { return getToken(GramaticaSimpleJavaParser.ID, 0); }
		public Lista_de_exprContext lista_de_expr() {
			return getRuleContext(Lista_de_exprContext.class,0);
		}
		public ChamadaFuncaoContext(Chamada_de_funcaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterChamadaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitChamadaFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitChamadaFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chamada_de_funcaoContext chamada_de_funcao() throws RecognitionException {
		Chamada_de_funcaoContext _localctx = new Chamada_de_funcaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_chamada_de_funcao);
		try {
			_localctx = new ChamadaFuncaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(175); match(ID);
			setState(176); match(18);
			setState(177); lista_de_expr();
			setState(178); match(34);
			setState(179); match(7);
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

	public static class Chamada_de_funcao_aninhadaContext extends ParserRuleContext {
		public Chamada_de_funcao_aninhadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_de_funcao_aninhada; }
	 
		public Chamada_de_funcao_aninhadaContext() { }
		public void copyFrom(Chamada_de_funcao_aninhadaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChamadaFuncaoAninhadaContext extends Chamada_de_funcao_aninhadaContext {
		public TerminalNode ID() { return getToken(GramaticaSimpleJavaParser.ID, 0); }
		public Lista_de_exprContext lista_de_expr() {
			return getRuleContext(Lista_de_exprContext.class,0);
		}
		public ChamadaFuncaoAninhadaContext(Chamada_de_funcao_aninhadaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterChamadaFuncaoAninhada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitChamadaFuncaoAninhada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitChamadaFuncaoAninhada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chamada_de_funcao_aninhadaContext chamada_de_funcao_aninhada() throws RecognitionException {
		Chamada_de_funcao_aninhadaContext _localctx = new Chamada_de_funcao_aninhadaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_chamada_de_funcao_aninhada);
		try {
			_localctx = new ChamadaFuncaoAninhadaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(181); match(ID);
			setState(182); match(18);
			setState(183); lista_de_expr();
			setState(184); match(34);
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

	public static class Comando_elseContext extends ParserRuleContext {
		public Comando_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_else; }
	 
		public Comando_elseContext() { }
		public void copyFrom(Comando_elseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ControleElseContext extends Comando_elseContext {
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ControleElseContext(Comando_elseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterControleElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitControleElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitControleElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comando_elseContext comando_else() throws RecognitionException {
		Comando_elseContext _localctx = new Comando_elseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comando_else);
		int _la;
		try {
			_localctx = new ControleElseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(186); match(33);
			setState(187); match(8);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 13) | (1L << 14) | (1L << 16) | (1L << 17) | (1L << 26) | (1L << ID))) != 0)) {
				{
				{
				setState(188); comandos();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194); match(11);
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

	public static class Step_forContext extends ParserRuleContext {
		public Step_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step_for; }
	 
		public Step_forContext() { }
		public void copyFrom(Step_forContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StepForContext extends Step_forContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public StepForContext(Step_forContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterStepFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitStepFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitStepFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Step_forContext step_for() throws RecognitionException {
		Step_forContext _localctx = new Step_forContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_step_for);
		try {
			_localctx = new StepForContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(196); match(36);
			setState(197); valor();
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

	public static class Comandos_controleContext extends ParserRuleContext {
		public Comandos_controleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos_controle; }
	 
		public Comandos_controleContext() { }
		public void copyFrom(Comandos_controleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComandoControleWhileContext extends Comandos_controleContext {
		public OprelacionalContext oprelacional() {
			return getRuleContext(OprelacionalContext.class,0);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandoControleWhileContext(Comandos_controleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterComandoControleWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitComandoControleWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitComandoControleWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComandoControleIfContext extends Comandos_controleContext {
		public OprelacionalContext oprelacional() {
			return getRuleContext(OprelacionalContext.class,0);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public Comando_elseContext comando_else() {
			return getRuleContext(Comando_elseContext.class,0);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandoControleIfContext(Comandos_controleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterComandoControleIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitComandoControleIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitComandoControleIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComandoControleForContext extends Comandos_controleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Step_forContext step_for() {
			return getRuleContext(Step_forContext.class,0);
		}
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public ComandoControleForContext(Comandos_controleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterComandoControleFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitComandoControleFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitComandoControleFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comandos_controleContext comandos_controle() throws RecognitionException {
		Comandos_controleContext _localctx = new Comandos_controleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comandos_controle);
		int _la;
		try {
			setState(247);
			switch (_input.LA(1)) {
			case 14:
				_localctx = new ComandoControleIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(199); match(14);
				setState(200); match(18);
				setState(201); oprelacional();
				setState(202); match(34);
				setState(203); match(8);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 13) | (1L << 14) | (1L << 16) | (1L << 17) | (1L << 26) | (1L << ID))) != 0)) {
					{
					{
					setState(204); comandos();
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210); match(11);
				setState(212);
				_la = _input.LA(1);
				if (_la==33) {
					{
					setState(211); comando_else();
					}
				}

				}
				break;
			case 6:
				_localctx = new ComandoControleWhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(214); match(6);
				setState(215); match(18);
				setState(216); oprelacional();
				setState(217); match(34);
				setState(218); match(8);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 13) | (1L << 14) | (1L << 16) | (1L << 17) | (1L << 26) | (1L << ID))) != 0)) {
					{
					{
					setState(219); comandos();
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(225); match(11);
				}
				break;
			case 13:
				_localctx = new ComandoControleForContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(227); match(13);
				setState(228); match(18);
				setState(229); identificador();
				setState(230); match(10);
				setState(231); valor();
				setState(232); match(24);
				setState(233); valor();
				setState(235);
				_la = _input.LA(1);
				if (_la==36) {
					{
					setState(234); step_for();
					}
				}

				setState(237); match(34);
				setState(238); match(8);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 13) | (1L << 14) | (1L << 16) | (1L << 17) | (1L << 26) | (1L << ID))) != 0)) {
					{
					{
					setState(239); comandos();
					}
					}
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(245); match(11);
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	 
		public AtribuicaoContext() { }
		public void copyFrom(AtribuicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtributionContext extends AtribuicaoContext {
		public TerminalNode ID() { return getToken(GramaticaSimpleJavaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtributionContext(AtribuicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterAtribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitAtribution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitAtribution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_atribuicao);
		try {
			_localctx = new AtributionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(249); match(ID);
			setState(250); match(10);
			setState(251); expr(0);
			setState(252); match(7);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprSomasubContext extends ExprContext {
		public ExprContext v1;
		public Token s;
		public ExprContext v2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprSomasubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterExprSomasub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitExprSomasub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitExprSomasub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMultdivContext extends ExprContext {
		public ExprContext v1;
		public Token s;
		public ExprContext v2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMultdivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterExprMultdiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitExprMultdiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitExprMultdiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNotContext extends ExprContext {
		public OpnotContext opnot() {
			return getRuleContext(OpnotContext.class,0);
		}
		public ExprNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitExprNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMinusContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprMinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterExprMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitExprMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitExprMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParenteseContext extends ExprContext {
		public ParenteseContext parentese() {
			return getRuleContext(ParenteseContext.class,0);
		}
		public ExprParenteseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterExprParentese(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitExprParentese(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitExprParentese(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPotContext extends ExprContext {
		public ExprContext v1;
		public ExprContext v2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprPotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterExprPot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitExprPot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitExprPot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			switch (_input.LA(1)) {
			case 37:
				{
				_localctx = new ExprMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(255); match(37);
				setState(256); expr(4);
				}
				break;
			case 18:
			case STRING:
			case BOOL:
			case ID:
			case REAL:
			case INT:
				{
				_localctx = new ExprParenteseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257); parentese();
				}
				break;
			case 32:
				{
				_localctx = new ExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258); opnot();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(270);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExprPotContext(new ExprContext(_parentctx, _parentState));
						((ExprPotContext)_localctx).v1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(261);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(262); match(12);
						setState(263); ((ExprPotContext)_localctx).v2 = expr(4);
						}
						break;

					case 2:
						{
						_localctx = new ExprMultdivContext(new ExprContext(_parentctx, _parentState));
						((ExprMultdivContext)_localctx).v1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(264);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(265);
						((ExprMultdivContext)_localctx).s = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==1 || _la==19) ) {
							((ExprMultdivContext)_localctx).s = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(266); ((ExprMultdivContext)_localctx).v2 = expr(3);
						}
						break;

					case 3:
						{
						_localctx = new ExprSomasubContext(new ExprContext(_parentctx, _parentState));
						((ExprSomasubContext)_localctx).v1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(267);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(268);
						((ExprSomasubContext)_localctx).s = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==35 || _la==37) ) {
							((ExprSomasubContext)_localctx).s = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(269); ((ExprSomasubContext)_localctx).v2 = expr(2);
						}
						break;
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OpnotContext extends ParserRuleContext {
		public OpnotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opnot; }
	 
		public OpnotContext() { }
		public void copyFrom(OpnotContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpnotFatorContext extends OpnotContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public OpnotFatorContext(OpnotContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterOpnotFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitOpnotFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitOpnotFator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpnotRelacionalContext extends OpnotContext {
		public OprelacionalContext oprelacional() {
			return getRuleContext(OprelacionalContext.class,0);
		}
		public OpnotRelacionalContext(OpnotContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterOpnotRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitOpnotRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitOpnotRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpnotContext opnot() throws RecognitionException {
		OpnotContext _localctx = new OpnotContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_opnot);
		try {
			setState(282);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new OpnotRelacionalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(275); match(32);
				setState(276); match(18);
				setState(277); oprelacional();
				setState(278); match(34);
				}
				break;

			case 2:
				_localctx = new OpnotFatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(280); match(32);
				setState(281); fator();
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

	public static class OprelacionalContext extends ParserRuleContext {
		public OprelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprelacional; }
	 
		public OprelacionalContext() { }
		public void copyFrom(OprelacionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperadorRelacionalIgualDifContext extends OprelacionalContext {
		public ExprContext v1;
		public Token s;
		public ExprContext v2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperadorRelacionalIgualDifContext(OprelacionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterOperadorRelacionalIgualDif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitOperadorRelacionalIgualDif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitOperadorRelacionalIgualDif(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperadorRelacionalMaiorMenorContext extends OprelacionalContext {
		public ExprContext v1;
		public Token s;
		public ExprContext v2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperadorRelacionalMaiorMenorContext(OprelacionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterOperadorRelacionalMaiorMenor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitOperadorRelacionalMaiorMenor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitOperadorRelacionalMaiorMenor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperadorRelacionalExprContext extends OprelacionalContext {
		public OpnotContext opnot() {
			return getRuleContext(OpnotContext.class,0);
		}
		public OperadorRelacionalExprContext(OprelacionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterOperadorRelacionalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitOperadorRelacionalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitOperadorRelacionalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperadorRelacionalAndOrContext extends OprelacionalContext {
		public ExprContext v1;
		public Token s;
		public ExprContext v2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperadorRelacionalAndOrContext(OprelacionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterOperadorRelacionalAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitOperadorRelacionalAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitOperadorRelacionalAndOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OprelacionalContext oprelacional() throws RecognitionException {
		OprelacionalContext _localctx = new OprelacionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_oprelacional);
		int _la;
		try {
			setState(297);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new OperadorRelacionalExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(284); opnot();
				}
				break;

			case 2:
				_localctx = new OperadorRelacionalIgualDifContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(285); ((OperadorRelacionalIgualDifContext)_localctx).v1 = expr(0);
				setState(286);
				((OperadorRelacionalIgualDifContext)_localctx).s = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==3 || _la==28) ) {
					((OperadorRelacionalIgualDifContext)_localctx).s = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(287); ((OperadorRelacionalIgualDifContext)_localctx).v2 = expr(0);
				}
				break;

			case 3:
				_localctx = new OperadorRelacionalMaiorMenorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(289); ((OperadorRelacionalMaiorMenorContext)_localctx).v1 = expr(0);
				setState(290);
				((OperadorRelacionalMaiorMenorContext)_localctx).s = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 15) | (1L << 25) | (1L << 27) | (1L << 30))) != 0)) ) {
					((OperadorRelacionalMaiorMenorContext)_localctx).s = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(291); ((OperadorRelacionalMaiorMenorContext)_localctx).v2 = expr(0);
				}
				break;

			case 4:
				_localctx = new OperadorRelacionalAndOrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(293); ((OperadorRelacionalAndOrContext)_localctx).v1 = expr(0);
				setState(294);
				((OperadorRelacionalAndOrContext)_localctx).s = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==5 || _la==9) ) {
					((OperadorRelacionalAndOrContext)_localctx).s = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(295); ((OperadorRelacionalAndOrContext)_localctx).v2 = expr(0);
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

	public static class ParenteseContext extends ParserRuleContext {
		public ParenteseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentese; }
	 
		public ParenteseContext() { }
		public void copyFrom(ParenteseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParensContext extends ParenteseContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ParenteseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FatContext extends ParenteseContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public FatContext(ParenteseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterFat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitFat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitFat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenteseContext parentese() throws RecognitionException {
		ParenteseContext _localctx = new ParenteseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parentese);
		try {
			setState(304);
			switch (_input.LA(1)) {
			case 18:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(299); match(18);
				setState(300); expr(0);
				setState(301); match(34);
				}
				break;
			case STRING:
			case BOOL:
			case ID:
			case REAL:
			case INT:
				_localctx = new FatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(303); fator();
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

	public static class FatorContext extends ParserRuleContext {
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
	 
		public FatorContext() { }
		public void copyFrom(FatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FatorChamadaFuncaoAninhadaContext extends FatorContext {
		public Chamada_de_funcao_aninhadaContext chamada_de_funcao_aninhada() {
			return getRuleContext(Chamada_de_funcao_aninhadaContext.class,0);
		}
		public FatorChamadaFuncaoAninhadaContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterFatorChamadaFuncaoAninhada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitFatorChamadaFuncaoAninhada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitFatorChamadaFuncaoAninhada(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FatorNumeroContext extends FatorContext {
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public FatorNumeroContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterFatorNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitFatorNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitFatorNumero(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FatorStringContext extends FatorContext {
		public TerminalNode STRING() { return getToken(GramaticaSimpleJavaParser.STRING, 0); }
		public FatorStringContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterFatorString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitFatorString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitFatorString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FatorBoolContext extends FatorContext {
		public TerminalNode BOOL() { return getToken(GramaticaSimpleJavaParser.BOOL, 0); }
		public FatorBoolContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterFatorBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitFatorBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitFatorBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FatorIdentificadorContext extends FatorContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public FatorIdentificadorContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterFatorIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitFatorIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitFatorIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fator);
		try {
			setState(311);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new FatorNumeroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(306); numero();
				}
				break;

			case 2:
				_localctx = new FatorBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(307); match(BOOL);
				}
				break;

			case 3:
				_localctx = new FatorChamadaFuncaoAninhadaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(308); chamada_de_funcao_aninhada();
				}
				break;

			case 4:
				_localctx = new FatorStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(309); match(STRING);
				}
				break;

			case 5:
				_localctx = new FatorIdentificadorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(310); identificador();
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

	public static class ValorContext extends ParserRuleContext {
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	 
		public ValorContext() { }
		public void copyFrom(ValorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValorIDContext extends ValorContext {
		public TerminalNode ID() { return getToken(GramaticaSimpleJavaParser.ID, 0); }
		public ValorIDContext(ValorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterValorID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitValorID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitValorID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValorINTContext extends ValorContext {
		public TerminalNode INT() { return getToken(GramaticaSimpleJavaParser.INT, 0); }
		public ValorINTContext(ValorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterValorINT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitValorINT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitValorINT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_valor);
		try {
			setState(315);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new ValorINTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(313); match(INT);
				}
				break;
			case ID:
				_localctx = new ValorIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(314); match(ID);
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

	public static class NumeroContext extends ParserRuleContext {
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
	 
		public NumeroContext() { }
		public void copyFrom(NumeroContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberRealContext extends NumeroContext {
		public TerminalNode REAL() { return getToken(GramaticaSimpleJavaParser.REAL, 0); }
		public NumberRealContext(NumeroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterNumberReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitNumberReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitNumberReal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberIntContext extends NumeroContext {
		public TerminalNode INT() { return getToken(GramaticaSimpleJavaParser.INT, 0); }
		public NumberIntContext(NumeroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterNumberInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitNumberInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitNumberInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_numero);
		try {
			setState(319);
			switch (_input.LA(1)) {
			case REAL:
				_localctx = new NumberRealContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(317); match(REAL);
				}
				break;
			case INT:
				_localctx = new NumberIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(318); match(INT);
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

	public static class IdentificadorContext extends ParserRuleContext {
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
	 
		public IdentificadorContext() { }
		public void copyFrom(IdentificadorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdContext extends IdentificadorContext {
		public TerminalNode ID() { return getToken(GramaticaSimpleJavaParser.ID, 0); }
		public IdContext(IdentificadorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpleJavaListener ) ((GramaticaSimpleJavaListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpleJavaVisitor ) return ((GramaticaSimpleJavaVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_identificador);
		try {
			_localctx = new IdContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(321); match(ID);
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
		case 19: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 3);

		case 1: return precpred(_ctx, 2);

		case 2: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u0146\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\7\2=\n\2\f\2\16\2@\13\2"+
		"\3\2\7\2C\n\2\f\2\16\2F\13\2\3\2\3\2\3\2\3\3\7\3L\n\3\f\3\16\3O\13\3\3"+
		"\3\6\3R\n\3\r\3\16\3S\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\5\6e\n\6\3\7\3\7\5\7i\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"r\n\b\f\b\16\bu\13\b\3\b\7\bx\n\b\f\b\16\b{\13\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008b\n\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\5\f\u0094\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009c\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00b0\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u00c0\n\21\f\21\16\21\u00c3\13\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00d0\n\23"+
		"\f\23\16\23\u00d3\13\23\3\23\3\23\5\23\u00d7\n\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u00df\n\23\f\23\16\23\u00e2\13\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ee\n\23\3\23\3\23\3\23\7\23\u00f3"+
		"\n\23\f\23\16\23\u00f6\13\23\3\23\3\23\5\23\u00fa\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u0106\n\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u0111\n\25\f\25\16\25\u0114\13\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u011d\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u012c\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0133\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u013a\n\31\3"+
		"\32\3\32\5\32\u013e\n\32\3\33\3\33\5\33\u0142\n\33\3\34\3\34\3\34\2\3"+
		"(\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\b\4"+
		"\2()++\4\2\3\3\25\25\4\2%%\'\'\4\2\5\5\36\36\6\2\21\21\33\33\35\35  \4"+
		"\2\7\7\13\13\u0157\28\3\2\2\2\4M\3\2\2\2\6U\3\2\2\2\bY\3\2\2\2\nd\3\2"+
		"\2\2\fh\3\2\2\2\16j\3\2\2\2\20~\3\2\2\2\22\u008a\3\2\2\2\24\u008c\3\2"+
		"\2\2\26\u0093\3\2\2\2\30\u009b\3\2\2\2\32\u00af\3\2\2\2\34\u00b1\3\2\2"+
		"\2\36\u00b7\3\2\2\2 \u00bc\3\2\2\2\"\u00c6\3\2\2\2$\u00f9\3\2\2\2&\u00fb"+
		"\3\2\2\2(\u0105\3\2\2\2*\u011c\3\2\2\2,\u012b\3\2\2\2.\u0132\3\2\2\2\60"+
		"\u0139\3\2\2\2\62\u013d\3\2\2\2\64\u0141\3\2\2\2\66\u0143\3\2\2\289\7"+
		"!\2\29:\7*\2\2:>\7\n\2\2;=\5\f\7\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2"+
		"\2\2?D\3\2\2\2@>\3\2\2\2AC\5\16\b\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3"+
		"\2\2\2EG\3\2\2\2FD\3\2\2\2GH\5\4\3\2HI\7\r\2\2I\3\3\2\2\2JL\5\f\7\2KJ"+
		"\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NQ\3\2\2\2OM\3\2\2\2PR\5\32\16\2"+
		"QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\5\3\2\2\2UV\5\26\f\2VW\5\n\6"+
		"\2WX\7\t\2\2X\7\3\2\2\2YZ\7\27\2\2Z[\5\26\f\2[\\\7*\2\2\\]\7\f\2\2]^\t"+
		"\2\2\2^_\7\t\2\2_\t\3\2\2\2`a\7*\2\2ab\7\26\2\2be\5\n\6\2ce\7*\2\2d`\3"+
		"\2\2\2dc\3\2\2\2e\13\3\2\2\2fi\5\6\4\2gi\5\b\5\2hf\3\2\2\2hg\3\2\2\2i"+
		"\r\3\2\2\2jk\5\26\f\2kl\7*\2\2lm\7\24\2\2mn\5\22\n\2no\7$\2\2os\7\n\2"+
		"\2pr\5\f\7\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2ty\3\2\2\2us\3\2\2"+
		"\2vx\5\32\16\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2"+
		"\2\2|}\7\r\2\2}\17\3\2\2\2~\177\7\4\2\2\177\u0080\7\24\2\2\u0080\u0081"+
		"\5(\25\2\u0081\u0082\7$\2\2\u0082\u0083\7\t\2\2\u0083\21\3\2\2\2\u0084"+
		"\u0085\5\24\13\2\u0085\u0086\7\26\2\2\u0086\u0087\5\22\n\2\u0087\u008b"+
		"\3\2\2\2\u0088\u008b\5\24\13\2\u0089\u008b\3\2\2\2\u008a\u0084\3\2\2\2"+
		"\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\23\3\2\2\2\u008c\u008d"+
		"\5\26\f\2\u008d\u008e\7*\2\2\u008e\25\3\2\2\2\u008f\u0094\7\31\2\2\u0090"+
		"\u0094\7\30\2\2\u0091\u0094\7\37\2\2\u0092\u0094\7\6\2\2\u0093\u008f\3"+
		"\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\27\3\2\2\2\u0095\u0096\5(\25\2\u0096\u0097\7\26\2\2\u0097\u0098\5\30"+
		"\r\2\u0098\u009c\3\2\2\2\u0099\u009c\5(\25\2\u009a\u009c\3\2\2\2\u009b"+
		"\u0095\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\31\3\2\2"+
		"\2\u009d\u009e\7\23\2\2\u009e\u009f\7\24\2\2\u009f\u00a0\5\30\r\2\u00a0"+
		"\u00a1\7$\2\2\u00a1\u00a2\7\t\2\2\u00a2\u00b0\3\2\2\2\u00a3\u00a4\7\34"+
		"\2\2\u00a4\u00a5\7\24\2\2\u00a5\u00a6\5\n\6\2\u00a6\u00a7\7$\2\2\u00a7"+
		"\u00a8\7\t\2\2\u00a8\u00b0\3\2\2\2\u00a9\u00b0\5$\23\2\u00aa\u00b0\5&"+
		"\24\2\u00ab\u00ac\7\22\2\2\u00ac\u00b0\7\t\2\2\u00ad\u00b0\5\34\17\2\u00ae"+
		"\u00b0\5\20\t\2\u00af\u009d\3\2\2\2\u00af\u00a3\3\2\2\2\u00af\u00a9\3"+
		"\2\2\2\u00af\u00aa\3\2\2\2\u00af\u00ab\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\33\3\2\2\2\u00b1\u00b2\7*\2\2\u00b2\u00b3\7\24\2"+
		"\2\u00b3\u00b4\5\30\r\2\u00b4\u00b5\7$\2\2\u00b5\u00b6\7\t\2\2\u00b6\35"+
		"\3\2\2\2\u00b7\u00b8\7*\2\2\u00b8\u00b9\7\24\2\2\u00b9\u00ba\5\30\r\2"+
		"\u00ba\u00bb\7$\2\2\u00bb\37\3\2\2\2\u00bc\u00bd\7#\2\2\u00bd\u00c1\7"+
		"\n\2\2\u00be\u00c0\5\32\16\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c4\u00c5\7\r\2\2\u00c5!\3\2\2\2\u00c6\u00c7\7&\2\2\u00c7\u00c8"+
		"\5\62\32\2\u00c8#\3\2\2\2\u00c9\u00ca\7\20\2\2\u00ca\u00cb\7\24\2\2\u00cb"+
		"\u00cc\5,\27\2\u00cc\u00cd\7$\2\2\u00cd\u00d1\7\n\2\2\u00ce\u00d0\5\32"+
		"\16\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d6\7\r"+
		"\2\2\u00d5\u00d7\5 \21\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00fa\3\2\2\2\u00d8\u00d9\7\b\2\2\u00d9\u00da\7\24\2\2\u00da\u00db\5"+
		",\27\2\u00db\u00dc\7$\2\2\u00dc\u00e0\7\n\2\2\u00dd\u00df\5\32\16\2\u00de"+
		"\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7\r\2\2\u00e4"+
		"\u00fa\3\2\2\2\u00e5\u00e6\7\17\2\2\u00e6\u00e7\7\24\2\2\u00e7\u00e8\5"+
		"\66\34\2\u00e8\u00e9\7\f\2\2\u00e9\u00ea\5\62\32\2\u00ea\u00eb\7\32\2"+
		"\2\u00eb\u00ed\5\62\32\2\u00ec\u00ee\5\"\22\2\u00ed\u00ec\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7$\2\2\u00f0\u00f4\7\n"+
		"\2\2\u00f1\u00f3\5\32\16\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f7\u00f8\7\r\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00c9\3\2\2\2\u00f9"+
		"\u00d8\3\2\2\2\u00f9\u00e5\3\2\2\2\u00fa%\3\2\2\2\u00fb\u00fc\7*\2\2\u00fc"+
		"\u00fd\7\f\2\2\u00fd\u00fe\5(\25\2\u00fe\u00ff\7\t\2\2\u00ff\'\3\2\2\2"+
		"\u0100\u0101\b\25\1\2\u0101\u0102\7\'\2\2\u0102\u0106\5(\25\6\u0103\u0106"+
		"\5.\30\2\u0104\u0106\5*\26\2\u0105\u0100\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0104\3\2\2\2\u0106\u0112\3\2\2\2\u0107\u0108\f\5\2\2\u0108\u0109\7\16"+
		"\2\2\u0109\u0111\5(\25\6\u010a\u010b\f\4\2\2\u010b\u010c\t\3\2\2\u010c"+
		"\u0111\5(\25\5\u010d\u010e\f\3\2\2\u010e\u010f\t\4\2\2\u010f\u0111\5("+
		"\25\4\u0110\u0107\3\2\2\2\u0110\u010a\3\2\2\2\u0110\u010d\3\2\2\2\u0111"+
		"\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113)\3\2\2\2"+
		"\u0114\u0112\3\2\2\2\u0115\u0116\7\"\2\2\u0116\u0117\7\24\2\2\u0117\u0118"+
		"\5,\27\2\u0118\u0119\7$\2\2\u0119\u011d\3\2\2\2\u011a\u011b\7\"\2\2\u011b"+
		"\u011d\5\60\31\2\u011c\u0115\3\2\2\2\u011c\u011a\3\2\2\2\u011d+\3\2\2"+
		"\2\u011e\u012c\5*\26\2\u011f\u0120\5(\25\2\u0120\u0121\t\5\2\2\u0121\u0122"+
		"\5(\25\2\u0122\u012c\3\2\2\2\u0123\u0124\5(\25\2\u0124\u0125\t\6\2\2\u0125"+
		"\u0126\5(\25\2\u0126\u012c\3\2\2\2\u0127\u0128\5(\25\2\u0128\u0129\t\7"+
		"\2\2\u0129\u012a\5(\25\2\u012a\u012c\3\2\2\2\u012b\u011e\3\2\2\2\u012b"+
		"\u011f\3\2\2\2\u012b\u0123\3\2\2\2\u012b\u0127\3\2\2\2\u012c-\3\2\2\2"+
		"\u012d\u012e\7\24\2\2\u012e\u012f\5(\25\2\u012f\u0130\7$\2\2\u0130\u0133"+
		"\3\2\2\2\u0131\u0133\5\60\31\2\u0132\u012d\3\2\2\2\u0132\u0131\3\2\2\2"+
		"\u0133/\3\2\2\2\u0134\u013a\5\64\33\2\u0135\u013a\7)\2\2\u0136\u013a\5"+
		"\36\20\2\u0137\u013a\7(\2\2\u0138\u013a\5\66\34\2\u0139\u0134\3\2\2\2"+
		"\u0139\u0135\3\2\2\2\u0139\u0136\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u0138"+
		"\3\2\2\2\u013a\61\3\2\2\2\u013b\u013e\7,\2\2\u013c\u013e\7*\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\63\3\2\2\2\u013f\u0142\7+\2\2"+
		"\u0140\u0142\7,\2\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142\65\3"+
		"\2\2\2\u0143\u0144\7*\2\2\u0144\67\3\2\2\2\36>DMSdhsy\u008a\u0093\u009b"+
		"\u00af\u00c1\u00d1\u00d6\u00e0\u00ed\u00f4\u00f9\u0105\u0110\u0112\u011c"+
		"\u012b\u0132\u0139\u013d\u0141";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}