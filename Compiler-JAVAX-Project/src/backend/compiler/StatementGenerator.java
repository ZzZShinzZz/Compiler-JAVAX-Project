package backend.compiler;

import java.util.*;

import antlr4.jsParser;

import antlr4.jsParser;
import intermediate.symtab.*;
import intermediate.type.*;
import intermediate.type.Typespec.Form;

import static intermediate.type.Typespec.Form.*;
import static backend.compiler.Instruction.*;

/**
 * <h1>StatementGenerator</h1>
 *
 * <p>Emit code for executable statements.</p>
 *
 * <p>Copyright (c) 2020 by Ronald Mak</p>
 * <p>For instructional purposes only.  No warranties.</p>
 */
public class StatementGenerator extends CodeGenerator
{
    /**
     * Constructor.
     * @param parent the parent generator.
     * @param compiler the compiler to use.
     */
    public StatementGenerator(CodeGenerator parent, Compiler compiler)
    {
        super(parent, compiler);
    }

    /**
     * Emit code for an assignment statement.
     * @param ctx the AssignmentStatementContext.
     */
    public void emitAssignment(jsParser.AssignmentStatementContext ctx)
    {
        jsParser.VariableContext   varCtx  = ctx.lhs().variable();
        jsParser.ExpressionContext exprCtx = ctx.rhs().expression();
        SymtabEntry varId = varCtx.entry;
        Typespec varType  = varCtx.type;
        Typespec exprType = exprCtx.type;

        // The last modifier, if any, is the variable's last subscript or field.
        int modifierCount = varCtx.modifier().size();
        jsParser.ModifierContext lastModCtx = modifierCount == 0
                            ? null : varCtx.modifier().get(modifierCount - 1);

        // The target variable has subscripts and/or fields.
        if (modifierCount > 0) 
        {
            lastModCtx = varCtx.modifier().get(modifierCount - 1);
            compiler.visit(varCtx);
        }
        
        // Emit code to evaluate the expression.
        compiler.visit(exprCtx);
        
        // float variable := integer constant
        if (   (varType == Predefined.doubleType)
            && (exprType.baseType() == Predefined.integerType)) emit(I2F);
        
        // Emit code to store the expression value into the target variable.
        // The target variable has no subscripts or fields.
        if (lastModCtx == null) emitStoreValue(varId, varId.getType());

        // The target variable is a field.
        else if (lastModCtx.field() != null)
        {
            emitStoreValue(lastModCtx.field().entry, lastModCtx.field().type);
        }

        // The target variable is an array element.
        else
        {
            emitStoreValue(null, varType);
        }
    }

    /**
     * Emit code for an IF statement.
     * @param ctx the IfStatementContext.
     */
    public void emitIf(jsParser.IfStatementContext ctx) {
        // Get the true and false statement contexts from the IfStatementContext.
        jsParser.TrueStatementContext tctx = ctx.trueStatement();
        jsParser.FalseStatementContext fctx = ctx.falseStatement();

        // Create a label for the exit point of the if statement.
        Label loopExitLabel = new Label();

        // Visit the expression node.
        compiler.visit(ctx.expression());

        // If there is no false statement, emit an IFEQ instruction and visit the true statement.
        if (fctx == null) {

            emit(IFEQ, loopExitLabel);
            compiler.visit(tctx);

        } else {
            // If there is a false statement, create a label for it.
            Label falseLabel = new Label();

            // Emit an IFEQ instruction to jump to the false statement if the condition is false.
            emit(IFEQ, falseLabel);

            // Visit the true statement.
            compiler.visit(tctx);

            // Emit a GOTO instruction to skip the false statement and go to the exit label.
            emit(GOTO, loopExitLabel);

            // Emit the label for the false statement.
            emitLabel(falseLabel);

            // Visit the false statement.
            compiler.visit(fctx);
        }

        // Emit the label for the exit point of the if statement.
        emitLabel(loopExitLabel);
    }


