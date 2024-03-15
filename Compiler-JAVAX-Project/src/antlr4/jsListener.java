// Generated from C:/Users/chy98/OneDrive/Documents/GitHub/compiler-proj/src/antlr4/js.g4 by ANTLR 4.13.1
package antlr4;

    import java.util.HashMap;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link jsParser}.
 */
public interface jsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link jsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(jsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(jsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(jsParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(jsParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#blockForFunction}.
	 * @param ctx the parse tree
	 */
	void enterBlockForFunction(jsParser.BlockForFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#blockForFunction}.
	 * @param ctx the parse tree
	 */
	void exitBlockForFunction(jsParser.BlockForFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(jsParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(jsParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#constantsPart}.
	 * @param ctx the parse tree
	 */
	void enterConstantsPart(jsParser.ConstantsPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#constantsPart}.
	 * @param ctx the parse tree
	 */
	void exitConstantsPart(jsParser.ConstantsPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#constantDefinitionsList}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinitionsList(jsParser.ConstantDefinitionsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#constantDefinitionsList}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinitionsList(jsParser.ConstantDefinitionsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(jsParser.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(jsParser.ConstantDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#constantIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantIdentifier(jsParser.ConstantIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#constantIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantIdentifier(jsParser.ConstantIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(jsParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(jsParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(jsParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(jsParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(jsParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(jsParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleTypespec}
	 * labeled alternative in {@link jsParser#typeSpecification}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypespec(jsParser.SimpleTypespecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleTypespec}
	 * labeled alternative in {@link jsParser#typeSpecification}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypespec(jsParser.SimpleTypespecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeIdentifierTypespec}
	 * labeled alternative in {@link jsParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifierTypespec(jsParser.TypeIdentifierTypespecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeIdentifierTypespec}
	 * labeled alternative in {@link jsParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifierTypespec(jsParser.TypeIdentifierTypespecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enumerationTypespec}
	 * labeled alternative in {@link jsParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationTypespec(jsParser.EnumerationTypespecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enumerationTypespec}
	 * labeled alternative in {@link jsParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationTypespec(jsParser.EnumerationTypespecContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#enumerationType}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationType(jsParser.EnumerationTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#enumerationType}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationType(jsParser.EnumerationTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(jsParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(jsParser.EnumerationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#variablesPart}.
	 * @param ctx the parse tree
	 */
	void enterVariablesPart(jsParser.VariablesPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#variablesPart}.
	 * @param ctx the parse tree
	 */
	void exitVariablesPart(jsParser.VariablesPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#variableDeclarationsList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationsList(jsParser.VariableDeclarationsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#variableDeclarationsList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationsList(jsParser.VariableDeclarationsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#variableDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarations(jsParser.VariableDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#variableDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarations(jsParser.VariableDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableIdentifier(jsParser.VariableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableIdentifier(jsParser.VariableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#routinesPart}.
	 * @param ctx the parse tree
	 */
	void enterRoutinesPart(jsParser.RoutinesPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#routinesPart}.
	 * @param ctx the parse tree
	 */
	void exitRoutinesPart(jsParser.RoutinesPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#routineDefinition}.
	 * @param ctx the parse tree
	 */
	void enterRoutineDefinition(jsParser.RoutineDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#routineDefinition}.
	 * @param ctx the parse tree
	 */
	void exitRoutineDefinition(jsParser.RoutineDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#functionHead}.
	 * @param ctx the parse tree
	 */
	void enterFunctionHead(jsParser.FunctionHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#functionHead}.
	 * @param ctx the parse tree
	 */
	void exitFunctionHead(jsParser.FunctionHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#routineIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterRoutineIdentifier(jsParser.RoutineIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#routineIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitRoutineIdentifier(jsParser.RoutineIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(jsParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(jsParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#parameterIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterParameterIdentifier(jsParser.ParameterIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#parameterIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitParameterIdentifier(jsParser.ParameterIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(jsParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(jsParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#increaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIncreaseStatement(jsParser.IncreaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#increaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIncreaseStatement(jsParser.IncreaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#decreaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterDecreaseStatement(jsParser.DecreaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#decreaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitDecreaseStatement(jsParser.DecreaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(jsParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(jsParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(jsParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(jsParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(jsParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(jsParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(jsParser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(jsParser.LhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#rhs}.
	 * @param ctx the parse tree
	 */
	void enterRhs(jsParser.RhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#rhs}.
	 * @param ctx the parse tree
	 */
	void exitRhs(jsParser.RhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(jsParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(jsParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#trueStatement}.
	 * @param ctx the parse tree
	 */
	void enterTrueStatement(jsParser.TrueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#trueStatement}.
	 * @param ctx the parse tree
	 */
	void exitTrueStatement(jsParser.TrueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#falseStatement}.
	 * @param ctx the parse tree
	 */
	void enterFalseStatement(jsParser.FalseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#falseStatement}.
	 * @param ctx the parse tree
	 */
	void exitFalseStatement(jsParser.FalseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(jsParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(jsParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#caseBranchList}.
	 * @param ctx the parse tree
	 */
	void enterCaseBranchList(jsParser.CaseBranchListContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#caseBranchList}.
	 * @param ctx the parse tree
	 */
	void exitCaseBranchList(jsParser.CaseBranchListContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void enterCaseBranch(jsParser.CaseBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void exitCaseBranch(jsParser.CaseBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#caseConstantList}.
	 * @param ctx the parse tree
	 */
	void enterCaseConstantList(jsParser.CaseConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#caseConstantList}.
	 * @param ctx the parse tree
	 */
	void exitCaseConstantList(jsParser.CaseConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#defaultStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefaultStatement(jsParser.DefaultStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#defaultStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefaultStatement(jsParser.DefaultStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#caseConstant}.
	 * @param ctx the parse tree
	 */
	void enterCaseConstant(jsParser.CaseConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#caseConstant}.
	 * @param ctx the parse tree
	 */
	void exitCaseConstant(jsParser.CaseConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(jsParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(jsParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(jsParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(jsParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(jsParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(jsParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(jsParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(jsParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(jsParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(jsParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(jsParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(jsParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#printlnStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintlnStatement(jsParser.PrintlnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#printlnStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintlnStatement(jsParser.PrintlnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#printArguments}.
	 * @param ctx the parse tree
	 */
	void enterPrintArguments(jsParser.PrintArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#printArguments}.
	 * @param ctx the parse tree
	 */
	void exitPrintArguments(jsParser.PrintArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#printArgument}.
	 * @param ctx the parse tree
	 */
	void enterPrintArgument(jsParser.PrintArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#printArgument}.
	 * @param ctx the parse tree
	 */
	void exitPrintArgument(jsParser.PrintArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#fieldWidth}.
	 * @param ctx the parse tree
	 */
	void enterFieldWidth(jsParser.FieldWidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#fieldWidth}.
	 * @param ctx the parse tree
	 */
	void exitFieldWidth(jsParser.FieldWidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#decimalPlaces}.
	 * @param ctx the parse tree
	 */
	void enterDecimalPlaces(jsParser.DecimalPlacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#decimalPlaces}.
	 * @param ctx the parse tree
	 */
	void exitDecimalPlaces(jsParser.DecimalPlacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(jsParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(jsParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(jsParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(jsParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(jsParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(jsParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link jsParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterVariableFactor(jsParser.VariableFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link jsParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitVariableFactor(jsParser.VariableFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link jsParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumberFactor(jsParser.NumberFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link jsParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumberFactor(jsParser.NumberFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link jsParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterCharacterFactor(jsParser.CharacterFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link jsParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitCharacterFactor(jsParser.CharacterFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link jsParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterStringFactor(jsParser.StringFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link jsParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitStringFactor(jsParser.StringFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallFactor}
	 * labeled alternative in {@link jsParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallFactor(jsParser.FunctionCallFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallFactor}
	 * labeled alternative in {@link jsParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallFactor(jsParser.FunctionCallFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedFactor}
	 * labeled alternative in {@link jsParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedFactor(jsParser.ParenthesizedFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedFactor}
	 * labeled alternative in {@link jsParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedFactor(jsParser.ParenthesizedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(jsParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(jsParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(jsParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(jsParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#indexList}.
	 * @param ctx the parse tree
	 */
	void enterIndexList(jsParser.IndexListContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#indexList}.
	 * @param ctx the parse tree
	 */
	void exitIndexList(jsParser.IndexListContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(jsParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(jsParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(jsParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(jsParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(jsParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(jsParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(jsParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(jsParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(jsParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(jsParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(jsParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(jsParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#integerConstant}.
	 * @param ctx the parse tree
	 */
	void enterIntegerConstant(jsParser.IntegerConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#integerConstant}.
	 * @param ctx the parse tree
	 */
	void exitIntegerConstant(jsParser.IntegerConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#realConstant}.
	 * @param ctx the parse tree
	 */
	void enterRealConstant(jsParser.RealConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#realConstant}.
	 * @param ctx the parse tree
	 */
	void exitRealConstant(jsParser.RealConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#doubleConstant}.
	 * @param ctx the parse tree
	 */
	void enterDoubleConstant(jsParser.DoubleConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#doubleConstant}.
	 * @param ctx the parse tree
	 */
	void exitDoubleConstant(jsParser.DoubleConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#characterConstant}.
	 * @param ctx the parse tree
	 */
	void enterCharacterConstant(jsParser.CharacterConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#characterConstant}.
	 * @param ctx the parse tree
	 */
	void exitCharacterConstant(jsParser.CharacterConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(jsParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(jsParser.StringConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(jsParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(jsParser.RelOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(jsParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(jsParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void enterMulOp(jsParser.MulOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void exitMulOp(jsParser.MulOpContext ctx);
}