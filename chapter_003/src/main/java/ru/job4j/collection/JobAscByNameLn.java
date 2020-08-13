package ru.job4j.collection;

import java.util.Comparator;

/**
 *  * Компаратор по возрастанию: сравнивает количество символов в имени.
 */

public class JobAscByNameLn implements Comparator<Job> {

    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o1.getName().length(), o2.getName().length());
    }
}