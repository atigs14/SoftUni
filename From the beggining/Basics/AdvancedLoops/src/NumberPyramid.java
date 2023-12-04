import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int counter = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (counter > n){
                    return;
                } else {
                    System.out.print(counter++ + " ");
                }
            }
            System.out.println();
        }
    }
}
