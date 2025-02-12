package academy.devdojo.maratonajava.javacore.ZZKjunit.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MangaTest {
    private Manga manga1;
    private Manga manga2;
    @BeforeEach
    public void setup(){
        manga1 = new Manga("Berserk", 68);
        manga2 = new Manga("Berserk", 68);
    }

    @Test
    public void accessors_ReturnData_WhenInitialized(){
        Assertions.assertEquals("Berserk", manga1.name());
        Assertions.assertEquals(68, manga1.volumes());
    }

    @Test
    public void hashcode_ReturnTrue_WhenObjectsAreTheSame(){
        Assertions.assertEquals(manga1.hashCode(), manga2.hashCode());
    }

    @Test
    @DisplayName("Should throw NullPointerException When Name is Null")
    void constructor_ThrowNullPointerException_WhenNameIsNull(){
        Assertions.assertThrows(NullPointerException.class, () -> new Manga(null, 20));
    }

    @Test
    @DisplayName("Should return True if is Record")
    void isRecord_ReturnTrue_WhenCalledFromManga(){
        Assertions.assertTrue(Manga.class.isRecord());
    }

}