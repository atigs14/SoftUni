import java.util.Scanner;

public class LargestCommonEnd {
    public static void main(String[] args) {

        /*
        Read two arrays of words and find the length of the largest common end (left or right).
         */


        Scanner console = new Scanner(System.in);

        String[] input1 = console.nextLine().split(" ");
        String[] input2 = console.nextLine().split(" ");


        int endIndex = Math.min(input1.length, input2.length);
        int leftCounter = 0;
        int rightCounter = 0;

        for (int i = 0; i < endIndex; i++) {
            if (input1[i].equals(input2[i])) {
                leftCounter++;
            }

            if ((input1[input1.length - i - 1]).equals(input2[input2.length - i - 1]) ) {
                rightCounter++;
            }
        }

        System.out.println(Math.max(leftCounter, rightCounter));

    }
}
