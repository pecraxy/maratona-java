package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {

    private static List<Car> carList = new ArrayList<>(List.of(new Car("Green", 2022),new Car ("Blue", 1998),new Car("Red", 2014)));

    public static void main(String[] args) {
        List<Car> redCars = filter(carList, (Car car) -> {
            return car.getColor().equals("Red");
        });
        List<Car> yearBeforeCars = filter(carList, car -> car.getYear() < 2015);
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(filter(nums, num -> num % 2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T e : list){
            if (predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
