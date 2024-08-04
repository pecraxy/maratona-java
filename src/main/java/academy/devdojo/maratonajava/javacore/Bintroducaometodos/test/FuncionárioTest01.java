package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionárioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.setNome("Marcelo");
        funcionario01.setIdade(22);
        funcionario01.setSalarios(new double[]{1000, 2000, 3000, 4000});//
        funcionario01.imprimeDados();
        System.out.println("Média: "+ funcionario01.getMedia());
    }
}
