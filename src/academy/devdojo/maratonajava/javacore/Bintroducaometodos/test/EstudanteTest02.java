package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.name = "Omatokita";
        estudante01.age = 22;
        estudante01.sex = 'M';

        estudante02.name = "Sakura";
        estudante02.age = 16;
        estudante02.sex = 'F';

        estudante01.imprime();
        estudante02.imprime();

    }
}
