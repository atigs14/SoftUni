package vehiclesExtension;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle car = getVehicle(scanner);
        String[] tokens;

        Vehicle truck = getVehicle(scanner);

        Vehicle bus = getVehicle(scanner);


        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);
        vehicles.put("Bus", bus);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            tokens = scanner.nextLine().split("\\s+");
            String commandName = tokens[0];
            String vehicleType = tokens[1];
            Vehicle vehicle = vehicles.get(vehicleType);

            try {
                switch (commandName) {
                    case "Drive":
                        double distance = Double.parseDouble(tokens[2]);
                        if (vehicle instanceof Bus) {
                            ((Bus) vehicle).setEmpty(false);
                        }
                        System.out.println(vehicle.drive(distance));
                        break;
                    case "Refuel":
                        double liters = Double.parseDouble(tokens[2]);
                        vehicles.get(vehicleType).refuel(liters);
                        break;
                    case "DriveEmpty":
                        double driveEmptyDistance = Double.parseDouble(tokens[2]);
                        if (vehicle instanceof Bus) {
                            ((Bus) vehicle).setEmpty(true);
                        }
                        System.out.println(vehicle.drive(driveEmptyDistance));
                        break;
                    default:
                        throw new IllegalArgumentException("No such command");
                }
            } catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
            }
        }

        vehicles.values().forEach(System.out::println);
    }

    private static Vehicle getVehicle(Scanner scanner) {
        String[] tokens = scanner.nextLine().split("\\s+");
        String vehicleType = tokens[0];
        double fuelAmount = Double.parseDouble(tokens[1]);
        double consumption = Double.parseDouble(tokens[2]);
        double tankCapacity = Double.parseDouble(tokens[3]);

        Vehicle vehicle = null;

        switch (vehicleType){
            case "Car":
                vehicle = new Car(fuelAmount, consumption, tankCapacity);
                break;
            case "Bus":
                vehicle = new Bus(fuelAmount, consumption, tankCapacity);
                break;
            case "Truck":
                vehicle = new Truck(fuelAmount, consumption, tankCapacity);
        }

        return vehicle;
    }
}
