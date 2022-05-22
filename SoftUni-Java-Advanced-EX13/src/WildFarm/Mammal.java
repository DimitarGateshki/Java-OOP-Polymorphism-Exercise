package WildFarm;

public class Mammal  extends Animal{
    protected String livingRegion;

    public Mammal(String animalName, String animalType, double animalWeight,String livingRegion) {
        super(animalName, animalType, animalWeight,livingRegion);

    }

    @Override
    public void makeSound() {

    }
}
