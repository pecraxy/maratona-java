package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllTestJavaOrClass extends SimpleFileVisitor<Path> {
    /*Correção:*/
//   private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("**/*{Test*}.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        /*Correção:*/
        //if (matcher.matches(file) sout(file.getName();
        if(matches(file, "glob:**/*{Test*}.{java,class}")) System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    public static boolean matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        return matcher.matches(path);
    }
}
public class PathMatcherTest03 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        Files.walkFileTree(root, new ListAllTestJavaOrClass());
    }

}
