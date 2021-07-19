package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.format.DateTimeFormatter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ShowAllItemActionTest {

    @Test
    public void whenCheckOutput() {
        Tracker tracker = new Tracker();
        Item item = new Item("fix bug");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = item.getCreated().format(formatter);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        tracker.add(item);
        ShowAllItemAction act = new ShowAllItemAction();
        act.execute(new StubInput(new String[]{}), tracker);
        String expected = "№1 Item: " + "Item{Created: "
                + currentDateTimeFormat + ", Id: "
                + item.getId() + ", Name: "
                + item.getName() + "}" + System.lineSeparator();
        assertThat(out.toString(), is(expected));
        System.setOut(def);
    }
}
