package ru.job4j.tracker;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.StringJoiner;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class StartUITest {
    String nl = System.lineSeparator();


    @Test
    public void whenExit() {
        StubInput input = new StubInput(new String[]{"0"});
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), Arrays.asList(new UserAction[]{action}));
        assertThat(action.isCall()).isTrue();
    }

    @Test
    public void whenPrtMenu() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(new String[]{"0"});
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), Arrays.asList(new UserAction[]{action}));
        String expect = new StringJoiner(nl, "", nl)
                .add("Menu." + nl)
                .add("0. Stub action")
                .toString();
        assertThat(out.toString()).isEqualTo(expect);
        System.setOut(def);
    }
}
