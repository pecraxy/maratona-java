package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa("Toyota");

        pessoa.setCpf("123.456.789-01");

        endereco.setRua("Rua Goku");
        endereco.setCep("08546-156");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("---------------");
        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("12345678910");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000.65);
        funcionario.imprime();
    }
}
