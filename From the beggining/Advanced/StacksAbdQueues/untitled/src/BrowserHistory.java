import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        /*
        Write a program, which takes 2 types of browser instructions:

        · Normal navigation: a URL is set, given by a string

        · The string "back" that sets the current URL to the last set URL

        After each instruction, the program should print the current URL.
        If the back instruction can’t be executed, print "no previous URLs". The input ends with "Home" command and then simply you have to stop the program.
         */

        ArrayDeque<String> stack = new ArrayDeque<>();


        String command = console.nextLine();

        while (!command.equals("Home")) {

            if (command.equals("back")) {

                if (stack.size() <= 1) {
                    System.out.println("no previous URLs");
                } else {
                    stack.pop();
                    System.out.println(stack.peek());

                }

            } else {
                stack.push(command);
                System.out.println(command);
            }


            command = console.nextLine();
        }
    }
}
