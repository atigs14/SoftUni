package Vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double consumption) {
        super(fuelQuantity, consumption);
    }

    @Override
    public void drive(double distance) {
        double fuelForTheTravel = distance * (getConsumption() + 1.6);
        if (fuelForTheTravel > getFuelQuantity()) {
            System.out.println("Truck needs refueling");
        } else {
            DecimalFormat decimalFormat = new DecimalFormat("###.00");
            setFuelQuantity(getFuelQuantity() - fuelForTheTravel);
            System.out.printf("Truck travelled %s km", decimalFormat.format(distance));
        }
    }

    @Override
    public void refuel(double liters) {
        setFuelQuantity(getFuelQuantity() + liters * 0.95 );
    }
}
