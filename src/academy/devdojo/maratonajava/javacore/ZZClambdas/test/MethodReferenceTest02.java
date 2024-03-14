package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bersek", 43), new Anime("Shangri La frontiers", 15), new Anime("Naruto SHippuden", 578)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
//        animeList.sort((a1, a2) -> animeComparators.compareByEpisodesNonStatic(a1, a2));
        System.out.println(animeList);
    }
}
