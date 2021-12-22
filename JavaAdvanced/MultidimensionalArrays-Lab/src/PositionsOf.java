import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions  = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = fillMatrix(rows, cols, scanner);

        int numberToFind = Integer.parseInt(scanner.nextLine());

        boolean isTrue = false;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == numberToFind){
                    System.out.println(row + " " + col);
                    isTrue = true;
                }
            }
        }

        if (!isTrue){
            System.out.println("not found");
        }

    }

    private static int[][] fillMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
                matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            }
        return matrix;
    }
}
