// Generated from CalculatorFrac.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorFracParser}.
 */
public interface CalculatorFracListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorFracParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalculatorFracParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorFracParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalculatorFracParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorFracParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(CalculatorFracParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorFracParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(CalculatorFracParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorFracParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CalculatorFracParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorFracParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CalculatorFracParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorFracParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CalculatorFracParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorFracParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CalculatorFracParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CalculatorFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(CalculatorFracParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CalculatorFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(CalculatorFracParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link CalculatorFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPow(CalculatorFracParser.ExprPowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link CalculatorFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPow(CalculatorFracParser.ExprPowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link CalculatorFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMulDiv(CalculatorFracParser.ExprMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link CalculatorFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMulDiv(CalculatorFracParser.ExprMulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link CalculatorFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(CalculatorFracParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link CalculatorFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(CalculatorFracParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link CalculatorFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(CalculatorFracParser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link CalculatorFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(CalculatorFracParser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLiteral}
	 * labeled alternative in {@link CalculatorFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLiteral(CalculatorFracParser.ExprLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLiteral}
	 * labeled alternative in {@link CalculatorFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLiteral(CalculatorFracParser.ExprLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link CalculatorFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReduce(CalculatorFracParser.ExprReduceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link CalculatorFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReduce(CalculatorFracParser.ExprReduceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link CalculatorFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVariable(CalculatorFracParser.ExprVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link CalculatorFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVariable(CalculatorFracParser.ExprVariableContext ctx);
}