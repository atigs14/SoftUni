package PizzaCalories;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<Topping> toppings = new ArrayList<>();

        String[] inputForPizza = console.nextLine().split("\\s+");

        String[] inputForDough = console.nextLine().split("\\s+");

        String pizzaName = inputForPizza[1];
        int numberOfTopics = Integer.parseInt(inputForPizza[2]);

        String flourType = inputForDough[1];
        String bakingTechnique = inputForDough[2];
        double flourWeight = Double.parseDouble(inputForDough[3]);

        String[] command = console.nextLine().split("\\s+");

        while (!command[0].equals("END")) {
            String toppingType = command[1];
            double toppingWeight = Double.parseDouble(command[2]);

            try {
                Topping topping = new Topping(toppingType, toppingWeight);

                toppings.add(topping);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            command = console.nextLine().split("\\s+");
        }

        try {
            Pizza pizza = new Pizza(pizzaName, numberOfTopics);
            Dough dough = new Dough(flourType, bakingTechnique, flourWeight);

            pizza.setDough(dough);

            for (Topping topping : toppings) {
                pizza.addTopping(topping);
            }

            System.out.printf(pizza.getName() + " - %.2f",pizza.getOverallCalories());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }




    }
}
