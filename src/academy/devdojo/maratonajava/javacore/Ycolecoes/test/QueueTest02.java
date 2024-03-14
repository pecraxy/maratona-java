package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
class ConsumidorComparator implements Comparator<Consumidor> {
    @Override
    public int compare(Consumidor o1, Consumidor o2) {
        return 0;
    }
}
public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5L,"Attack On Titan", 15.87, 0));
        mangas.add(new Manga(1L, "Bersek", 18.99, 5));
        mangas.add(new Manga(4L,"Jujutsu Kaisen", 24.13, 0));
        mangas.add(new Manga(3L, "Pokemon", 3.2, 2));
        mangas.add(new Manga(2L, "Naruto", 2.99, 0));

        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }

    }
}
