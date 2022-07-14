package ru.job4j.ex;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 16.07.2021
 */
public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void ifNLessThen0TheIAE() {
        Fact fact = new Fact();
        int rsl = fact.calc(-3);
        assertEquals(rsl, 6);
    }
}
