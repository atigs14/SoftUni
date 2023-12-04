import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int number = 1;

        System.out.println(number);

        for (int i = 0; i < n; i++) {
            number *= 2;
            System.out.println(number);
        }


    }
}
