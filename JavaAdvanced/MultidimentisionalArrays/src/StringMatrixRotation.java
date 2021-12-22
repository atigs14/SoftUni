import java.util.ArrayList;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String rotation = scanner.nextLine();

        int angeOfRotation = Integer.parseInt(rotation.split("[()]+")[1]) % 360;

        ArrayList<String> linesForMatrix = new ArrayList<>();
        int maxLength = 0;

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("END")){
                break;
            }
            linesForMatrix.add(line);

            if (line.length() > maxLength) {
                maxLength = line.length();
            }
        }

        int rows = linesForMatrix.size();
        int cols = maxLength;

        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (col < linesForMatrix.get(row).length()){
                    matrix[row][col] = linesForMatrix.get(row).charAt(col);
                } else {
                  matrix[row][col] = ' ';
                }
            }
        }

        rotate(angeOfRotation, rows, cols, matrix);

    }

    private static void rotate(int angeOfRotation, int rows, int cols, char[][] matrix) {
        if (angeOfRotation == 90){
            for (int col = 0; col < cols; col++) {
                for (int row = rows - 1; row >= 0; row--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }

        } else if (angeOfRotation == 180) {
            for (int row = rows - 1; row >= 0 ; row--) {
                for (int col = cols - 1; col >= 0 ; col--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }

        } else if (angeOfRotation == 270) {
            for (int col = cols - 1; col >= 0; col--) {
                for (int row = 0; row < rows; row++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }

        }else {
            for (int ro = 0; ro < rows; ro++) {
                for (int col = 0; col < cols; col++) {
                    System.out.print(matrix[ro][col]);
                }
                System.out.println();
            }
        }
    }
}
