package PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*
        You want to be the very best pokemon trainer, like no one ever was, so you set out to catch Pokémon.
        Define a class Trainer and a class Pokémon. Trainer has a name, number of badges and a collection of pokemon.
        Pokémon has a name, an element and health, all values are mandatory. Every Trainer starts with 0 badges.

        From the console you will receive an unknown number of lines until you receive the command "Tournament",
        each line will carry information about a pokemon and the trainer who caught it in the format
        "{TrainerName} {PokemonName} {PokemonElement} {PokemonHealth}" where TrainerName is the name of the
        Trainer who caught the pokemon, names are unique there cannot be 2 trainers with the same name. After
        receiving the command "Tournament" an unknown number of lines containing one of three elements
        "Fire", "Water", "Electricity" will follow until the command "End" is received. For every command you must
        check if a trainer has at least 1 pokemon with the given element, if he does he receive 1 badge, otherwise
        all his pokemon lose 10 health, if a pokemon falls to 0 or less health he dies and must be deleted from the
        trainer’s collection. After the command "End" is received you should print all trainers sorted by the amount
         of badges they have in descending order (if two trainers have the same amount of badges they should be sorted
          by order of appearance in the input) in the format "{TrainerName} {Badges} {NumberOfPokemon}".
         */


        LinkedHashMap<String, Trainer> trainers = new LinkedHashMap<>();


        String command = console.nextLine();

        while (!command.equals("Tournament")) {
            String[] tokens = command.split(" ");
            String name = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            Trainer trainer = trainers.getOrDefault(name, new Trainer(name));
            trainer.addPokemon(pokemon);
            trainers.put(name, trainer);

            command = console.nextLine();
        }

        command = console.nextLine();

        while (!command.equals("End")) {
            String element = command;

            for (Trainer trainer : trainers.values()) {
                trainer.getElement(element);
            }
            command = console.nextLine();
        }

        List<Trainer> sortedTrainers = new ArrayList<>(trainers.values());
        sortedTrainers.sort((t1,t2) -> t2.getBadges() - t1.getBadges());
        for (Trainer sortedTrainer : sortedTrainers) {
            System.out.println(sortedTrainer.getName() + " " + sortedTrainer.getBadges() + " " + sortedTrainer.getNumberOfPokemons());
        }


    }
}
