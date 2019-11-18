package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        int in = 6;
        int in2 = 2;
        int expected = 2;
        double out = SqArea.square(in, in2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
