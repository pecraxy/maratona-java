package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {

    private static List<Car> carList = new ArrayList<>(List.of(new Car("Green", 2022),new Car ("Blue", 1998),new Car("Red", 2014)));

    public static void main(String[] args) {
        List<Car> greenCars = filterCar(carList, new Predicate<Car>() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green");
            }
        });

        List<Car> redCars = filterCar(carList, car -> car.getColor().equals("Red"));
        List<Car> yearBeforeCars = filterCar(carList, car -> car.getYear() < 2015);

        System.out.println(greenCars);
        System.out.println();
        System.out.println(redCars);
        System.out.println();
        System.out.println(yearBeforeCars);
    }

    private static List<Car> filterCar(List<Car> cars, Predicate<Car> carPredicate){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars){
            if (carPredicate.test(car)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}
