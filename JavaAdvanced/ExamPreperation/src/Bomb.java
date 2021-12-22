import java.util.Scanner;

public class Bomb {
    static int bombCount = 0;
    static int sRowPosition;
    static int sColPosition;
    static boolean isOut = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[n][n];

        String[] commands = scanner.nextLine().split(",");

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().replaceAll(" ", "");
            matrix[i] = line.toCharArray();

            if (line.contains("s")){
                sRowPosition = i;
                sColPosition = line.indexOf("s");
            }

            for (char e : matrix[i]) {
                if (e == 'B'){
                    bombCount++;
                }
            }
        }

        for (String command : commands) {
            if (command.equals("up")) {
                moveSapper(matrix, -1, 0);
                if (isOut || bombCount == 0){
                    break;
                }
            } else if (command.equals("down")){
                moveSapper(matrix, 1, 0);
                if (isOut || bombCount == 0){
                    break;
                }
            }else if (command.equals("left")){
                moveSapper(matrix, 0, -1);
                if (isOut || bombCount == 0){
                    break;
                }
            }else if (command.equals("right")){
                moveSapper(matrix, 0, 1);
                if (isOut || bombCount == 0){
                    break;
                }
            }
        }

        if (isOut) {
            System.out.printf("END! %d bombs left on the field", bombCount);
        } else if (bombCount == 0) {
            System.out.println("Congratulations! You found all bombs!");
        } else {
            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)", bombCount, sRowPosition, sColPosition);
        }


    }

    private static void moveSapper(char[][] matrix, int newRow, int newCol) {
        int Row = sRowPosition + newRow;
        int Col = sColPosition + newCol;
        if (Row < 0 || Row >= matrix.length) {
            Row = sRowPosition;
        } else if (Col < 0 || Col >= matrix[Row].length) {
            Col = sColPosition;
        }
        if (matrix[Row][Col] == 'B'){
            matrix[Row][Col] = '+';
            bombCount--;
            System.out.println("You found a bomb!");
        } else if (matrix[Row][Col] == 'e'){
            isOut = true;
        }
        sRowPosition = Row;
        sColPosition = Col;
    }


}
