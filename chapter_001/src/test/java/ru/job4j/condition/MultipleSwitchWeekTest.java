package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.condition.MultipleSwitchWeek.numberOfDay;

/**
 * @author Iuriy Gaydarzhi.
 * @since 12.06.2021
 */
public class MultipleSwitchWeekTest {

    @Test
    public void when1ThenMondayRus() {
        assertThat(1, is(numberOfDay("Понедельник")));
    }

    @Test
    public void when1ThenMonday() {
        assertThat(1, is(numberOfDay("Monday")));
    }

    @Test
    public void when2ThenTuesdayRus() {
        assertThat(2, is(numberOfDay("Вторник")));
    }

    @Test
    public void when2ThenTuesday() {
        assertThat(2, is(numberOfDay("Tuesday")));
    }

    @Test
    public void when3ThenWednesdayRus() {
        assertThat(3, is(numberOfDay("Среда")));
    }

    @Test
    public void when3ThenWednesday() {
        assertThat(3, is(numberOfDay("Wednesday")));
    }

    @Test
    public void when4ThenThursdayRus() {
        assertThat(4, is(numberOfDay("Четверг")));
    }

    @Test
    public void when4ThenThursday() {
        assertThat(4, is(numberOfDay("Thursday")));
    }

    @Test
    public void when5ThenFridayRus() {
        assertThat(5, is(numberOfDay("Пятница")));
    }

    @Test
    public void when5ThenFriday() {
        assertThat(5, is(numberOfDay("Friday")));
    }

    @Test
    public void when6ThenSaturdayRus() {
        assertThat(6, is(numberOfDay("Суббота")));
    }

    @Test
    public void when6ThenSaturday() {
        assertThat(6, is(numberOfDay("Saturday")));
    }

    @Test
    public void when7ThenSundayRus() {
        assertThat(7, is(numberOfDay("Воскресенье")));
    }

    @Test
    public void when7ThenSunday() {
        assertThat(7, is(numberOfDay("Sunday")));
    }

    @Test
    public void when9ThenMinus1() {
        assertThat(-1, is(numberOfDay(String.valueOf(9))));
    }
}