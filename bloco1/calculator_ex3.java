package bloco1;
import java.util.*;

public class calculator_ex3 {

    static void calculator(){

        Scanner input = new Scanner(System.in);
        Stack<Double> stack = new Stack<Double>();
        Double a, b, result;

        try{
            while(input.hasNext()){
                if(input.hasNextDouble()){
                    stack.push(input.nextDouble());
                } else {
                    String token = input.next();

                    if(token.length() != 1){
                        System.err.printf("%s is not a valid token\n", token);
                        continue;
                    }

                    switch(token){
                        case "+":
                            b = stack.pop();
                            a = stack.pop();
                            result = a + b;
                            break;
                        case "-":
                            b = stack.pop();
                            a = stack.pop();
                            result = a - b;
                            break;
                        case "*":
                            b = stack.pop();
                            a = stack.pop();
                            result = a * b;
                            break;
                        case "/":
                            b = stack.pop();
                            a = stack.pop();
                            result = a / b;
                            break;
                        default:
                        System.err.printf("%s is not a valid token\n", token);
                        continue;
                    }

                    stack.push(result);
                }
                System.out.printf("Stack: %s\n", stack.toString());
            }
        } catch (Exception e) {
            System.err.printf("Empty stack\n");
        }
    }

    public static void main(String[] args){
        calculator();
    }
}
