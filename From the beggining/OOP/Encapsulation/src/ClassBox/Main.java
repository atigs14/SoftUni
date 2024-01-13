package ClassBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double length = Double.parseDouble(console.nextLine());
        double width = Double.parseDouble(console.nextLine());
        double height = Double.parseDouble(console.nextLine());

        try {
            Box box = new Box(length, width, height);

            System.out.printf("Surface Area - %.2f%n", box.calculateSurfaceAre());
            System.out.printf("Lateral Surface Area - %.2f%n", box.calculateLateralSurfaceArea());
            System.out.printf("Volume – %.2f%n", box.calculateVolume());

        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }


    }
}
