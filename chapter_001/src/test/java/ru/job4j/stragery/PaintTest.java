package ru.job4j.stragery;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.assertj.core.api.Assertions.assertThat;

public class PaintTest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @BeforeEach
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @AfterEach
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square());
        assertThat(this.out.toString()).contains(new StringJoiner(System.lineSeparator())
                .add("+ + + +")
                .add("+ + + +")
                .add("+ + + +")
                .add("+ + + +")
                .toString()

        );
    }

    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        assertThat(this.out.toString()).isEqualTo(new StringJoiner(System.lineSeparator())
                .add("   +")
                .add("  +++")
                .add(" +++++")
                .add("+++++++")
                .toString()

        );
    }
}
