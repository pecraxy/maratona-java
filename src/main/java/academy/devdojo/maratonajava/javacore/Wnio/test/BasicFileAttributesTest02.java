package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        //BasicFileAttributesView, DosFileAttributesView, PosixFileAttributesView
        Path path = Paths.get("pasta2/new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();


        System.out.println("Creation Time : " + creationTime);
        System.out.println("Last Modified Time : " + lastModifiedTime);
        System.out.println("Last Acess Time : " + lastAccessTime);
        System.out.println("---------");
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newLastAcess = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime, newLastAcess ,creationTime);

        creationTime = fileAttributeView.readAttributes().creationTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();
        System.out.println("Creation Time : " + creationTime);
        System.out.println("Last Modified Time : " + lastModifiedTime);
        System.out.println("Last Acess Time : " + lastAccessTime);
    }
}
