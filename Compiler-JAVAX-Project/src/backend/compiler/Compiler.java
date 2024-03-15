package backend.compiler;

import antlr4.*;

import intermediate.symtab.*;
import intermediate.symtab.Predefined;

/**
 * Compile Pascal to Jasmin assembly language.
 */
public class Compiler extends jsBaseVisitor<Object>
{
    private SymtabEntry programId;  // symbol table entry of the program name
    private String programName;     // the program name
    
    private CodeGenerator       code;            // base code generator
    private ProgramGenerator    programCode;     // program code generator
    private StatementGenerator  statementCode;   // statement code generator
    private ExpressionGenerator expressionCode;  // expression code generator
    
    /**
     * Constructor for the base compiler.
     * @param programId the symtab entry for the program name.
     */
    public Compiler(SymtabEntry programId)
    {
        this.programId = programId;
        if(programId == null){
            System.out.println("programId is empty");
            return;
        }
        programName = programId.getName();
        
        code = new CodeGenerator(programName, "j", this);
    }
    
    /**
     * Constructor for child compilers of procedures and functions.
     * @param parent the parent compiler.
     */
    public Compiler(Compiler parent)
    {
        this.code        = parent.code;
        this.programCode = parent.programCode;
        this.programId   = parent.programId;
        this.programName = parent.programName;
    }
    
    /**
     * Constructor for child compilers of records.
     * @param parent the parent compiler.
     * @param recordId the symbol table entry of the name of the record to compile.
     */
    public Compiler(Compiler parent, SymtabEntry recordId)
    {        
        String recordTypePath = recordId.getType().getRecordTypePath();
        code = new CodeGenerator(recordTypePath, "j", this);
        createNewGenerators(code);
        
        programCode.emitRecord(recordId, recordTypePath);
    }
    
    /**
     * Create new child code generators.
     * @param parentGenerator the parent code generator.
     */
    private void createNewGenerators(CodeGenerator parentGenerator)
    {
        programCode    = new ProgramGenerator(parentGenerator, this);
        statementCode  = new StatementGenerator(programCode, this);
        expressionCode = new ExpressionGenerator(programCode, this);
    }

    /**
     * Get the name of the object (Jasmin) file.
     * @return the name.
     */
    public String getObjectFileName() { return code.getObjectFileName(); }
    
    @Override 
    public Object visitProgram(jsParser.ProgramContext ctx)
    { 
        createNewGenerators(code);
        programCode.emitProgram(ctx);
        return null;
    }


//    @Override
//    public Object visitRoutineDefinition(
//            jsParser.RoutineDefinitionContext ctx) {
//        createNewGenerators(programCode);
//        programCode.emitRoutine(ctx);
//    }

    @Override
    public Object visitRoutineDefinition(
            jsParser.RoutineDefinitionContext ctx)
    {
        createNewGenerators(programCode);
        programCode.emitRoutine(ctx);
        return null;
    }
    @Override
    public Object visitDecreaseStatement(jsParser.DecreaseStatementContext ctx){
        statementCode.emitDecrease(ctx);
        return null;
    }
    @Override
    public Object visitIncreaseStatement(jsParser.IncreaseStatementContext ctx){
        statementCode.emitIncrease(ctx);
        return null;
    }
    
    @Override
    public Object visitStatement(jsParser.StatementContext ctx)
    {
//        if (   (ctx.compoundStatement() == null)
//            && (ctx.emptyStatement() == null))
//        {
//            statementCode.emitComment(ctx);
//        }
        if (   (ctx == null)
                && (ctx.emptyStatement() == null))
        {
            statementCode.emitComment(ctx);
        }

        return visitChildren(ctx);
    }

    @Override
    public Object visitAssignmentStatement(
            jsParser.AssignmentStatementContext ctx)
    {
        statementCode.emitAssignment(ctx);
        return null;
    }
    @Override
    public Object visitVariableDeclarations(jsParser.VariableDeclarationsContext ctx){

        return null;
    }
    @Override 
    public Object visitIfStatement(jsParser.IfStatementContext ctx)
    {
        statementCode.emitIf(ctx);
        return null;
    }

