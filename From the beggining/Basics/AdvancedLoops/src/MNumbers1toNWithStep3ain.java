import java.util.Scanner;

public class MNumbers1toNWithStep3ain {
    public static void main(String[] args) {
        /*
        Напишете програма, която чете число n, въведено от потребителя, и отпечатва числата от 1 до n през 3 (със стъпка 3).
         */

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= n; i += 3) {
            System.out.println(i);
        }
    }
}