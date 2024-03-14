package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("pasta");
        boolean isDirectoryCreated = fileDirectory.mkdir();
        System.out.println("Diretório Criado? " + isDirectoryCreated);
        File fileArquivoDirectory = new File(fileDirectory, "arquivo.txt");
        boolean isFileCreated = fileArquivoDirectory.createNewFile();
        System.out.println("Arquivo criado? " + isFileCreated);
        File fileRenamed = new File(fileDirectory, "arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDirectory.renameTo(fileRenamed);
        System.out.println("Foi renomeado? " + isRenamed);

        File renamedDirectory = new File("pasta2");
        boolean isDirectoryRenamed = fileDirectory.renameTo(renamedDirectory);
        System.out.println("O diretório foi renomeado? " + isDirectoryRenamed);
    }
}
