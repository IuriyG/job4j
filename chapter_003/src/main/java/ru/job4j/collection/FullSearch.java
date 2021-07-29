package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * @author Iuriy Gaydarzhi.
 * @since 28.07.2021
 * <p>
 * 1. Уникальные задачи.
 */
public class FullSearch {
    /**
     * Метод игнорирует дубликаты.
     *
     * @param list Лист задач.
     * @return Множество без дубликатов.
     */
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task task : list) {
            task.getNumber().equals(task);
            numbers.add(task.getNumber());
        }
        return numbers;
    }
}
