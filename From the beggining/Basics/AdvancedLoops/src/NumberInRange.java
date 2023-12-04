import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        while (true){
            int n = Integer.parseInt(console.nextLine());

            if (n >= 1 && n <= 100){
                System.out.println("Еnter a number in the range [1...100]:\n" +
                        "The number is: " + n);
                break;
            }

            System.out.println("Еnter a number in the range [1...100]:\n" +
                    "Invalid number!\n");
        }
    }
}
