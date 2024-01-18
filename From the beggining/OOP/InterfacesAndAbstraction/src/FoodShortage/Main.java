package FoodShortage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int lines = Integer.parseInt(console.nextLine());

        List<Buyer> buyers = new ArrayList<>();

        while (lines-- > 0) {
            String[] tokens = console.nextLine().split("\\s+");

            if (tokens.length == 4) {
                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);
                String id = tokens[2];
                String birthday = tokens[3];

                Buyer citizen = new Citizen(name, age, id, birthday);
                buyers.add(citizen);
            } else if (tokens.length == 3) {
                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);
                String group = tokens[2];

                Buyer citizen = new Rebel(name, age, group);
                buyers.add(citizen);
            }
        }

        String command = console.nextLine();


        while (!command.equals("End")) {

            for (Buyer buyer : buyers) {
                if (command.equals(buyer.getName())) {
                    buyer.buyFood();
                }
            }

            command = console.nextLine();
        }

        int foodCounter = 0;

        for (Buyer buyer : buyers) {
            foodCounter += buyer.getFood();
        }

        System.out.println(foodCounter);
    }
}
