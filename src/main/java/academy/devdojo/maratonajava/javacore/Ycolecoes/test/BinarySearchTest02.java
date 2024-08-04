package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Attack On Titan", 15.87));
        mangas.add(new Manga(1L, "Bersek", 18.99));
        mangas.add(new Manga(4L,"Jujutsu Kaisen", 24.13));
        mangas.add(new Manga(3L, "Pokemon", 12.99));
        mangas.add(new Manga(2L, "Naruto", 2.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

//        Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(2L, "Naruto", 2.99);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));


    }
}
