package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Marcelo");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");
        Manga manga1 = new Manga(5L, "Attack On Titan", 15.87);
        Manga manga2 = new Manga(1L, "Bersek", 18.99);
        Manga manga3 = new Manga(4L, "Jujutsu Kaisen", 24.13);
        Manga manga4 = new Manga(3L, "Pokemon", 12.99);
        Manga manga5 = new Manga(2L, "Naruto", 2.99);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga3);
        consumidorManga.put(consumidor2, manga5);
        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome() + " comprou " + entry.getValue().getNome());
        }

    }
}
