package Vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicle{
    public Car(double fuelQuantity, double consumption) {
        super(fuelQuantity, consumption);
    }

    @Override
    public void drive(double distance) {
        double fuelForTheTravel = distance * (getConsumption() + 0.9);
        if (fuelForTheTravel > getFuelQuantity()){
            System.out.println("Car needs refueling");
        } else {
            DecimalFormat decimalFormat = new DecimalFormat("###.00");
            setFuelQuantity(getFuelQuantity() - fuelForTheTravel);
            System.out.printf("Car travelled %s km",decimalFormat.format(distance));
        }
    }

    @Override
    public void refuel(double liters) {
        setFuelQuantity(getFuelQuantity() + liters);
    }
}
