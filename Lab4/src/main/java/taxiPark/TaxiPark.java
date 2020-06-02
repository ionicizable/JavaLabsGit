package taxiPark;

import exception.TaxiParkException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaxiPark {
    private List<Car> cars;

    public TaxiPark(List<Car> cars) {
        this.cars = cars;
    }

    public TaxiPark(){
        this.cars = new ArrayList<>();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void carsCost() {
        Integer sum = 0;
        for (Car car : cars) {
            sum += car.getPrice();
        }
        System.out.println(sum);
    }

    public void sortCarsByFuelConsumption(){
        List<Car> temp;
        temp = this.cars.stream().sorted(Comparator.comparing(Car::getFuelConsumption))
                .collect(Collectors.toList());
        temp.forEach(o -> System.out.println(o.toString()));
    }

    public void chooseBySpeed(Integer min, Integer max) throws TaxiParkException {
        if (min<0 || max<0){
            throw new TaxiParkException("only positive values accepted");
        }
        if (max<min){
            throw new TaxiParkException("Max should be larger than Min");
        }
        for (Car car: cars) {
            if (car.getSpeed()>=min && car.getSpeed()<=max){
                System.out.println(car.toString());
            }
        }
    }

    public void show(){
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }

    public void addCar(Car car){
        cars.add(car);
    }
}
