package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L,"Attack On Titan", 15.87, 0));
        mangas.add(new Manga(1L, "Bersek", 18.99, 5));
        mangas.add(new Manga(4L,"Jujutsu Kaisen", 24.13, 0));
        mangas.add(new Manga(3L, "Pokemon", 12.99, 2));
        mangas.add(new Manga(2L, "Naruto", 2.99, 0));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
