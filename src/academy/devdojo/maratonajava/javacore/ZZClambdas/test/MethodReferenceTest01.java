package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.*;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bersek", 43), new Anime("Shangri La frontiers", 15), new Anime("Naruto SHippuden", 578)));
//        Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
//        Collections.sort(animeList, AnimeComparators::compareByTitle);
        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
