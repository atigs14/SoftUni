import java.util.Scanner;

public class EnterEvenNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        boolean CorrectNumber = false;

        while (!CorrectNumber){
            try {
                System.out.print("Enter even number: ");
                int n = Integer.parseInt(console.nextLine());
                if (n % 2 == 0) {
                    System.out.println("Even number entered: " + n);
                    CorrectNumber = true;
                } else {
                    System.out.println("The number is not even.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number!");
            }
        }


    }
}
