package academy.devdojo.maratonajava.javacore.ZZKjunit.service;

import academy.devdojo.maratonajava.javacore.ZZKjunit.domain.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {
    private Person adult;
    private Person notAdult;
    private Person nullPerson;
    private PersonService personService;
    @BeforeEach
    public void setUp(){
        adult = new Person(18);
        notAdult = new Person(13);
        personService = new PersonService();
    }

    @Test
    @DisplayName("A person should be not adult (false) when age is lower than 18.")
    void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        Assertions.assertFalse(personService.isAdult(notAdult));
    }

    @Test
    @DisplayName("A person should be adult (true) when age is greater or equal than 18.")
    void isAdult_ReturnTrue_WhenAgeIsGreaterOrEqualThan18() {
        Assertions.assertTrue(personService.isAdult(adult));
    }

    @Test
    @DisplayName("Should throw NullPointerException with message when person is null")
    void isAdult_ReturnNullPointerException_WhenPersonIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> personService.isAdult(null), "Should return NullPointerException.");
    }

    @Test
    @DisplayName("Should return list with only adults")
    void filterRemovingNotAdult_ReturnListWithAdultOnly_WhenListOfPersonWithAdultIsPassed(){
        List<Person> personlist = List.of(new Person(17), new Person(18), new Person(21));
        Assertions.assertEquals(2, personService.filterRemovingNotAdult(personlist).size());
    }
}