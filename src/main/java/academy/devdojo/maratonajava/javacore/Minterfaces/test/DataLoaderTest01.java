package academy.devdojo.maratonajava.javacore.Minterfaces.test;


import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();
        fileLoader.checkPermission();
        databaseLoader.checkPermission();

        DatabaseLoader.retrieveMaxDataSize();
        DataLoader.retrieveMaxDataSize();
        System.out.println(DataLoader.MAX_DATA_SIZE);

    }
}
