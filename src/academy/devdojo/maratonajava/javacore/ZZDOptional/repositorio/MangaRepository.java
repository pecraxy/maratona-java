package academy.devdojo.maratonajava.javacore.ZZDOptional.repositorio;

import academy.devdojo.maratonajava.javacore.ZZDOptional.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "Dragon Ball Z", 326), new Manga(2, "Dragon Ball Super", 425));

    public static Optional<Manga> findById(Integer id){
        return findBy(s -> s.getId().equals(id));
    }

    public static Optional<Manga> findByTitle(String title){
        return findBy(s -> s.getTitle().equalsIgnoreCase(title));
    }

    private static Optional<Manga> findBy(Predicate<Manga> mangaPredicate){
        Manga found = null;
        for (Manga manga: mangas){
            if(mangaPredicate.test(manga)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}
