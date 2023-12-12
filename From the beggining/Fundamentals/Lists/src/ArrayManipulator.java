import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*
        Write a program that reads an array of integers from the console and set of commands and executes them over the array. The commands are as follows:
            add <index> <element> – adds element at the specified index (elements right from this position inclusively are shifted to the right).
            addMany <index> <element 1> <element 2> … <element n> – adds a set of elements at the specified index.
            contains <element> – prints the index of the first occurrence of the specified element (if exists) in the array or -1 if the element is not found.
            remove <index> – removes the element at the specified index.
            shift <positions> – shifts every element of the array the number of positions to the left (with rotation).
            For example, [1, 2, 3, 4, 5] -> shift 2 -> [3, 4, 5, 1, 2]
            sumPairs – sums the elements in the array by pairs (first + second, third + fourth, …).
            For example, [1, 2, 4, 5, 6, 7, 8] -> [3, 9, 13, 8].
            print – stop receiving more commands and print the last state of the array.
         */

        List<Integer> input = Arrays.stream(console.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        while (true) {
            String[] commandLine = console.nextLine().split(" ");

            String command = commandLine[0];

            if (command.equals("add")) {
                int index = Integer.parseInt(commandLine[1]);
                int element = Integer.parseInt(commandLine[2]);

                input.add(index, element);

            } else if (command.equals("addMany")) {
                int index = Integer.parseInt(commandLine[1]);

                for (int i = 2; i < commandLine.length; i++) {
                    input.add(index, Integer.parseInt(commandLine[i]));
                    index++;
                }

            } else if (command.equals("contains")) {
                int element = Integer.parseInt(commandLine[1]);

                if (input.contains(element)) {
                    System.out.println(input.indexOf(element));
                } else {
                    System.out.println("-1");
                }

            } else if (command.equals("remove")) {
                int index = Integer.parseInt(commandLine[1]);
                input.remove(index);

            } else if (command.equals("shift")) {
                int rotations = Integer.parseInt(commandLine[1]);

                // i am using rotate method of collections with minus before rotations value I rotate it to the left
                Collections.rotate(input, -rotations);

            } else if (command.equals("sumPairs")) {

                for (int i = 0; i < input.size(); i++) {
                    int sumPair = input.get(i) + input.get(i + 1);
                    input.set(i, sumPair);
                    input.remove(i + 1);
                }

            } else if (command.equals("print")) {
                System.out.println(input);
                break;
            }
        }
    }
}
