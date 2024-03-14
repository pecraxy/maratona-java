package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        //Altera todas as instâncias da CLASSE e não apenas a instância,
        //Já que o modificador é estático, ou seja, pertence a classe e não somente a instância,
        //Alterando todos as velocidades limítes de  todos os carros
        //Carro.limitSpeed = 180;

        Carro.setLimitSpeed(180);
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes-benz", 275);
        Carro c3 = new Carro("Wolksvagen", 290);

        c1.print();
        c2.print();
        c3.print();

        //Boas práticas:Criar método estático quando os métodos não acessam uma variável, atributo da instância

    }
}
