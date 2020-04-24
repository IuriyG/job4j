package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ShowAllItemActionTest {

    @Test
    public void whenCheckOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Item item = new Item("fix bug");
        tracker.add(item);
        ShowAllItemAction act = new ShowAllItemAction();
        act.execute(new StubInput(new String[]{}), tracker);
        String expected = "№1 Item: Id: " + item.getId() + "," + " Name: " + item.getName() + System.lineSeparator();
        assertThat(new String(out.toByteArray()), is(expected));
        System.setOut(def);
    }
}
