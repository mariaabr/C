package bloco1;
import java.util.*;
import java.io.*;

public class tradutor_numbers {

    static HashMap<String, Integer> loadfile(String filename){

        FileInputStream fileinput = null;
        Scanner input;
        HashMap<String, Integer> dictionary = new HashMap<String, Integer>();

        try{
            fileinput = new FileInputStream(filename);
        } catch (Exception e){
            System.err.printf("Cannot use file \" %s \": %s\n", filename, e);
            System.exit(2);
        }

        input = new Scanner(fileinput);

        try{
            while(input.hasNext()){
                Integer value;
                String name;

                value = input.nextInt();
                input.next();
                name = input.next();

                dictionary.put(name, value);
            }
        } catch (Exception e){
            System.err.printf("Cannot use file \" %s \": wrong format\n", filename);
            System.exit(3);
        }

        input.close();
        return dictionary;
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