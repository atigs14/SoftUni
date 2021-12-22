import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] RobotsPlusTime = scanner.nextLine().split(";");
        int[] allStartingTime = Arrays
                .stream(scanner.nextLine().split(":"))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();

        String material = scanner.nextLine();

        int hours = allStartingTime[0];
        int minutes = allStartingTime[1];
        int seconds = allStartingTime[2];

        if (seconds > 59){
            minutes++;
            seconds -= 60;
        }
        if (minutes > 59){
            hours++;
            minutes -= 60;
        }



        while (!material.equals("End") ){


            material = scanner.nextLine();
        }
    }
}