    /**
     * Emit code for a CASE statement.
     * @param ctx the CaseStatementContext.
     */
    public void emitCase(jsParser.CaseStatementContext ctx)
    {
        /***** Complete this method. *****/
        //load expression variable onto stack
        compiler.visit(ctx.expression());

        ArrayList<Label> branches = new ArrayList<>();
        TreeMap<Integer,Label> labelToConstant = new TreeMap<>();

        emit(LOOKUPSWITCH);

        // Process each case branch
        for(jsParser.CaseBranchContext branchCtx : ctx.caseBranchList().caseBranch()) {
            Label label = new Label();
            branches.add(label);
            String[] constants = branchCtx.caseConstantList().getText().split(",");

            // Map each constant to a label
            for(String constant : constants) {
                int value = constant.charAt(0) == '\'' ? (int) constant.charAt(1) : Integer.parseInt(constant);
                labelToConstant.put(value, label);
            }
        }

        // Emit labels for LookUpSwitch
        for(Map.Entry<Integer, Label> entry : labelToConstant.entrySet()) {
            emitLabel(entry.getKey(), entry.getValue());
        }

        Label defaultLabel = new Label(); //L006
        Label exitLabel = new Label(); // L007

        if(ctx.caseBranchList().defaultStatement()!=null){
            emitLabel("default", defaultLabel);
        }else{
            emitLabel("default", exitLabel);
        }



        // Emit case statements
        for(int i = 0; i < ctx.caseBranchList().caseBranch().size(); i++) {
            jsParser.CaseBranchContext branchCtx = ctx.caseBranchList().caseBranch().get(i);
            emitLabel(branches.get(i));

            compiler.visit(branchCtx.statement());
            emit(GOTO, exitLabel); // goto L007
        }

        //emit for default statement
        if(ctx.caseBranchList().defaultStatement()!=null){
            emitLabel(defaultLabel); //L006
            compiler.visit(ctx.caseBranchList().defaultStatement().statement());
        }

        emitLabel(exitLabel);
    }




    /**
     * Emit code for a REPEAT statement.
     * @param ctx the RepeatStatementContext.
     */
//    public void emitRepeat(jsParser.RepeatStatementContext ctx)
//    {
//        Label loopTopLabel  = new Label();
//        Label loopExitLabel = new Label();
//
//        emitLabel(loopTopLabel);
//
//        compiler.visit(ctx.statementList());
//        compiler.visit(ctx.expression());
//        emit(IFNE, loopExitLabel);
//        emit(GOTO, loopTopLabel);
//
//        emitLabel(loopExitLabel);
//    }
    
    /**
     * Emit code for a WHILE statement.
     * @param ctx the WhileStatementContext.
     */

    public void emitWhile(jsParser.WhileStatementContext ctx) {
        // Create labels for the top of the loop and the loop exit.
        Label loopTopLabel = new Label();
        Label loopExitLabel = new Label();

        // Emit the label for the top of the loop.
        emitLabel(loopTopLabel);

        // Visit the expression node and emit an IFEQ instruction to exit the loop if false.
        compiler.visit(ctx.expression());
        emit(IFEQ, loopExitLabel);

        // Visit the statement (body of the loop).
        compiler.visit(ctx.statementList());

        // Emit a GOTO instruction to jump back to the top of the loop.
        emit(GOTO, loopTopLabel);

        // Emit the label for the loop exit.
        emitLabel(loopExitLabel);
    }
    
