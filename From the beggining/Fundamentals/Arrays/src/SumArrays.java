import java.util.Arrays;
import java.util.Scanner;

public class SumArrays {
    public static void main(String[] args) {

        /*
        Write a program that reads two arrays of integers and sums them.
        When the arrays are not of the same size, duplicate the smaller array a few times.
         */

        Scanner console = new Scanner(System.in);
        // I had to try to shorter the code
        int[] arr1 = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] arr2 = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int length1 = arr1.length;
        int length2 = arr2.length;

        int maxLength = Math.max(length1, length2);
        if (length1 > length2){
            int[] duplicated = new int[maxLength];

            for (int i = 0; i < maxLength; i++) {
                duplicated[i] = arr2[i % arr2.length];
            }

            arr2 = duplicated;

        } else {
            int[] duplicated = new int[maxLength];

            for (int i = 0; i < maxLength; i++) {
                duplicated[i] = arr1[i % arr1.length];
            }
            arr1 = duplicated;
        }

        for (int i = 0; i < maxLength; i++) {
            System.out.print(arr1[i] + arr2[i] + " ");
        }
    }
}
