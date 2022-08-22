package ru.job4j.map;

/**
 * Запись содержит результаты: имя и баллы.
 * Этот класс используется как для учеников, так и для предметов.
 *
 * @author Iuriy Gaydarzhi.
 * @since 21.07.2022
 */
public record Label(String name, double score) implements Comparable<Label> {
    @Override
    public int compareTo(Label o) {
        return Double.compare(o.score, this.score);
    }
}
