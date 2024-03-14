package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(List.of("Han Xiao", "Cale Henituse", "Black Star"));
        nameList.sort(String::compareTo);
        System.out.println(nameList);

        Function<String, Integer> numStringToInteger = Integer::parseInt;
        Integer apply = numStringToInteger.apply("10");
        System.out.println(apply + "\n");

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(nameList, "Han Xiao"));
    }
}
