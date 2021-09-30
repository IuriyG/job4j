package ru.job4j.collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Интерфейс java.util.TreeSet
 * Классы этого интерфейса - это java.util.HashSet и java.util.TreeSet.
 * Эта коллекция сразу сортирует элементы.
 * TreeSet требует от входящего типа данных поддержания интерфейса java.util.Comparable.
 */

public class TreeSort {

    /**
     * Метод демонстрирует работу множества Set. Сортировка по возрастанию(по умолчанию), и по убыванию.
     *
     * @param args Входящий аргумент.
     */
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        System.out.println(numbers);

        Set<Integer> numbers2 = new TreeSet<>(Collections.reverseOrder());
        numbers2.add(5);
        numbers2.add(1);
        numbers2.add(3);
        System.out.println(numbers2);
    }
}
