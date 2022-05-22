package WildFarm;

public class Tiger extends Felime {

    public Tiger(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }
    public void eat(Food food){
        if (food instanceof Vegetable){
            System.out.println("Tigers are not eating that type of food!");
        }else {
            super.eat(food);
        }
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");

    }
}
