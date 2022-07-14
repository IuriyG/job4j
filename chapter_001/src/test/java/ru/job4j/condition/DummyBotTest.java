package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class DummyBotTest {
    @Test
    public void whenGreetBot() {
        assertThat(
                DummyBot.answer("Привет, Бот."))
                .isEqualTo("Привет, умник."
                );
    }

    @Test
    public void whenByeBot() {
        assertThat(
                DummyBot.answer("Пока."))
                .isEqualTo("До скорой встречи.");
    }

    @Test
    public void whenUnknownBot() {
        assertThat(
                DummyBot.answer("Сколько будет 2 + 2?"))
                .isEqualTo("Это ставит меня в тупик. Задайте другой вопрос.");
    }
}
