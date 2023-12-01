import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int input = Integer.parseInt(console.nextLine());

        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < input; i++) {
            int number = Integer.parseInt(console.nextLine());

            if (number > maxNumber){
                maxNumber = number;
            }

        }

        System.out.println(maxNumber);
    }
}