    /**
     * Emit code for a FOR statement.
     * @param ctx the ForStatementContext.
     */
    public void emitDecrease(jsParser.DecreaseStatementContext ctx){
        jsParser.VariableContext   varCtx  = ctx.variable();
        SymtabEntry varId = varCtx.entry;
        Typespec varType  = varCtx.type;

        // The last modifier, if any, is the variable's last subscript or field.
        int modifierCount = varCtx.modifier().size();
        jsParser.ModifierContext lastModCtx = modifierCount == 0
                ? null : varCtx.modifier().get(modifierCount - 1);

        // The target variable has subscripts and/or fields.
        if (modifierCount > 0)
        {
            lastModCtx = varCtx.modifier().get(modifierCount - 1);
            compiler.visit(varCtx);
        }

        // Emit code to evaluate the expression.
//            compiler.visit(exprCtx);

        Typespec type = varId.getType().baseType();
        String variableName = varId.getName();
        String name = programName + "/" + variableName;
        emit(GETSTATIC, name, typeDescriptor(type));

        emit(ICONST_1);
        emit(ISUB);

//            // float variable := integer constant
//            if (   (varType == Predefined.doubleType)
//                    && (exprType.baseType() == Predefined.integerType)) emit(I2F);

        // Emit code to store the expression value into the target variable.
        // The target variable has no subscripts or fields.
        if (lastModCtx == null) emitStoreValue(varId, varId.getType());

            // The target variable is a field.
        else if (lastModCtx.field() != null)
        {
            emitStoreValue(lastModCtx.field().entry, lastModCtx.field().type);
        }

        // The target variable is an array element.
        else
        {
            emitStoreValue(null, varType);
        }
    }

    public void emitIncrease(jsParser.IncreaseStatementContext ctx){
        jsParser.VariableContext   varCtx  = ctx.variable();
        SymtabEntry varId = varCtx.entry;
        Typespec varType  = varCtx.type;

        // The last modifier, if any, is the variable's last subscript or field.
        int modifierCount = varCtx.modifier().size();
        jsParser.ModifierContext lastModCtx = modifierCount == 0
                ? null : varCtx.modifier().get(modifierCount - 1);

        // The target variable has subscripts and/or fields.
        if (modifierCount > 0)
        {
            lastModCtx = varCtx.modifier().get(modifierCount - 1);
            compiler.visit(varCtx);
        }

        // Emit code to evaluate the expression.
//            compiler.visit(exprCtx);

        Typespec type = varId.getType().baseType();
        String variableName = varId.getName();
        String name = programName + "/" + variableName;
        emit(GETSTATIC, name, typeDescriptor(type));

        emit(ICONST_1);
        emit(IADD);

//            // float variable := integer constant
//            if (   (varType == Predefined.doubleType)
//                    && (exprType.baseType() == Predefined.integerType)) emit(I2F);

        // Emit code to store the expression value into the target variable.
        // The target variable has no subscripts or fields.
        if (lastModCtx == null) emitStoreValue(varId, varId.getType());
    }
    public void emitFor(jsParser.ForStatementContext ctx)
    {

        Label loopTopLabel = new Label();
        Label loopExitLabel = new Label();

        jsParser.FactorContext numFac = ctx.variablesPart().variableDeclarationsList().variableDeclarations(0).expression().simpleExpression(0).term(0).factor(0);
        if(numFac instanceof jsParser.NumberFactorContext){

            numFac.type = ctx.variablesPart().variableDeclarationsList().variableDeclarations(0).typeSpecification().type;

        }

        compiler.visit(ctx.variablesPart().variableDeclarationsList().variableDeclarations(0).expression()); // init assign
        emitStoreValue(ctx.variablesPart().variableDeclarationsList().variableDeclarations(0).variableIdentifier().entry, ctx.variablesPart().variableDeclarationsList().variableDeclarations(0).typeSpecification().type);

        emitLabel(loopTopLabel);
        emitLoadValue(ctx.variablesPart().variableDeclarationsList().variableDeclarations(0).variableIdentifier().entry);
        compiler.visit(ctx.expression().simpleExpression(1));

        //check and assign appropriate expression
        if(ctx.expression().relOp().getText().equals("<")){
            emit(IF_ICMPGE,loopExitLabel);
        }else if(ctx.expression().relOp().getText().equals("!=")){
            emit(IF_ICMPEQ, loopExitLabel); // branch for exit if expression is "!="
        }else if(ctx.expression().relOp().getText().equals("<=")){
            emit(IF_ICMPGT, loopExitLabel); // branch for exit if expression is "<="
        }else if(ctx.expression().relOp().getText().equals(">")){
            emit(IF_ICMPLE, loopExitLabel); // branch for exit if expression is ">"
        }else if(ctx.expression().relOp().getText().equals(">=")){
            emit(IF_ICMPLT, loopExitLabel); // branch for exit if expression is ">="
        }else if(ctx.expression().relOp().getText().equals("==")){
            emit(IF_ICMPNE, loopExitLabel); // branch for exit if expression is ">="
        }


        compiler.visit(ctx.statementList()); // visit the body of the loop

        if(ctx.statement().increaseStatement()!=null){
            compiler.visit(ctx.statement().increaseStatement());


        }else if(ctx.statement().decreaseStatement()!=null){
            compiler.visit(ctx.statement().decreaseStatement());

        }else{
            compiler.visit(ctx.statement());
        };

        emit(GOTO, loopTopLabel);
        emitLabel(loopExitLabel);


    }


