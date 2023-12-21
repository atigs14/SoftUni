import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*
        Write a program that:

            o Records car number for every car that enter in the parking lot.
            o Removes car number when the car go out.

         When the parking lot is empty, print "Parking Lot is Empty".
         Input
         The input will be string in format {direction, carNumber}.
         The input ends with string "END".
         */

        LinkedHashSet<String> parkingLot = new LinkedHashSet<>();

        String[] input = console.nextLine().split(", ");

        while (!input[0].equals("END")){
            String direction = input[0];

            if (direction.equals("IN")){
                parkingLot.add(input[1]);
            } else if (direction.equals("OUT")){
                parkingLot.remove(input[1]);
            }


            input = console.nextLine().split(", ");
        }

        if (!parkingLot.isEmpty()){
            for (String car :
                    parkingLot) {
                System.out.println(car);
            }
        } else {
            System.out.println("Parking Lot is Empty");
        }

    }
}
