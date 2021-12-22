import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int[][] firstMatrix = fillmatrix(dimensions, scanner);

        dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int[][] secondMatrix = fillmatrix(dimensions, scanner);

        checkIfEqual(firstMatrix, secondMatrix);



    }

    private static void checkIfEqual(int[][] firstMatrix, int[][] secondMatrix) {
        boolean finale = true;
        if (firstMatrix.length != secondMatrix.length) {
            System.out.println("not equal");
            finale = false;
        }
        else {
            for (int row = 0; row < firstMatrix.length; row++) {
                if (firstMatrix[row].length != secondMatrix[row].length){
                    System.out.println("not equal");
                    finale = false;
                    break;
                }
                for (int col = 0; col < firstMatrix[row].length; col++) {
                    if (firstMatrix[row][col] != secondMatrix[row][col]){
                        System.out.println("not equal");
                        finale = false;
                        break;
                    }
                }
            }
            if (finale) {
                System.out.println("equal");
            }

        }
    }

    private static int[][] fillmatrix(int[] dimensions, Scanner scanner) {
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
                matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}
