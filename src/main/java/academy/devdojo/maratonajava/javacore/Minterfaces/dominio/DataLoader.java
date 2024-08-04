package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    void load();
    int MAX_DATA_SIZE = 10;
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões.");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retireveMaxDataSize na interface.");
    }

}
