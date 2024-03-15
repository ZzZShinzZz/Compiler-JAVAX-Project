// Generated from ./js.g4 by ANTLR 4.13.1

    package antlr4;
    import java.util.HashMap;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class jsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, CONST=29, VAR=30, IF=31, ELSE=32, 
		WHILE=33, DO=34, FOR=35, FUNCTION=36, SWITCH=37, CASE=38, DEFAULT=39, 
		IDENTIFIER=40, INTEGER=41, DOUBLE=42, NEWLINE=43, WS=44, SINGLE_QUOTE=45, 
		DOUBLE_QUOTE=46, CHARACTER=47, STRING=48, SINGLE_LINE_COMMENT=49, BLOCK_COMMENT=50, 
		REAL=51;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_blockForFunction = 2, RULE_declarations = 3, 
		RULE_constantsPart = 4, RULE_constantDefinitionsList = 5, RULE_constantDefinition = 6, 
		RULE_constantIdentifier = 7, RULE_constant = 8, RULE_sign = 9, RULE_typeIdentifier = 10, 
		RULE_typeSpecification = 11, RULE_simpleType = 12, RULE_enumerationType = 13, 
		RULE_enumerationConstant = 14, RULE_variablesPart = 15, RULE_variableDeclarationsList = 16, 
		RULE_variableDeclarations = 17, RULE_variableIdentifier = 18, RULE_routinesPart = 19, 
		RULE_routineDefinition = 20, RULE_procedureHead = 21, RULE_functionHead = 22, 
		RULE_routineIdentifier = 23, RULE_parameters = 24, RULE_parameterDeclarationsList = 25, 
		RULE_parameterDeclarations = 26, RULE_parameterIdentifierList = 27, RULE_parameterIdentifier = 28, 
		RULE_statement = 29, RULE_increaseStatement = 30, RULE_decreaseStatement = 31, 
		RULE_emptyStatement = 32, RULE_statementList = 33, RULE_assignmentStatement = 34, 
		RULE_lhs = 35, RULE_rhs = 36, RULE_ifStatement = 37, RULE_trueStatement = 38, 
		RULE_falseStatement = 39, RULE_caseStatement = 40, RULE_caseBranchList = 41, 
		RULE_caseBranch = 42, RULE_caseConstantList = 43, RULE_defaultStatement = 44, 
		RULE_caseConstant = 45, RULE_whileStatement = 46, RULE_forStatement = 47, 
		RULE_variableAssignment = 48, RULE_procedureCallStatement = 49, RULE_procedureName = 50, 
		RULE_argumentList = 51, RULE_argument = 52, RULE_printStatement = 53, 
		RULE_printlnStatement = 54, RULE_printArguments = 55, RULE_printArgument = 56, 
		RULE_fieldWidth = 57, RULE_decimalPlaces = 58, RULE_expression = 59, RULE_simpleExpression = 60, 
		RULE_term = 61, RULE_factor = 62, RULE_variable = 63, RULE_modifier = 64, 
		RULE_indexList = 65, RULE_index = 66, RULE_field = 67, RULE_functionCall = 68, 
		RULE_functionName = 69, RULE_number = 70, RULE_unsignedNumber = 71, RULE_integerConstant = 72, 
		RULE_realConstant = 73, RULE_doubleConstant = 74, RULE_characterConstant = 75, 
		RULE_stringConstant = 76, RULE_relOp = 77, RULE_addOp = 78, RULE_mulOp = 79;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "blockForFunction", "declarations", "constantsPart", 
			"constantDefinitionsList", "constantDefinition", "constantIdentifier", 
			"constant", "sign", "typeIdentifier", "typeSpecification", "simpleType", 
			"enumerationType", "enumerationConstant", "variablesPart", "variableDeclarationsList", 
			"variableDeclarations", "variableIdentifier", "routinesPart", "routineDefinition", 
			"procedureHead", "functionHead", "routineIdentifier", "parameters", "parameterDeclarationsList", 
			"parameterDeclarations", "parameterIdentifierList", "parameterIdentifier", 
			"statement", "increaseStatement", "decreaseStatement", "emptyStatement", 
			"statementList", "assignmentStatement", "lhs", "rhs", "ifStatement", 
			"trueStatement", "falseStatement", "caseStatement", "caseBranchList", 
			"caseBranch", "caseConstantList", "defaultStatement", "caseConstant", 
			"whileStatement", "forStatement", "variableAssignment", "procedureCallStatement", 
			"procedureName", "argumentList", "argument", "printStatement", "printlnStatement", 
			"printArguments", "printArgument", "fieldWidth", "decimalPlaces", "expression", 
			"simpleExpression", "term", "factor", "variable", "modifier", "indexList", 
			"index", "field", "functionCall", "functionName", "number", "unsignedNumber", 
			"integerConstant", "realConstant", "doubleConstant", "characterConstant", 
			"stringConstant", "relOp", "addOp", "mulOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "','", "'='", "'-'", "'+'", "'('", "')'", "';'", 
			"'public'", "'void'", "'++'", "'--'", "':'", "'for'", "'print'", "'println'", 
			"'['", "']'", "'.'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'*'", 
			"'/'", null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'''", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "CONST", "VAR", "IF", "ELSE", "WHILE", 
			"DO", "FOR", "FUNCTION", "SWITCH", "CASE", "DEFAULT", "IDENTIFIER", "INTEGER", 
			"DOUBLE", "NEWLINE", "WS", "SINGLE_QUOTE", "DOUBLE_QUOTE", "CHARACTER", 
			"STRING", "SINGLE_LINE_COMMENT", "BLOCK_COMMENT", "REAL"
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
	public String getGrammarFileName() { return "js.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public jsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			block();
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
	public static class BlockContext extends ParserRuleContext {
		public SymtabEntry entry = null;
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			statementList();
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
	public static class BlockForFunctionContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockForFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockForFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitBlockForFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockForFunctionContext blockForFunction() throws RecognitionException {
		BlockForFunctionContext _localctx = new BlockForFunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_blockForFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__0);
			setState(165);
			statementList();
			setState(166);
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
	public static class DeclarationsContext extends ParserRuleContext {
		public ConstantsPartContext constantsPart() {
			return getRuleContext(ConstantsPartContext.class,0);
		}
		public VariablesPartContext variablesPart() {
			return getRuleContext(VariablesPartContext.class,0);
		}
		public RoutinesPartContext routinesPart() {
			return getRuleContext(RoutinesPartContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(168);
				constantsPart();
				}
			}

			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6 || _la==IDENTIFIER) {
				{
				setState(171);
				variablesPart();
				}
			}

			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(174);
				routinesPart();
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
	public static class ConstantsPartContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(jsParser.CONST, 0); }
		public ConstantDefinitionsListContext constantDefinitionsList() {
			return getRuleContext(ConstantDefinitionsListContext.class,0);
		}
		public ConstantsPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantsPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitConstantsPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantsPartContext constantsPart() throws RecognitionException {
		ConstantsPartContext _localctx = new ConstantsPartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constantsPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(CONST);
			setState(178);
			constantDefinitionsList();
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
	public static class ConstantDefinitionsListContext extends ParserRuleContext {
		public List<ConstantDefinitionContext> constantDefinition() {
			return getRuleContexts(ConstantDefinitionContext.class);
		}
		public ConstantDefinitionContext constantDefinition(int i) {
			return getRuleContext(ConstantDefinitionContext.class,i);
		}
		public ConstantDefinitionsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinitionsList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitConstantDefinitionsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDefinitionsListContext constantDefinitionsList() throws RecognitionException {
		ConstantDefinitionsListContext _localctx = new ConstantDefinitionsListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constantDefinitionsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			constantDefinition();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(181);
				match(T__2);
				setState(182);
				constantDefinition();
				}
				}
				setState(187);
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
	public static class ConstantDefinitionContext extends ParserRuleContext {
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitConstantDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDefinitionContext constantDefinition() throws RecognitionException {
		ConstantDefinitionContext _localctx = new ConstantDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constantDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			constantIdentifier();
			setState(189);
			match(T__3);
			setState(190);
			constant();
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
	public static class ConstantIdentifierContext extends ParserRuleContext {
		public Typespec type = null;
		public SymtabEntry entry = null;
		public TerminalNode IDENTIFIER() { return getToken(jsParser.IDENTIFIER, 0); }
		public ConstantIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitConstantIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantIdentifierContext constantIdentifier() throws RecognitionException {
		ConstantIdentifierContext _localctx = new ConstantIdentifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constantIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(IDENTIFIER);
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
	public static class ConstantContext extends ParserRuleContext {
		public Typespec type = null;
		public Object value = null;
		public TerminalNode IDENTIFIER() { return getToken(jsParser.IDENTIFIER, 0); }
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public CharacterConstantContext characterConstant() {
			return getRuleContext(CharacterConstantContext.class,0);
		}
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constant);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case IDENTIFIER:
			case INTEGER:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==T__5) {
					{
					setState(194);
					sign();
					}
				}

				setState(199);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(197);
					match(IDENTIFIER);
					}
					break;
				case INTEGER:
				case DOUBLE:
					{
					setState(198);
					unsignedNumber();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				characterConstant();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				stringConstant();
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
	public static class SignContext extends ParserRuleContext {
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class TypeIdentifierContext extends ParserRuleContext {
		public Typespec type = null;
		public SymtabEntry entry = null;
		public TerminalNode IDENTIFIER() { return getToken(jsParser.IDENTIFIER, 0); }
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitTypeIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(IDENTIFIER);
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
	public static class TypeSpecificationContext extends ParserRuleContext {
		public Typespec type = null;
		public TypeSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecification; }
	 
		public TypeSpecificationContext() { }
		public void copyFrom(TypeSpecificationContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleTypespecContext extends TypeSpecificationContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public SimpleTypespecContext(TypeSpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitSimpleTypespec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecificationContext typeSpecification() throws RecognitionException {
		TypeSpecificationContext _localctx = new TypeSpecificationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeSpecification);
		try {
			_localctx = new SimpleTypespecContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			simpleType();
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
	public static class SimpleTypeContext extends ParserRuleContext {
		public Typespec type = null;
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
	 
		public SimpleTypeContext() { }
		public void copyFrom(SimpleTypeContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EnumerationTypespecContext extends SimpleTypeContext {
		public EnumerationTypeContext enumerationType() {
			return getRuleContext(EnumerationTypeContext.class,0);
		}
		public EnumerationTypespecContext(SimpleTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitEnumerationTypespec(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeIdentifierTypespecContext extends SimpleTypeContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TypeIdentifierTypespecContext(SimpleTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitTypeIdentifierTypespec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simpleType);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new TypeIdentifierTypespecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				typeIdentifier();
				}
				break;
			case T__6:
				_localctx = new EnumerationTypespecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				enumerationType();
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
	public static class EnumerationTypeContext extends ParserRuleContext {
		public List<EnumerationConstantContext> enumerationConstant() {
			return getRuleContexts(EnumerationConstantContext.class);
		}
		public EnumerationConstantContext enumerationConstant(int i) {
			return getRuleContext(EnumerationConstantContext.class,i);
		}
		public EnumerationTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitEnumerationType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationTypeContext enumerationType() throws RecognitionException {
		EnumerationTypeContext _localctx = new EnumerationTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumerationType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__6);
			setState(216);
			enumerationConstant();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(217);
				match(T__2);
				setState(218);
				enumerationConstant();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			match(T__7);
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
	public static class EnumerationConstantContext extends ParserRuleContext {
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public EnumerationConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitEnumerationConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationConstantContext enumerationConstant() throws RecognitionException {
		EnumerationConstantContext _localctx = new EnumerationConstantContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			constantIdentifier();
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
	public static class VariablesPartContext extends ParserRuleContext {
		public VariableDeclarationsListContext variableDeclarationsList() {
			return getRuleContext(VariableDeclarationsListContext.class,0);
		}
		public VariablesPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablesPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitVariablesPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesPartContext variablesPart() throws RecognitionException {
		VariablesPartContext _localctx = new VariablesPartContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variablesPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			variableDeclarationsList();
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
	public static class VariableDeclarationsListContext extends ParserRuleContext {
		public List<VariableDeclarationsContext> variableDeclarations() {
			return getRuleContexts(VariableDeclarationsContext.class);
		}
		public VariableDeclarationsContext variableDeclarations(int i) {
			return getRuleContext(VariableDeclarationsContext.class,i);
		}
		public VariableDeclarationsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationsList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitVariableDeclarationsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationsListContext variableDeclarationsList() throws RecognitionException {
		VariableDeclarationsListContext _localctx = new VariableDeclarationsListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableDeclarationsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			variableDeclarations();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(231);
				match(T__2);
				setState(232);
				variableDeclarations();
				}
				}
				setState(237);
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
	public static class VariableDeclarationsContext extends ParserRuleContext {
		public TypeSpecificationContext typeSpecification() {
			return getRuleContext(TypeSpecificationContext.class,0);
		}
		public VariableIdentifierContext variableIdentifier() {
			return getRuleContext(VariableIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitVariableDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationsContext variableDeclarations() throws RecognitionException {
		VariableDeclarationsContext _localctx = new VariableDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableDeclarations);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				typeSpecification();
				setState(239);
				variableIdentifier();
				setState(240);
				match(T__3);
				setState(241);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				typeSpecification();
				setState(244);
				variableIdentifier();
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
	public static class VariableIdentifierContext extends ParserRuleContext {
		public Typespec type = null;
		public SymtabEntry entry = null;
		public TerminalNode IDENTIFIER() { return getToken(jsParser.IDENTIFIER, 0); }
		public VariableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitVariableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableIdentifierContext variableIdentifier() throws RecognitionException {
		VariableIdentifierContext _localctx = new VariableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(IDENTIFIER);
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
	public static class RoutinesPartContext extends ParserRuleContext {
		public List<RoutineDefinitionContext> routineDefinition() {
			return getRuleContexts(RoutineDefinitionContext.class);
		}
		public RoutineDefinitionContext routineDefinition(int i) {
			return getRuleContext(RoutineDefinitionContext.class,i);
		}
		public RoutinesPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routinesPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitRoutinesPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutinesPartContext routinesPart() throws RecognitionException {
		RoutinesPartContext _localctx = new RoutinesPartContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_routinesPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			routineDefinition();
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(251);
					match(T__8);
					setState(252);
					routineDefinition();
					}
					} 
				}
				setState(257);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RoutineDefinitionContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProcedureHeadContext procedureHead() {
			return getRuleContext(ProcedureHeadContext.class,0);
		}
		public FunctionHeadContext functionHead() {
			return getRuleContext(FunctionHeadContext.class,0);
		}
		public RoutineDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitRoutineDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutineDefinitionContext routineDefinition() throws RecognitionException {
		RoutineDefinitionContext _localctx = new RoutineDefinitionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_routineDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(258);
				procedureHead();
				}
				break;
			case 2:
				{
				setState(259);
				functionHead();
				}
				break;
			}
			setState(262);
			match(T__0);
			setState(263);
			block();
			setState(264);
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
	public static class ProcedureHeadContext extends ParserRuleContext {
		public RoutineIdentifierContext routineIdentifier() {
			return getRuleContext(RoutineIdentifierContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ProcedureHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureHead; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitProcedureHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureHeadContext procedureHead() throws RecognitionException {
		ProcedureHeadContext _localctx = new ProcedureHeadContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_procedureHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__9);
			setState(267);
			match(T__10);
			setState(268);
			routineIdentifier();
			setState(269);
			match(T__6);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(270);
				parameters();
				}
			}

			setState(273);
			match(T__7);
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
	public static class FunctionHeadContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public RoutineIdentifierContext routineIdentifier() {
			return getRuleContext(RoutineIdentifierContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionHead; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitFunctionHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionHeadContext functionHead() throws RecognitionException {
		FunctionHeadContext _localctx = new FunctionHeadContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__9);
			setState(276);
			typeIdentifier();
			setState(277);
			routineIdentifier();
			setState(278);
			match(T__6);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(279);
				parameters();
				}
			}

			setState(282);
			match(T__7);
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
	public static class RoutineIdentifierContext extends ParserRuleContext {
		public Typespec type = null;
		public SymtabEntry entry = null;
		public TerminalNode IDENTIFIER() { return getToken(jsParser.IDENTIFIER, 0); }
		public RoutineIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitRoutineIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutineIdentifierContext routineIdentifier() throws RecognitionException {
		RoutineIdentifierContext _localctx = new RoutineIdentifierContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_routineIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(IDENTIFIER);
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
	public static class ParametersContext extends ParserRuleContext {
		public ParameterDeclarationsListContext parameterDeclarationsList() {
			return getRuleContext(ParameterDeclarationsListContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			parameterDeclarationsList();
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
	public static class ParameterDeclarationsListContext extends ParserRuleContext {
		public List<ParameterDeclarationsContext> parameterDeclarations() {
			return getRuleContexts(ParameterDeclarationsContext.class);
		}
		public ParameterDeclarationsContext parameterDeclarations(int i) {
			return getRuleContext(ParameterDeclarationsContext.class,i);
		}
		public ParameterDeclarationsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclarationsList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitParameterDeclarationsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationsListContext parameterDeclarationsList() throws RecognitionException {
		ParameterDeclarationsListContext _localctx = new ParameterDeclarationsListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parameterDeclarationsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			parameterDeclarations();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(289);
				match(T__2);
				setState(290);
				parameterDeclarations();
				}
				}
				setState(295);
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
	public static class ParameterDeclarationsContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ParameterIdentifierListContext parameterIdentifierList() {
			return getRuleContext(ParameterIdentifierListContext.class,0);
		}
		public ParameterDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitParameterDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationsContext parameterDeclarations() throws RecognitionException {
		ParameterDeclarationsContext _localctx = new ParameterDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parameterDeclarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			typeIdentifier();
			setState(297);
			parameterIdentifierList();
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
	public static class ParameterIdentifierListContext extends ParserRuleContext {
		public List<ParameterIdentifierContext> parameterIdentifier() {
			return getRuleContexts(ParameterIdentifierContext.class);
		}
		public ParameterIdentifierContext parameterIdentifier(int i) {
			return getRuleContext(ParameterIdentifierContext.class,i);
		}
		public ParameterIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterIdentifierList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitParameterIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterIdentifierListContext parameterIdentifierList() throws RecognitionException {
		ParameterIdentifierListContext _localctx = new ParameterIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parameterIdentifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			parameterIdentifier();
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(300);
					match(T__2);
					setState(301);
					parameterIdentifier();
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
	public static class ParameterIdentifierContext extends ParserRuleContext {
		public Typespec type = null;
		public SymtabEntry entry = null;
		public TerminalNode IDENTIFIER() { return getToken(jsParser.IDENTIFIER, 0); }
		public ParameterIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitParameterIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterIdentifierContext parameterIdentifier() throws RecognitionException {
		ParameterIdentifierContext _localctx = new ParameterIdentifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parameterIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(IDENTIFIER);
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
	public static class StatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public PrintlnStatementContext printlnStatement() {
			return getRuleContext(PrintlnStatementContext.class,0);
		}
		public ProcedureCallStatementContext procedureCallStatement() {
			return getRuleContext(ProcedureCallStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public IncreaseStatementContext increaseStatement() {
			return getRuleContext(IncreaseStatementContext.class,0);
		}
		public DecreaseStatementContext decreaseStatement() {
			return getRuleContext(DecreaseStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_statement);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				assignmentStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
				caseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(313);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(314);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(315);
				printlnStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(316);
				procedureCallStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(317);
				emptyStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(318);
				printlnStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(319);
				emptyStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(320);
				declarations();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(321);
				printStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(322);
				increaseStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(323);
				decreaseStatement();
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
	public static class IncreaseStatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public IncreaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increaseStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitIncreaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncreaseStatementContext increaseStatement() throws RecognitionException {
		IncreaseStatementContext _localctx = new IncreaseStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_increaseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			variable();
			setState(327);
			match(T__11);
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
	public static class DecreaseStatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public DecreaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decreaseStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitDecreaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecreaseStatementContext decreaseStatement() throws RecognitionException {
		DecreaseStatementContext _localctx = new DecreaseStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_decreaseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			variable();
			setState(330);
			match(T__12);
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
	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			statement();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(335);
				match(T__8);
				setState(336);
				statement();
				}
				}
				setState(341);
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
	public static class AssignmentStatementContext extends ParserRuleContext {
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			lhs();
			setState(343);
			match(T__3);
			setState(344);
			rhs();
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
	public static class LhsContext extends ParserRuleContext {
		public Typespec type = null;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitLhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_lhs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			variable();
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
	public static class RhsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rhs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitRhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RhsContext rhs() throws RecognitionException {
		RhsContext _localctx = new RhsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_rhs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			expression();
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(jsParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TrueStatementContext trueStatement() {
			return getRuleContext(TrueStatementContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(jsParser.ELSE, 0); }
		public FalseStatementContext falseStatement() {
			return getRuleContext(FalseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(IF);
			setState(351);
			match(T__6);
			setState(352);
			expression();
			setState(353);
			match(T__7);
			setState(354);
			match(T__0);
			setState(355);
			trueStatement();
			setState(356);
			match(T__1);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(357);
				match(ELSE);
				setState(358);
				match(T__0);
				setState(359);
				falseStatement();
				setState(360);
				match(T__1);
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
	public static class TrueStatementContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TrueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitTrueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueStatementContext trueStatement() throws RecognitionException {
		TrueStatementContext _localctx = new TrueStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_trueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			statementList();
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
	public static class FalseStatementContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public FalseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_falseStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitFalseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FalseStatementContext falseStatement() throws RecognitionException {
		FalseStatementContext _localctx = new FalseStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_falseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			statementList();
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
	public static class CaseStatementContext extends ParserRuleContext {
		public HashMap<Integer, jsParser.StatementContext> jumpTable = null;
		public TerminalNode SWITCH() { return getToken(jsParser.SWITCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CaseBranchListContext caseBranchList() {
			return getRuleContext(CaseBranchListContext.class,0);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_caseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(SWITCH);
			setState(369);
			match(T__6);
			setState(370);
			expression();
			setState(371);
			match(T__7);
			setState(372);
			match(T__0);
			setState(373);
			caseBranchList();
			setState(374);
			match(T__8);
			setState(375);
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
	public static class CaseBranchListContext extends ParserRuleContext {
		public List<TerminalNode> CASE() { return getTokens(jsParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(jsParser.CASE, i);
		}
		public List<CaseBranchContext> caseBranch() {
			return getRuleContexts(CaseBranchContext.class);
		}
		public CaseBranchContext caseBranch(int i) {
			return getRuleContext(CaseBranchContext.class,i);
		}
		public DefaultStatementContext defaultStatement() {
			return getRuleContext(DefaultStatementContext.class,0);
		}
		public CaseBranchListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBranchList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitCaseBranchList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBranchListContext caseBranchList() throws RecognitionException {
		CaseBranchListContext _localctx = new CaseBranchListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_caseBranchList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(CASE);
			setState(378);
			caseBranch();
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(379);
					match(T__8);
					setState(380);
					match(CASE);
					setState(381);
					caseBranch();
					}
					} 
				}
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(387);
				match(T__8);
				setState(388);
				defaultStatement();
				}
				break;
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
		public CaseConstantListContext caseConstantList() {
			return getRuleContext(CaseConstantListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CaseBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBranch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitCaseBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBranchContext caseBranch() throws RecognitionException {
		CaseBranchContext _localctx = new CaseBranchContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_caseBranch);
		try {
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case IDENTIFIER:
			case INTEGER:
			case DOUBLE:
			case CHARACTER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				caseConstantList();
				setState(392);
				match(T__13);
				setState(393);
				statement();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class CaseConstantListContext extends ParserRuleContext {
		public List<CaseConstantContext> caseConstant() {
			return getRuleContexts(CaseConstantContext.class);
		}
		public CaseConstantContext caseConstant(int i) {
			return getRuleContext(CaseConstantContext.class,i);
		}
		public CaseConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseConstantList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitCaseConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseConstantListContext caseConstantList() throws RecognitionException {
		CaseConstantListContext _localctx = new CaseConstantListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_caseConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			caseConstant();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(399);
				match(T__2);
				setState(400);
				caseConstant();
				}
				}
				setState(405);
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
	public static class DefaultStatementContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(jsParser.DEFAULT, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DefaultStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitDefaultStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultStatementContext defaultStatement() throws RecognitionException {
		DefaultStatementContext _localctx = new DefaultStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_defaultStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(DEFAULT);
			setState(407);
			match(T__13);
			setState(408);
			statement();
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
	public static class CaseConstantContext extends ParserRuleContext {
		public Typespec type = null;
		public int value = 0;
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public CaseConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitCaseConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseConstantContext caseConstant() throws RecognitionException {
		CaseConstantContext _localctx = new CaseConstantContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_caseConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			constant();
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(jsParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(WHILE);
			setState(413);
			match(T__6);
			setState(414);
			expression();
			setState(415);
			match(T__7);
			setState(416);
			match(T__0);
			setState(417);
			statementList();
			setState(418);
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
	public static class ForStatementContext extends ParserRuleContext {
		public VariablesPartContext variablesPart() {
			return getRuleContext(VariablesPartContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(T__14);
			setState(421);
			match(T__6);
			setState(422);
			variablesPart();
			setState(423);
			match(T__8);
			setState(424);
			expression();
			setState(425);
			match(T__8);
			setState(426);
			statement();
			setState(427);
			match(T__7);
			setState(428);
			match(T__0);
			setState(429);
			statementList();
			setState(430);
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
	public static class VariableAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(jsParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(IDENTIFIER);
			setState(433);
			match(T__3);
			setState(434);
			expression();
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
	public static class ProcedureCallStatementContext extends ParserRuleContext {
		public ProcedureNameContext procedureName() {
			return getRuleContext(ProcedureNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ProcedureCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureCallStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitProcedureCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureCallStatementContext procedureCallStatement() throws RecognitionException {
		ProcedureCallStatementContext _localctx = new ProcedureCallStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_procedureCallStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			procedureName();
			setState(437);
			match(T__6);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 429909046460640L) != 0)) {
				{
				setState(438);
				argumentList();
				}
			}

			setState(441);
			match(T__7);
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
	public static class ProcedureNameContext extends ParserRuleContext {
		public SymtabEntry entry = null;
		public TerminalNode IDENTIFIER() { return getToken(jsParser.IDENTIFIER, 0); }
		public ProcedureNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitProcedureName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureNameContext procedureName() throws RecognitionException {
		ProcedureNameContext _localctx = new ProcedureNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_procedureName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(IDENTIFIER);
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
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			argument();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(446);
				match(T__2);
				setState(447);
				argument();
				}
				}
				setState(452);
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
	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			expression();
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
	public static class PrintStatementContext extends ParserRuleContext {
		public PrintArgumentsContext printArguments() {
			return getRuleContext(PrintArgumentsContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(T__15);
			setState(456);
			printArguments();
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
	public static class PrintlnStatementContext extends ParserRuleContext {
		public PrintArgumentsContext printArguments() {
			return getRuleContext(PrintArgumentsContext.class,0);
		}
		public PrintlnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printlnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitPrintlnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnStatementContext printlnStatement() throws RecognitionException {
		PrintlnStatementContext _localctx = new PrintlnStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_printlnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(T__16);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(459);
				printArguments();
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
	public static class PrintArgumentsContext extends ParserRuleContext {
		public List<PrintArgumentContext> printArgument() {
			return getRuleContexts(PrintArgumentContext.class);
		}
		public PrintArgumentContext printArgument(int i) {
			return getRuleContext(PrintArgumentContext.class,i);
		}
		public PrintArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printArguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitPrintArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintArgumentsContext printArguments() throws RecognitionException {
		PrintArgumentsContext _localctx = new PrintArgumentsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_printArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(T__6);
			setState(463);
			printArgument();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(464);
				match(T__5);
				setState(465);
				printArgument();
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(471);
			match(T__7);
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
	public static class PrintArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FieldWidthContext fieldWidth() {
			return getRuleContext(FieldWidthContext.class,0);
		}
		public PrintArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printArgument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitPrintArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintArgumentContext printArgument() throws RecognitionException {
		PrintArgumentContext _localctx = new PrintArgumentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_printArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			expression();
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(474);
				match(T__13);
				setState(475);
				fieldWidth();
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
	public static class FieldWidthContext extends ParserRuleContext {
		public IntegerConstantContext integerConstant() {
			return getRuleContext(IntegerConstantContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public DecimalPlacesContext decimalPlaces() {
			return getRuleContext(DecimalPlacesContext.class,0);
		}
		public FieldWidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldWidth; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitFieldWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldWidthContext fieldWidth() throws RecognitionException {
		FieldWidthContext _localctx = new FieldWidthContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_fieldWidth);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4 || _la==T__5) {
				{
				setState(478);
				sign();
				}
			}

			setState(481);
			integerConstant();
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(482);
				match(T__13);
				setState(483);
				decimalPlaces();
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
	public static class DecimalPlacesContext extends ParserRuleContext {
		public IntegerConstantContext integerConstant() {
			return getRuleContext(IntegerConstantContext.class,0);
		}
		public DecimalPlacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalPlaces; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitDecimalPlaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalPlacesContext decimalPlaces() throws RecognitionException {
		DecimalPlacesContext _localctx = new DecimalPlacesContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_decimalPlaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			integerConstant();
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
		public Typespec type = null;
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			simpleExpression();
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 132120576L) != 0)) {
				{
				setState(489);
				relOp();
				setState(490);
				simpleExpression();
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
	public static class SimpleExpressionContext extends ParserRuleContext {
		public Typespec type = null;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public List<AddOpContext> addOp() {
			return getRuleContexts(AddOpContext.class);
		}
		public AddOpContext addOp(int i) {
			return getRuleContext(AddOpContext.class,i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_simpleExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(494);
				sign();
				}
				break;
			}
			setState(497);
			term();
			setState(503);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(498);
					addOp();
					setState(499);
					term();
					}
					} 
				}
				setState(505);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
	public static class TermContext extends ParserRuleContext {
		public Typespec type = null;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MulOpContext> mulOp() {
			return getRuleContexts(MulOpContext.class);
		}
		public MulOpContext mulOp(int i) {
			return getRuleContext(MulOpContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			factor();
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26 || _la==T__27) {
				{
				{
				setState(507);
				mulOp();
				setState(508);
				factor();
				}
				}
				setState(514);
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
	public static class FactorContext extends ParserRuleContext {
		public Typespec type = null;
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberFactorContext extends FactorContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitNumberFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringFactorContext extends FactorContext {
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public StringFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitStringFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharacterFactorContext extends FactorContext {
		public CharacterConstantContext characterConstant() {
			return getRuleContext(CharacterConstantContext.class,0);
		}
		public CharacterFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitCharacterFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableFactorContext extends FactorContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitVariableFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallFactorContext extends FactorContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitFunctionCallFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedFactorContext extends FactorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitParenthesizedFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_factor);
		try {
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new VariableFactorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				variable();
				}
				break;
			case 2:
				_localctx = new NumberFactorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				number();
				}
				break;
			case 3:
				_localctx = new CharacterFactorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(517);
				characterConstant();
				}
				break;
			case 4:
				_localctx = new StringFactorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(518);
				stringConstant();
				}
				break;
			case 5:
				_localctx = new FunctionCallFactorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(519);
				functionCall();
				}
				break;
			case 6:
				_localctx = new ParenthesizedFactorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(520);
				match(T__6);
				setState(521);
				expression();
				setState(522);
				match(T__7);
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
	public static class VariableContext extends ParserRuleContext {
		public Typespec type = null;
		public SymtabEntry entry = null;
		public VariableIdentifierContext variableIdentifier() {
			return getRuleContext(VariableIdentifierContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			variableIdentifier();
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==T__19) {
				{
				{
				setState(527);
				modifier();
				}
				}
				setState(532);
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
	public static class ModifierContext extends ParserRuleContext {
		public IndexListContext indexList() {
			return getRuleContext(IndexListContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_modifier);
		try {
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				match(T__17);
				setState(534);
				indexList();
				setState(535);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				match(T__19);
				setState(538);
				field();
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
	public static class IndexListContext extends ParserRuleContext {
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public IndexListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitIndexList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexListContext indexList() throws RecognitionException {
		IndexListContext _localctx = new IndexListContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_indexList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			index();
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(542);
				match(T__2);
				setState(543);
				index();
				}
				}
				setState(548);
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
	public static class IndexContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			expression();
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
	public static class FieldContext extends ParserRuleContext {
		public Typespec type = null;
		public SymtabEntry entry = null;
		public TerminalNode IDENTIFIER() { return getToken(jsParser.IDENTIFIER, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(IDENTIFIER);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			functionName();
			setState(554);
			match(T__6);
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 429909046460640L) != 0)) {
				{
				setState(555);
				argumentList();
				}
			}

			setState(558);
			match(T__7);
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
	public static class FunctionNameContext extends ParserRuleContext {
		public Typespec type = null;
		public SymtabEntry entry = null;
		public TerminalNode IDENTIFIER() { return getToken(jsParser.IDENTIFIER, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(IDENTIFIER);
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
	public static class NumberContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4 || _la==T__5) {
				{
				setState(562);
				sign();
				}
			}

			setState(565);
			unsignedNumber();
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
	public static class UnsignedNumberContext extends ParserRuleContext {
		public IntegerConstantContext integerConstant() {
			return getRuleContext(IntegerConstantContext.class,0);
		}
		public DoubleConstantContext doubleConstant() {
			return getRuleContext(DoubleConstantContext.class,0);
		}
		public UnsignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedNumber; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitUnsignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_unsignedNumber);
		try {
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				integerConstant();
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				doubleConstant();
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
	public static class IntegerConstantContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(jsParser.INTEGER, 0); }
		public IntegerConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitIntegerConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerConstantContext integerConstant() throws RecognitionException {
		IntegerConstantContext _localctx = new IntegerConstantContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_integerConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(INTEGER);
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
	public static class RealConstantContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(jsParser.REAL, 0); }
		public RealConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitRealConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealConstantContext realConstant() throws RecognitionException {
		RealConstantContext _localctx = new RealConstantContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_realConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(REAL);
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
	public static class DoubleConstantContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(jsParser.DOUBLE, 0); }
		public DoubleConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitDoubleConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleConstantContext doubleConstant() throws RecognitionException {
		DoubleConstantContext _localctx = new DoubleConstantContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_doubleConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(DOUBLE);
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
	public static class CharacterConstantContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(jsParser.CHARACTER, 0); }
		public CharacterConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitCharacterConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterConstantContext characterConstant() throws RecognitionException {
		CharacterConstantContext _localctx = new CharacterConstantContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_characterConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(CHARACTER);
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
	public static class StringConstantContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(jsParser.STRING, 0); }
		public StringConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConstantContext stringConstant() throws RecognitionException {
		StringConstantContext _localctx = new StringConstantContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(STRING);
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
	public static class RelOpContext extends ParserRuleContext {
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitRelOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 132120576L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class AddOpContext extends ParserRuleContext {
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitAddOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class MulOpContext extends ParserRuleContext {
		public MulOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jsVisitor ) return ((jsVisitor<? extends T>)visitor).visitMulOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulOpContext mulOp() throws RecognitionException {
		MulOpContext _localctx = new MulOpContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_mulOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__27) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		"\u0004\u00013\u024c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0003\u0003\u00aa\b\u0003\u0001\u0003\u0003"+
		"\u0003\u00ad\b\u0003\u0001\u0003\u0003\u0003\u00b0\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00b8\b\u0005\n\u0005\f\u0005\u00bb\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0003\b\u00c4\b\b\u0001"+
		"\b\u0001\b\u0003\b\u00c8\b\b\u0001\b\u0001\b\u0003\b\u00cc\b\b\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003"+
		"\f\u00d6\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00dc\b\r\n\r\f\r"+
		"\u00df\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00ea\b\u0010\n\u0010"+
		"\f\u0010\u00ed\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00f7\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u00fe\b\u0013\n\u0013\f\u0013\u0101\t\u0013\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0105\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0110"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0119\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u0124\b\u0019\n\u0019\f\u0019\u0127\t\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u012f\b\u001b\n\u001b\f\u001b\u0132\t\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0145\b\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0005!\u0152\b!\n!\f!\u0155\t!\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u016b\b%\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u017f\b)\n)"+
		"\f)\u0182\t)\u0001)\u0001)\u0003)\u0186\b)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0003*\u018d\b*\u0001+\u0001+\u0001+\u0005+\u0192\b+\n+\f+\u0195"+
		"\t+\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u0001"+
		"0\u00011\u00011\u00011\u00031\u01b8\b1\u00011\u00011\u00012\u00012\u0001"+
		"3\u00013\u00013\u00053\u01c1\b3\n3\f3\u01c4\t3\u00014\u00014\u00015\u0001"+
		"5\u00015\u00016\u00016\u00036\u01cd\b6\u00017\u00017\u00017\u00017\u0005"+
		"7\u01d3\b7\n7\f7\u01d6\t7\u00017\u00017\u00018\u00018\u00018\u00038\u01dd"+
		"\b8\u00019\u00039\u01e0\b9\u00019\u00019\u00019\u00039\u01e5\b9\u0001"+
		":\u0001:\u0001;\u0001;\u0001;\u0001;\u0003;\u01ed\b;\u0001<\u0003<\u01f0"+
		"\b<\u0001<\u0001<\u0001<\u0001<\u0005<\u01f6\b<\n<\f<\u01f9\t<\u0001="+
		"\u0001=\u0001=\u0001=\u0005=\u01ff\b=\n=\f=\u0202\t=\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u020d\b>\u0001?\u0001"+
		"?\u0005?\u0211\b?\n?\f?\u0214\t?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0003@\u021c\b@\u0001A\u0001A\u0001A\u0005A\u0221\bA\nA\fA\u0224\tA"+
		"\u0001B\u0001B\u0001C\u0001C\u0001D\u0001D\u0001D\u0003D\u022d\bD\u0001"+
		"D\u0001D\u0001E\u0001E\u0001F\u0003F\u0234\bF\u0001F\u0001F\u0001G\u0001"+
		"G\u0003G\u023a\bG\u0001H\u0001H\u0001I\u0001I\u0001J\u0001J\u0001K\u0001"+
		"K\u0001L\u0001L\u0001M\u0001M\u0001N\u0001N\u0001O\u0001O\u0001O\u0000"+
		"\u0000P\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u0000\u0003\u0001\u0000\u0005\u0006\u0001\u0000\u0015"+
		"\u001a\u0001\u0000\u001b\u001c\u0237\u0000\u00a0\u0001\u0000\u0000\u0000"+
		"\u0002\u00a2\u0001\u0000\u0000\u0000\u0004\u00a4\u0001\u0000\u0000\u0000"+
		"\u0006\u00a9\u0001\u0000\u0000\u0000\b\u00b1\u0001\u0000\u0000\u0000\n"+
		"\u00b4\u0001\u0000\u0000\u0000\f\u00bc\u0001\u0000\u0000\u0000\u000e\u00c0"+
		"\u0001\u0000\u0000\u0000\u0010\u00cb\u0001\u0000\u0000\u0000\u0012\u00cd"+
		"\u0001\u0000\u0000\u0000\u0014\u00cf\u0001\u0000\u0000\u0000\u0016\u00d1"+
		"\u0001\u0000\u0000\u0000\u0018\u00d5\u0001\u0000\u0000\u0000\u001a\u00d7"+
		"\u0001\u0000\u0000\u0000\u001c\u00e2\u0001\u0000\u0000\u0000\u001e\u00e4"+
		"\u0001\u0000\u0000\u0000 \u00e6\u0001\u0000\u0000\u0000\"\u00f6\u0001"+
		"\u0000\u0000\u0000$\u00f8\u0001\u0000\u0000\u0000&\u00fa\u0001\u0000\u0000"+
		"\u0000(\u0104\u0001\u0000\u0000\u0000*\u010a\u0001\u0000\u0000\u0000,"+
		"\u0113\u0001\u0000\u0000\u0000.\u011c\u0001\u0000\u0000\u00000\u011e\u0001"+
		"\u0000\u0000\u00002\u0120\u0001\u0000\u0000\u00004\u0128\u0001\u0000\u0000"+
		"\u00006\u012b\u0001\u0000\u0000\u00008\u0133\u0001\u0000\u0000\u0000:"+
		"\u0144\u0001\u0000\u0000\u0000<\u0146\u0001\u0000\u0000\u0000>\u0149\u0001"+
		"\u0000\u0000\u0000@\u014c\u0001\u0000\u0000\u0000B\u014e\u0001\u0000\u0000"+
		"\u0000D\u0156\u0001\u0000\u0000\u0000F\u015a\u0001\u0000\u0000\u0000H"+
		"\u015c\u0001\u0000\u0000\u0000J\u015e\u0001\u0000\u0000\u0000L\u016c\u0001"+
		"\u0000\u0000\u0000N\u016e\u0001\u0000\u0000\u0000P\u0170\u0001\u0000\u0000"+
		"\u0000R\u0179\u0001\u0000\u0000\u0000T\u018c\u0001\u0000\u0000\u0000V"+
		"\u018e\u0001\u0000\u0000\u0000X\u0196\u0001\u0000\u0000\u0000Z\u019a\u0001"+
		"\u0000\u0000\u0000\\\u019c\u0001\u0000\u0000\u0000^\u01a4\u0001\u0000"+
		"\u0000\u0000`\u01b0\u0001\u0000\u0000\u0000b\u01b4\u0001\u0000\u0000\u0000"+
		"d\u01bb\u0001\u0000\u0000\u0000f\u01bd\u0001\u0000\u0000\u0000h\u01c5"+
		"\u0001\u0000\u0000\u0000j\u01c7\u0001\u0000\u0000\u0000l\u01ca\u0001\u0000"+
		"\u0000\u0000n\u01ce\u0001\u0000\u0000\u0000p\u01d9\u0001\u0000\u0000\u0000"+
		"r\u01df\u0001\u0000\u0000\u0000t\u01e6\u0001\u0000\u0000\u0000v\u01e8"+
		"\u0001\u0000\u0000\u0000x\u01ef\u0001\u0000\u0000\u0000z\u01fa\u0001\u0000"+
		"\u0000\u0000|\u020c\u0001\u0000\u0000\u0000~\u020e\u0001\u0000\u0000\u0000"+
		"\u0080\u021b\u0001\u0000\u0000\u0000\u0082\u021d\u0001\u0000\u0000\u0000"+
		"\u0084\u0225\u0001\u0000\u0000\u0000\u0086\u0227\u0001\u0000\u0000\u0000"+
		"\u0088\u0229\u0001\u0000\u0000\u0000\u008a\u0230\u0001\u0000\u0000\u0000"+
		"\u008c\u0233\u0001\u0000\u0000\u0000\u008e\u0239\u0001\u0000\u0000\u0000"+
		"\u0090\u023b\u0001\u0000\u0000\u0000\u0092\u023d\u0001\u0000\u0000\u0000"+
		"\u0094\u023f\u0001\u0000\u0000\u0000\u0096\u0241\u0001\u0000\u0000\u0000"+
		"\u0098\u0243\u0001\u0000\u0000\u0000\u009a\u0245\u0001\u0000\u0000\u0000"+
		"\u009c\u0247\u0001\u0000\u0000\u0000\u009e\u0249\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0003\u0002\u0001\u0000\u00a1\u0001\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0003B!\u0000\u00a3\u0003\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0005\u0001\u0000\u0000\u00a5\u00a6\u0003B!\u0000\u00a6\u00a7\u0005\u0002"+
		"\u0000\u0000\u00a7\u0005\u0001\u0000\u0000\u0000\u00a8\u00aa\u0003\b\u0004"+
		"\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00ad\u0003\u001e\u000f"+
		"\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00b0\u0003&\u0013\u0000"+
		"\u00af\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b0\u0007\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u001d\u0000\u0000"+
		"\u00b2\u00b3\u0003\n\u0005\u0000\u00b3\t\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b9\u0003\f\u0006\u0000\u00b5\u00b6\u0005\u0003\u0000\u0000\u00b6\u00b8"+
		"\u0003\f\u0006\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001"+
		"\u0000\u0000\u0000\u00ba\u000b\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0003\u000e\u0007\u0000\u00bd\u00be\u0005"+
		"\u0004\u0000\u0000\u00be\u00bf\u0003\u0010\b\u0000\u00bf\r\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0005(\u0000\u0000\u00c1\u000f\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c4\u0003\u0012\t\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c8\u0005(\u0000\u0000\u00c6\u00c8\u0003\u008eG\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u00cc"+
		"\u0001\u0000\u0000\u0000\u00c9\u00cc\u0003\u0096K\u0000\u00ca\u00cc\u0003"+
		"\u0098L\u0000\u00cb\u00c3\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u0011\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0007\u0000\u0000\u0000\u00ce\u0013\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0005(\u0000\u0000\u00d0\u0015\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0003\u0018\f\u0000\u00d2\u0017\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d6\u0003\u0014\n\u0000\u00d4\u00d6\u0003\u001a\r\u0000\u00d5"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6"+
		"\u0019\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u0007\u0000\u0000\u00d8"+
		"\u00dd\u0003\u001c\u000e\u0000\u00d9\u00da\u0005\u0003\u0000\u0000\u00da"+
		"\u00dc\u0003\u001c\u000e\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc"+
		"\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0001\u0000\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df"+
		"\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\b\u0000\u0000\u00e1\u001b"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003\u000e\u0007\u0000\u00e3\u001d"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e5\u0003 \u0010\u0000\u00e5\u001f\u0001"+
		"\u0000\u0000\u0000\u00e6\u00eb\u0003\"\u0011\u0000\u00e7\u00e8\u0005\u0003"+
		"\u0000\u0000\u00e8\u00ea\u0003\"\u0011\u0000\u00e9\u00e7\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec!\u0001\u0000\u0000\u0000"+
		"\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ef\u0003\u0016\u000b\u0000"+
		"\u00ef\u00f0\u0003$\u0012\u0000\u00f0\u00f1\u0005\u0004\u0000\u0000\u00f1"+
		"\u00f2\u0003v;\u0000\u00f2\u00f7\u0001\u0000\u0000\u0000\u00f3\u00f4\u0003"+
		"\u0016\u000b\u0000\u00f4\u00f5\u0003$\u0012\u0000\u00f5\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f6\u00ee\u0001\u0000\u0000\u0000\u00f6\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f7#\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005(\u0000\u0000"+
		"\u00f9%\u0001\u0000\u0000\u0000\u00fa\u00ff\u0003(\u0014\u0000\u00fb\u00fc"+
		"\u0005\t\u0000\u0000\u00fc\u00fe\u0003(\u0014\u0000\u00fd\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\'\u0001\u0000"+
		"\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0105\u0003*\u0015"+
		"\u0000\u0103\u0105\u0003,\u0016\u0000\u0104\u0102\u0001\u0000\u0000\u0000"+
		"\u0104\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0005\u0001\u0000\u0000\u0107\u0108\u0003\u0002\u0001\u0000"+
		"\u0108\u0109\u0005\u0002\u0000\u0000\u0109)\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0005\n\u0000\u0000\u010b\u010c\u0005\u000b\u0000\u0000\u010c\u010d"+
		"\u0003.\u0017\u0000\u010d\u010f\u0005\u0007\u0000\u0000\u010e\u0110\u0003"+
		"0\u0018\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0005\b\u0000"+
		"\u0000\u0112+\u0001\u0000\u0000\u0000\u0113\u0114\u0005\n\u0000\u0000"+
		"\u0114\u0115\u0003\u0014\n\u0000\u0115\u0116\u0003.\u0017\u0000\u0116"+
		"\u0118\u0005\u0007\u0000\u0000\u0117\u0119\u00030\u0018\u0000\u0118\u0117"+
		"\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0001\u0000\u0000\u0000\u011a\u011b\u0005\b\u0000\u0000\u011b-\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0005(\u0000\u0000\u011d/\u0001\u0000\u0000"+
		"\u0000\u011e\u011f\u00032\u0019\u0000\u011f1\u0001\u0000\u0000\u0000\u0120"+
		"\u0125\u00034\u001a\u0000\u0121\u0122\u0005\u0003\u0000\u0000\u0122\u0124"+
		"\u00034\u001a\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0127\u0001"+
		"\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001"+
		"\u0000\u0000\u0000\u01263\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0003\u0014\n\u0000\u0129\u012a\u00036\u001b"+
		"\u0000\u012a5\u0001\u0000\u0000\u0000\u012b\u0130\u00038\u001c\u0000\u012c"+
		"\u012d\u0005\u0003\u0000\u0000\u012d\u012f\u00038\u001c\u0000\u012e\u012c"+
		"\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u012e"+
		"\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u01317\u0001"+
		"\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0134\u0005"+
		"(\u0000\u0000\u01349\u0001\u0000\u0000\u0000\u0135\u0145\u0001\u0000\u0000"+
		"\u0000\u0136\u0145\u0003D\"\u0000\u0137\u0145\u0003J%\u0000\u0138\u0145"+
		"\u0003P(\u0000\u0139\u0145\u0003\\.\u0000\u013a\u0145\u0003^/\u0000\u013b"+
		"\u0145\u0003l6\u0000\u013c\u0145\u0003b1\u0000\u013d\u0145\u0003@ \u0000"+
		"\u013e\u0145\u0003l6\u0000\u013f\u0145\u0003@ \u0000\u0140\u0145\u0003"+
		"\u0006\u0003\u0000\u0141\u0145\u0003j5\u0000\u0142\u0145\u0003<\u001e"+
		"\u0000\u0143\u0145\u0003>\u001f\u0000\u0144\u0135\u0001\u0000\u0000\u0000"+
		"\u0144\u0136\u0001\u0000\u0000\u0000\u0144\u0137\u0001\u0000\u0000\u0000"+
		"\u0144\u0138\u0001\u0000\u0000\u0000\u0144\u0139\u0001\u0000\u0000\u0000"+
		"\u0144\u013a\u0001\u0000\u0000\u0000\u0144\u013b\u0001\u0000\u0000\u0000"+
		"\u0144\u013c\u0001\u0000\u0000\u0000\u0144\u013d\u0001\u0000\u0000\u0000"+
		"\u0144\u013e\u0001\u0000\u0000\u0000\u0144\u013f\u0001\u0000\u0000\u0000"+
		"\u0144\u0140\u0001\u0000\u0000\u0000\u0144\u0141\u0001\u0000\u0000\u0000"+
		"\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0143\u0001\u0000\u0000\u0000"+
		"\u0145;\u0001\u0000\u0000\u0000\u0146\u0147\u0003~?\u0000\u0147\u0148"+
		"\u0005\f\u0000\u0000\u0148=\u0001\u0000\u0000\u0000\u0149\u014a\u0003"+
		"~?\u0000\u014a\u014b\u0005\r\u0000\u0000\u014b?\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0001\u0000\u0000\u0000\u014dA\u0001\u0000\u0000\u0000\u014e"+
		"\u0153\u0003:\u001d\u0000\u014f\u0150\u0005\t\u0000\u0000\u0150\u0152"+
		"\u0003:\u001d\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0155\u0001"+
		"\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001"+
		"\u0000\u0000\u0000\u0154C\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000"+
		"\u0000\u0000\u0156\u0157\u0003F#\u0000\u0157\u0158\u0005\u0004\u0000\u0000"+
		"\u0158\u0159\u0003H$\u0000\u0159E\u0001\u0000\u0000\u0000\u015a\u015b"+
		"\u0003~?\u0000\u015bG\u0001\u0000\u0000\u0000\u015c\u015d\u0003v;\u0000"+
		"\u015dI\u0001\u0000\u0000\u0000\u015e\u015f\u0005\u001f\u0000\u0000\u015f"+
		"\u0160\u0005\u0007\u0000\u0000\u0160\u0161\u0003v;\u0000\u0161\u0162\u0005"+
		"\b\u0000\u0000\u0162\u0163\u0005\u0001\u0000\u0000\u0163\u0164\u0003L"+
		"&\u0000\u0164\u016a\u0005\u0002\u0000\u0000\u0165\u0166\u0005 \u0000\u0000"+
		"\u0166\u0167\u0005\u0001\u0000\u0000\u0167\u0168\u0003N\'\u0000\u0168"+
		"\u0169\u0005\u0002\u0000\u0000\u0169\u016b\u0001\u0000\u0000\u0000\u016a"+
		"\u0165\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b"+
		"K\u0001\u0000\u0000\u0000\u016c\u016d\u0003B!\u0000\u016dM\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0003B!\u0000\u016fO\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0005%\u0000\u0000\u0171\u0172\u0005\u0007\u0000\u0000\u0172"+
		"\u0173\u0003v;\u0000\u0173\u0174\u0005\b\u0000\u0000\u0174\u0175\u0005"+
		"\u0001\u0000\u0000\u0175\u0176\u0003R)\u0000\u0176\u0177\u0005\t\u0000"+
		"\u0000\u0177\u0178\u0005\u0002\u0000\u0000\u0178Q\u0001\u0000\u0000\u0000"+
		"\u0179\u017a\u0005&\u0000\u0000\u017a\u0180\u0003T*\u0000\u017b\u017c"+
		"\u0005\t\u0000\u0000\u017c\u017d\u0005&\u0000\u0000\u017d\u017f\u0003"+
		"T*\u0000\u017e\u017b\u0001\u0000\u0000\u0000\u017f\u0182\u0001\u0000\u0000"+
		"\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000"+
		"\u0000\u0181\u0185\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000"+
		"\u0000\u0183\u0184\u0005\t\u0000\u0000\u0184\u0186\u0003X,\u0000\u0185"+
		"\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186"+
		"S\u0001\u0000\u0000\u0000\u0187\u0188\u0003V+\u0000\u0188\u0189\u0005"+
		"\u000e\u0000\u0000\u0189\u018a\u0003:\u001d\u0000\u018a\u018d\u0001\u0000"+
		"\u0000\u0000\u018b\u018d\u0001\u0000\u0000\u0000\u018c\u0187\u0001\u0000"+
		"\u0000\u0000\u018c\u018b\u0001\u0000\u0000\u0000\u018dU\u0001\u0000\u0000"+
		"\u0000\u018e\u0193\u0003Z-\u0000\u018f\u0190\u0005\u0003\u0000\u0000\u0190"+
		"\u0192\u0003Z-\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u0195\u0001"+
		"\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0193\u0194\u0001"+
		"\u0000\u0000\u0000\u0194W\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000"+
		"\u0000\u0000\u0196\u0197\u0005\'\u0000\u0000\u0197\u0198\u0005\u000e\u0000"+
		"\u0000\u0198\u0199\u0003:\u001d\u0000\u0199Y\u0001\u0000\u0000\u0000\u019a"+
		"\u019b\u0003\u0010\b\u0000\u019b[\u0001\u0000\u0000\u0000\u019c\u019d"+
		"\u0005!\u0000\u0000\u019d\u019e\u0005\u0007\u0000\u0000\u019e\u019f\u0003"+
		"v;\u0000\u019f\u01a0\u0005\b\u0000\u0000\u01a0\u01a1\u0005\u0001\u0000"+
		"\u0000\u01a1\u01a2\u0003B!\u0000\u01a2\u01a3\u0005\u0002\u0000\u0000\u01a3"+
		"]\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005\u000f\u0000\u0000\u01a5\u01a6"+
		"\u0005\u0007\u0000\u0000\u01a6\u01a7\u0003\u001e\u000f\u0000\u01a7\u01a8"+
		"\u0005\t\u0000\u0000\u01a8\u01a9\u0003v;\u0000\u01a9\u01aa\u0005\t\u0000"+
		"\u0000\u01aa\u01ab\u0003:\u001d\u0000\u01ab\u01ac\u0005\b\u0000\u0000"+
		"\u01ac\u01ad\u0005\u0001\u0000\u0000\u01ad\u01ae\u0003B!\u0000\u01ae\u01af"+
		"\u0005\u0002\u0000\u0000\u01af_\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005"+
		"(\u0000\u0000\u01b1\u01b2\u0005\u0004\u0000\u0000\u01b2\u01b3\u0003v;"+
		"\u0000\u01b3a\u0001\u0000\u0000\u0000\u01b4\u01b5\u0003d2\u0000\u01b5"+
		"\u01b7\u0005\u0007\u0000\u0000\u01b6\u01b8\u0003f3\u0000\u01b7\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001"+
		"\u0000\u0000\u0000\u01b9\u01ba\u0005\b\u0000\u0000\u01bac\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bc\u0005(\u0000\u0000\u01bce\u0001\u0000\u0000\u0000"+
		"\u01bd\u01c2\u0003h4\u0000\u01be\u01bf\u0005\u0003\u0000\u0000\u01bf\u01c1"+
		"\u0003h4\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c1\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c3g\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c6\u0003v;\u0000\u01c6i\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c8\u0005\u0010\u0000\u0000\u01c8\u01c9\u0003n7\u0000\u01c9k\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cc\u0005\u0011\u0000\u0000\u01cb\u01cd\u0003"+
		"n7\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cdm\u0001\u0000\u0000\u0000\u01ce\u01cf\u0005\u0007\u0000\u0000"+
		"\u01cf\u01d4\u0003p8\u0000\u01d0\u01d1\u0005\u0006\u0000\u0000\u01d1\u01d3"+
		"\u0003p8\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d3\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d7\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d8\u0005\b\u0000\u0000\u01d8o\u0001\u0000\u0000"+
		"\u0000\u01d9\u01dc\u0003v;\u0000\u01da\u01db\u0005\u000e\u0000\u0000\u01db"+
		"\u01dd\u0003r9\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001"+
		"\u0000\u0000\u0000\u01ddq\u0001\u0000\u0000\u0000\u01de\u01e0\u0003\u0012"+
		"\t\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000"+
		"\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e4\u0003\u0090H\u0000"+
		"\u01e2\u01e3\u0005\u000e\u0000\u0000\u01e3\u01e5\u0003t:\u0000\u01e4\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5s\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e7\u0003\u0090H\u0000\u01e7u\u0001\u0000\u0000"+
		"\u0000\u01e8\u01ec\u0003x<\u0000\u01e9\u01ea\u0003\u009aM\u0000\u01ea"+
		"\u01eb\u0003x<\u0000\u01eb\u01ed\u0001\u0000\u0000\u0000\u01ec\u01e9\u0001"+
		"\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01edw\u0001\u0000"+
		"\u0000\u0000\u01ee\u01f0\u0003\u0012\t\u0000\u01ef\u01ee\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f7\u0003z=\u0000\u01f2\u01f3\u0003\u009cN\u0000\u01f3"+
		"\u01f4\u0003z=\u0000\u01f4\u01f6\u0001\u0000\u0000\u0000\u01f5\u01f2\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f9\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001"+
		"\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8y\u0001\u0000"+
		"\u0000\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01fa\u0200\u0003|>\u0000"+
		"\u01fb\u01fc\u0003\u009eO\u0000\u01fc\u01fd\u0003|>\u0000\u01fd\u01ff"+
		"\u0001\u0000\u0000\u0000\u01fe\u01fb\u0001\u0000\u0000\u0000\u01ff\u0202"+
		"\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0200\u0201"+
		"\u0001\u0000\u0000\u0000\u0201{\u0001\u0000\u0000\u0000\u0202\u0200\u0001"+
		"\u0000\u0000\u0000\u0203\u020d\u0003~?\u0000\u0204\u020d\u0003\u008cF"+
		"\u0000\u0205\u020d\u0003\u0096K\u0000\u0206\u020d\u0003\u0098L\u0000\u0207"+
		"\u020d\u0003\u0088D\u0000\u0208\u0209\u0005\u0007\u0000\u0000\u0209\u020a"+
		"\u0003v;\u0000\u020a\u020b\u0005\b\u0000\u0000\u020b\u020d\u0001\u0000"+
		"\u0000\u0000\u020c\u0203\u0001\u0000\u0000\u0000\u020c\u0204\u0001\u0000"+
		"\u0000\u0000\u020c\u0205\u0001\u0000\u0000\u0000\u020c\u0206\u0001\u0000"+
		"\u0000\u0000\u020c\u0207\u0001\u0000\u0000\u0000\u020c\u0208\u0001\u0000"+
		"\u0000\u0000\u020d}\u0001\u0000\u0000\u0000\u020e\u0212\u0003$\u0012\u0000"+
		"\u020f\u0211\u0003\u0080@\u0000\u0210\u020f\u0001\u0000\u0000\u0000\u0211"+
		"\u0214\u0001\u0000\u0000\u0000\u0212\u0210\u0001\u0000\u0000\u0000\u0212"+
		"\u0213\u0001\u0000\u0000\u0000\u0213\u007f\u0001\u0000\u0000\u0000\u0214"+
		"\u0212\u0001\u0000\u0000\u0000\u0215\u0216\u0005\u0012\u0000\u0000\u0216"+
		"\u0217\u0003\u0082A\u0000\u0217\u0218\u0005\u0013\u0000\u0000\u0218\u021c"+
		"\u0001\u0000\u0000\u0000\u0219\u021a\u0005\u0014\u0000\u0000\u021a\u021c"+
		"\u0003\u0086C\u0000\u021b\u0215\u0001\u0000\u0000\u0000\u021b\u0219\u0001"+
		"\u0000\u0000\u0000\u021c\u0081\u0001\u0000\u0000\u0000\u021d\u0222\u0003"+
		"\u0084B\u0000\u021e\u021f\u0005\u0003\u0000\u0000\u021f\u0221\u0003\u0084"+
		"B\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0221\u0224\u0001\u0000\u0000"+
		"\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000"+
		"\u0000\u0223\u0083\u0001\u0000\u0000\u0000\u0224\u0222\u0001\u0000\u0000"+
		"\u0000\u0225\u0226\u0003v;\u0000\u0226\u0085\u0001\u0000\u0000\u0000\u0227"+
		"\u0228\u0005(\u0000\u0000\u0228\u0087\u0001\u0000\u0000\u0000\u0229\u022a"+
		"\u0003\u008aE\u0000\u022a\u022c\u0005\u0007\u0000\u0000\u022b\u022d\u0003"+
		"f3\u0000\u022c\u022b\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000"+
		"\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u022f\u0005\b\u0000\u0000"+
		"\u022f\u0089\u0001\u0000\u0000\u0000\u0230\u0231\u0005(\u0000\u0000\u0231"+
		"\u008b\u0001\u0000\u0000\u0000\u0232\u0234\u0003\u0012\t\u0000\u0233\u0232"+
		"\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u0235"+
		"\u0001\u0000\u0000\u0000\u0235\u0236\u0003\u008eG\u0000\u0236\u008d\u0001"+
		"\u0000\u0000\u0000\u0237\u023a\u0003\u0090H\u0000\u0238\u023a\u0003\u0094"+
		"J\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u0239\u0238\u0001\u0000\u0000"+
		"\u0000\u023a\u008f\u0001\u0000\u0000\u0000\u023b\u023c\u0005)\u0000\u0000"+
		"\u023c\u0091\u0001\u0000\u0000\u0000\u023d\u023e\u00053\u0000\u0000\u023e"+
		"\u0093\u0001\u0000\u0000\u0000\u023f\u0240\u0005*\u0000\u0000\u0240\u0095"+
		"\u0001\u0000\u0000\u0000\u0241\u0242\u0005/\u0000\u0000\u0242\u0097\u0001"+
		"\u0000\u0000\u0000\u0243\u0244\u00050\u0000\u0000\u0244\u0099\u0001\u0000"+
		"\u0000\u0000\u0245\u0246\u0007\u0001\u0000\u0000\u0246\u009b\u0001\u0000"+
		"\u0000\u0000\u0247\u0248\u0007\u0000\u0000\u0000\u0248\u009d\u0001\u0000"+
		"\u0000\u0000\u0249\u024a\u0007\u0002\u0000\u0000\u024a\u009f\u0001\u0000"+
		"\u0000\u0000*\u00a9\u00ac\u00af\u00b9\u00c3\u00c7\u00cb\u00d5\u00dd\u00eb"+
		"\u00f6\u00ff\u0104\u010f\u0118\u0125\u0130\u0144\u0153\u016a\u0180\u0185"+
		"\u018c\u0193\u01b7\u01c2\u01cc\u01d4\u01dc\u01df\u01e4\u01ec\u01ef\u01f7"+
		"\u0200\u020c\u0212\u021b\u0222\u022c\u0233\u0239";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}