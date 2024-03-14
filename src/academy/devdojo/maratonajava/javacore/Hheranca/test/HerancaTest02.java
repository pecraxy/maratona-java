package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {

    //0- Bloco de inicialização estático da {@code Super Classe} é executado quando a JVM carregar a classe pai
    //1- Bloco de inicialização estático da Sub Classe é executado quando a JVM carregar a classe filha
    //2- Alocado espaço em memória pro objeto da classe pai;
    //3- Cada um dos atributos de SUPER CLASSE é criado e inicializado com valores default ou o que for passado DA CLASSE PAI
    //4- Bloco de inicialização da SUPER CLASSE é executado na ordem em que aparece;
    //5- Construtor da SUPER CLASSE é executado.

    //  --- Repete o processo pra classe filha: ---


    //6- Alocado espaço em memória pro objeto da subclasse;
    //7- Cada um dos atributos de SubClasse é criado e inicializado com valores default ou o que for passado
    //8- Bloco de inicialização da SubClasse é executado na ordem em que aparece;
    //9- Construtor da SubClasse é executado.

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Marcelo");

        /*
        * Quando se tem herança, a {@code Super Classe} da herança (classe pai de uma herança), sempre precisa ser
        *Inicializada primeiro e depois a classe filha
        * ----------------------------------------------------
        * 1.1- Dentro do bloco de inicialização estátitico de Pessoa
        * 2.1- Dentro do bloco de inicialização estátitico de Funcionário
        * 1.2- Dentro do bloco de inicialização não estático de Pessoa 1
        * 1.3- Dentro do bloco de inicialização não estático de Pessoa 2
        * 1.4- Dentro do construtor de pessoa
        * 2.2- Dentro do bloco de inicialização não estático de Funcionário 1
        * 2.3- Dentro do bloco de inicialização não estático de Funcionário 2
        * 2.4- Dentro do construtor de funcionário
        *  */



    }
}
