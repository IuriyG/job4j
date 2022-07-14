package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class SqMaxTest {

    @Test
    public void whenFirstMax() {
        int result = SqMax.max(4, 3, 2, 1);
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void whenSecondMax() {
        int result = SqMax.max(3, 4, 2, 1);
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void whenThirdMax() {
        int result = SqMax.max(2, 3, 4, 1);
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void whenForthMax() {
        int result = SqMax.max(1, 3, 2, 4);
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void whenTheSame() {
        int result = SqMax.max(4, 4, 4, 4);
        assertThat(result).isEqualTo(4);
    }
}
