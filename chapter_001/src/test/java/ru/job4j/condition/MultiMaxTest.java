package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 2, 4);
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(4, 2, 1);
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void whenTheSame() {
        MultiMax check = new MultiMax();
        int result = check.max(4, 4, 4);
        assertThat(result).isEqualTo(4);
    }
}
