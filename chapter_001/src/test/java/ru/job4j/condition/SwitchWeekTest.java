package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.job4j.condition.SwitchWeek.nameOfDay;

/**
 * @author Iuriy Gaydarzhi.
 * @since 11.06.2021
 */
public class SwitchWeekTest {

    @Test
    public void when1ThenMonday() {
        String expected = "Понедельник";
        assertThat(expected).isEqualTo(nameOfDay(1));
    }

    @Test
    public void when2ThenTuesday() {
        String expected = "Вторник";
        assertThat(expected).isEqualTo(nameOfDay(2));
    }

    @Test
    public void when3ThenWednesday() {
        String expected = "Среда";
        assertThat(expected).isEqualTo(nameOfDay(3));
    }

    @Test
    public void when4ThenThursday() {
        String expected = "Четверг";
        assertThat(expected).isEqualTo(nameOfDay(4));
    }

    @Test
    public void when5ThenFriday() {
        String expected = "Пятница";
        assertThat(expected).isEqualTo(nameOfDay(5));
    }

    @Test
    public void when6ThenSaturday() {
        String expected = "Суббота";
        assertThat(expected).isEqualTo(nameOfDay(6));
    }

    @Test
    public void when7ThenSunday() {
        String expected = "Воскресенье";
        assertThat(expected).isEqualTo(nameOfDay(7));
    }

    @Test
    public void when9ThenMistake() {
        String expected = "Ошибка";
        assertThat(expected).isEqualTo(nameOfDay(9));
    }
}
