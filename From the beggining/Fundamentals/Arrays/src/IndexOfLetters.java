import java.util.Scanner;

public class IndexOfLetters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*
                Write a program that creates an array containing all letters from
                the alphabet (a-z). Read a lowercase word from the console and print
                the index of each of its letters in the letters array.
         */

        //Reading the input
        char[] input = console.nextLine().toCharArray();

        //Creating array with chars
        char[] alphabet = new char[26];
        char startingLetter = 'a';

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = startingLetter;
            startingLetter++;
        }

        for (char element : input) {
            for (int i = 0; i < alphabet.length; i++) {
                if (element == alphabet[i]) {
                    System.out.println(element + " -> " + i);
                }
            }
        }


    }
}

