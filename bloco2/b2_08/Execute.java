@SuppressWarnings("CheckReturnValue")
public class Execute extends CalculatorBaseVisitor<String> {

   @Override public String visitProgram(CalculatorParser.ProgramContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStatExpr(CalculatorParser.StatExprContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStatWhoCares(CalculatorParser.StatWhoCaresContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitAssignment(CalculatorParser.AssignmentContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExprMulDivMod(CalculatorParser.ExprMulDivModContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExprParent(CalculatorParser.ExprParentContext ctx) {
      
      String e = visit( ctx.expr() );
      return e;
      //return res;
   }

   @Override public String visitExprUnary(CalculatorParser.ExprUnaryContext ctx) {
      
      String result;
      String e = visit( ctx.expr() );

      if( e == null ) return null;
      if (ctx.op.getText().equals("-")){
         result = e + "!-";
      } else if (ctx.op.getText().equals("+")) {
         result = e + "!+";
      }
      return result;
      //return res;
   }

   @Override public String visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      
      String e = ctx.Integer().getText();
      return e;
      //return res;
   }

   @Override public String visitExprVariable(CalculatorParser.ExprVariableContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }
}
