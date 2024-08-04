package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Attack On Titan", 15.87, 0));
        mangas.add(new Manga(1L, "Bersek", 18.99, 5));
        mangas.add(new Manga(4L,"Jujutsu Kaisen", 24.13, 0));
        mangas.add(new Manga(3L, "Pokemon", 12.99, 2));
        mangas.add(new Manga(2L, "Naruto", 2.99, 0));

        Iterator<Manga> mangaIterator = mangas.iterator();
//        while(mangaIterator.hasNext()){
//            if (mangaIterator.next().getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
