package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Класс демонстрирует поиск по предикату.
 *
 * @author Iuriy Gaydarzhi.
 * @since 01.10.2021
 */
public class SearchFolder {

    /**
     * Метод совершает поиск папки по предикату.
     *
     * @param list Входящий список объектов Folder.
     * @param pre  Входящий предикат.
     * @return Если найден по условиям предиката, то добавляется в список, иначе - false.
     */
    public static List<Folder> filter(List<Folder> list, Predicate<Folder> pre) {
        List<Folder> rsl = new ArrayList<>();
        for (Folder f : list) {
            if (pre.test(f)) {
                rsl.add(f);
            }
        }
        return rsl;
    }
}
