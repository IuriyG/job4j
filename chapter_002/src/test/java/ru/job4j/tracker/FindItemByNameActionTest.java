package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindItemByNameActionTest {

    @Test
    public void whenCheckOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Item item = new Item("item");
        tracker.add(item);
        FindItemByNameAction findItem = new FindItemByNameAction();
        findItem.execute(new StubInput(new String[]{"item"}), tracker);
        String expect = new StringJoiner(System.lineSeparator())
                .add(System.lineSeparator() + "Find matches: ")
                .add("№1 Item: Id: " + item.getId() + ", Name: " + item.getName() + System.lineSeparator())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
}
