package ru.job4j.stragery;

import org.junit.Assert;
import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenDrawTriangle() {
        assertThat(new Triangle().draw(),
                is(new StringJoiner(System.lineSeparator())
                        .add("   +")
                        .add("  +++")
                        .add(" +++++")
                        .add("+++++++")
                        .toString()
                )
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
        Assert.assertNotEquals(sj, new Triangle().draw());
    }

}