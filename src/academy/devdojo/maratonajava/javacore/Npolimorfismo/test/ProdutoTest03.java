package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Acer", 3500);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2023");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------");
        CalculadoraImposto.calcularImposto(produto);

    }
}
