package WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<Animal> zoo=new ArrayList<>();

        String input= sc.nextLine();
        while (!input.equals("End")){
            String[] info=input.split("\\s+");

            Animal animal=createAnimal(info);
            String foodInfo=sc.nextLine();

            Food food=createFood(foodInfo.split("\\s+"));
            animal.makeSound();
            animal.eat(food);
            zoo.add(animal);
            input=sc.nextLine();



        }
        for (Animal el:zoo) {
            System.out.println(el);
        }


    }

    private static Animal createAnimal(String[] info) {
        switch (info[0]){
            case "Mouse":
                return new Mouse(info[1],info[0],Double.parseDouble(info[2]),info[3]);

                case "Zebra":
                    return new Zebra(info[1],info[0],Double.parseDouble(info[2]),info[3]);

                case "Cat":
                    return new Cat(info[1],info[0],Double.parseDouble(info[2]),info[3],info[4]);

                case "Tiger":
                    return new Tiger(info[1],info[0],Double.parseDouble(info[2]),info[3]);

            default:
                throw new  IllegalStateException("Unknown animal type "+info[0]);
        }



    }

    private static Food createFood(String[] split) {
        int quan=Integer.parseInt(split[1]);
        return split[0].equals("Meat") ? new Meat(quan):new Vegetable(quan);

    }
}
