import entity.Puppy;
import exception.TaxiParkException;
import serialization.Connector;
import taxiPark.Car;
import taxiPark.TaxiPark;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Puppy puppy = new Puppy(3,"bulldog","Rex");

        puppy.showName();

        puppy.bite();

        puppy.jump();

        puppy.run();

        puppy.voice();

        Car car1 = new Car("mazda", "rx7", 20, 100, 6.9, 3);
        Car car2 = new Car("lada","granta",10,90,4.2, 2);
        Car car3 = new Car("mercedes", "c63", 70, 120, 10.3, 4);
        TaxiPark taxiPark = new TaxiPark();
        taxiPark.addCar(car1);
        taxiPark.addCar(car2);
        taxiPark.addCar(car3);
        Connector connector = new Connector();
        try {
            connector.serialize(puppy, taxiPark);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
            while (true) {
                try {
                    System.out.println("1.Cars cost 2.Sort by fuel consumption 3.choose a car by speed");
                    Scanner scanner = new Scanner(System.in);
                    int check = scanner.nextInt();
                    switch (check) {
                        case 1:
                            taxiPark.carsCost();
                            break;
                        case 2:
                            taxiPark.sortCarsByFuelConsumption();
                            break;
                        case 3:
                            System.out.println("Enter min and max speed for search:");
                            int min = scanner.nextInt();
                            int max = scanner.nextInt();
                            taxiPark.chooseBySpeed(min, max);
                            break;
                        default:
                            System.out.println("Такого пункта в меню нет");
                    }
                } catch (InputMismatchException | TaxiParkException e){
                    System.out.println("Error");
                    System.out.println(e.getMessage());
                }

            }


    }
}
