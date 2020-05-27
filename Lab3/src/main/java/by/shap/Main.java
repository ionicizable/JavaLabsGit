package by.shap;

import by.shap.entity.Point;
import by.shap.entity.Quadrilateral;
import by.shap.entity.QuadrilateralHashtable;
import by.shap.entity.Train;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        List<Train> trains = new ArrayList<>();
        trains.add(addTrain("Minsk", 1, "1000"));
        trains.add(addTrain("Frankfurt", 2, "1100"));
        trains.add(addTrain("Moscow", 3, "1200"));
        trains.add(addTrain("Seoul", 4, "1300"));
        System.out.println("All trains");
        for (Train train : trains) {
            System.out.println(train.toString());
        }
        System.out.println("Choose destination:");
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.next();
        for (Train train : trains) {
            if (train.getDestination().equals(destination)){
                System.out.println(train.toString());
            }
        }
        System.out.println("Choose destination and time");
        destination = scanner.next();
        String time = scanner.next();
        for (Train train : trains) {
            if (train.getDestination().equals(destination) && train.getTime().equals(destination)){
                System.out.println(train.toString());
            }
        }
        System.out.println("Choose destination");
        destination = scanner.next();
        System.out.println("Trains to your destination with common seats available:");
        for (Train train : trains) {
            if (train.getDestination().equals(destination) && train.getSeat().get("common")>0 ){
                System.out.println(train.toString());
            }
        }

        Quadrilateral square = new Quadrilateral(
                new Point(0,0),
                new Point(5, 0),
                new Point(5, 5),
                new Point(0, 5)
        );

        Quadrilateral square1 = new Quadrilateral(
                new Point(0,0),
                new Point(10, 0),
                new Point(10, 10),
                new Point(0, 10)
        );

        Quadrilateral square2 = new Quadrilateral(
                new Point(0,0),
                new Point(8, 0),
                new Point(8, 8),
                new Point(0, 8)
        );

        Quadrilateral rectangle = new Quadrilateral(
                new Point(0, 0),
                new Point(5, 0),
                new Point(5, 2),
                new Point(0, 2)
        );

        Quadrilateral rectangle1 = new Quadrilateral(
                new Point(0, 0),
                new Point(8, 0),
                new Point(8, 2),
                new Point(0, 2)
        );

        Quadrilateral rectangle2 = new Quadrilateral(
                new Point(0, 0),
                new Point(5, 0),
                new Point(5, 10),
                new Point(0, 10)
        );

        Quadrilateral arbitary = new Quadrilateral(
                new Point(0, 0),
                new Point(4, 0),
                new Point(4, 2),
                new Point(0, 5)
        );

        QuadrilateralHashtable quadrilateralHashtable = new QuadrilateralHashtable(
                square,
                rectangle,
                arbitary,
                square1,
                square2,
                rectangle1,
                rectangle2
        );

        System.out.println(quadrilateralHashtable.toString());

        System.out.println("Min square perimeter: " + quadrilateralHashtable.findMinPerimeter(QuadrilateralHashtable.QuadrilateralType.Square));
        System.out.println("Max square perimeter: " + quadrilateralHashtable.findMaxPerimeter(QuadrilateralHashtable.QuadrilateralType.Square));

        System.out.println("Min square area: " + quadrilateralHashtable.findMinArea(QuadrilateralHashtable.QuadrilateralType.Square));
        System.out.println("Max square area: " + quadrilateralHashtable.findMaxArea(QuadrilateralHashtable.QuadrilateralType.Square));
        System.out.println();

        System.out.println("Min rectangle perimeter: " + quadrilateralHashtable.findMinPerimeter(QuadrilateralHashtable.QuadrilateralType.Rectangle));
        System.out.println("Max rectangle perimeter: " + quadrilateralHashtable.findMaxPerimeter(QuadrilateralHashtable.QuadrilateralType.Rectangle));

        System.out.println("Min rectangle area: " + quadrilateralHashtable.findMinArea(QuadrilateralHashtable.QuadrilateralType.Rectangle));
        System.out.println("Max rectangle area: " + quadrilateralHashtable.findMaxArea(QuadrilateralHashtable.QuadrilateralType.Rectangle));
        System.out.println();

        System.out.println("Min arbitary perimeter: " + quadrilateralHashtable.findMinPerimeter(QuadrilateralHashtable.QuadrilateralType.Arbitary));
        System.out.println("Max arbitary perimeter: " + quadrilateralHashtable.findMaxPerimeter(QuadrilateralHashtable.QuadrilateralType.Arbitary));

        System.out.println("Min arbitary area: " + quadrilateralHashtable.findMinArea(QuadrilateralHashtable.QuadrilateralType.Arbitary));
        System.out.println("Max arbitary area: " + quadrilateralHashtable.findMaxArea(QuadrilateralHashtable.QuadrilateralType.Arbitary));
        System.out.println();
    }

    public static Train addTrain(String destination, Integer id, String time) {
        HashMap<String, Integer> seats = new HashMap<>();
        seats.put("common", ThreadLocalRandom.current().nextInt(0, 20 + 1));
        seats.put("coupe", ThreadLocalRandom.current().nextInt(0, 20 + 1));
        seats.put("plat", ThreadLocalRandom.current().nextInt(0, 20 + 1));
        seats.put("luxury", ThreadLocalRandom.current().nextInt(0, 20 + 1));
        return new Train(destination, id, time, seats);
    }


}
