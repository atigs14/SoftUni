import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine().split(" ")[0]);

        int[][] matrix = ReadMatrix(rows,scanner);


        int number = Integer.parseInt(scanner.nextLine());

        
    }

    public static int[][] ReadMatrix(int rows, Scanner scanner) {
        int[][] Matrix = new int[rows][];

        for (int row = 0; row < rows; row++) {
            Matrix[row] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        return Matrix;
    }
}
