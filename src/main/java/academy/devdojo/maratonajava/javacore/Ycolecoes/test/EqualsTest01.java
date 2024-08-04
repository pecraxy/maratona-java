package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
/*        String nome = "William Suane o mais Humilde";
        String nome2 = /*new String() - está no heap e não no pool de strings, retorna falso / "William Suane o mais Humilde";
//        System.out.println(nome == nome2); //retorna true se não for new String
        System.out.println(nome.equals(nome2));*/
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC1", "iPhone");
        System.out.println(s1.equals(s2));
    }
}
