package VehiclesExtension;

import java.text.DecimalFormat;

public abstract class Vehicles {

    private  double fuelQuantity;
    private  double fuelConsumption;
    private  double tankCapacity;

    public void setFuelConsumption() {
        this.fuelConsumption = this.fuelConsumption-1.4;
    }
    public  void secondSet(){
        this.fuelConsumption = this.fuelConsumption+1.4;
    }

    public Vehicles(double fuelQuantity, double fuelConsumption, double tankCapacity) {

        this.fuelConsumption = fuelConsumption ;
        this.tankCapacity=tankCapacity;
        this.setFlue(fuelQuantity);
    }

    private void setFlue(double fuelQuantity){
        if (fuelQuantity<=0){
            System.out.println("Fuel must be a positive number");

        }else if (this.tankCapacity<fuelQuantity){
            System.out.println("Cannot fit fuel in tank");
        }else{
            this.fuelQuantity=fuelQuantity;
        }
    };

    DecimalFormat form=new DecimalFormat("##.##");
    public void driving(double kms) {
        double inFlue=kms*this.fuelConsumption;
        if (inFlue<=this.fuelQuantity){
            this.fuelQuantity-=inFlue;

            System.out.printf("%s travelled %s km%n",this.getClass().getSimpleName(),form.format(kms));
        }else {
            System.out.printf("%s needs refueling%n",this.getClass().getSimpleName());
        }
    }

    public void refueling(double liters) {
        if (liters<=0){
            System.out.println("Fuel must be a positive number");

        }else if (this.fuelQuantity+liters>this.tankCapacity){
            System.out.println("Cannot fit fuel in tank");

        }else {
            this.fuelQuantity += liters;
        }
    }


    @Override
    public String toString() {
        return String.format("%s: %.2f ",this.getClass().getSimpleName(),this.fuelQuantity);
    }
}
