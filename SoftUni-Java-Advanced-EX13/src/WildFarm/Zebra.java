package WildFarm;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    public void eat(Food food){
        if (food instanceof Meat){
            System.out.println("Zebras are not eating that type of food!");
        }else {
            super.eat(food);
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");

    }
}
