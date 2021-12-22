package PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        Map<String, Trainer> trainers = new LinkedHashMap<>();
        List<Pokemon> pokemons = new ArrayList<>();
        Pokemon pokemon = null;
        while (!input[0].equals("Tournament")){
            String nameOfTheTrainer = input[0];
            String nameOfThePokemon = input[1];
            String pokemonElement = input[2];
            int pokemonHealth = Integer.parseInt(input[3]);

            trainers.putIfAbsent(nameOfTheTrainer, new Trainer(nameOfTheTrainer));
            Trainer currentTrainer = trainers.get(nameOfTheTrainer);


            input = scanner.nextLine().split("\\s+");
        }

        String commands = scanner.nextLine();

        while (!commands.equals("End")) {
            String finalCommands = commands;


            commands = scanner.nextLine();
        }
    }
}
