import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        readMatrix(matrix, scanner, rows, cols);

        int maxSum = Integer.MIN_VALUE;
        int startRow = 0;
        int startCol = 0;

        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                int sum =  matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] +
                        matrix[row +1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2] +
                        matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];

                if (sum > maxSum){
                    maxSum = sum;
                    startCol = col;
                    startRow = row;
                }
            }
        }

        System.out.println("Sum = " + maxSum);
        for (int row = startRow; row < startRow + 3; row++) {
            for (int col = startCol; col < startCol + 3; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }

    private static int[][] readMatrix(int[][] matrix, Scanner scanner, int rows, int cols) {
        for (int rol = 0; rol < rows; rol++) {
            for (int col = 0; col < cols; col++) {
                matrix[rol][col] = scanner.nextInt();
            }
        }
        return matrix;
    }
}
