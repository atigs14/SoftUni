package PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int toppings) {
        setToppings(toppings);
        setName(name);
    }

    private void setName(String name) {
        if (name.isBlank() || (name.length() > 15)) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }

        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setToppings(int toppings) {
        if (toppings < 1 || toppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }

        this.toppings = new ArrayList<>(toppings);
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping){
        toppings.add(topping);
    }

    public double getOverallCalories(){
        double toppingCalories = 1;

        for (Topping topping : toppings) {
            toppingCalories *= topping.calculateCalories();
        }
                //Absolutely no sense with real life
        return 2 * dough.calculateCalories() * toppingCalories;
    }
}
