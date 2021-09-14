package ru.job4j.collection;

import java.util.Comparator;

/**
 * @author Iuriy Gaydarzhi.
 * @since 02.09.2021
 */
public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
