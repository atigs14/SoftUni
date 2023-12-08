import java.util.Arrays;
import java.util.Scanner;

public class FoldAndSum {
    public static void main(String[] args) {
        /*
        Read an array of 4*k integers, fold it like shown below, and print the sum of the upper
        and lower two rows (each holding 2 * k integers):
         */

        Scanner console = new Scanner(System.in);

        int[] input = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int firstAndThirdArrayLength = input.length / 4;

        int[] firstArray = new int[firstAndThirdArrayLength];

        //Copping the first part of the array
        System.arraycopy(input, 0, firstArray, 0, firstAndThirdArrayLength);

        //Reversing the first array
        ReverseArray(firstArray);

        int[] thirdArray = new int[firstAndThirdArrayLength];
        int LastArrayIndexCounter = 0;


        //Coping the third array from the input
        for (int i = input.length - firstAndThirdArrayLength; i < input.length; i++) {
            thirdArray[LastArrayIndexCounter] = input[i];
            LastArrayIndexCounter++;
        }

        ReverseArray(thirdArray);

        int[] middleArray = new int[input.length / 2];
        int middleArrayIndex = 0;
        //Coping the middle array from the input
        for (int i = firstAndThirdArrayLength; i < input.length - firstAndThirdArrayLength; i++) {
            middleArray[middleArrayIndex] = input[i];
            middleArrayIndex++;
        }


        //Summing the arrays

        //Concatenating the first and last array

        int[] endArrays = new int[input.length / 2];
        int indexOfLastPositionInArray = 0;

        //Adding first part
        for (int i = 0; i < firstAndThirdArrayLength; i++) {
            endArrays[i] = firstArray[i];
            indexOfLastPositionInArray++;
        }

        //Adding second part
        for (int j : thirdArray) {
            endArrays[indexOfLastPositionInArray] = j;
            indexOfLastPositionInArray++;
        }

        //Summing the endArrays with MiddleArray

        int[] finalArray = new int[input.length / 2];

        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = middleArray[i] + endArrays[i];
        }

        for (int el : finalArray) {
            System.out.print(el + " ");
        }


    }

    public static void ReverseArray(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i -1];
            array[array.length - 1- i] = temp;
        }
    }
}
