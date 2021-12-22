import java.util.Arrays;
import java.util.Scanner;

public class printDiagonalsofSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][rows];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < rows; col++) {
                if (row == col){
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
        System.out.println();
        for (int row = rows - 1; row >= 0; row--) {
            for (int col = 0; col < rows; col++) {
                if (col == rows - 1 - row) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
    }
}
