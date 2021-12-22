import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[rows][cols];
        char[][] matrix2 = new char[rows][cols];

        fillMatrix(matrix, rows, cols, scanner);
        fillMatrix(matrix2, rows, cols, scanner);

        char[][] finalMatrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == matrix2[row][col]){
                    finalMatrix[row][col] = matrix[row][col];
                }
                else {
                    finalMatrix[row][col] = '*';
                }
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(finalMatrix[row][col] + " ");
            }
            System.out.println();
        }

    }

    private static void fillMatrix(char[][] matrix, int rows, int cols, Scanner scanner) {
        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine();
            String[] elements = line.split("\\s+");

            for (int col = 0; col < elements.length; col++) {
                char current = elements[col].charAt(0);
                matrix[row][col] =  current;
            }
        }
    }
}
