import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {

        /*
        Write a program to read an array of integers and condense them by summing adjacent couples of
        elements until a single integer is obtained. For example, if we have 3 elements {2, 10, 3},
        we sum the first two and the second two elements and obtain {2+10, 10+3} = {12, 13},
        then we sum again all adjacent elements and obtain {12+13} = {25}.
         */

        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split(" ");

        int[] numbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        while (numbers.length > 1){
            int[] condensed = new int[numbers.length -1];

            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = numbers[i] + numbers[i + 1];
            }

            numbers = condensed;
        }

        System.out.println(numbers[0]);


    }
}
