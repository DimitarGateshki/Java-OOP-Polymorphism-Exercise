package Vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicles {


    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption+0.9);
    }
}
