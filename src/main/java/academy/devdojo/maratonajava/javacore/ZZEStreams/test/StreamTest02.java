package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import academy.devdojo.maratonajava.javacore.ZZEStreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {
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

        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());
        System.out.println(titles);
    }
}
