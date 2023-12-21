import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        String[] input = console.nextLine().split(" ");

        Collections.addAll(stack, input);

        while (stack.size() > 1){

            int firstEl = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int secondEl = Integer.parseInt(stack.pop());


            if (operator.equals("+")){

                stack.push(String.valueOf(firstEl + secondEl));

            } else if (operator.equals("-")){

                stack.push(String.valueOf(firstEl - secondEl));

            }
        }

        System.out.println(stack.pop());



    }
}
