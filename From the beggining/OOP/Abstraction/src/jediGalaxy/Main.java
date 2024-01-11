package jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Here I have to refactor the code only, it is downloaded

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = dimensions[0];
        int y = dimensions[1];

        int[][] matrix = FillMatrix(x, y);

        String command = scanner.nextLine();
        int sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] playerStartPosition = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilStartPosition = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


            EvilDiagonal(evilStartPosition, matrix);

            sum = PlayerDiagonalReturningPoints(playerStartPosition, matrix, sum);

            command = scanner.nextLine();
        }

        System.out.println(sum);


    }

    private static int PlayerDiagonalReturningPoints(int[] playerStartPosition, int[][] matrix, int sum) {
        int playerX = playerStartPosition[0];
        int playerY = playerStartPosition[1];

        while (playerX >= 0 && playerY < matrix[1].length) {
            if (playerX < matrix.length && playerY >= 0 && playerY < matrix[0].length) {
                sum = CalculatePoints(sum, playerY, matrix[playerX]);
            }

            playerY++;
            playerX--;
        }
        return sum;
    }

    private static int CalculatePoints(int sum, int playerY, int[] matrix) {
        sum += matrix[playerY];
        return sum;
    }

    private static void EvilDiagonal(int[] evilStartPosition, int[][] matrix) {
        int evilX = evilStartPosition[0];
        int evilY = evilStartPosition[1];

        while (evilX >= 0 && evilY >= 0) {
            if (evilX < matrix.length && evilY < matrix[0].length) {
                matrix[evilX][evilY] = 0;
            }
            evilX--;
            evilY--;
        }
    }

    private static int[][] FillMatrix(int x, int y) {
        int[][] matrix = new int[x][y];

        int value = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = value++;
            }
        }
        return matrix;
    }
}
