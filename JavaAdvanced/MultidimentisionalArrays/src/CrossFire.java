import java.util.Scanner;

public class CrossFire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[2][2];

        System.out.println();

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }

    }
}
