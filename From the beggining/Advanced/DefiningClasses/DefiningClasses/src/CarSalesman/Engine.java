package CarSalesman;

import java.util.LinkedHashSet;

public class Engine {
    private final String model;
    private final int power;
    private int displacement;
    private String efficiency;

    public Engine(String model, int power){
        this.model = model;
        this.power = power;
        efficiency = "n/a";
        displacement = -1;
    }

    public Engine(String model, int power, int displacement){
        this(model, power);
        this.displacement = displacement;
        efficiency = "n/a";
    }
    public Engine(String model, int power, String efficiency){
        this(model, power);
        this.efficiency = efficiency;
        displacement = -1;
    }

    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public static Engine getEngineByModel(LinkedHashSet<Engine> engineSet, String targetModel) {
        for (Engine engine : engineSet) {
            if (engine.getModel().equals(targetModel)) {
                return engine; // Return the Engine object if the model matches
            }
        }
        return null; // Return null if the model is not found in the set
    }

    private String displacementToString(){
        return (displacement != -1) ? String.valueOf(displacement) : "n/a";
    }

    @Override
    public String toString() {

        return model + ":\n" +
                "Power: " + power + "\n"+
                "Displacement: " + displacementToString() +"\n"+
                "Efficiency: " + efficiency;
    }
}
