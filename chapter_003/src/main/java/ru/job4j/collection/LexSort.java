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
        String s = left.replaceAll("\\D", "");
        String s2 = right.replaceAll("\\D", "");
        return Integer.parseInt(s) - Integer.parseInt(s2);
    }
}
