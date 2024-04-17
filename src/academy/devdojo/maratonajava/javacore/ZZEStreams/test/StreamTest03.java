package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import academy.devdojo.maratonajava.javacore.ZZEStreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(
            List.of(
                    new LightNovel("Legendary Mechanic", 8.99),
                    new LightNovel("Beginning After The End", 4),
                    new LightNovel("Shadow Slave", 3.75),
                    new LightNovel("Trash's Count of the Family", 9.55),
                    new LightNovel("Solo Leveling", 2.55)
            )
    );
    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);
        long count = stream
                .distinct()
                .filter(lightNovel -> lightNovel.getPrice() <= 4)
                .count();
        System.out.println(count);
    }
}
