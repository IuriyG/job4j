package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinDiapasonTest {
    @Test
    public void whenFirstMin() {
        assertThat(MinDiapason.findMin(new int[]{-1, 0, 5, 10}, 1, 3)).isEqualTo(0);
    }

    @Test
    public void whenLastMin() {
        assertThat(MinDiapason.findMin(new int[]{10, 5, 3, 1}, 1, 3)).isEqualTo(3);
    }

    @Test
    public void whenMiddleMin() {
        assertThat(MinDiapason.findMin(new int[]{10, 2, 5, 1}, 0, 2)).isEqualTo(2);
    }
}
