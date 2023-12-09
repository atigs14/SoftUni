import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfIncreasingElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*
        Write a program that finds the longest increasing subsequence in an array of integers.
        The longest increasing subsequence is a portion of the array (subsequence) that
        is strongly increasing and has the longest possible length. If several such subsequences exist, find the left most of them.
         */


        int[] input = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int start = 0;
        int len = 1;
        int bestStart = 0;
        int bestLen = 1;

        for (int i = 1; i < input.length; i++) {
            if (input[i] == input[i - 1] + 1) {
                len++;
                if (len > bestLen) {
                    bestLen = len;
                    bestStart = start;
                }
            } else {
                len = 1;
                start = i;
            }
        }

        for (int i = bestStart; i < bestStart + bestLen; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