    public void emitProcedureCall(jsParser.ProcedureCallStatementContext ctx)
    {
        /***** Complete this method. *****/
        String param = ctx.getText();
        System.out.println("procedure call: " +param);
        jsParser.ArgumentListContext argList = ctx.argumentList();

        if(argList!=null){
//            compiler.visit(ctx.argumentList());
            System.out.println("size:" + argList.argument().size());
            for(jsParser.ArgumentContext argCtx:argList.argument()){
                System.out.println(argCtx.getText());
            }
        }

        emitCall(ctx.procedureName().entry, ctx.argumentList());



    }

    /**
     * Emit code for a function call statement.
     * @param ctx the FunctionCallContext.
     */
    public void emitFunctionCall(jsParser.FunctionCallContext ctx)
    {
        /***** Complete this method. *****/
        emitCall(ctx.functionName().entry, ctx.argumentList());


    }

    /**
     * Emit a call to a procedure or a function.
     * @param routineId the routine name's symbol table entry.
     * @param argListCtx the ArgumentListContext.
     */
    private void emitCall(SymtabEntry routineId, jsParser.ArgumentListContext argListCtx) {
        if (argListCtx == null) {
            return; // No arguments to process.
        }

        // Collect expected argument types and build the argument type string.
        List<Typespec> expectedArgTypes = new ArrayList<>();
        StringBuilder argTypeBuilder = new StringBuilder();

        for (SymtabEntry argSymTabEntry : routineId.getRoutineParameters()) {
            expectedArgTypes.add(argSymTabEntry.getType());
            argTypeBuilder.append(typeToString(argSymTabEntry.getType()));
        }

        String argType = argTypeBuilder.toString();

        // Process the arguments.
        for (int idx = 0; idx < argListCtx.argument().size(); ++idx) {
            jsParser.ArgumentContext argCtx = argListCtx.argument(idx);
            compiler.visit(argCtx.expression());

            if (!argCtx.expression().type.equals(expectedArgTypes.get(idx))) {
                emit(Instruction.I2F);
            }
        }

        // Get the return type string.
        String returnType = typeToString(routineId.getType());

        // If returnType is null, set it to "V".
        returnType = returnType != null ? returnType : "V";

        // Construct and emit the function call.

        String funcName = programName + "/" + routineId.getName() + "(" + argType + ")" + returnType;

        emit(Instruction.INVOKESTATIC, funcName);
    }

