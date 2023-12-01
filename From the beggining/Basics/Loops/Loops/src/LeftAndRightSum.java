import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        /*
        Да се напише програма, която чете 2*n-на брой цели числа, подадени от потребителя,
        и проверява дали сумата на първите n числа (лява сума) е равна на сумата на вторите n числа (дясна сума).
        При равенство печата "Yes" + сумата; иначе печата "No" + разликата. Разликата се изчислява като положително число
        (по абсолютна стойност).
         */

        int input = Integer.parseInt(console.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < input; i++) {
            int n = Integer.parseInt(console.nextLine());

            leftSum += n;
        }

        for (int i = 0; i < input; i++) {
            int n = Integer.parseInt(console.nextLine());

            rightSum += n;
        }

        int result = leftSum - rightSum;

        if (result == 0) {
            System.out.println("Yes, sum = " + leftSum);
        } else {
            System.out.println("No, diff = " + Math.abs(result));
        }

    }
}
