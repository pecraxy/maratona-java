package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> names = List.of("Marcelo", "Enfia o Pastelão", "Zaza");
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        forEach(names, (String s) -> System.out.print(s + " "));
        System.out.println();
        forEach(nums, i -> System.out.print(i + " "));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
