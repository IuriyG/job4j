package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.job4j.condition.MultipleSwitchWeek.numberOfDay;

/**
 * @author Iuriy Gaydarzhi.
 * @since 12.06.2021
 */
public class MultipleSwitchWeekTest {

    @Test
    public void when1ThenMondayRus() {
        assertThat(1).isEqualTo(numberOfDay("Понедельник"));
    }

    @Test
    public void when1ThenMonday() {
        assertThat(1).isEqualTo(numberOfDay("Monday"));
    }

    @Test
    public void when2ThenTuesdayRus() {
        assertThat(2).isEqualTo(numberOfDay("Вторник"));
    }

    @Test
    public void when2ThenTuesday() {
        assertThat(2).isEqualTo(numberOfDay("Tuesday"));
    }

    @Test
    public void when3ThenWednesdayRus() {
        assertThat(3).isEqualTo(numberOfDay("Среда"));
    }

    @Test
    public void when3ThenWednesday() {
        assertThat(3).isEqualTo(numberOfDay("Wednesday"));
    }

    @Test
    public void when4ThenThursdayRus() {
        assertThat(4).isEqualTo(numberOfDay("Четверг"));
    }

    @Test
    public void when4ThenThursday() {
        assertThat(4).isEqualTo(numberOfDay("Thursday"));
    }

    @Test
    public void when5ThenFridayRus() {
        assertThat(5).isEqualTo(numberOfDay("Пятница"));
    }

    @Test
    public void when5ThenFriday() {
        assertThat(5).isEqualTo(numberOfDay("Friday"));
    }

    @Test
    public void when6ThenSaturdayRus() {
        assertThat(6).isEqualTo(numberOfDay("Суббота"));
    }

    @Test
    public void when6ThenSaturday() {
        assertThat(6).isEqualTo(numberOfDay("Saturday"));
    }

    @Test
    public void when7ThenSundayRus() {
        assertThat(7).isEqualTo(numberOfDay("Воскресенье"));
    }

    @Test
    public void when7ThenSunday() {
        assertThat(7).isEqualTo(numberOfDay("Sunday"));
    }
}