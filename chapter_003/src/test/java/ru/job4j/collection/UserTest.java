package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.assertj.core.api.Assertions.assertThat;


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
        assertThat(it.next()).isEqualByComparingTo(new User("Ivan", 31));
        assertThat(it.next()).isEqualByComparingTo(new User("Petr", 32));
    }

    /**
     * Метод демонстрирует сортировку имён по возрастанию.
     */
    @Test
    public void whenComparePertVSIvan() {
        int rsl = new User("Petr", 32).compareTo(new User("Ivan", 31));
        assertThat(rsl).isGreaterThan(0);
    }
}
