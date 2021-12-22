import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];

        fillMatrix(matrix, rows, scanner);

        String command = scanner.nextLine();

        while (!command.equals("END")){
            String[] tokens = command.split("\\s+");

            if (tokens[0].equals("swap")){
                if (validInput(tokens, rows, cols)  && tokens.length == 5){
                    int row1 = Integer.parseInt(tokens[1]);
                    int col1 = Integer.parseInt(tokens[2]);
                    int row2 = Integer.parseInt(tokens[3]);
                    int col2 = Integer.parseInt(tokens[4]);


                    String firstElement = matrix[row1][col1];
                    String secondElement = matrix[row2][col2];

                    matrix[row1][col1] = secondElement;
                    matrix[row2][col2] = firstElement;

                    for (int row = 0; row < rows; row++) {
                        for (int col = 0; col < cols; col++) {
                            System.out.print(matrix[row][col] + " ");
                        }
                        System.out.println();
                    }


                }
                else {
                    System.out.println("Invalid input!");
                }
            }
            else {
                System.out.println("Invalid input!");
            }


            command = scanner.nextLine();
        }
    }

    private static boolean validInput(String[] tokens, int rows, int cols) {
        int row1 = Integer.parseInt(tokens[1]);
        int col1 = Integer.parseInt(tokens[2]);
        int row2 = Integer.parseInt(tokens[3]);
        int col2 = Integer.parseInt(tokens[4]);

        if ((row1 > 0 && row1 <= rows) || (col2 > 0 && col2 <= cols) || (row2 > 0 && row2 <= rows) || (col1 > 0 && col1 <= cols)){
            return  true;
        }
        else {
            return  false;
        }
    }

    private static String[][] fillMatrix(String[][] matrix, int rows, Scanner scanner) {
        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
        return matrix;
    }
}
