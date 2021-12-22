import java.util.Scanner;

public class BoomWorm {
    static int sRow = 0;
    static int sCol = 0;
    static StringBuilder word;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        word = new StringBuilder();

        String lifeWord = scanner.nextLine();
        word.append(lifeWord);
        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][n];

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            matrix[i] = line.toCharArray();

            if (line.contains("P")) {
                sRow = i;
                sCol = line.indexOf("P");
                for (int j = 0; j < matrix.length; j++) {
                    for (int col = 0; col < matrix.length; col++) {
                        if (matrix[j][col] == 'P') {
                            matrix[j][col] = '-';
                        }
                    }
                }
            }



        }

        String command = scanner.nextLine();

        while (!command.equals("end")){
            if (command.equals("up")) {
                moveSnake(matrix,  -1, 0);
            }
            else if (command.equals("down")){
                moveSnake(matrix, 0 + 1, 0);
            }else if (command.equals("left")){
                moveSnake(matrix, 0, 0 - 1);
            }else if (command.equals("right")){
                moveSnake(matrix, 0, 0 + 1);

            }

            command = scanner.nextLine();
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[sRow][sCol] = 'P';
            }
        }

        System.out.println(word);
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }

    }

    private static void moveSnake(char[][] matrix, int r, int c) {
        int currentRow = sRow + r;
        int currentCol = sCol + c;
        if (isOutOfBounds(matrix, currentRow, currentCol)){
            word.deleteCharAt(word.length() - 1);
             currentRow = sRow;
             currentCol = sCol;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[currentRow][currentCol] != '-') {
                    word.append(matrix[currentRow][currentCol]);
                    matrix[currentRow][currentCol] = '-';
                }

            }
        }
        sRow = currentRow;
        sCol = currentCol;
    }

    private static boolean isOutOfBounds(char[][] matrix, int r, int c) {
        return r < 0 || r >= matrix.length || c < 0 || c >=matrix[r].length;
    }
}
