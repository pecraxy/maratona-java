package academy.devdojo.maratonajava.javacore.ZZKjunit.domain;

import java.util.Objects;

public record Manga(String name, int volumes) {
    public Manga {
        Objects.requireNonNull(name);
    }
}
