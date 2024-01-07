package SpeedRacing;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        LinkedHashSet<Car> cars = new LinkedHashSet<>(
        );

        while (n-- > 0) {
            String[] tokens = console.nextLine().split(" ");
            String carName = tokens[0];
            double fuelAmount = Double.parseDouble(tokens[1]);
            double fuelCostForKM = Double.parseDouble(tokens[2]);

            Car car = new Car(carName, fuelAmount, fuelCostForKM);
            cars.add(car);
        }

        String command = console.nextLine();

        while (!command.equals("End")) {
            String[] tokens = command.split(" ");
            String carModel = tokens[1];
            int distance = Integer.parseInt(tokens[2]);

            for (Car car : cars) {
                if (car.getModel().equals(carModel)) {
                    car.DriveCar(distance);
                }
            }

            command = console.nextLine();
        }

        for (Car car : cars) {
            System.out.printf("%s %.2f %.0f%n",car.getModel(), car.getFuel(), car.getDistanceTraveled());
        }
    }
}
