package CarSalesman;

public class Engine {
    private String model;
    private int power;
    private String displacement;
    private String efficiency;

    public Engine(String model, int power){
        this.model = model;
        this.power = power;
    }

    public Engine(String model, int power, String displacement){
        this(model, power);
        this.displacement = displacement;
    }
    public Engine(String model, int power, String efficiency){
        this(model, power);
        this.efficiency = efficiency;
    }
}
