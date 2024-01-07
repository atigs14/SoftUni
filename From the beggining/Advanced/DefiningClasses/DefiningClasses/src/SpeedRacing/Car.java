package SpeedRacing;

public class Car {
    private final String model;
    private double fuel;
    private final double fuelCost;
    private int distanceTraveled;

    public Car(String model, double fuel, double fuelCost){
        this.model = model;
        this.fuel = fuel;
        this.fuelCost = fuelCost;
        this.distanceTraveled = 0;
    }

    public void DriveCar (int amountOfKM){
        if (amountOfKM * this.fuelCost > this.fuel){
            System.out.println("Insufficient fuel for the drive");
        } else {
            this.fuel = this.fuel - amountOfKM * this.fuelCost;
            this.distanceTraveled = amountOfKM;
        }
    }

    public String getModel() {
        return model;
    }

    public double getFuel() {
        return fuel;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }
}
