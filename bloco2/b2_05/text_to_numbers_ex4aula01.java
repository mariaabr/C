import java.util.*;
import java.io.*;

import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class text_to_numbers_ex4aula01 {

    static HashMap<String, Integer> loadfile(String filename){

        FileInputStream fileinput = null;

        try{
            fileinput = new FileInputStream(filename);
        } catch (Exception e){
            System.err.printf("Cannot use file \" %s \": %s\n", filename, e);
            System.exit(2);
        }

        NDict listener = null;

        try{
        // ANTLR4 stuff
            CharStream input = CharStreams.fromStream(fileinput);
            NumbersLexer lexer = new NumbersLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            NumbersParser parser = new NumbersParser(tokens);
            ParseTree tree = parser.top();
        // end of it

        // more ANTLR4 stuff
            ParseTreeWalker walker = new ParseTreeWalker();
            listener = new NDict();
            walker.walk(listener, tree);
        // end of it

        // input.close();
        // return dictionary;
        } catch(Exception e){
            e.printStackTrace();
            System.exit(4);
        }

        return listener.mappings();
    }

    static void parseInput(HashMap<String, Integer> dictionary){

        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            String token = input.next();
            Integer value;

            value = dictionary.get(token);

            if(value != null){
                System.out.printf("%d ", value);
            } else {
                System.out.printf("%S ", token);
            }
        }
        
        input.close();
        System.out.printf("\n");
    }

    static public void main(String[] args){
        if(args.length != 1){
            System.err.printf("Usage: exercício filename\n");
            System.exit(1);
        }

        parseInput(loadfile(args[0]));
    }
}
