// Generated from /home/mtdsousa/workspace/antlr4-verilog-python/extra/grammars-v4-2/verilog/verilog/VerilogPreParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VerilogPreParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EM=1, EMEQ=2, EMEQEQ=3, DQ=4, HA=5, DL=6, DLFULLSKEW=7, DLHOLD=8, DLNOCHANGE=9, 
		DLPERIOD=10, DLRECOVERY=11, DLRECREM=12, DLREMOVAL=13, DLSETUP=14, DLSETUPHOLD=15, 
		DLSKEW=16, DLTIMESKEW=17, DLWIDTH=18, MO=19, AM=20, AMAM=21, AMAMAM=22, 
		LP=23, RP=24, AS=25, ASAS=26, ASSL=27, ASGT=28, PL=29, PLCL=30, CO=31, 
		MI=32, MICL=33, MIGT=34, MIINCDIR=35, DT=36, SL=37, SLAS=38, SLSL=39, 
		CL=40, SC=41, LT=42, LTLT=43, LTLTLT=44, LTEQ=45, EQ=46, EQEQ=47, EQEQEQ=48, 
		EQGT=49, GT=50, GTEQ=51, GTGT=52, GTGTGT=53, QM=54, AT=55, PATHPULSEDL=56, 
		LB=57, BSAP=58, RB=59, CA=60, CATI=61, GA=62, ALWAYS=63, AND=64, ASSIGN=65, 
		AUTOMATIC=66, BEGIN=67, BUF=68, BUFIFZERO=69, BUFIFONE=70, CASE=71, CASEX=72, 
		CASEZ=73, CELL=74, CMOS=75, CONFIG=76, DEASSIGN=77, DEFAULT=78, DEFPARAM=79, 
		DESIGN=80, DISABLE=81, EDGE=82, ELSE=83, END=84, ENDCASE=85, ENDCONFIG=86, 
		ENDFUNCTION=87, ENDGENERATE=88, ENDMODULE=89, ENDPRIMITIVE=90, ENDSPECIFY=91, 
		ENDTABLE=92, ENDTASK=93, EVENT=94, FOR=95, FORCE=96, FOREVER=97, FORK=98, 
		FUNCTION=99, GENERATE=100, GENVAR=101, HIGHZZERO=102, HIGHZONE=103, IF=104, 
		IFNONE=105, INCLUDE=106, INITIAL=107, INOUT=108, INPUT=109, INSTANCE=110, 
		INTEGER=111, JOIN=112, LARGE=113, LIBLIST=114, LIBRARY=115, LOCALPARAM=116, 
		MACROMODULE=117, MEDIUM=118, MODULE=119, NAND=120, NEGEDGE=121, NMOS=122, 
		NOR=123, NOSHOWCANCELLED=124, NOT=125, NOTIFZERO=126, NOTIFONE=127, OR=128, 
		OUTPUT=129, PARAMETER=130, PMOS=131, POSEDGE=132, PRIMITIVE=133, PULLZERO=134, 
		PULLONE=135, PULLDOWN=136, PULLUP=137, PULSESTYLE_ONDETECT=138, PULSESTYLE_ONEVENT=139, 
		RCMOS=140, REAL=141, REALTIME=142, REG=143, RELEASE=144, REPEAT=145, RNMOS=146, 
		RPMOS=147, RTRAN=148, RTRANIFZERO=149, RTRANIFONE=150, SCALARED=151, SHOWCANCELLED=152, 
		SIGNED=153, SMALL=154, SPECIFY=155, SPECPARAM=156, STRONGZERO=157, STRONGONE=158, 
		SUPPLYZERO=159, SUPPLYONE=160, TABLE=161, TASK=162, TIME=163, TRAN=164, 
		TRANIFZERO=165, TRANIFONE=166, TRI=167, TRIZERO=168, TRIONE=169, TRIAND=170, 
		TRIOR=171, TRIREG=172, USE=173, UWIRE=174, VECTORED=175, WAIT=176, WAND=177, 
		WEAKZERO=178, WEAKONE=179, WHILE=180, WIRE=181, WOR=182, XNOR=183, XOR=184, 
		LC=185, VL=186, VLVL=187, RC=188, TI=189, TIAM=190, TICA=191, TIVL=192, 
		DECIMAL_NUMBER=193, BINARY_NUMBER=194, OCTAL_NUMBER=195, HEX_NUMBER=196, 
		REAL_NUMBER=197, STRING=198, COMMENT=199, ESCAPED_IDENTIFIER=200, SIMPLE_IDENTIFIER=201, 
		SYSTEM_TF_IDENTIFIER=202, WHITE_SPACE=203, FILE_PATH_SPEC=204, INIT_VAL=205, 
		OUTPUT_SYMBOL=206, LEVEL_SYMBOL=207, EDGE_SYMBOL=208, EDGE_DESCRIPTOR=209, 
		SCALAR_CONSTANT=210, BEGIN_KEYWORDS_DIRECTIVE=211, CELLDEFINE_DIRECTIVE=212, 
		DEFAULT_NETTYPE_DIRECTIVE=213, DEFINE_DIRECTIVE=214, ELSE_DIRECTIVE=215, 
		ELSIF_DIRECTIVE=216, END_KEYWORDS_DIRECTIVE=217, ENDCELLDEFINE_DIRECTIVE=218, 
		ENDIF_DIRECTIVE=219, IFDEF_DIRECTIVE=220, IFNDEF_DIRECTIVE=221, INCLUDE_DIRECTIVE=222, 
		LINE_DIRECTIVE=223, NOUNCONNECTED_DRIVE_DIRECTIVE=224, PRAGMA_DIRECTIVE=225, 
		RESETALL_DIRECTIVE=226, TIMESCALE_DIRECTIVE=227, UNCONNECTED_DRIVE_DIRECTIVE=228, 
		UNDEF_DIRECTIVE=229, MACRO_USAGE=230, DIRECTIVE_TEXT=231, DIRECTIVE_IDENTIFIER=232, 
		DIRECTIVE_COMMENT=233, DIRECTIVE_WHITE_SPACE=234, DIRECTIVE_NEWLINE=235, 
		MACRO_TEXT=236, MT_ESC_NEWLINE=237, SOURCE_TEXT=238;
	public static final int
		RULE_source_text = 0, RULE_compiler_directive = 1, RULE_begin_keywords_directive = 2, 
		RULE_celldefine_directive = 3, RULE_default_nettype_directive = 4, RULE_endcelldefine_directive = 5, 
		RULE_end_keywords_directive = 6, RULE_ifdef_directive = 7, RULE_ifndef_directive = 8, 
		RULE_include_directive = 9, RULE_line_directive = 10, RULE_nounconnected_drive_directive = 11, 
		RULE_pragma_directive = 12, RULE_resetall_directive = 13, RULE_text_macro_definition = 14, 
		RULE_text_macro_usage = 15, RULE_timescale_directive = 16, RULE_unconnected_drive_directive = 17, 
		RULE_undef_directive = 18, RULE_elsif_directive = 19, RULE_else_directive = 20, 
		RULE_endif_directive = 21, RULE_text_macro_identifier = 22, RULE_ifdef_group_of_lines = 23, 
		RULE_ifndef_group_of_lines = 24, RULE_elsif_group_of_lines = 25, RULE_else_group_of_lines = 26, 
		RULE_macro_text = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"source_text", "compiler_directive", "begin_keywords_directive", "celldefine_directive", 
			"default_nettype_directive", "endcelldefine_directive", "end_keywords_directive", 
			"ifdef_directive", "ifndef_directive", "include_directive", "line_directive", 
			"nounconnected_drive_directive", "pragma_directive", "resetall_directive", 
			"text_macro_definition", "text_macro_usage", "timescale_directive", "unconnected_drive_directive", 
			"undef_directive", "elsif_directive", "else_directive", "endif_directive", 
			"text_macro_identifier", "ifdef_group_of_lines", "ifndef_group_of_lines", 
			"elsif_group_of_lines", "else_group_of_lines", "macro_text"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'!='", "'!=='", "'\"'", "'#'", "'$'", "'$fullskew'", "'$hold'", 
			"'$nochange'", "'$period'", "'$recovery'", "'$recrem'", "'$removal'", 
			"'$setup'", "'$setuphold'", "'$skew'", "'$timeskew'", "'$width'", "'%'", 
			"'&'", "'&&'", "'&&&'", "'('", "')'", "'*'", "'**'", "'*/'", "'*>'", 
			"'+'", "'+:'", "','", "'-'", "'-:'", "'->'", "'-incdir'", "'.'", "'/'", 
			"'/*'", "'//'", "':'", "';'", "'<'", "'<<'", "'<<<'", "'<='", "'='", 
			"'=='", "'==='", "'=>'", "'>'", "'>='", "'>>'", "'>>>'", "'?'", "'@'", 
			"'PATHPULSE$'", "'['", "'''", "']'", "'^'", "'^~'", null, "'always'", 
			"'and'", "'assign'", "'automatic'", "'begin'", "'buf'", "'bufif0'", "'bufif1'", 
			"'case'", "'casex'", "'casez'", "'cell'", "'cmos'", "'config'", "'deassign'", 
			"'default'", "'defparam'", "'design'", "'disable'", "'edge'", "'else'", 
			"'end'", "'endcase'", "'endconfig'", "'endfunction'", "'endgenerate'", 
			"'endmodule'", "'endprimitive'", "'endspecify'", "'endtable'", "'endtask'", 
			"'event'", "'for'", "'force'", "'forever'", "'fork'", "'function'", "'generate'", 
			"'genvar'", "'highz0'", "'highz1'", "'if'", "'ifnone'", "'include'", 
			"'initial'", "'inout'", "'input'", "'instance'", "'integer'", "'join'", 
			"'large'", "'liblist'", "'library'", "'localparam'", "'macromodule'", 
			"'medium'", "'module'", "'nand'", "'negedge'", "'nmos'", "'nor'", "'noshowcancelled'", 
			"'not'", "'notif0'", "'notif1'", "'or'", "'output'", "'parameter'", "'pmos'", 
			"'posedge'", "'primitive'", "'pull0'", "'pull1'", "'pulldown'", "'pullup'", 
			"'pulsestyle_ondetect'", "'pulsestyle_onevent'", "'rcmos'", "'real'", 
			"'realtime'", "'reg'", "'release'", "'repeat'", "'rnmos'", "'rpmos'", 
			"'rtran'", "'rtranif0'", "'rtranif1'", "'scalared'", "'showcancelled'", 
			"'signed'", "'small'", "'specify'", "'specparam'", "'strong0'", "'strong1'", 
			"'supply0'", "'supply1'", "'table'", "'task'", "'time'", "'tran'", "'tranif0'", 
			"'tranif1'", "'tri'", "'tri0'", "'tri1'", "'triand'", "'trior'", "'trireg'", 
			"'use'", "'uwire'", "'vectored'", "'wait'", "'wand'", "'weak0'", "'weak1'", 
			"'while'", "'wire'", "'wor'", "'xnor'", "'xor'", "'{'", "'|'", "'||'", 
			"'}'", "'~'", "'~&'", "'~^'", "'~|'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'celldefine'", null, null, null, null, "'end_keywords'", "'endcelldefine'", 
			null, null, null, null, null, "'nounconnected_drive'", null, "'resetall'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EM", "EMEQ", "EMEQEQ", "DQ", "HA", "DL", "DLFULLSKEW", "DLHOLD", 
			"DLNOCHANGE", "DLPERIOD", "DLRECOVERY", "DLRECREM", "DLREMOVAL", "DLSETUP", 
			"DLSETUPHOLD", "DLSKEW", "DLTIMESKEW", "DLWIDTH", "MO", "AM", "AMAM", 
			"AMAMAM", "LP", "RP", "AS", "ASAS", "ASSL", "ASGT", "PL", "PLCL", "CO", 
			"MI", "MICL", "MIGT", "MIINCDIR", "DT", "SL", "SLAS", "SLSL", "CL", "SC", 
			"LT", "LTLT", "LTLTLT", "LTEQ", "EQ", "EQEQ", "EQEQEQ", "EQGT", "GT", 
			"GTEQ", "GTGT", "GTGTGT", "QM", "AT", "PATHPULSEDL", "LB", "BSAP", "RB", 
			"CA", "CATI", "GA", "ALWAYS", "AND", "ASSIGN", "AUTOMATIC", "BEGIN", 
			"BUF", "BUFIFZERO", "BUFIFONE", "CASE", "CASEX", "CASEZ", "CELL", "CMOS", 
			"CONFIG", "DEASSIGN", "DEFAULT", "DEFPARAM", "DESIGN", "DISABLE", "EDGE", 
			"ELSE", "END", "ENDCASE", "ENDCONFIG", "ENDFUNCTION", "ENDGENERATE", 
			"ENDMODULE", "ENDPRIMITIVE", "ENDSPECIFY", "ENDTABLE", "ENDTASK", "EVENT", 
			"FOR", "FORCE", "FOREVER", "FORK", "FUNCTION", "GENERATE", "GENVAR", 
			"HIGHZZERO", "HIGHZONE", "IF", "IFNONE", "INCLUDE", "INITIAL", "INOUT", 
			"INPUT", "INSTANCE", "INTEGER", "JOIN", "LARGE", "LIBLIST", "LIBRARY", 
			"LOCALPARAM", "MACROMODULE", "MEDIUM", "MODULE", "NAND", "NEGEDGE", "NMOS", 
			"NOR", "NOSHOWCANCELLED", "NOT", "NOTIFZERO", "NOTIFONE", "OR", "OUTPUT", 
			"PARAMETER", "PMOS", "POSEDGE", "PRIMITIVE", "PULLZERO", "PULLONE", "PULLDOWN", 
			"PULLUP", "PULSESTYLE_ONDETECT", "PULSESTYLE_ONEVENT", "RCMOS", "REAL", 
			"REALTIME", "REG", "RELEASE", "REPEAT", "RNMOS", "RPMOS", "RTRAN", "RTRANIFZERO", 
			"RTRANIFONE", "SCALARED", "SHOWCANCELLED", "SIGNED", "SMALL", "SPECIFY", 
			"SPECPARAM", "STRONGZERO", "STRONGONE", "SUPPLYZERO", "SUPPLYONE", "TABLE", 
			"TASK", "TIME", "TRAN", "TRANIFZERO", "TRANIFONE", "TRI", "TRIZERO", 
			"TRIONE", "TRIAND", "TRIOR", "TRIREG", "USE", "UWIRE", "VECTORED", "WAIT", 
			"WAND", "WEAKZERO", "WEAKONE", "WHILE", "WIRE", "WOR", "XNOR", "XOR", 
			"LC", "VL", "VLVL", "RC", "TI", "TIAM", "TICA", "TIVL", "DECIMAL_NUMBER", 
			"BINARY_NUMBER", "OCTAL_NUMBER", "HEX_NUMBER", "REAL_NUMBER", "STRING", 
			"COMMENT", "ESCAPED_IDENTIFIER", "SIMPLE_IDENTIFIER", "SYSTEM_TF_IDENTIFIER", 
			"WHITE_SPACE", "FILE_PATH_SPEC", "INIT_VAL", "OUTPUT_SYMBOL", "LEVEL_SYMBOL", 
			"EDGE_SYMBOL", "EDGE_DESCRIPTOR", "SCALAR_CONSTANT", "BEGIN_KEYWORDS_DIRECTIVE", 
			"CELLDEFINE_DIRECTIVE", "DEFAULT_NETTYPE_DIRECTIVE", "DEFINE_DIRECTIVE", 
			"ELSE_DIRECTIVE", "ELSIF_DIRECTIVE", "END_KEYWORDS_DIRECTIVE", "ENDCELLDEFINE_DIRECTIVE", 
			"ENDIF_DIRECTIVE", "IFDEF_DIRECTIVE", "IFNDEF_DIRECTIVE", "INCLUDE_DIRECTIVE", 
			"LINE_DIRECTIVE", "NOUNCONNECTED_DRIVE_DIRECTIVE", "PRAGMA_DIRECTIVE", 
			"RESETALL_DIRECTIVE", "TIMESCALE_DIRECTIVE", "UNCONNECTED_DRIVE_DIRECTIVE", 
			"UNDEF_DIRECTIVE", "MACRO_USAGE", "DIRECTIVE_TEXT", "DIRECTIVE_IDENTIFIER", 
			"DIRECTIVE_COMMENT", "DIRECTIVE_WHITE_SPACE", "DIRECTIVE_NEWLINE", "MACRO_TEXT", 
			"MT_ESC_NEWLINE", "SOURCE_TEXT"
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
	public String getGrammarFileName() { return "VerilogPreParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VerilogPreParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Source_textContext extends ParserRuleContext {
		public List<Compiler_directiveContext> compiler_directive() {
			return getRuleContexts(Compiler_directiveContext.class);
		}
		public Compiler_directiveContext compiler_directive(int i) {
			return getRuleContext(Compiler_directiveContext.class,i);
		}
		public Source_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterSource_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitSource_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitSource_text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_textContext source_text() throws RecognitionException {
		Source_textContext _localctx = new Source_textContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_source_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GA) {
				{
				{
				setState(56);
				compiler_directive();
				}
				}
				setState(61);
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

	public static class Compiler_directiveContext extends ParserRuleContext {
		public Begin_keywords_directiveContext begin_keywords_directive() {
			return getRuleContext(Begin_keywords_directiveContext.class,0);
		}
		public Celldefine_directiveContext celldefine_directive() {
			return getRuleContext(Celldefine_directiveContext.class,0);
		}
		public Default_nettype_directiveContext default_nettype_directive() {
			return getRuleContext(Default_nettype_directiveContext.class,0);
		}
		public Endcelldefine_directiveContext endcelldefine_directive() {
			return getRuleContext(Endcelldefine_directiveContext.class,0);
		}
		public End_keywords_directiveContext end_keywords_directive() {
			return getRuleContext(End_keywords_directiveContext.class,0);
		}
		public Ifdef_directiveContext ifdef_directive() {
			return getRuleContext(Ifdef_directiveContext.class,0);
		}
		public Ifndef_directiveContext ifndef_directive() {
			return getRuleContext(Ifndef_directiveContext.class,0);
		}
		public Include_directiveContext include_directive() {
			return getRuleContext(Include_directiveContext.class,0);
		}
		public Line_directiveContext line_directive() {
			return getRuleContext(Line_directiveContext.class,0);
		}
		public Nounconnected_drive_directiveContext nounconnected_drive_directive() {
			return getRuleContext(Nounconnected_drive_directiveContext.class,0);
		}
		public Pragma_directiveContext pragma_directive() {
			return getRuleContext(Pragma_directiveContext.class,0);
		}
		public Resetall_directiveContext resetall_directive() {
			return getRuleContext(Resetall_directiveContext.class,0);
		}
		public Text_macro_definitionContext text_macro_definition() {
			return getRuleContext(Text_macro_definitionContext.class,0);
		}
		public Text_macro_usageContext text_macro_usage() {
			return getRuleContext(Text_macro_usageContext.class,0);
		}
		public Timescale_directiveContext timescale_directive() {
			return getRuleContext(Timescale_directiveContext.class,0);
		}
		public Unconnected_drive_directiveContext unconnected_drive_directive() {
			return getRuleContext(Unconnected_drive_directiveContext.class,0);
		}
		public Undef_directiveContext undef_directive() {
			return getRuleContext(Undef_directiveContext.class,0);
		}
		public Compiler_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compiler_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterCompiler_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitCompiler_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitCompiler_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compiler_directiveContext compiler_directive() throws RecognitionException {
		Compiler_directiveContext _localctx = new Compiler_directiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_compiler_directive);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				begin_keywords_directive();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				celldefine_directive();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				default_nettype_directive();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				endcelldefine_directive();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				end_keywords_directive();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				ifdef_directive();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				ifndef_directive();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(69);
				include_directive();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(70);
				line_directive();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(71);
				nounconnected_drive_directive();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(72);
				pragma_directive();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(73);
				resetall_directive();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(74);
				text_macro_definition();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(75);
				text_macro_usage();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(76);
				timescale_directive();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(77);
				unconnected_drive_directive();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(78);
				undef_directive();
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

	public static class Begin_keywords_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode BEGIN_KEYWORDS_DIRECTIVE() { return getToken(VerilogPreParser.BEGIN_KEYWORDS_DIRECTIVE, 0); }
		public TerminalNode DIRECTIVE_TEXT() { return getToken(VerilogPreParser.DIRECTIVE_TEXT, 0); }
		public Begin_keywords_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_keywords_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterBegin_keywords_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitBegin_keywords_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitBegin_keywords_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_keywords_directiveContext begin_keywords_directive() throws RecognitionException {
		Begin_keywords_directiveContext _localctx = new Begin_keywords_directiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_begin_keywords_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(GA);
			setState(82);
			match(BEGIN_KEYWORDS_DIRECTIVE);
			setState(83);
			match(DIRECTIVE_TEXT);
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

	public static class Celldefine_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode CELLDEFINE_DIRECTIVE() { return getToken(VerilogPreParser.CELLDEFINE_DIRECTIVE, 0); }
		public Celldefine_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_celldefine_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterCelldefine_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitCelldefine_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitCelldefine_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Celldefine_directiveContext celldefine_directive() throws RecognitionException {
		Celldefine_directiveContext _localctx = new Celldefine_directiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_celldefine_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(GA);
			setState(86);
			match(CELLDEFINE_DIRECTIVE);
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

	public static class Default_nettype_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode DEFAULT_NETTYPE_DIRECTIVE() { return getToken(VerilogPreParser.DEFAULT_NETTYPE_DIRECTIVE, 0); }
		public TerminalNode DIRECTIVE_TEXT() { return getToken(VerilogPreParser.DIRECTIVE_TEXT, 0); }
		public Default_nettype_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_nettype_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterDefault_nettype_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitDefault_nettype_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitDefault_nettype_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_nettype_directiveContext default_nettype_directive() throws RecognitionException {
		Default_nettype_directiveContext _localctx = new Default_nettype_directiveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_default_nettype_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(GA);
			setState(89);
			match(DEFAULT_NETTYPE_DIRECTIVE);
			setState(90);
			match(DIRECTIVE_TEXT);
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

	public static class Endcelldefine_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode ENDCELLDEFINE_DIRECTIVE() { return getToken(VerilogPreParser.ENDCELLDEFINE_DIRECTIVE, 0); }
		public Endcelldefine_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endcelldefine_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterEndcelldefine_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitEndcelldefine_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitEndcelldefine_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Endcelldefine_directiveContext endcelldefine_directive() throws RecognitionException {
		Endcelldefine_directiveContext _localctx = new Endcelldefine_directiveContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_endcelldefine_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(GA);
			setState(93);
			match(ENDCELLDEFINE_DIRECTIVE);
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

	public static class End_keywords_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode END_KEYWORDS_DIRECTIVE() { return getToken(VerilogPreParser.END_KEYWORDS_DIRECTIVE, 0); }
		public End_keywords_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_keywords_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterEnd_keywords_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitEnd_keywords_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitEnd_keywords_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_keywords_directiveContext end_keywords_directive() throws RecognitionException {
		End_keywords_directiveContext _localctx = new End_keywords_directiveContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_end_keywords_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(GA);
			setState(96);
			match(END_KEYWORDS_DIRECTIVE);
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

	public static class Ifdef_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode IFDEF_DIRECTIVE() { return getToken(VerilogPreParser.IFDEF_DIRECTIVE, 0); }
		public Text_macro_identifierContext text_macro_identifier() {
			return getRuleContext(Text_macro_identifierContext.class,0);
		}
		public Ifdef_group_of_linesContext ifdef_group_of_lines() {
			return getRuleContext(Ifdef_group_of_linesContext.class,0);
		}
		public Endif_directiveContext endif_directive() {
			return getRuleContext(Endif_directiveContext.class,0);
		}
		public List<Elsif_directiveContext> elsif_directive() {
			return getRuleContexts(Elsif_directiveContext.class);
		}
		public Elsif_directiveContext elsif_directive(int i) {
			return getRuleContext(Elsif_directiveContext.class,i);
		}
		public Else_directiveContext else_directive() {
			return getRuleContext(Else_directiveContext.class,0);
		}
		public Ifdef_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifdef_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterIfdef_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitIfdef_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitIfdef_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ifdef_directiveContext ifdef_directive() throws RecognitionException {
		Ifdef_directiveContext _localctx = new Ifdef_directiveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifdef_directive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(GA);
			setState(99);
			match(IFDEF_DIRECTIVE);
			setState(100);
			text_macro_identifier();
			setState(101);
			ifdef_group_of_lines();
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					elsif_directive();
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(108);
				else_directive();
				}
				break;
			}
			setState(111);
			endif_directive();
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

	public static class Ifndef_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode IFNDEF_DIRECTIVE() { return getToken(VerilogPreParser.IFNDEF_DIRECTIVE, 0); }
		public Text_macro_identifierContext text_macro_identifier() {
			return getRuleContext(Text_macro_identifierContext.class,0);
		}
		public Ifndef_group_of_linesContext ifndef_group_of_lines() {
			return getRuleContext(Ifndef_group_of_linesContext.class,0);
		}
		public Endif_directiveContext endif_directive() {
			return getRuleContext(Endif_directiveContext.class,0);
		}
		public List<Elsif_directiveContext> elsif_directive() {
			return getRuleContexts(Elsif_directiveContext.class);
		}
		public Elsif_directiveContext elsif_directive(int i) {
			return getRuleContext(Elsif_directiveContext.class,i);
		}
		public Else_directiveContext else_directive() {
			return getRuleContext(Else_directiveContext.class,0);
		}
		public Ifndef_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifndef_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterIfndef_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitIfndef_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitIfndef_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ifndef_directiveContext ifndef_directive() throws RecognitionException {
		Ifndef_directiveContext _localctx = new Ifndef_directiveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifndef_directive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(GA);
			setState(114);
			match(IFNDEF_DIRECTIVE);
			setState(115);
			text_macro_identifier();
			setState(116);
			ifndef_group_of_lines();
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(117);
					elsif_directive();
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(123);
				else_directive();
				}
				break;
			}
			setState(126);
			endif_directive();
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

	public static class Include_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode INCLUDE_DIRECTIVE() { return getToken(VerilogPreParser.INCLUDE_DIRECTIVE, 0); }
		public TerminalNode DIRECTIVE_TEXT() { return getToken(VerilogPreParser.DIRECTIVE_TEXT, 0); }
		public Include_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterInclude_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitInclude_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitInclude_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Include_directiveContext include_directive() throws RecognitionException {
		Include_directiveContext _localctx = new Include_directiveContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_include_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(GA);
			setState(129);
			match(INCLUDE_DIRECTIVE);
			setState(130);
			match(DIRECTIVE_TEXT);
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

	public static class Line_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode LINE_DIRECTIVE() { return getToken(VerilogPreParser.LINE_DIRECTIVE, 0); }
		public TerminalNode DIRECTIVE_TEXT() { return getToken(VerilogPreParser.DIRECTIVE_TEXT, 0); }
		public Line_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterLine_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitLine_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitLine_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_directiveContext line_directive() throws RecognitionException {
		Line_directiveContext _localctx = new Line_directiveContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_line_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(GA);
			setState(133);
			match(LINE_DIRECTIVE);
			setState(134);
			match(DIRECTIVE_TEXT);
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

	public static class Nounconnected_drive_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode NOUNCONNECTED_DRIVE_DIRECTIVE() { return getToken(VerilogPreParser.NOUNCONNECTED_DRIVE_DIRECTIVE, 0); }
		public Nounconnected_drive_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nounconnected_drive_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterNounconnected_drive_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitNounconnected_drive_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitNounconnected_drive_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nounconnected_drive_directiveContext nounconnected_drive_directive() throws RecognitionException {
		Nounconnected_drive_directiveContext _localctx = new Nounconnected_drive_directiveContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nounconnected_drive_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(GA);
			setState(137);
			match(NOUNCONNECTED_DRIVE_DIRECTIVE);
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

	public static class Pragma_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode PRAGMA_DIRECTIVE() { return getToken(VerilogPreParser.PRAGMA_DIRECTIVE, 0); }
		public TerminalNode DIRECTIVE_TEXT() { return getToken(VerilogPreParser.DIRECTIVE_TEXT, 0); }
		public Pragma_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterPragma_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitPragma_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitPragma_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_directiveContext pragma_directive() throws RecognitionException {
		Pragma_directiveContext _localctx = new Pragma_directiveContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pragma_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(GA);
			setState(140);
			match(PRAGMA_DIRECTIVE);
			setState(141);
			match(DIRECTIVE_TEXT);
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

	public static class Resetall_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode RESETALL_DIRECTIVE() { return getToken(VerilogPreParser.RESETALL_DIRECTIVE, 0); }
		public Resetall_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resetall_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterResetall_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitResetall_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitResetall_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Resetall_directiveContext resetall_directive() throws RecognitionException {
		Resetall_directiveContext _localctx = new Resetall_directiveContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_resetall_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(GA);
			setState(144);
			match(RESETALL_DIRECTIVE);
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

	public static class Text_macro_definitionContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode DEFINE_DIRECTIVE() { return getToken(VerilogPreParser.DEFINE_DIRECTIVE, 0); }
		public Text_macro_identifierContext text_macro_identifier() {
			return getRuleContext(Text_macro_identifierContext.class,0);
		}
		public Macro_textContext macro_text() {
			return getRuleContext(Macro_textContext.class,0);
		}
		public Text_macro_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_macro_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterText_macro_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitText_macro_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitText_macro_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_macro_definitionContext text_macro_definition() throws RecognitionException {
		Text_macro_definitionContext _localctx = new Text_macro_definitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_text_macro_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(GA);
			setState(147);
			match(DEFINE_DIRECTIVE);
			setState(148);
			text_macro_identifier();
			setState(149);
			macro_text();
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

	public static class Text_macro_usageContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode MACRO_USAGE() { return getToken(VerilogPreParser.MACRO_USAGE, 0); }
		public Text_macro_usageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_macro_usage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterText_macro_usage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitText_macro_usage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitText_macro_usage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_macro_usageContext text_macro_usage() throws RecognitionException {
		Text_macro_usageContext _localctx = new Text_macro_usageContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_text_macro_usage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(GA);
			setState(152);
			match(MACRO_USAGE);
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

	public static class Timescale_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode TIMESCALE_DIRECTIVE() { return getToken(VerilogPreParser.TIMESCALE_DIRECTIVE, 0); }
		public TerminalNode DIRECTIVE_TEXT() { return getToken(VerilogPreParser.DIRECTIVE_TEXT, 0); }
		public Timescale_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timescale_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterTimescale_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitTimescale_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitTimescale_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timescale_directiveContext timescale_directive() throws RecognitionException {
		Timescale_directiveContext _localctx = new Timescale_directiveContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_timescale_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(GA);
			setState(155);
			match(TIMESCALE_DIRECTIVE);
			setState(156);
			match(DIRECTIVE_TEXT);
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

	public static class Unconnected_drive_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode UNCONNECTED_DRIVE_DIRECTIVE() { return getToken(VerilogPreParser.UNCONNECTED_DRIVE_DIRECTIVE, 0); }
		public TerminalNode DIRECTIVE_TEXT() { return getToken(VerilogPreParser.DIRECTIVE_TEXT, 0); }
		public Unconnected_drive_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unconnected_drive_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterUnconnected_drive_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitUnconnected_drive_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitUnconnected_drive_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unconnected_drive_directiveContext unconnected_drive_directive() throws RecognitionException {
		Unconnected_drive_directiveContext _localctx = new Unconnected_drive_directiveContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unconnected_drive_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(GA);
			setState(159);
			match(UNCONNECTED_DRIVE_DIRECTIVE);
			setState(160);
			match(DIRECTIVE_TEXT);
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

	public static class Undef_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode UNDEF_DIRECTIVE() { return getToken(VerilogPreParser.UNDEF_DIRECTIVE, 0); }
		public Text_macro_identifierContext text_macro_identifier() {
			return getRuleContext(Text_macro_identifierContext.class,0);
		}
		public Undef_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undef_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterUndef_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitUndef_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitUndef_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Undef_directiveContext undef_directive() throws RecognitionException {
		Undef_directiveContext _localctx = new Undef_directiveContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_undef_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(GA);
			setState(163);
			match(UNDEF_DIRECTIVE);
			setState(164);
			text_macro_identifier();
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

	public static class Elsif_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode ELSIF_DIRECTIVE() { return getToken(VerilogPreParser.ELSIF_DIRECTIVE, 0); }
		public Text_macro_identifierContext text_macro_identifier() {
			return getRuleContext(Text_macro_identifierContext.class,0);
		}
		public Elsif_group_of_linesContext elsif_group_of_lines() {
			return getRuleContext(Elsif_group_of_linesContext.class,0);
		}
		public Elsif_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsif_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterElsif_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitElsif_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitElsif_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elsif_directiveContext elsif_directive() throws RecognitionException {
		Elsif_directiveContext _localctx = new Elsif_directiveContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elsif_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(GA);
			setState(167);
			match(ELSIF_DIRECTIVE);
			setState(168);
			text_macro_identifier();
			setState(169);
			elsif_group_of_lines();
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

	public static class Else_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode ELSE_DIRECTIVE() { return getToken(VerilogPreParser.ELSE_DIRECTIVE, 0); }
		public Else_group_of_linesContext else_group_of_lines() {
			return getRuleContext(Else_group_of_linesContext.class,0);
		}
		public Else_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterElse_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitElse_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitElse_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_directiveContext else_directive() throws RecognitionException {
		Else_directiveContext _localctx = new Else_directiveContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_else_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(GA);
			setState(172);
			match(ELSE_DIRECTIVE);
			setState(173);
			else_group_of_lines();
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

	public static class Endif_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode ENDIF_DIRECTIVE() { return getToken(VerilogPreParser.ENDIF_DIRECTIVE, 0); }
		public Endif_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endif_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterEndif_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitEndif_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitEndif_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Endif_directiveContext endif_directive() throws RecognitionException {
		Endif_directiveContext _localctx = new Endif_directiveContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_endif_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(GA);
			setState(176);
			match(ENDIF_DIRECTIVE);
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

	public static class Text_macro_identifierContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_IDENTIFIER() { return getToken(VerilogPreParser.DIRECTIVE_IDENTIFIER, 0); }
		public Text_macro_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_macro_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterText_macro_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitText_macro_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitText_macro_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_macro_identifierContext text_macro_identifier() throws RecognitionException {
		Text_macro_identifierContext _localctx = new Text_macro_identifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_text_macro_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(DIRECTIVE_IDENTIFIER);
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

	public static class Ifdef_group_of_linesContext extends ParserRuleContext {
		public List<TerminalNode> SOURCE_TEXT() { return getTokens(VerilogPreParser.SOURCE_TEXT); }
		public TerminalNode SOURCE_TEXT(int i) {
			return getToken(VerilogPreParser.SOURCE_TEXT, i);
		}
		public List<Compiler_directiveContext> compiler_directive() {
			return getRuleContexts(Compiler_directiveContext.class);
		}
		public Compiler_directiveContext compiler_directive(int i) {
			return getRuleContext(Compiler_directiveContext.class,i);
		}
		public Ifdef_group_of_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifdef_group_of_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterIfdef_group_of_lines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitIfdef_group_of_lines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitIfdef_group_of_lines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ifdef_group_of_linesContext ifdef_group_of_lines() throws RecognitionException {
		Ifdef_group_of_linesContext _localctx = new Ifdef_group_of_linesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifdef_group_of_lines);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(182);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SOURCE_TEXT:
						{
						setState(180);
						match(SOURCE_TEXT);
						}
						break;
					case GA:
						{
						setState(181);
						compiler_directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Ifndef_group_of_linesContext extends ParserRuleContext {
		public List<TerminalNode> SOURCE_TEXT() { return getTokens(VerilogPreParser.SOURCE_TEXT); }
		public TerminalNode SOURCE_TEXT(int i) {
			return getToken(VerilogPreParser.SOURCE_TEXT, i);
		}
		public List<Compiler_directiveContext> compiler_directive() {
			return getRuleContexts(Compiler_directiveContext.class);
		}
		public Compiler_directiveContext compiler_directive(int i) {
			return getRuleContext(Compiler_directiveContext.class,i);
		}
		public Ifndef_group_of_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifndef_group_of_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterIfndef_group_of_lines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitIfndef_group_of_lines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitIfndef_group_of_lines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ifndef_group_of_linesContext ifndef_group_of_lines() throws RecognitionException {
		Ifndef_group_of_linesContext _localctx = new Ifndef_group_of_linesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifndef_group_of_lines);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(189);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SOURCE_TEXT:
						{
						setState(187);
						match(SOURCE_TEXT);
						}
						break;
					case GA:
						{
						setState(188);
						compiler_directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class Elsif_group_of_linesContext extends ParserRuleContext {
		public List<TerminalNode> SOURCE_TEXT() { return getTokens(VerilogPreParser.SOURCE_TEXT); }
		public TerminalNode SOURCE_TEXT(int i) {
			return getToken(VerilogPreParser.SOURCE_TEXT, i);
		}
		public List<Compiler_directiveContext> compiler_directive() {
			return getRuleContexts(Compiler_directiveContext.class);
		}
		public Compiler_directiveContext compiler_directive(int i) {
			return getRuleContext(Compiler_directiveContext.class,i);
		}
		public Elsif_group_of_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsif_group_of_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterElsif_group_of_lines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitElsif_group_of_lines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitElsif_group_of_lines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elsif_group_of_linesContext elsif_group_of_lines() throws RecognitionException {
		Elsif_group_of_linesContext _localctx = new Elsif_group_of_linesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_elsif_group_of_lines);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(196);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SOURCE_TEXT:
						{
						setState(194);
						match(SOURCE_TEXT);
						}
						break;
					case GA:
						{
						setState(195);
						compiler_directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class Else_group_of_linesContext extends ParserRuleContext {
		public List<TerminalNode> SOURCE_TEXT() { return getTokens(VerilogPreParser.SOURCE_TEXT); }
		public TerminalNode SOURCE_TEXT(int i) {
			return getToken(VerilogPreParser.SOURCE_TEXT, i);
		}
		public List<Compiler_directiveContext> compiler_directive() {
			return getRuleContexts(Compiler_directiveContext.class);
		}
		public Compiler_directiveContext compiler_directive(int i) {
			return getRuleContext(Compiler_directiveContext.class,i);
		}
		public Else_group_of_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_group_of_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterElse_group_of_lines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitElse_group_of_lines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitElse_group_of_lines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_group_of_linesContext else_group_of_lines() throws RecognitionException {
		Else_group_of_linesContext _localctx = new Else_group_of_linesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_else_group_of_lines);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(203);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SOURCE_TEXT:
						{
						setState(201);
						match(SOURCE_TEXT);
						}
						break;
					case GA:
						{
						setState(202);
						compiler_directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class Macro_textContext extends ParserRuleContext {
		public List<TerminalNode> MACRO_TEXT() { return getTokens(VerilogPreParser.MACRO_TEXT); }
		public TerminalNode MACRO_TEXT(int i) {
			return getToken(VerilogPreParser.MACRO_TEXT, i);
		}
		public Macro_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterMacro_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitMacro_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitMacro_text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_textContext macro_text() throws RecognitionException {
		Macro_textContext _localctx = new Macro_textContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_macro_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MACRO_TEXT) {
				{
				{
				setState(208);
				match(MACRO_TEXT);
				}
				}
				setState(213);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00f0\u00d9\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"R\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\7\tj\n\t\f\t\16\tm\13\t\3\t\5\tp\n\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\7\ny\n\n\f\n\16\n|\13\n\3\n\5\n\177\n\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\7\31\u00b9\n\31\f\31"+
		"\16\31\u00bc\13\31\3\32\3\32\7\32\u00c0\n\32\f\32\16\32\u00c3\13\32\3"+
		"\33\3\33\7\33\u00c7\n\33\f\33\16\33\u00ca\13\33\3\34\3\34\7\34\u00ce\n"+
		"\34\f\34\16\34\u00d1\13\34\3\35\7\35\u00d4\n\35\f\35\16\35\u00d7\13\35"+
		"\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668\2\2\2\u00da\2=\3\2\2\2\4Q\3\2\2\2\6S\3\2\2\2\bW\3\2\2\2\nZ\3\2\2"+
		"\2\f^\3\2\2\2\16a\3\2\2\2\20d\3\2\2\2\22s\3\2\2\2\24\u0082\3\2\2\2\26"+
		"\u0086\3\2\2\2\30\u008a\3\2\2\2\32\u008d\3\2\2\2\34\u0091\3\2\2\2\36\u0094"+
		"\3\2\2\2 \u0099\3\2\2\2\"\u009c\3\2\2\2$\u00a0\3\2\2\2&\u00a4\3\2\2\2"+
		"(\u00a8\3\2\2\2*\u00ad\3\2\2\2,\u00b1\3\2\2\2.\u00b4\3\2\2\2\60\u00ba"+
		"\3\2\2\2\62\u00c1\3\2\2\2\64\u00c8\3\2\2\2\66\u00cf\3\2\2\28\u00d5\3\2"+
		"\2\2:<\5\4\3\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\3\3\2\2\2?=\3"+
		"\2\2\2@R\5\6\4\2AR\5\b\5\2BR\5\n\6\2CR\5\f\7\2DR\5\16\b\2ER\5\20\t\2F"+
		"R\5\22\n\2GR\5\24\13\2HR\5\26\f\2IR\5\30\r\2JR\5\32\16\2KR\5\34\17\2L"+
		"R\5\36\20\2MR\5 \21\2NR\5\"\22\2OR\5$\23\2PR\5&\24\2Q@\3\2\2\2QA\3\2\2"+
		"\2QB\3\2\2\2QC\3\2\2\2QD\3\2\2\2QE\3\2\2\2QF\3\2\2\2QG\3\2\2\2QH\3\2\2"+
		"\2QI\3\2\2\2QJ\3\2\2\2QK\3\2\2\2QL\3\2\2\2QM\3\2\2\2QN\3\2\2\2QO\3\2\2"+
		"\2QP\3\2\2\2R\5\3\2\2\2ST\7@\2\2TU\7\u00d5\2\2UV\7\u00e9\2\2V\7\3\2\2"+
		"\2WX\7@\2\2XY\7\u00d6\2\2Y\t\3\2\2\2Z[\7@\2\2[\\\7\u00d7\2\2\\]\7\u00e9"+
		"\2\2]\13\3\2\2\2^_\7@\2\2_`\7\u00dc\2\2`\r\3\2\2\2ab\7@\2\2bc\7\u00db"+
		"\2\2c\17\3\2\2\2de\7@\2\2ef\7\u00de\2\2fg\5.\30\2gk\5\60\31\2hj\5(\25"+
		"\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lo\3\2\2\2mk\3\2\2\2np\5*\26"+
		"\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\5,\27\2r\21\3\2\2\2st\7@\2\2tu\7\u00df"+
		"\2\2uv\5.\30\2vz\5\62\32\2wy\5(\25\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3"+
		"\2\2\2{~\3\2\2\2|z\3\2\2\2}\177\5*\26\2~}\3\2\2\2~\177\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\5,\27\2\u0081\23\3\2\2\2\u0082\u0083\7@\2\2\u0083"+
		"\u0084\7\u00e0\2\2\u0084\u0085\7\u00e9\2\2\u0085\25\3\2\2\2\u0086\u0087"+
		"\7@\2\2\u0087\u0088\7\u00e1\2\2\u0088\u0089\7\u00e9\2\2\u0089\27\3\2\2"+
		"\2\u008a\u008b\7@\2\2\u008b\u008c\7\u00e2\2\2\u008c\31\3\2\2\2\u008d\u008e"+
		"\7@\2\2\u008e\u008f\7\u00e3\2\2\u008f\u0090\7\u00e9\2\2\u0090\33\3\2\2"+
		"\2\u0091\u0092\7@\2\2\u0092\u0093\7\u00e4\2\2\u0093\35\3\2\2\2\u0094\u0095"+
		"\7@\2\2\u0095\u0096\7\u00d8\2\2\u0096\u0097\5.\30\2\u0097\u0098\58\35"+
		"\2\u0098\37\3\2\2\2\u0099\u009a\7@\2\2\u009a\u009b\7\u00e8\2\2\u009b!"+
		"\3\2\2\2\u009c\u009d\7@\2\2\u009d\u009e\7\u00e5\2\2\u009e\u009f\7\u00e9"+
		"\2\2\u009f#\3\2\2\2\u00a0\u00a1\7@\2\2\u00a1\u00a2\7\u00e6\2\2\u00a2\u00a3"+
		"\7\u00e9\2\2\u00a3%\3\2\2\2\u00a4\u00a5\7@\2\2\u00a5\u00a6\7\u00e7\2\2"+
		"\u00a6\u00a7\5.\30\2\u00a7\'\3\2\2\2\u00a8\u00a9\7@\2\2\u00a9\u00aa\7"+
		"\u00da\2\2\u00aa\u00ab\5.\30\2\u00ab\u00ac\5\64\33\2\u00ac)\3\2\2\2\u00ad"+
		"\u00ae\7@\2\2\u00ae\u00af\7\u00d9\2\2\u00af\u00b0\5\66\34\2\u00b0+\3\2"+
		"\2\2\u00b1\u00b2\7@\2\2\u00b2\u00b3\7\u00dd\2\2\u00b3-\3\2\2\2\u00b4\u00b5"+
		"\7\u00ea\2\2\u00b5/\3\2\2\2\u00b6\u00b9\7\u00f0\2\2\u00b7\u00b9\5\4\3"+
		"\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\61\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00c0\7\u00f0\2\2\u00be\u00c0\5\4\3\2\u00bf\u00bd\3\2\2\2\u00bf\u00be"+
		"\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\63\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\7\u00f0\2\2\u00c5\u00c7\5"+
		"\4\3\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\65\3\2\2\2\u00ca\u00c8\3\2\2"+
		"\2\u00cb\u00ce\7\u00f0\2\2\u00cc\u00ce\5\4\3\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\67\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d4\7\u00ee\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d69\3\2\2\2\u00d7\u00d5\3\2\2\2\21=Qkoz~\u00b8\u00ba\u00bf\u00c1"+
		"\u00c6\u00c8\u00cd\u00cf\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}