package Vehicles;

public abstract class Vehicle {
    private double fuelQuantity;
    private double consumption;

    public Vehicle(double fuelQuantity, double consumption) {
        this.fuelQuantity = fuelQuantity;
        this.consumption = consumption;
    }

    public abstract void drive(double distance);

    public abstract void refuel(double liters);

    public double getConsumption() {
        return consumption;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }
}
