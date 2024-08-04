package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListJavaFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
/*      MINHA RESOLUÇÃO (DESNECESSARIAMENTE COMPLEXA)
        String nomeArquivo = file.getFileName().toString();
        String extensaoArquivo = nomeArquivo.substring(nomeArquivo.lastIndexOf(".") + 1);
        if (extensaoArquivo.equals("java")){
            System.out.println("Nome arquivo: " + file.getFileName());
            return FileVisitResult.CONTINUE;
        }
        return FileVisitResult.SKIP_SUBTREE;
*/
        if(file.getFileName().toString().endsWith(".java")){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest01 {
    public static void main(String[] args) {
        Path root = Paths.get(".");
        try {
            Files.walkFileTree(root, new ListJavaFiles());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



