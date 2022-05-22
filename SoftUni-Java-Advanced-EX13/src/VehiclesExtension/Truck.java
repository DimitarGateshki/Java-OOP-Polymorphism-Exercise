package VehiclesExtension;

public class Truck extends Vehicles {


    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption+1.6, tankCapacity);
    }

    @Override
    public void refueling(double liters) {
        super.refueling(liters*0.95);
    }
}
