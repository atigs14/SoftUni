import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {

        /*
        Да се напише програма, която чете n-на брой цели числа, въведени от потребителя, и
        проверява дали сред тях съществува число, което е равно на сумата на всички останали.
        Ако има такъв елемент, печата "Yes", "Sum = "  + неговата стойност; иначе печата "No",
         "Diff = " + разликата между най-големия елемент и сумата на останалите (по абсолютна стойност).

         */
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int maxNumber = Integer.MIN_VALUE;

        int sumAllNumbers = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(console.nextLine());
            if (number > maxNumber){
                maxNumber = number;
            }

            sumAllNumbers += number;
        }

        int finalSum = sumAllNumbers - maxNumber;

        if (finalSum == maxNumber){
            System.out.println("Yes");
            System.out.println("Sum = "+ maxNumber);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(finalSum - maxNumber));
        }


    }
}
