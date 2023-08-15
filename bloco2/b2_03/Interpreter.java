@SuppressWarnings("CheckReturnValue")
public class Interpreter extends CalculatorBaseVisitor<Integer> {

   @Override public Integer visitProgram(CalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitStat(CalculatorParser.StatContext ctx) {
      if(ctx.expr() != null){
         System.out.println (visit( ctx.expr() ));
      }
      return null;
      //return res;
   }

   @Override public Integer visitExprMulDivMod(CalculatorParser.ExprMulDivModContext ctx) {
      Integer e1, e2;

      e1 = visit( ctx.expr(0) );
      e2 = visit( ctx.expr(1) );

      switch(ctx.op.getText()){
         case "*": return e1*e2;
         case "/": return e1/e2;
         case "%": return e1%e2;
      }

      return null;
      //return res;
   }

   @Override public Integer visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Integer e1, e2;

      e1 = visit( ctx.expr(0) );
      e2 = visit( ctx.expr(1) );

      switch(ctx.op.getText()){
         case "+": return e1+e2;
         case "-": return e1-e2;
      }

      return null;
      //return res;
   }

   @Override public Integer visitExprUnary(CalculatorParser.ExprUnaryContext ctx) {
      Integer e = visit( ctx.expr() );

      if(ctx.op.getText().equals("-")){
         return -e;
      }
      return e;
      //return res;
   }

   @Override public Integer visitExprParent(CalculatorParser.ExprParentContext ctx) {
      return visit( ctx.expr() );
      //return res;
   }

   @Override public Integer visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      return Integer.parseInt( ctx.INTEGER().getText() );
      //return res;
   }
}
