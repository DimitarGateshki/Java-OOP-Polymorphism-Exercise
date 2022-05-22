package WildFarm;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed=breed;
    }
    public void eat(Food food){

            super.eat(food);

    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.insert(sb.indexOf(",")+1, " "+this.breed + ",");
        return sb.toString();
    }
}
