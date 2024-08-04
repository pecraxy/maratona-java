package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
class MangaByIdComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Attack On Titan", 15.87));
        mangas.add(new Manga(1L, "Bersek", 18.99));
        mangas.add(new Manga(4L,"Jujutsu Kaisen", 24.13));
        mangas.add(new Manga(3L, "Pokemon", 12.99));
        mangas.add(new Manga(2L, "Naruto", 2.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas); //próprio java puxa método compareTo, caso não tenha comparable, throw Exception
        System.out.println("-----");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

//        Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());

        System.out.println("-----");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        //Caso precise customizar a forma que precisa ser imprimido, fazer o exemplo acima, ou seja, utilizando o Comparator.

    }
}
