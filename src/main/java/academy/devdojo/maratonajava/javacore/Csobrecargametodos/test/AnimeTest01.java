package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        //Sobrecarga de métodos, ter métodos com mesmo nome, mas parâmetros ou tipos de parâmetros diferentes
        anime.init("Cowboy Bebop", "TV", 24, "Action");
        anime.print();
    }
}
