package ru.job4j.stragery;

import org.junit.jupiter.api.Test;

import java.util.StringJoiner;

import static org.assertj.core.api.Assertions.assertThat;


public class SquareTest {
    @Test
    public void whenDrawSquare() {
        assertThat(new Square().draw()).isEqualTo(new StringJoiner(System.lineSeparator())
                .add("+ + + +")
                .add("+ + + +")
                .add("+ + + +")
                .add("+ + + +")
                .toString()

        );
    }

    @Test
    public void whenDrawSquareFalse() {
        String sj = new StringJoiner(System.lineSeparator())
                .add("+ + + +")
                .add("+ + + +")
                .add("+ +   +")
                .add("+ + + +")
                .toString();
        assertThat(sj).isNotEqualTo(new Square().draw());
    }
}
