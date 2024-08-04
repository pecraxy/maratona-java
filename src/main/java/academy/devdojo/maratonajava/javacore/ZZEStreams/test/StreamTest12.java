package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import academy.devdojo.maratonajava.javacore.ZZEStreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEStreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightNovel> lightNovels = new ArrayList<>(
            List.of(
                    new LightNovel("Legendary Mechanic", 8.99, Category.FANTASY),
                    new LightNovel("Beginning After The End", 4, Category.FANTASY),
                    new LightNovel("Shadow Slave", 3.75, Category.DRAMA),
                    new LightNovel("Trash's Count of the Family", 9.55, Category.DRAMA),
                    new LightNovel("Solo Leveling", 2.55, Category.ROMANCE)
            )
    );
    public static void main(String[] args) {
        Map<Category, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
