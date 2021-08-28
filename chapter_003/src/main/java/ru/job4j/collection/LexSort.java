package ru.job4j.collection;

import java.util.Comparator;

/**
 * @author Iuriy Gaydarzhi.
 * @since 22.08.2021
 */
public class LexSort implements Comparator<String> {
    /**
     * Метод сортирует входящие аргументы по числу.
     *
     * @param left  Первый сравниваемый аргумент.
     * @param right Второй сравниваемый аргумент.
     * @return Отсортированные данные.
     */
    @Override
    public int compare(String left, String right) {
        int s = Integer.parseInt(left.replaceAll("\\D", ""));
        int s2 = Integer.parseInt(right.replaceAll("\\D", ""));
        return Integer.compare(s, s2);
    }
}
