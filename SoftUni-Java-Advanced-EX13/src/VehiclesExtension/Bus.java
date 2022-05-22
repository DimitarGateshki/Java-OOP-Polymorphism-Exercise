package VehiclesExtension;

public class Bus extends Vehicles {

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption+1.4, tankCapacity);
    }


}
