import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumof2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split(", ");

        int rows = Integer.parseInt(firstLine[0]);
        int cols = Integer.parseInt(firstLine[1]);

        int[][] matrix = new int[rows][cols];

        int BiggestSum = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (sum > BiggestSum){
                    BiggestSum = sum;
                    maxRow = row;
                    maxCol = col;
                }
            }
        }

        for (int row = maxRow; row < maxRow + 2; row++) {
            for (int col = maxCol; col < maxCol + 2; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println(BiggestSum);
    }
}
