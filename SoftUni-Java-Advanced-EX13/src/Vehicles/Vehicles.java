package Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicles {

    private  double fuelQuantity;
    private  double fuelConsumption;

    public Vehicles(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity ;
        this.fuelConsumption = fuelConsumption ;
    }

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
        this.fuelQuantity+=liters;
    }


    @Override
    public String toString() {
        return String.format("%s: %.2f ",this.getClass().getSimpleName(),this.fuelQuantity);
    }
}
