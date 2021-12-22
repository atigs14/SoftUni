package wilfFarm;

import java.text.DecimalFormat;

public class Cat extends Felime{
    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %s, %d]", getAnimalType(), getAnimalName(), breed, format.format(getAnimalWeight()), getLivingRegion(), getFoodEaten());
    }
}
