import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int input = Integer.parseInt(console.nextLine());

        double bonusScore = 0;
        double totalScore = 0;

        if (input <= 100) {
            bonusScore += 5;
        } else if (input <= 1000) {
            bonusScore = input * 0.2;
        } else {
            bonusScore = input * 0.1;
        }

        if (input % 2 == 0) {
            bonusScore += 1;
        }

        if (input % 10 == 5) {
            bonusScore += 2;
        }

        totalScore = input + bonusScore;

        System.out.println(bonusScore);
        System.out.println(totalScore);


    }
}
