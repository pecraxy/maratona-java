package academy.devdojo.maratonajava.javacore.ZZKjunit.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {
    @Test
    void instanceOf_ExecutesChildClassMethod_WhenObjectIsOfChildType(){
        Employee employeeDeveloper = new Developer("1", "Java");
        if (employeeDeveloper instanceof Developer developer){
            Assertions.assertEquals("Java", developer.getMainLanguage());
        }
    }
}