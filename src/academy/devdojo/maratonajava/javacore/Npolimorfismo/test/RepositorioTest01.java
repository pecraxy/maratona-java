package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();

        repositorio.salvar();

        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Luffy");
        list.add("Sasuke");
        System.out.println(list);

    }
}
