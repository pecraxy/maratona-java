package academy.devdojo.maratonajava.javacore.ZZDOptional.test;

import academy.devdojo.maratonajava.javacore.ZZDOptional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.ZZDOptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Dragon Ball Z");
        mangaByTitle.ifPresent(manga -> manga.setTitle("Dragon Ball Z Kai"));
        System.out.println(mangaByTitle);
        Manga manga = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);

        Manga mangaOrElse = MangaRepository.findByTitle("Drifters").orElseGet(() -> new Manga(3, "Drifters", 20));
        System.out.println(mangaOrElse);

    }
}
