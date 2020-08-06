package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * В этом задании Вам нужно будет преобразовать список с массивом чисел в список чисел
 * 1. Реализуйте класс ConvertList.
 * 2. Залейте код в репозиторий.
 * 3. Оставьте ссылку на коммит и переведите на ответственного.
 */
public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] ints : list) {
            for (int anInt : ints) {
                rsl.add(anInt);
            }
        }
        return rsl;
    }
}
