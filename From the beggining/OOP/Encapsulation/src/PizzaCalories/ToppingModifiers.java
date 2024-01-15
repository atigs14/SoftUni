package PizzaCalories;

public enum ToppingModifiers {
    MEAT(1.2),
    Veggies(0.8),
    Cheese(1.1),
    Sauce(0.9);

    private final double modifier;

    ToppingModifiers(double modifier){
        this.modifier = modifier;
    }

    public double getModifier() {
        return modifier;
    }
}
