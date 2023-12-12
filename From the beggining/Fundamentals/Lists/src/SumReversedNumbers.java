import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumReversedNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        /*
        Write a program that reads sequence of numbers, reverses their digits, and prints their sum.
         */

        List<Integer> input = Arrays.stream(console.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;

        for (int number : input) {
            int reversed = ReverseDigits(number);
            sum += reversed;
        }

        System.out.println(sum);
    }

    private static int ReverseDigits(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}
