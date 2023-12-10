import java.util.*;

public class AppendLists {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*
        Write a program to append several lists of numbers.
         Lists are separated by ‘|’.
         Values are separated by spaces (‘ ’, one or several)
         Order the lists from the last to the first, and their values from left to right.
         */

        String[] input = console.nextLine().split("\\|");



        List<String> listOfNumbers = new ArrayList<>();

        for (int i = input.length - 1; i >= 0; i--) {

            String[] numbers = input[i].trim().split("\\s+");

            listOfNumbers.addAll(Arrays.asList(numbers));
        }



        for (String el : listOfNumbers) {
            System.out.print(el + " ");
        }
    }
}
