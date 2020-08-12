package ru.job4j.collection;

import java.util.Comparator;

/**
 *  Теперь давайте создадим класс ru.job4j.collection.SortByNameJob,
 *  который будет реализовывать интерфейс java.util.Comparator.
 */

public class SortByNameJob implements Comparator<Job> {

    @Override
    public int compare(Job first, Job second) {
        return first.getName().compareTo(second.getName());
    }
}