    public String typeToString(Typespec type) {
        // Define a map to map Typespec objects to their string representations.
        Map<Typespec, String> typeMap = new HashMap<>();
        typeMap.put(Predefined.integerType, "I");
        typeMap.put(Predefined.charType, "C");
        typeMap.put(Predefined.booleanType, "Z");
        typeMap.put(Predefined.realType, "F");
        typeMap.put(Predefined.stringType, "S");
        typeMap.put(Predefined.undefinedType, "V");

        // Get the string representation from the map.
        return typeMap.get(type);
    }
    /**
     * Emit code for a WRITE statement.
     * @param ctx the WriteStatementContext.
     */
    public void emitWrite(jsParser.PrintStatementContext ctx)
    {
        emitWrite(ctx.printArguments(), false);
    }

    /**
     * Emit code for a WRITELN statement.
     * @param ctx the WritelnStatementContext.
     */
    public void emitWriteln(jsParser.PrintlnStatementContext ctx)
    {
        emitWrite(ctx.printArguments(), true);
    }

    /**
     * Emit code for a call to WRITE or WRITELN.
     * @param argsCtx the WriteArgumentsContext.
     * @param needLF true if need a line feed.
     */
    private void emitWrite(jsParser.PrintArgumentsContext argsCtx,
                           boolean needLF)
    {
        emit(GETSTATIC, "java/lang/System/out", "Ljava/io/PrintStream;");

        // WRITELN with no arguments.
        if (argsCtx == null) 
        {
            emit(INVOKEVIRTUAL, "java/io/PrintStream.println()V");
            localStack.decrease(1);
        }
            
        // Generate code for the arguments.
        else
        {
            StringBuffer format = new StringBuffer();
            int exprCount = createWriteFormat(argsCtx, format, needLF);
            
            // Load the format string.
            emit(LDC, format.toString());
            
            // Emit the arguments array.
            if (exprCount > 0)
            {
                emitArgumentsArray(argsCtx, exprCount);

                emit(INVOKEVIRTUAL,
                     "java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)" +
                     "Ljava/io/PrintStream;");
                localStack.decrease(2);
                emit(POP);
            }
            else
            {
                emit(INVOKEVIRTUAL,
                     "java/io/PrintStream/print(Ljava/lang/String;)V");
                localStack.decrease(2);
            }
        }
    }
    
    /**
     * Create the printf format string.
     * @param argsCtx the WriteArgumentsContext.
     * @param format the format string to create.
     * @return the count of expression arguments.
     */
    private int createWriteFormat(jsParser.PrintArgumentsContext argsCtx,
                                  StringBuffer format, boolean needLF)
    {
        int exprCount = 0;
        format.append("\"");
        
        // Loop over the write arguments.
        for (jsParser.PrintArgumentContext argCtx : argsCtx.printArgument())
        {
            Typespec type = argCtx.expression().type;
            String argText = argCtx.getText();
            
            // Append any literal strings.
            if (argText.charAt(0) == '\'') 
            {
                format.append(convertString(argText));
            }
            
            // For any other expressions, append a field specifier.
            else
            {
                exprCount++;
                format.append("%");

                jsParser.FieldWidthContext fwCtx = argCtx.fieldWidth();
                if (fwCtx != null)
                {
                    String sign = (   (fwCtx.sign() != null) 
                                   && (fwCtx.sign().getText().equals("-"))) 
                                ? "-" : "";
                    format.append(sign)
                          .append(fwCtx.integerConstant().getText());

                    jsParser.DecimalPlacesContext dpCtx =
                                                        fwCtx.decimalPlaces();
                    if (dpCtx != null)
                    {
                        format.append(".")
                              .append(dpCtx.integerConstant().getText());
                    }
                }
                
                String typeFlag = type == Predefined.integerType ? "d" 
                                : type == Predefined.doubleType    ? "f"
                                : type == Predefined.booleanType ? "b" 
                                : type == Predefined.charType    ? "c" 
                                :                                  "s";
                format.append(typeFlag);
            }
        }
        
        format.append(needLF ? "\\n\"" : "\"");
 
        return exprCount;
    }
    
