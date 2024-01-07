package CarSalesman;

public class Car {
    private final String model;
    private final Engine engine;
    private int weight;
    private String color;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        weight = -1;
        color = "n/a";
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine);
        this.weight = weight;
        color = "n/a";
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine);
        this.color = color;
        weight = -1;
    }

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    private String weightToString (){
        return (weight != -1) ?  String.valueOf(weight) : "n/a";
    }

    @Override
    public String toString() {
        return model + ":\n" +
                engine + "\n" +
                "Weight: " + weightToString() + "\n" +
                "Color: " + color;
    }
}
