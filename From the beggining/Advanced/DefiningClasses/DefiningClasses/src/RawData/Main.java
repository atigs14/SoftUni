package RawData;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    /*
    You are the owner of a courier company and you want to make a system for tracking your cars and their cargo.
    Define a class Car that holds information about model, engine, cargo and a collection of exactly 4 tires.
    The engine, cargo and tire should be separate classes, create a constructor that receives all information
    about the Car and creates and initializes its inner components (engine, cargo and tires).

    On the first line of the input you will receive a number N - the number of cars you have, on each of the next N
    lines you will receive information about a car in the format:

    "{Model} {EngineSpeed} {EnginePower} {CargoWeight} {CargoType} {Tire1Pressure} {Tire1Age} {Tire2Pressure} {Tire2Age}
    {Tire3Pressure} {Tire]’3Age} {Tire4Pressure} {Tire4Age}", where the speed, power, weight and tire age are integers,
    tire pressure is a double.

    After the N lines you will receive a single line with one of 2 commands "fragile" or "flamable" , if the command is
    "fragile" print all cars whose Cargo Type is "fragile" with a tire whose pressure is < 1, if the command is
    "flamable" print all cars whose Cargo Type is "flamable" and have Engine Power > 250. The cars should be printed
    in order of appearing in the input.
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        LinkedHashSet<Car> cars = new LinkedHashSet<>();

        while (n-- > 0) {
            String[] tokens = console.nextLine().split(" ");
            String model = tokens[0];
            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            double tire1Pressure = Double.parseDouble(tokens[5]);
            int tire1age = Integer.parseInt(tokens[6]);
            double tire2Pressure = Double.parseDouble(tokens[7]);
            int tire2age = Integer.parseInt(tokens[8]);
            double tire3Pressure = Double.parseDouble(tokens[9]);
            int tire3age = Integer.parseInt(tokens[10]);
            double tire4Pressure = Double.parseDouble(tokens[11]);
            int tire4age = Integer.parseInt(tokens[12]);

            Car car = new Car(model, new Engine(engineSpeed, enginePower), new Cargo(cargoWeight, cargoType), new Tires(tire1Pressure, tire1age, tire2Pressure, tire2age, tire3Pressure, tire3age, tire4Pressure, tire4age));

            cars.add(car);
        }

        String command = console.nextLine();

        if (command.equals("fragile")) {
            for (Car car : cars) {
                if (car.getCargo().getType().equals("fragile") && car.getTires().isUnder1()) {
                    System.out.println(car.getModel());
                }
            }

        } else if (command.equals("flammable")) {
            for (Car car : cars) {
                if (car.getCargo().getType().equals("flammable") && car.getEngine().getPower() > 250) {
                    System.out.println(car.getModel());
                }
            }
        }
    }
}
