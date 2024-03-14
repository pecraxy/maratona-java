package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carros;

public class CarrosTest01 {
    public static void main(String[] args) {
        Carros carro01 = new Carros();
        Carros carro02 = new Carros();

        carro01.nome = "Fusca";
        carro01.marca = "Wolskagen";
        carro01.ano = 1980;

        carro02.nome = "Ka";
        carro02.marca = "Ford";
        carro02.ano = 2020;

        //Demonstração de "passagem de dados" de uma varíavel de referência (a um objeto) a outra variável
        //carro01 = carro02;

        System.out.println("Nome do carro 01: " + carro01.nome + "\nMarca do carro 01: " + carro01.marca + "\nAno do carro 01: " + carro01.ano);
        System.out.println("\nNome do carro 02: " + carro02.nome + "\nMarca do carro 02: " + carro02.marca + "\nAno do carro 02: " + carro02.ano);

    }
}
