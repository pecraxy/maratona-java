package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import academy.devdojo.maratonajava.javacore.ZZEStreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEStreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEStreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static final List<LightNovel> lightNovels = new ArrayList<>(
            List.of(
                    new LightNovel("Legendary Mechanic", 8.99, Category.FANTASY),
                    new LightNovel("Beginning After The End", 4, Category.FANTASY),
                    new LightNovel("Shadow Slave", 3.75, Category.DRAMA),
                    new LightNovel("Trash's Count of the Family", 9.55, Category.DRAMA),
                    new LightNovel("Solo Leveling", 2.55, Category.ROMANCE)
            )
    );
    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.counting()));
        System.out.println(collect);
        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));

        Map<Category, LightNovel> collect2 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect2);

        Map<Category, LightNovel> collect3 = lightNovels.stream()
                .collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect3);
    }
}
