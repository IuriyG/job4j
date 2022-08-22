package ru.job4j.map;

import java.util.List;

/**
 * Запись описывает ученика (Фамилия и {@link  Subject}).
 *
 * @author Iuriy Gaydarzhi.
 * @since 21.07.2022
 */
public record Pupil(String name, List<Subject> subjects) {
}
