import java.util.Scanner;

public class ReverseArrayOfIntegers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        Integer[] numbers = new Integer[n];

        for (int i = 0; i < n; i++) {
            int input =Integer.parseInt(console.nextLine());

            numbers[i] = input;
        }

        for (int i = n - 1; i >= 0 ; i--) {
            System.out.println(numbers[i]);

        }
    }
}
