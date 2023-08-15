import java.util.*;

@SuppressWarnings("CheckReturnValue")
public class Execute extends GrammarBaseVisitor<String> {

   Map<String,String> variaveis = new HashMap<String,String>();  //HashMap vamos fazer da maneira masi complicada is to é uma variavel pode nao existir //pensar sempre as variaveis


   @Override public String visitProgram(GrammarParser.ProgramContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStatement(GrammarParser.StatementContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitPrint(GrammarParser.PrintContext ctx) {
      String expr = visit(ctx.expr());

      if (expr != null) {
         System.out.printf("%s\n", expr);
      }
      return null;
   }

   @Override public String visitAssign(GrammarParser.AssignContext ctx) {
      String expr = visit(ctx.expr());

      if (expr != null) {
          variaveis.put(ctx.ID().getText(), expr);
      }
      return null;
   }

   @Override public String visitAdd(GrammarParser.AddContext ctx) {
      String expr1, expr2;

      expr1 = visit(ctx.expr(0));
      expr2 = visit(ctx.expr(1));

      if(expr1 == null || expr2 == null) return null;

      return expr1 + expr2;
   }

   @Override public String visitInput(GrammarParser.InputContext ctx) {
      String expr = visit( ctx.expr() );
      Scanner sc = new Scanner(System.in);

      if(expr == null) return null;
      System.out.println(expr);

      return sc.nextLine();
   }

   @Override public String visitSub(GrammarParser.SubContext ctx) {
      String expr1, expr2;

      expr1 = visit(ctx.expr(0));
      expr2 = visit(ctx.expr(1));

      if(expr1 == null || expr2 == null) return null;

      return (new String(expr1)).replace(expr2, "");
   }

   @Override public String visitTrim(GrammarParser.TrimContext ctx) {
      String expr = visit(ctx.expr());

      if(expr == null) return null;

      return (new String(expr)).trim();
   }

   @Override public String visitReplace(GrammarParser.ReplaceContext ctx) {
      String expr1, expr2, expr3;

      expr1 = visit(ctx.expr(0));
      expr2 = visit(ctx.expr(1));
      expr3 = visit(ctx.expr(2));

      if(expr1 == null || expr2 == null || expr3 == null) return null;

      return (new String(expr1)).replace(expr2, expr3);
   }

   @Override public String visitParentisis(GrammarParser.ParentisisContext ctx) {
      return visit(ctx.expr());
   }

   @Override public String visitId(GrammarParser.IdContext ctx) {
      String id = ctx.ID().getText();

      String varValue = variaveis.get(id);
      if (varValue == null) {
         System.err.printf("ERROR: variable %s not defined\n", id);
         
      }
      return varValue;
   }

   @Override public String visitLiteral(GrammarParser.LiteralContext ctx) {
      String value = ctx.LITERAL().getText();
      return value.substring(1, value.length() - 1);
   }
}
