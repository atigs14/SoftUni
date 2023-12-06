import java.util.Arrays;
import java.util.Scanner;

public class RotateAndSum {
    public static void main(String[] args) {

        /*
        To “rotate an array on the right” means to move its last element first:
        {1, 2, 3} à {3, 1, 2}.

        Write a program to read an array of n integers (space separated on a single line)
        and an integer k, rotate the array right k times and sum the obtained arrays after
        each rotation as shown below.
         */
        Scanner console = new Scanner(System.in);

        int[] array = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rotations = Integer.parseInt(console.nextLine());

        int[] sumArray = new int[array.length];

        for (int i = 0; i < rotations; i++) {

            //Rotating the array
            int lastEl = array[array.length - 1];
            for (int j = array.length - 1; j > 0 ; j--) {
                array[j] = array[j - 1];
            }
            array[0] = lastEl;

            //Summing the looped array with previous
            for (int j = 0; j < array.length; j++) {
                sumArray[j] += array[j];
            }
        }

        //Printing the array

        for (int el :
                sumArray) {
            System.out.print(el + " ");
        }


    }
}
