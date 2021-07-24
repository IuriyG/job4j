package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    String nl = System.lineSeparator();


    @Test
    public void whenExit() {
        StubInput input = new StubInput(new String[]{"0"});
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), Arrays.asList(new UserAction[]{action}));
        assertThat(action.isCall(), is(true));
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
        assertThat(out.toString(), is(expect));
        System.setOut(def);
    }

    @Test
    public void whenInvalidExit() {
        StubAction out = new StubAction();
        Input in = new StubInput(
                new String[]{"0", "5"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ExitProgramAction());
//        UserAction[] actions = new UserAction[]{
//                new ExitProgramAction()
//        };
        new StartUI().init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Exit" + ln
                        + "Wrong input, you can select: 0 .. 0" + ln
                        + "Menu." + ln
                        + "0. Exit" + ln
                )
        );
    }
}
