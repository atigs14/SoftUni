import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char index = input.charAt(i);
            int number = Character.getNumericValue(index);
            sum += number;
        }

        System.out.println(sum);
    }
}
