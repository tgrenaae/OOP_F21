package session1Tommy.Excercises.Excercise1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {


    @Test
    void getNameTest() {
        Person person = new Person("Anna", 168, 67);
        assertEquals("Anna", person.getName());
    }

    @Test
    void getHeight() {
        Person person = new Person("Anna", 168, 67);
        assertEquals(168, person.getHeight());
    }

    @Test
    void setHeight() {
        Person person = new Person("Anna", 168, 67);
        person.setHeight(170);
        assertEquals(170, person.height);
    }

    @Test
    void getWeight() {
        Person person = new Person("Anna", 168, 67);
        assertEquals(67, person.getWeight());
    }

    @Test
    void setWeight() {
        Person person = new Person("Anna", 168, 67);
        person.setWeight(70);
        assertEquals(70, person.weight);
    }
}
