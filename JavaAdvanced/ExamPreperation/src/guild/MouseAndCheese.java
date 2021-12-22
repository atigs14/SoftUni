package guild;

import java.util.Scanner;

public class MouseAndCheese {
    static int mRow = 0;
    static int mCol = 0;
    static int cheeses = 0;
    static boolean isOut = false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[size][size];

        for (int r = 0; r < size; r++) {
            String line = scanner.nextLine();
            matrix[r] = line.toCharArray();

            if (line.contains("M")) {
                mRow = r;
                mCol = line.indexOf("M");
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        if (matrix[i][j] == 'M') {
                            matrix[i][j] = '-';
                        }
                    }
                }
            }
        }

            String command = scanner.nextLine();

            while (!command.equals("end") && !isOut){
                if (command.equals("up")) {
                    moveMouse(matrix,  -1, 0);
                }
                else if (command.equals("down")){
                    moveMouse(matrix, 1, 0);
                }else if (command.equals("left")){
                    moveMouse(matrix, 0, -1);
                }else if (command.equals("right")){
                    moveMouse(matrix, 0, 1);
                }

                command = scanner.nextLine();
            }

            if (!isOut) {
                for (int row = 0; row < size; row++) {
                    for (int col = 0; col < size; col++) {
                        matrix[mRow][mCol] = 'M';
                    }
                }
            }

            if (isOut) {
                System.out.println("Where is the mouse?");
            }

            if (cheeses < 5){
                int needed = 5 - cheeses;
                System.out.println("The mouse couldn't eat the cheeses, she needed " + needed +" cheeses more.");
            } else {
                System.out.println("Great job, the mouse is fed "+ cheeses +" cheeses!");
            }

            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }


        }

    private static void moveMouse(char[][] matrix, int r, int c) {
        int currentRow = mRow + r;
        int currentCol = mCol + c;
        if (isOutOfBounds(matrix, currentRow, currentCol)){
            isOut = true;
        } else {
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix.length; col++) {
                    if (matrix[currentRow][currentCol] == 'B') {
                        matrix[currentRow][currentCol] = '-';
                        currentRow += r;
                        currentCol += c;
                        if (isOutOfBounds(matrix, currentRow, currentCol)){
                            isOut = true;
                            currentRow = mRow;
                            currentCol = mCol;
                        }
                    }
                    if (matrix[currentRow][currentCol] == 'c'){
                        cheeses++;
                        matrix[currentRow][currentCol] = '-';
                    }
                }
            }

            mRow = currentRow;
            mCol = currentCol;
        }
    }

    private static boolean isOutOfBounds(char[][] matrix, int r, int c) {
        return r < 0 || r >= matrix.length || c < 0 || c >= matrix[r].length;
    }
}
