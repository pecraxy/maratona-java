package academy.devdojo.maratonajava.javacore.Oexceptions.exceptions.test;

import academy.devdojo.maratonajava.javacore.Oexceptions.exceptions.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexceptions.exceptions.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexceptions.exceptions.dominio.Pessoa;
import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
