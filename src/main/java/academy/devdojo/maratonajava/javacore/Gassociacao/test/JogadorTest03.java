package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Cafu");
        Jogador jogador02 = new Jogador("Pelé");
        Jogador jogador03 = new Jogador("Ronaldo Fenômeno");
        Jogador goleiro01 = new Jogador("Cássio");
        Jogador[] jogadores = {jogador01, jogador02, jogador03};
        Jogador[] goleiros = {goleiro01};
        Time time = new Time("Seleção Brasileira");
        Time time2 = new Time("Corinthians");

        goleiro01.setTime(time2);
        jogador01.setTime(time);
        jogador02.setTime(time);
        jogador03.setTime(time);
        time.setJogadores(jogadores);
        time2.setJogadores(goleiros);

        System.out.println("--- Jogador1---");
        jogador01.print();
        System.out.println("--- Jogador2---");
        jogador02.print();
        System.out.println("--- Jogador3---");
        jogador03.print();
        System.out.println("--- Goleiro1---");
        goleiro01.print();

        System.out.println("--- Time ---");
        time.print();

        System.out.println("--- Time2 ---");
        time2.print();

    }
}
