package ru.job4j.stragery;

import org.junit.jupiter.api.Test;

import java.util.StringJoiner;

import static org.assertj.core.api.Assertions.assertThat;


public class TriangleTest {
    @Test
    public void whenDrawTriangle() {
        assertThat(new Triangle().draw()).isEqualTo(new StringJoiner(System.lineSeparator())
                .add("   +")
                .add("  +++")
                .add(" +++++")
                .add("+++++++")
                .toString()
        );
    }

    @Test
    public void whenDrawTriangleFalse() {
        String sj = new StringJoiner(System.lineSeparator())
                .add("   +")
                .add("  +++")
                .add(" +++++")
                .add("+++ +++")
                .toString();
        assertThat(sj).isNotEqualTo(new Triangle().draw());
    }

}