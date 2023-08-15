package bloco1;
import java.util.*;

public class calculator_ex{

    static Scanner input;

    static String readToken(){
        String token = null;
        
        try{
            token = input.next();
        } catch(Exception e){
            System.exit(0);
        }

        return token;
    }

    static String readOperation(){
        String token;

        for(;;) { // nao tem statements o que significa?
            token = readToken();

            if(token.length() == 1 && (token.charAt(0) == '+' || token.charAt(0) == '-' || token.charAt(0) == '*' || token.charAt(0) == '/')){
                return token;
            }

            System.err.printf("%s is not a valid operation \n", token);
        }
    }

    static Double readOperand(){
        String token;
        Double value;

        for(;;){
            token = readToken();
            try{
                value = Double.valueOf(token);
            } catch(Exception e){
                System.err.printf("%s is not a valid real number \n", token);
                continue;
            }

            return value;
        }
    }

    static void calculator(){
        Double num1, num2, result;
        String operation;

        for(;;){

            num1 = readOperand();
            operation = readOperation();
            num2 = readOperand();
            result = 0.0;

            switch(operation){
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }

            System.out.printf("%f %s %f = %f\n", num1, operation, num2, result);
        }
    }
    public static void main(String[] args){

        input = new Scanner(System.in);
        calculator();
    }
}