package Vehicles;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String[] carInfo=sc.nextLine().split("\\s+");
        Vehicles car=new Car(Double.parseDouble(carInfo[1]),Double.parseDouble(carInfo[2]));
        String[] truckInfo=sc.nextLine().split("\\s+");
        Vehicles truck=new Truck(Double.parseDouble(truckInfo[1]),Double.parseDouble(truckInfo[2]));



        int n=Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            String[] token=sc.nextLine().split("\\s+");
            switch (token[0]){
                case "Drive":
                    if (token[1].equals("Car")){
                        car.driving(Double.parseDouble(token[2]));
                    }else {
                        truck.driving(Double.parseDouble(token[2]));
                    }
                    break;
                case "Refuel":
                    if (token[1].equals("Car")){
                        car.refueling(Double.parseDouble(token[2]));
                    }else {
                        truck.refueling(Double.parseDouble(token[2]));
                    }
                    break;
            }

        }

        System.out.println(car);
        System.out.println(truck);

    }

}
