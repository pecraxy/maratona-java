package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String name;
    private int[] episodes;     //{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}
    //1- Alocado espaço em memória pro objeto;
    //2- Cada atributo de classe é criado e inicializado com valores default ou o que for passado;
    //3- Bloco de inicialização é executado;
    //4- Construtor é executado.
    //(Vai mudar um pouquinho quando entrar em herança e blocos estáticos)

    {
        //Bloco de inicialização, pode ser colocado em qualquer lugar do código, mas vai executar sempre depois dos atributos
        //E sempre é executado quando é criado uma instância de um objeto
        //Atributos, Inicialização, construtores
        System.out.println("Dentro do bloco de inicialização");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i+1;
        }
    }

    //Inicialização dos objetos/atributos, acontece antes do construtor
    //for (int episode: this.episodes) {
    //            System.out.println("Episódio:" + episode);
    //        }
    public Anime() {
        for (int episode: this.episodes) {
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
