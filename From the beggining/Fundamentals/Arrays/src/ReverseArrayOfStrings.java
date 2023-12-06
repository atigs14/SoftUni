import java.util.Scanner;

public class ReverseArrayOfStrings {

    /*
    Write a program to read an array of strings, reverse it and print its elements.
    The input consists of a sequence of space separated strings. Print the output on a single line (space separated).
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        String[] arr = input.split(" ");

        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (String word :
                arr) {
            System.out.print(word + " ");
        }
    }
}
