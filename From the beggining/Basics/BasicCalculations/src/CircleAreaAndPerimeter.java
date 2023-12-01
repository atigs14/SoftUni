import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double radius = Double.parseDouble(console.nextLine());

        double area = Math.PI * radius * radius;

        double perimeter = 2 * Math.PI * radius;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
