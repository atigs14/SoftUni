package Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] carTokens = console.nextLine().split(" ");
        double carFuelQuantity = Double.parseDouble(carTokens[1]);
        double carConsumption = Double.parseDouble(carTokens[2]);

        String[] truckTokens = console.nextLine().split(" ");
        double truckFuelQuantity = Double.parseDouble(truckTokens[1]);
        double truckConsumption = Double.parseDouble(truckTokens[2]);

        Car car = new Car(carFuelQuantity, carConsumption);
        Truck truck = new Truck(truckFuelQuantity, truckConsumption);

        int numberOfLines = Integer.parseInt(console.nextLine());

        while (numberOfLines-- > 0){
            String[] command = console.nextLine().split(" ");

            if (command[0].equals("Drive")){
                String vehicle = command[1];

                if (vehicle.equals("Truck")){
                    //TODO
                } else if (vehicle.equals("Car")){
                    //TODO
                }
            }
        }

    }
}
