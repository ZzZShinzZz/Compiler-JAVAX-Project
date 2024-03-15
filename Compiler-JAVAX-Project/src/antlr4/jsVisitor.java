// Generated from ./js.g4 by ANTLR 4.13.1

    package antlr4;
    import java.util.HashMap;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link jsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface jsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link jsParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(jsParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(jsParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#blockForFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockForFunction(jsParser.BlockForFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(jsParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#constantsPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantsPart(jsParser.ConstantsPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#constantDefinitionsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinitionsList(jsParser.ConstantDefinitionsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#constantDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinition(jsParser.ConstantDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#constantIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantIdentifier(jsParser.ConstantIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(jsParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(jsParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentifier(jsParser.TypeIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleTypespec}
	 * labeled alternative in {@link jsParser#typeSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypespec(jsParser.SimpleTypespecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeIdentifierTypespec}
	 * labeled alternative in {@link jsParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentifierTypespec(jsParser.TypeIdentifierTypespecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enumerationTypespec}
	 * labeled alternative in {@link jsParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationTypespec(jsParser.EnumerationTypespecContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#enumerationType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationType(jsParser.EnumerationTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#enumerationConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationConstant(jsParser.EnumerationConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#variablesPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablesPart(jsParser.VariablesPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#variableDeclarationsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationsList(jsParser.VariableDeclarationsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#variableDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarations(jsParser.VariableDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#variableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableIdentifier(jsParser.VariableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#routinesPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutinesPart(jsParser.RoutinesPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#routineDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineDefinition(jsParser.RoutineDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#procedureHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureHead(jsParser.ProcedureHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#functionHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionHead(jsParser.FunctionHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#routineIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineIdentifier(jsParser.RoutineIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(jsParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#parameterDeclarationsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarationsList(jsParser.ParameterDeclarationsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#parameterDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarations(jsParser.ParameterDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#parameterIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterIdentifierList(jsParser.ParameterIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#parameterIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterIdentifier(jsParser.ParameterIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(jsParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#increaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncreaseStatement(jsParser.IncreaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#decreaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecreaseStatement(jsParser.DecreaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(jsParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(jsParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(jsParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs(jsParser.LhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRhs(jsParser.RhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(jsParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#trueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueStatement(jsParser.TrueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#falseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseStatement(jsParser.FalseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(jsParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#caseBranchList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBranchList(jsParser.CaseBranchListContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#caseBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBranch(jsParser.CaseBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#caseConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseConstantList(jsParser.CaseConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#defaultStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultStatement(jsParser.DefaultStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#caseConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseConstant(jsParser.CaseConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(jsParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(jsParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(jsParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#procedureCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureCallStatement(jsParser.ProcedureCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#procedureName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureName(jsParser.ProcedureNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(jsParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(jsParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(jsParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#printlnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintlnStatement(jsParser.PrintlnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#printArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintArguments(jsParser.PrintArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#printArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintArgument(jsParser.PrintArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#fieldWidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldWidth(jsParser.FieldWidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#decimalPlaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalPlaces(jsParser.DecimalPlacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(jsParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(jsParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(jsParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link jsParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableFactor(jsParser.VariableFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link jsParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFactor(jsParser.NumberFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link jsParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterFactor(jsParser.CharacterFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link jsParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFactor(jsParser.StringFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallFactor}
	 * labeled alternative in {@link jsParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallFactor(jsParser.FunctionCallFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedFactor}
	 * labeled alternative in {@link jsParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedFactor(jsParser.ParenthesizedFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(jsParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(jsParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#indexList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexList(jsParser.IndexListContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(jsParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(jsParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(jsParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(jsParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(jsParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(jsParser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#integerConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConstant(jsParser.IntegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#realConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealConstant(jsParser.RealConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#doubleConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleConstant(jsParser.DoubleConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#characterConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterConstant(jsParser.CharacterConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#stringConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstant(jsParser.StringConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(jsParser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(jsParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#mulOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOp(jsParser.MulOpContext ctx);
}