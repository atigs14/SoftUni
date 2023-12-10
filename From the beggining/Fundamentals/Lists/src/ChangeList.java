import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*
        Write a program, which reads a list of integers from the console and receives commands,
        which manipulate the list. Your program may receive the following commands:
           Delete {element} – delete all elements in the array, which are equal to the given element
           Insert {element} {position} – insert element and the given position
           You should stop the program when you receive the command Odd or Even.
           If you receive Odd  print all odd numbers in the array separated with single whitespace, otherwise print the even numbers.
         */

        List<Integer> input = Arrays.stream(console.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String[] command = console.nextLine().split(" ");


            if (command[0].equals("Odd")) {
                for (int number : input) {
                    if (number % 2 != 0) {
                        System.out.print(number + " ");
                    }
                }

                break;

            } else if (command[0].equals("Even")) {
                for (int number : input) {
                    if (number % 2 == 0) {
                        System.out.print(number + " ");
                    }
                }
                break;

            } else if (command[0].equals("Delete")) {
                int value = Integer.parseInt(command[1]);

                input.removeIf(number -> number.equals(value));


            } else if (command[0].equals("Insert")) {
                int value = Integer.parseInt(command[1]);
                int position = Integer.parseInt(command[2]);

                input.add(position,value);

            }

        }

    }
}
