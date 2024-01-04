package CarInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();

        int linesOfInput = Integer.parseInt(console.nextLine());

        while (linesOfInput-- > 0){

            String[] line = console.nextLine().split(" ");

            if (line.length == 1){
                String brand = line[0];

                Car car = new Car(brand);

                cars.add(car);

            }else if (line.length == 3){
                String brand = line[0];
                String model = line[1];
                int horsePower = Integer.parseInt(line[2]);

                Car car = new Car(brand, model, horsePower);


                cars.add(car);
            }

        }

        for (Car car :cars) {
            System.out.println(car.carInfo());
        }
    }
}