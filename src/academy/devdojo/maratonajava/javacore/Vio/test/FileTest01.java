package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.TimeZone;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try{
            boolean isCreated = file.createNewFile();
            System.out.println("O arquivo foi criado? " + isCreated);
            System.out.println("Path: " + file.getPath());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("É diretório? " + file.isDirectory());
            System.out.println("É um arquivo? " + file.isFile());
            System.out.println("Está oculto? " + file.isHidden());
            System.out.println("Última modificação: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean exists = file.exists();
            if(exists){
                System.out.println("O arquivo foi deletado? " + file.delete());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
