package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        integers.stream()
                .reduce((x, y) -> x + y)
                .ifPresent(System.out::println);
        System.out.println("------------------------");

        System.out.println(integers.stream().reduce(2, Integer::sum));

        System.out.println("------------------------");

        integers.stream()
                .reduce((x,y) -> x*y)
                .ifPresent(System.out::println);

        System.out.println("------------------------");

        integers.stream()
                .reduce((x,y) -> x > y ? x : y)
                .ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(Integer::max).get());
    }
}
