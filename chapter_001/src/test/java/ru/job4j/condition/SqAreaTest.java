package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqAreaTest {

    /* @Test                  // Тест для задания: 3.8 Площадь треугольника.[#192082]
     public void square() {
         int in = 6;
         int in2 = 2;
         int expected = 2;
         double out = SqArea.square(in, in2);
         Assert.assertEquals(expected, out, 0.01);
     }
      */
    @Test
    public void whenp4k1s1() {
        int k = 1;
        int p = 4;
        int expected = 1;
        int s = SqArea.square(p, k);
        assertThat(s, is(expected));
    }

    @Test
    public void whenp6k2s2() {
        int k = 2;
        int p = 6;
        int expected = 2;
        int s = SqArea.square(p, k);
        assertThat(s, is(expected));
    }
}
