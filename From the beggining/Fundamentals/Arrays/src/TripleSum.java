import java.util.Arrays;
import java.util.Scanner;

public class TripleSum {
    public static void main(String[] args) {


        /*
        Write a program to read an array of integers and find all triples of elements a, b and c,
        such that a + b == c (where a stays to the left from b). Print “No” if no such triples exist.
         */
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split(" ");

        int[] array = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        boolean isFound = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                int sum = array[i] + array[j];
                for (int k = 0; k < array.length; k++) {
                    if (array[k] == sum){
                        System.out.println(array[i] + " + " + array[j] + " == " + array[k]);
                        isFound = true;
                    }
                }
            }
        }

        if (!isFound){
            System.out.println("No");
        }
    }
}
