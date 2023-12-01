import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        /*
        Да се напише програма, която чете n-на брой цели числа, подадени от потребителя,
        и проверява дали сумата от числата на четни позиции е равна на сумата на числата на нечетни позиции.
        При равенство да се отпечата "Yes" + сумата; иначе да се отпечата "No" + разликата.
        Разликата се изчислява по абсолютна стойност.

         */

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= n; i++) {
            int input = Integer.parseInt(console.nextLine());
            if (i % 2 == 0){
                leftSum += input;
            } else {
                rightSum += input;
            }
        }

        int total = leftSum - rightSum;

        if (total == 0){
            System.out.println("Yes Sum = " + leftSum);
        } else {
            System.out.println("No Diff = " + Math.abs(total));
        }
    }
}
