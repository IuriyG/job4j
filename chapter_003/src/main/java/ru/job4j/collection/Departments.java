package ru.job4j.collection;

import java.util.*;

/**
 * Класс отсортировывает и добавляет пропущенные подразделения.
 *
 * @author Iuriy Gaydarzhi.
 * @since 02.09.2021
 */
public class Departments {
    /**
     * Метод сортирует их начиная с главного подразделения и заканчивая дочерними.
     *
     * @param dep Список строк.
     * @return Результат сортировки.
     */
    public static List<String> fillGaps(List<String> dep) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : dep) {
            String start = "";
            for (String el : value.split("/")) {
                tmp.add(start + el);
                start = start + el + "/";
            }
        }
        return new ArrayList<>(tmp);
    }

    /**
     * Метод сортирует отделы в порядке возрастания.
     *
     * @param org Список строк.
     */
    public static void sortAsc(List<String> org) {
        Collections.sort(org);
    }

    /**
     * Метод сортирует отделы в порядке Убывания.
     *
     * @param org Список строк.
     */
    public static void sortDesc(List<String> org) {
        fillGaps(org);
        org.sort(new DepDescComp());
    }
}
