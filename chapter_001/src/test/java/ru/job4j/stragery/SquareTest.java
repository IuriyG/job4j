package ru.job4j.stragery;

import org.junit.Assert;
import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenDrawSquare() {
        assertThat(new Square().draw(),
                is(new StringJoiner(System.lineSeparator())
                        .add("+ + + +")
                        .add("+ + + +")
                        .add("+ + + +")
                        .add("+ + + +")
                        .toString()
                )
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
        Assert.assertNotEquals(sj, new Square().draw());
    }
}
