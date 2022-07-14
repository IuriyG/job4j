package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinTest {
    @Test
    public void whenFirstMin() {
        assertThat(Min.findMin(new int[]{0, 5, 10})).isEqualTo(0);
    }

    @Test
    public void whenLastMin() {
        assertThat(Min.findMin(new int[]{10, 5, 3})).isEqualTo(3);
    }

    @Test
    public void whenMiddleMin() {
        assertThat(Min.findMin(new int[]{10, 2, 5})).isEqualTo(2);
    }
}
