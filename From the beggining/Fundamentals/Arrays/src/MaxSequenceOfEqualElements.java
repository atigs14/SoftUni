import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*Write a program that finds the longest sequence of equal elements in an array of integers.
        If several longest sequences exist, print the leftmost one
         */

        int[] input = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int start = 0;
        int len = 1;
        int bestStart = 0;
        int bestLen = 1;

        for (int i = 1; i < input.length; i++) {
            if (input[i] == input[i - 1]) {
                len ++;

                if (len > bestLen){
                    bestLen = len;
                    bestStart = start;
                }
            } else {
                start = i;
                len = 1;
            }
        }

        //Printing the best sequence

        for (int i = bestStart; i < bestStart + bestLen; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
