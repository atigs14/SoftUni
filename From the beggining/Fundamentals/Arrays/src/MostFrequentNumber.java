import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*
        Write a program that finds the most frequent number in a given sequence of numbers.
        · Numbers will be in the range [0…65535].
        · In case of multiple numbers with the same maximal frequency, print the left most of them
         */
        
        int[] input = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        

        int bestCount = 1;
        int bestNumber = input[0];

        for (int i = 0; i < input.length; i++) {
            int counter = 1;
            for (int j = 0; j < input.length; j++) {
                if (input[i] == input[j]){
                    counter++;
                }
                if (counter > bestCount){
                    bestCount = counter;
                    bestNumber = input[i];
                }
            }
        }

        System.out.println(bestNumber);
    }
}
