import java.util.Scanner;

public class Sequence2kplus1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());


        for (int i = 1; i <= n; i = i * 2 + 1) {
            System.out.println(i);
        }
    }
}