    /**
     * Emit the printf arguments array.
     * @param argsCtx
     * @param exprCount
     */
    private void emitArgumentsArray(jsParser.PrintArgumentsContext argsCtx,
                                    int exprCount)
    {
        // Create the arguments array.
        emitLoadConstant(exprCount);
        emit(ANEWARRAY, "java/lang/Object");

        int index = 0;

        // Loop over the write arguments to fill the arguments array.
        for (jsParser.PrintArgumentContext argCtx :
                                                    argsCtx.printArgument())
        {
            String argText = argCtx.getText();
            jsParser.ExpressionContext exprCtx = argCtx.expression();
            Typespec type = exprCtx.type.baseType();
            
            // Skip string constants, which were made part of
            // the format string.
            if (argText.charAt(0) != '\'') 
            {
                emit(DUP);
                emitLoadConstant(index++);

                compiler.visit(exprCtx);

                Form form = type.getForm();
                if (    ((form == SCALAR) || (form == ENUMERATION))
                     && (type != Predefined.stringType))
                {
                    emit(INVOKESTATIC, valueOfSignature(type));
                }

                // Store the value into the array.
                emit(AASTORE);
            }
        }
    }


    /**
     * Emit code for a READ statement.
     * @param ctx the ReadStatementContext.
     */
//    public void emitRead(jsParser.ReadStatementContext ctx)
//    {
//        emitRead(ctx.readArguments(), false);
//    }

    /**
     * Emit code for a READLN statement.
     * @param ctx the ReadlnStatementContext.
     */
//    public void emitReadln(jsParser.ReadlnStatementContext ctx)
//    {
//        emitRead(ctx.readArguments(), true);
//    }

    /**
     * Generate code for a call to READ or READLN.
     * @param argsCtx the ReadArgumentsContext.
     * @param needSkip true if need to skip the rest of the input line.
     */
    /*
    private void emitRead(jsParser.ReadArgumentsContext argsCtx,
                          boolean needSkip)
    {
        int size = argsCtx.variable().size();
        
        // Loop over read arguments.
        for (int i = 0; i < size; i++)
        {
            jsParser.VariableContext varCtx = argsCtx.variable().get(i);
            Typespec varType = varCtx.type;
            
            if (varType == Predefined.integerType)
            {
                emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
                emit(INVOKEVIRTUAL, "java/util/Scanner/nextInt()I");
                emitStoreValue(varCtx.entry, null);
            }
            else if (varType == Predefined.realType)
            {
                emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
                emit(INVOKEVIRTUAL, "java/util/Scanner/nextFloat()F");
                emitStoreValue(varCtx.entry, null);
            }
            else if (varType == Predefined.booleanType)
            {
                emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
                emit(INVOKEVIRTUAL, "java/util/Scanner/nextBoolean()Z");
                emitStoreValue(varCtx.entry, null);
            }
            else if (varType == Predefined.charType)
            {
                emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
                emit(LDC, "\"\"");
                emit(INVOKEVIRTUAL, "java/util/Scanner/useDelimiter(Ljava/lang/String;)" +
                                    "Ljava/util/Scanner;");
                emit(POP);                
                emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
                emit(INVOKEVIRTUAL, "java/util/Scanner/next()Ljava/lang/String;");
                emit(ICONST_0);           
                emit(INVOKEVIRTUAL, "java/lang/String/charAt(I)C");
                emitStoreValue(varCtx.entry, null);
                
                emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
                emit(INVOKEVIRTUAL, "java/util/Scanner/reset()Ljava/util/Scanner;");

            }
            else  // string
            {
                emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
                emit(INVOKEVIRTUAL, "java/util/Scanner/next()Ljava/lang/String;");
                emitStoreValue(varCtx.entry, null);
            }
        }

        // READLN: Skip the rest of the input line.
        if (needSkip) 
        {
            emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
            emit(INVOKEVIRTUAL, "java/util/Scanner/nextLine()Ljava/lang/String;");
            emit(POP);                 
        }


    }

     */

}