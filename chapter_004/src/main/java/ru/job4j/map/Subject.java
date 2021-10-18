package ru.job4j.map;

import java.util.Objects;

/**
 * Модель данных ПРЕДМЕТ.
 *
 * @author Iuriy Gaydarzhi.
 * @since 16.10.2021
 */
public class Subject {

    /**
     * Название предмета.
     */
    private final String name;

    /**
     * Оценки.
     */
    private final int score;

    /**
     * Конструктор.
     *
     * @param name  Название предмета.
     * @param score Оценки.
     */
    public Subject(String name, int score) {
        this.name = name;
        this.score = score;
    }

    /**
     * Геттер для имени.
     *
     * @return Имя.
     */
    public String getName() {
        return name;
    }

    /**
     * Геттер для оценок
     *
     * @return Оценки.
     */
    public int getScore() {
        return score;
    }

    /**
     * Перегруженный метод сравнения.
     *
     * @param o Объект.
     * @return Объект сравнения.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Subject subject = (Subject) o;
        return Objects.equals(name, subject.name);
    }

    /**
     * Перегруженный метод Хеш-код.
     *
     * @return Хэш имени.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
