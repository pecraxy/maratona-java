package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String name;
    private static int[] episodes;     //{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}

    //0- Bloco de inicialização estático é executado quando a JVM carregar a classe
    //1- Alocado espaço em memória pro objeto;
    //2- Cada atributo de classe é criado e inicializado com valores default ou o que for passado;
    //3- Bloco de inicialização é executado;
    //4- Construtor é executado.
    //(Vai mudar um pouquinho quando entrar em herança e blocos estáticos)

    static {
        //Bloco de inicialização, pode ser colocado em qualquer lugar do código, mas vai executar sempre depois dos atributos
        //E sempre é executado quando é criado uma instância de um objeto
        //Atributos, Inicialização, construtores
        System.out.println("Dentro do bloco de inicialização 1");
        episodes = new int[100];
        for (int i = 0; i < Anime.episodes.length; i++) {
            Anime.episodes[i] = i+1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }

    //Inicialização dos objetos/atributos, acontece antes do construtor
    //for (int episode: this.episodes) {
    //            System.out.println("Episódio:" + episode);
    //        }
    public Anime() {
        for (int episode: Anime.episodes) {
            System.out.print(episode + " ");
        }
        System.out.println("");
    }

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }

}
