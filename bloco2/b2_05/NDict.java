import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.*;
@SuppressWarnings("CheckReturnValue")

public class NDict extends NumbersBaseListener {

   private HashMap<String, Integer> mappings;

   public NDict() {
      mappings = new HashMap<String, Integer>();
   }

   public HashMap<String, Integer> mappings() {
      return mappings;
   }

   @Override public void enterTop(NumbersParser.TopContext ctx) {
   }

   @Override public void exitTop(NumbersParser.TopContext ctx) {
   }

   @Override public void enterMapping(NumbersParser.MappingContext ctx) {
      System.out.printf("%s -> %s\n", ctx.WORD().getText(), ctx.NUMBER().getText() );
      mappings.put( ctx.WORD().getText(), Integer.parseInt( ctx.NUMBER().getText()) );
   }

   @Override public void exitMapping(NumbersParser.MappingContext ctx) {
   }

   @Override public void enterEveryRule(ParserRuleContext ctx) {
   }

   @Override public void exitEveryRule(ParserRuleContext ctx) {
   }

   @Override public void visitTerminal(TerminalNode node) {
   }

   @Override public void visitErrorNode(ErrorNode node) {
   }
}
