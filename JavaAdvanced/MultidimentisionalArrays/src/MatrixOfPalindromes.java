import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        int sumOfFirst = 0;
        int sumOfSecond = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (row == col){
                    sumOfFirst += matrix[row][col];
                }
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (col == matrix.length - row - 1) {
                    sumOfSecond += matrix[row][col];
                }
            }
        }

        System.out.println(Math.abs(sumOfFirst - sumOfSecond));

    }
}
