package PokemonTrainer;

import java.util.LinkedHashSet;

public class Trainer {
    private String name;
    private int badges;
    private LinkedHashSet<Pokemon> pokemons;


    public Trainer(String name) {
        this.name = name;
        pokemons = new LinkedHashSet<>();
        badges = 0;
    }

    public String getName() {
        return name;
    }

    public int getBadges() {
        return badges;
    }

    public void addPokemon(Pokemon pokemon){
        pokemons.add(pokemon);
    }

    public LinkedHashSet<Pokemon> getPokemons() {
        return pokemons;
    }

    public int getNumberOfPokemons(){
        return pokemons.size();
    }

    public void getElement(String element){
        boolean hasElement = pokemons.stream().anyMatch(pokemon -> pokemon.getElement().equals(element));
        if (hasElement){
            badges++;
        } else {
            pokemons.forEach(pokemon -> pokemon.takeDamage(10));
        }

        pokemons.removeIf(pokemon -> pokemon.getHealth() <= 0);
    }
}
