package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        //                      Construtor, sempre inicializado primeiro que os métodos
        //Sobrecarga de construtores também são possíveis
        Anime anime = new Anime("Cowboy Bebop", "TV", 24, "Action", "Blue Bird");
        //Sobrecarga de métodos, ter métodos com mesmo nome, mas parâmetros ou tipos de parâmetros diferentes
        anime.print();

    }
}
