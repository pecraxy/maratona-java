package academy.devdojo.maratonajava.javacore.Vio.test;
//File - arquivo em si
//FileWriter - bem lowlevel, escrever no arquivo
//FileReader - só pra leitura
//BufferedWriter - escrita com perfomance
//BufferedReader - leitura com perfomance


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("El Muchchaco de los ojos tristes\nHas encontrado una razon");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
