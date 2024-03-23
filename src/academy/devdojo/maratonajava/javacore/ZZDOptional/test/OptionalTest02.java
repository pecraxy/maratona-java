package academy.devdojo.maratonajava.javacore.ZZDOptional.test;

import academy.devdojo.maratonajava.javacore.ZZDOptional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.ZZDOptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Dragon Ball Z");
        mangaByTitle.ifPresent(manga -> manga.setTitle("Dragon Ball Z Kai"));
        System.out.println(mangaByTitle);
        //
        //MangaRepository.findById(3).ifPresentOrElse();
    }
}
