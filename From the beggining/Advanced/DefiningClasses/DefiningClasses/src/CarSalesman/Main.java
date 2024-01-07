package CarSalesman;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        /*
        Define two classes Car and Engine. A Car has a model, engine, weight and color. An Engine has model,
        power, displacement and efficiency. A Car's weight, color, its Engine’s displacements, and efficiency are optional.
        On the first line, you will read a number N which will specify how many lines of engines you will receive, on each of
        the next N lines you will receive information about an Engine in the following format "{Model} {Power} {Displacement} {Efficiency}". After the lines with engines, on the next line you will receive a number M – specifying the number of Cars that will follow, on each of the next M lines the information about a Car will follow in the following format "{Model} {Engine} {Weight} {Color}", where the engine in the format will be the model of an existing Engine. When creating the object for a Car, you should keep a reference to the real engine in it, instead of just the engines model, note that the optional properties might be missing from the formats.
        Your task is to print each car (in the order you received them) and its information in the format-defined bellow.
        If any of the optional fields has not been given print "n/a" in its place instead of:
        {CarModel}: {EngineModel}: Power: {EnginePower} Displacement: {EngineDisplacement} Efficiency: {EngineEfficiency}
        Weight: {CarWeight} Color: {CarColor}
         */


        int n = Integer.parseInt(console.nextLine());

        LinkedHashSet<Engine> engines = new LinkedHashSet<>();
        LinkedHashSet<Car> cars = new LinkedHashSet<>();

        while (n-- > 0) {
            String[] tokens = console.nextLine().split(" ");

            String engineModel = tokens[0];
            int enginePower = Integer.parseInt(tokens[1]);

            if (tokens.length == 4) {
                int displacement = Integer.parseInt(tokens[2]);
                String efficiency = tokens[3];
                Engine engine = new Engine(engineModel, enginePower, displacement, efficiency);
                engines.add(engine);

            } else if (tokens.length == 3) {
                try {
                    int displacement = Integer.parseInt(tokens[2]);
                    Engine engine = new Engine(engineModel, enginePower, displacement);
                    engines.add(engine);

                } catch (NumberFormatException e) {
                    String efficiency = tokens[2];
                    Engine engine = new Engine(engineModel, enginePower, efficiency);
                    engines.add(engine);
                }
            } else if (tokens.length == 2) {
                Engine engine = new Engine(engineModel, enginePower);
            }
        }

        int m = Integer.parseInt(console.nextLine());

        while (m-- > 0) {
            String[] tokens = console.nextLine().split(" ");
            String model = tokens[0];
            String engineInString = tokens[1];

            Engine engine = Engine.getEngineByModel(engines, engineInString);

            if (tokens.length == 4) {
                int weight = Integer.parseInt(tokens[2]);
                String color = tokens[3];
                Car car = new Car(model, engine, weight, color);
                cars.add(car);

            } else if (tokens.length == 3) {
                try {
                    int weight = Integer.parseInt(tokens[2]);
                    Car car = new Car(model, engine, weight);
                    cars.add(car);

                } catch (Exception e) {
                    String color = tokens[2];
                    Car car = new Car(model, engine, color);
                    cars.add(car);
                }
            } else if (tokens.length == 2) {
                Car car = new Car(model, engine);
                cars.add(car);
            }
        }

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
