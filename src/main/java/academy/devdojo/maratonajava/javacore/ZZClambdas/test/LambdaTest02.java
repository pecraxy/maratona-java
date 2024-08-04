package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Cale Henituse", "Sylvia");
        List<Integer> lengthOfStrings = map(strings, String::length);
        List<String> upperCaseStrings = map(strings, String::toUpperCase);
        System.out.println(lengthOfStrings);
        System.out.println(upperCaseStrings);

    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for (T e: list){
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }

}
