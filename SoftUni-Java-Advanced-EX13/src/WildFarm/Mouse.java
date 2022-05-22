package WildFarm;

public class Mouse extends Mammal {
    public Mouse(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    public void eat(Food food){
        if (food instanceof Meat){
            System.out.println("Mice are not eating that type of food!");
        }else {
            super.eat(food);
        }
    }



    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }
}
