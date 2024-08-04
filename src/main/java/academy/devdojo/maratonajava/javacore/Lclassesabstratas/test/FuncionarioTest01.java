package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Luffy", 500);
        Funcionario funcionario = new Gerente("o", 0);

        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Mathias", 900);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
