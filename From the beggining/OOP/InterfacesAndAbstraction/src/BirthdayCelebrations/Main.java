package BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String command = console.nextLine();

        List<Birthable> birthables = new ArrayList<>();

        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+");

            if (tokens.length == 5) {
                String name = tokens[1];
                int age = Integer.parseInt(tokens[2]);
                String id = tokens[3];
                String birthday = tokens[4];

                Birthable citizen = new Citizen(name, age, id, birthday);

                birthables.add(citizen);

            } else if (tokens.length == 3) {
                if (tokens[0].equals("Pet")) {

                    Birthable pet = new Pet(tokens[1], tokens[2]);
                    birthables.add(pet);
                }
            }

            command = console.nextLine();
        }

        String yearToLookFor = console.nextLine();

        List<String> filteredBirthdays = birthables.stream().map(Birthable::getBirthDate)
                .filter(birthDate -> birthDate.endsWith(yearToLookFor))
                .toList();

        filteredBirthdays.forEach(System.out::println);
    }
}
