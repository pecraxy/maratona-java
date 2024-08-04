package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L,"Attack On Titan", 15.87, 0));
        mangas.add(new Manga(1L, "Bersek", 18.99, 5));
        mangas.add(new Manga(4L,"Jujutsu Kaisen", 24.13, 0));
        mangas.add(new Manga(3L, "Pokemon", 3.2, 2));
        mangas.add(new Manga(2L, "Naruto", 2.99, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Manga yuyu = new Manga(1L, "Yuyu Hakusho", 3.2, 5);
//        for (Manga manga : mangas.descendingSet()) {
//            System.out.println(manga);
//        }
        System.out.println("-------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));
        System.out.println("---");
        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()); //Retorna e remove o primeiro elemento da lista
        System.out.println(mangas.pollLast()); //Retorna e remove o último elemento da lista
        System.out.println(mangas.size());
    }
}
