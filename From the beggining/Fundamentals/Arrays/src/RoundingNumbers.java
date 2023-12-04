import java.util.Arrays;
import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split(" ");

        double[] originalNumber = Arrays.stream(input).mapToDouble(Double::parseDouble).toArray();

        int[] updatedArray = new int[originalNumber.length];

        for (int i = 0; i < originalNumber.length; i++) {
            updatedArray[i] = (int) (Math.abs(originalNumber[i]) + 0.5);
        }

        for (int i = 0; i < originalNumber.length; i++) {
            if (originalNumber[i] < 0){
                updatedArray[i] *= -1;
            }
        }

        for (int i = 0; i < originalNumber.length; i++) {
            System.out.println(originalNumber[i] + " => " + updatedArray[i]);
        }
    }
}
