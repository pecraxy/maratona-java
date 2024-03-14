package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("William");
        nomes.add("DevDojo");
        nomes2.add("Suane");
        nomes2.add("Academy");
//        nomes.remove("William");
        nomes.addAll(nomes2);

        for(String nome: nomes){
            System.out.println(nome);
            //nomes.add("nome");
        }
        nomes.add("Suane");
        System.out.println("-------------");
        int size = nomes.size();
        for(int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
