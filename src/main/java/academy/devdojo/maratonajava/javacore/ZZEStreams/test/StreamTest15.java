package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import academy.devdojo.maratonajava.javacore.ZZEStreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEStreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEStreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest15 {
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
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        Map<Category, Set<Promotion>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion,
                        Collectors.toSet())));
        System.out.println(collect1);

        Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion,
                        Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect1);

    }
    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
