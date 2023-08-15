import java.util.*;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends CalculatorBaseVisitor<Integer> {

   HashMap<String, Integer> variables;

   Interpreter(){
      variables = new HashMap<String, Integer>();
   }

   @Override public Integer visitStatExpr(CalculatorParser.StatExprContext ctx) {

      Integer e = visit( ctx.expr() );

      if ( e == null ) return null;

      // System.out.println (visit( ctx.expr() ));
      System.out.println ( e );
      return e;
   }

   @Override public Integer visitAssignment(CalculatorParser.AssignmentContext ctx) {

      Integer e = visit( ctx.expr() );

      if ( e == null ) return null;

      variables.put( ctx.ID().getText(), e );
      System.out.printf( "%d\n", e );
      return e;
}

   @Override public Integer visitExprMulDivMod(CalculatorParser.ExprMulDivModContext ctx) {
      Integer e1, e2;

      e1 = visit( ctx.expr(0) );
      e2 = visit( ctx.expr(1) );

      if ( e1 == null || e2 == null ) return null;

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

      if ( e1 == null || e2 == null ) return null;

      switch(ctx.op.getText()){
         case "+": return e1+e2;
         case "-": return e1-e2;
      }

      return null;
      //return res;
   }

   @Override public Integer visitExprUnary(CalculatorParser.ExprUnaryContext ctx) {

      Integer e = visit( ctx.expr() );

      if ( e == null ) return null;

      if(ctx.op.getText().equals("-")){
         return -e;
      }
      return e;
      //return res;
   }

   @Override public Integer visitExprVariable(CalculatorParser.ExprVariableContext ctx) {

      Integer e = variables.get(ctx.ID().getText() );

      if ( e == null){
         System.out.printf("Variable %s not defined\n", ctx.ID().getText());
      }
      return e;
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
