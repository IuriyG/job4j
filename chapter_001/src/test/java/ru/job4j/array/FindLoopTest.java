package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result).isEqualTo(expect);
    }

    @Test
    public void whenArrayHas10Then1() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 10;
        int result = find.indexOf(input, value);
        int expect = 1;
        assertThat(result).isEqualTo(expect);
    }

    @Test
    public void whenArrayHasNotElement() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 9;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result).isEqualTo(expect);
    }

    @Test
    public void whenFind3() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result).isEqualTo(expect);
    }

    @Test
    public void whenDoNoFind6() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 6;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result).isEqualTo(expect);
    }
}
