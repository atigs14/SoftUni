import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parkingLot = new LinkedHashSet<>();
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("END")){
                break;
            }
            else {
                String[] tokens = input.split(", ");
                if (tokens[0].equals("IN")){
                    parkingLot.add(tokens[1]);
                } else {
                    parkingLot.remove(tokens[1]);
                }
            }
        }

        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            System.out.println(String.join(System.lineSeparator(), parkingLot));
        }

    }
}
