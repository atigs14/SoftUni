package PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setWeight(weight);
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
    }

    private void setBakingTechnique(String bakingTechnique) {
        this.bakingTechnique = bakingTechnique;
    }

    private void setFlourType(String flourType) {
        if (isPartOfTheList(flourType)) {
            this.flourType = flourType;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    private boolean isPartOfTheList(String flourType) {
        boolean isPartOfEnumList = false;

        for (DoughModifiers dough : DoughModifiers.values()) {
            isPartOfEnumList = flourType.equalsIgnoreCase(dough.name());
            if (isPartOfEnumList) {
                return isPartOfEnumList;
            }
        }

        return isPartOfEnumList;
    }



    public double calculateCalories(){
        return DoughModifiers.valueOf(flourType.toUpperCase()).getModifier() * weight;
    }
}
