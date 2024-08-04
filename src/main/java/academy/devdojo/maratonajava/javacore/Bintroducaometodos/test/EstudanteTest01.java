package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.name = "Omatokita";
        estudante01.age = 22;
        estudante01.sex = 'M';

        estudante02.name = "Sakura";
        estudante02.age = 16;
        estudante02.sex = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
        System.out.println("\n");
        /*É perigoso a passada de parâmetros via referência, porque quando usamos tipos primitivos usamos uma cópia,
        * portanto não importa o que fazemos, já que a variável original não vai se alterar, mas quando usamos uma
        * variável de referência, o valor se altera, porque pegamos a referência da variável, ou seja, o espaço em
        * memória utilizada e não uma cópia dos valores do objeto*/

        /*<strong>Boas práticas</strong> da programação: ao invés de se alterar os dados que você está passando a um objeto, você precisar
         fazer algum tipo de alteração, você deve retornar um novo objeto, ou seja, se precisar fazer qualquer alteração,
         deve se criar um novo objeto manualmente e retornar a outro*/
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
