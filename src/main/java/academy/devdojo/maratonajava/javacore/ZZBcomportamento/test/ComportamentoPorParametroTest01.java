package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {

    private static List<Car> carList = new ArrayList<>(List.of(new Car("Green", 2022),new Car ("Blue", 1998),new Car("Red", 2014)));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(carList));
        System.out.println(filterRedCar(carList));
        System.out.println(filterCarByColor(carList, "Green"));
        System.out.println(filterCarByColor(carList, "Red"));
        System.out.println(filterCarByYearBefore(carList, 2015));
    }

    private static List<Car> filterGreenCar(List<Car> cars){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("Green")){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterRedCar(List<Car> cars){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("Red")){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterCarByYearBefore(List<Car> cars, int year){
        List<Car> oldCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year){
                oldCars.add(car);
            }
        }
        return oldCars;
    }
}
