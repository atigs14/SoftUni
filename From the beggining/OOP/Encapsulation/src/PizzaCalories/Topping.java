package PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(toppingType + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

    private void setToppingType(String toppingType) {

        if (isPartOfTheList(toppingType)) {
            this.toppingType = toppingType;
        } else {
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
    }

    private boolean isPartOfTheList(String toppingType) {
        boolean isPartOfEnumList = false;

        for (ToppingModifiers topic : ToppingModifiers.values()) {
            isPartOfEnumList = toppingType.equalsIgnoreCase(topic.name());
            if (isPartOfEnumList) {
                return isPartOfEnumList;
            }
        }

        return isPartOfEnumList;
    }

    public double calculateCalories(){
        return ToppingModifiers.valueOf(toppingType).getModifier();
    }
}
