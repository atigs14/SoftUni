package wilfFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();

        String animalInput = scanner.nextLine();

        while (!animalInput.equals("End")) {
            String[] tokens = animalInput.split("\\s+");
            Animal animal = createAnimal(tokens);
            String foodInput = scanner.nextLine();
            Food food = getFood(foodInput.split("\\s+"));

            animal.makeSound();
            try {
                animal.eat(food);
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
            animals.add(animal);
            animalInput = scanner.nextLine();
        }
        animals.forEach(System.out::println);
    }

    private static Food getFood(String[] tokens) {
        String type = tokens[0];
        int quantity = Integer.parseInt(tokens[1]);

        if (type.equals("Meat")) {
            return new Meat(quantity);
        } else return new Vegetable(quantity);
    }

    private static Animal createAnimal(String[] tokens) {
        String type = tokens[0];
        String name = tokens[1];
        double weight = Double.parseDouble(tokens[2]);
        String animalLivingRegion = tokens[3];

        switch (type) {
            case "Mouse":
                return new Mouse(name, type, weight, animalLivingRegion);
            case "Cat":
                return new Cat(name, type, weight, animalLivingRegion, tokens[4]);
            case "Zebra":
                return new Zebra(name, type, weight, animalLivingRegion);
            case "Tiger":
                return new Tiger(name, type, weight, animalLivingRegion);
            default:
                throw new IllegalArgumentException("No such animal");
        }
    }
}
