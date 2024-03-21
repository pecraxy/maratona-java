package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparator = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparator.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("Shangri La frontiers", 15), new Anime("Naruto SHippuden", 578)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        System.out.println(animeBiFunction.apply("O Menino e a Garça", 1));
    }
}
