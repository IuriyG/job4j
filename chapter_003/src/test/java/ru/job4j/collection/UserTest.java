package ru.job4j.collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.*;

public class UserTest {

    /**
     * Метод демонстрирует сортировку по возрасту, если имена идентичны.
     */
    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32));
        users.add(new User("Ivan", 31));
        Iterator<User> it = users.iterator();
        assertEquals(it.next(), (new User("Ivan", 31)));
        assertEquals(it.next(), (new User("Petr", 32)));
    }

    /**
     * Метод демонстрирует сортировку имён по возрастанию.
     */
    @Test
    public void whenComparePertVSIvan() {
        int rsl = new User("Petr", 32).compareTo(new User("Ivan", 31));
        assertThat(rsl, greaterThan(0));
    }
}
