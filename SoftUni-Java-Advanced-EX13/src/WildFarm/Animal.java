package WildFarm;

import java.text.DecimalFormat;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private double animalWeight;
    private int foodEaten;
    protected String livingRegion;

    public Animal(String animalName, String animalType, double animalWeight,String livingRegion) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.livingRegion=livingRegion;

    }

    public abstract void makeSound();

    public void eat(Food food){
        this.foodEaten=food.getQuantity();

    }

    DecimalFormat format=new DecimalFormat("##.##");

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %d]"
                ,this.animalType,this.animalName,
                format.format(this.animalWeight),this.livingRegion,this.foodEaten);
    }
}