    @Override 
    public Object visitCaseStatement(jsParser.CaseStatementContext ctx)
    {
        statementCode.emitCase(ctx);
        return null;
    }

//    @Override
//    public Object visitRepeatStatement(jsParser.RepeatStatementContext ctx)
//    {
//        statementCode.emitRepeat(ctx);
//        return null;
//    }

    @Override 
    public Object visitWhileStatement(jsParser.WhileStatementContext ctx)
    {
        statementCode.emitWhile(ctx);
        return null;
    }

    @Override 
    public Object visitForStatement(jsParser.ForStatementContext ctx)
    {
        statementCode.emitFor(ctx);
        return null;
    }

    @Override
    public Object visitProcedureCallStatement(
            jsParser.ProcedureCallStatementContext ctx)
    {
        statementCode.emitProcedureCall(ctx);
        return null;
    }

    @Override 
    public Object visitExpression(jsParser.ExpressionContext ctx)
    {
        expressionCode.emitExpression(ctx);
        return null;
    }

    @Override 
    public Object visitVariableFactor(jsParser.VariableFactorContext ctx)
    {
        expressionCode.emitLoadValue(ctx.variable());
        return null;
    }

    @Override 
    public Object visitVariable(jsParser.VariableContext ctx)
    {
        expressionCode.emitLoadVariable(ctx);
        return null;
    }

    @Override 
    public Object visitNumberFactor(jsParser.NumberFactorContext ctx)
    {
        if (ctx.type == Predefined.integerType) 
        {
            expressionCode.emitLoadIntegerConstant(ctx.number());
        }
        else
        {
            expressionCode.emitLoadDoubleConstant(ctx.number());
        }
        
        return null;
    }

    @Override 
    public Object visitCharacterFactor(jsParser.CharacterFactorContext ctx)
    {
        char ch = ctx.getText().charAt(1);
        expressionCode.emitLoadConstant(ch);

        return null;
    }

    @Override 
    public Object visitStringFactor(jsParser.StringFactorContext ctx)
    {
        String jasminString = convertString(ctx.getText());
        expressionCode.emitLoadConstant(jasminString);
        
        return null;
    }
    
    /**
     * Convert a Pascal string to a Java string.
     * @param pascalString the Pascal string.
     * @return the Java string.
     */
    String convertString(String pascalString)
    {
        String unquoted = pascalString.substring(1, pascalString.length()-1);
        return unquoted.replace("''", "'").replace("\"", "\\\"");
    }

    @Override 
    public Object visitFunctionCallFactor(
            jsParser.FunctionCallFactorContext ctx)
    {
        statementCode.emitFunctionCall(ctx.functionCall());
        return null;
    }

//    @Override
//    public Object visitNotFactor(jsParser.NotFactorContext ctx)
//    {
//        expressionCode.emitNotFactor(ctx);
//        return null;
//    }

    @Override 
    public Object visitParenthesizedFactor(
            jsParser.ParenthesizedFactorContext ctx)
    {
        return visit(ctx.expression());
    }

    @Override 
    public Object visitPrintStatement(jsParser.PrintStatementContext ctx)
    {
        statementCode.emitWrite(ctx);
        return null;
    }

    @Override 
    public Object visitPrintlnStatement(jsParser.PrintlnStatementContext ctx)
    {
        statementCode.emitWriteln(ctx);
        return null;
    }

//    @Override
//    public Object visitReadStatement(jsParser.ReadStatementContext ctx)
//    {
//        statementCode.emitRead(ctx);
//        return null;
//    }
//
//    @Override
//    public Object visitReadlnStatement(jsParser.ReadlnStatementContext ctx)
//    {
//        statementCode.emitReadln(ctx);
//        return null;
//    }
}
