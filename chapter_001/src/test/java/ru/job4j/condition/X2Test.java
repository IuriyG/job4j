package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Iuriy Gaydarzhi.
 * @since 01.06.2021
 */
public class X2Test {

    @Test
    public void whenA10B0C0X2Then40() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 40;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C1X1Then3() {
        int a = 1, b = 1, c = 1, x = 1;
        int expected = 3;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA0B1C1X1Then2() {
        int a = 0, b = 1, c = 1, x = 1;
        int expected = 2;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C0X1Then2() {
        int a = 1, b = 1, c = 0, x = 1;
        int expected = 2;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C1X0Then1() {
        int a = 1, b = 1, c = 1, x = 0;
        int expected = 1;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
}
