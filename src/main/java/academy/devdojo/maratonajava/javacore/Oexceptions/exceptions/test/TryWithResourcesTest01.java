package academy.devdojo.maratonajava.javacore.Oexceptions.exceptions.test;

import academy.devdojo.maratonajava.javacore.Oexceptions.exceptions.dominio.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexceptions.exceptions.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo(){
        //Se dá conta de fechar a conexão com a variável de referência (considerando que o método close joga uma excecção)
        // evitando de reproduzir o método abaixo (lerArquivo2),
        //mas você só pode utilizar uma variável de referência com try with resources
        //que implementem a interface closeable ou autocloseable

        //As variáveis são fechadas nas ordens inversas que foram declaradas, é util
        //Quando se trabalha com uma cadeida de banco de dados
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){

        } catch (IOException e){

        }
    }
    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
