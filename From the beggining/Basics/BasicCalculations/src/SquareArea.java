import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int side = Integer.parseInt(console.nextLine());

        int area = side * side;

        System.out.println(area);
    }
}
