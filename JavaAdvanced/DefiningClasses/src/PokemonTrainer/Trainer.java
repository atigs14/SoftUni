package PokemonTrainer;

public class Trainer {
    private String name;
    private static int badges = 0;
    private Pokemon pokemon;

    public Trainer(String name, Pokemon pokemon) {
        this.name = name;
        this.pokemon = pokemon;
    }

    public Trainer(String name) {
        this.name = name;
    }

    public static int getBadges() {
        return badges;
    }
}
