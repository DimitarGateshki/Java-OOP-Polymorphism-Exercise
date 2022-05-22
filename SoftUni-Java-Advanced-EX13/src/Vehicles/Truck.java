package Vehicles;

public class Truck extends Vehicles {

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption+1.6);
    }
    @Override
    public void refueling(double liters) {
        super.refueling(liters*0.95);
    }
}
