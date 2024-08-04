package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Everson Willian Bacceli"; //String constant pool, piscina constante de String
        String nome2 = "Everson Willian Bacceli";
        System.out.println(nome == nome2);
        //System.out.println(nome == nome2); return true, busca a mesma referência em memória
        //como a String é imútavel, não é possível alterar esse valor

        //Troca a referência
        nome.concat(" Suane");
        System.out.println(nome == nome2);
        //System.out.println(nome == nome2); retorna true, mesmo concatenando com Suane
        System.out.println(nome); //Retorna apenas o nome original, sem o "Suane"
        // Devido à imutábilidade das String, enquanto não faça uma nova associação, não pode trocar o valor que existe.

        //Troca a referência em memória
        //Como a String é imutável, apenas trocando a referência que muda
        nome = nome.concat(" Suane"); // como se fosse nome+= " Suane";
        System.out.println(nome);
        System.out.println(nome == nome2); //Retorna false

        //nunca iremos ver algo assim
        String nome3 = new String("Everson Willian Bacceli"); //Cria o "nome em outro lugar"
        //1 variável de referência, 2 objeto do tipo String, 3 uma string no pool de String

        //Ou seja, cria um objeto do tipo String na "heap"
        System.out.println(nome2 == nome3); //retorna false

        System.out.println(nome2 == nome3.intern()); //retorna true, o nome2 é comparado no 'pool' de 'strings' e não heap para 'pool de string '

        //Tirar para carreira profissional, é que Strings são imutáveis e precisa sempre tomar cuidado associando um novo valor a var. ref.
        //Ou não vai conseguir utilizar esse valor novo

    }
}
