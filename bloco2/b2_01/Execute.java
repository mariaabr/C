import org.antlr.v4.runtime.tree.*;

@SuppressWarnings("CheckReturnValue")
public class Execute extends HelloBaseVisitor<Object> {

   /* posso utilizar o hellobasevisitor
   @Override public Object visitTop(HelloParser.TopContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      return res;
   }
   */

   @Override public Object visitGreetings(HelloParser.GreetingsContext ctx) {
      Object res = null;
      // return visitChildren(ctx);
      System.out.printf("Ola' %s\n", visitName( ctx.name() ));
      return res;
   }

   @Override public Object visitBye(HelloParser.ByeContext ctx) {
      Object res = null;
      // return visitChildren(ctx);
      System.out.printf("Adeus %s\n", visitName( ctx.name() ));
      return res;
   }

   @Override public Object visitName(HelloParser.NameContext ctx) {
      String res = " ";
      // return visitChildren(ctx);
      for (TerminalNode id: ctx.ID()){
         res += id.getText() + " ";
      }
      return res;
   }
}
