package ru.job4j.tracker;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class ItemTest {

    /**
     * Тест использует переопределенный компаратор ItemDescendingSortByName.
     * Метод демонстрирует сортировку по возрастанию.
     */
   @Test
    public void itemSortAscending() {

        Tracker tracker = new Tracker();
        Item four = tracker.add(new Item("test4"));
        Item one = tracker.add(new Item("test1"));
        Item three = tracker.add(new Item("test3"));

        List<Item> list = new ArrayList<>();
        list.add(three);
        list.add(one);
        list.add(four);

        list.sort(new ItemSortAscendingByName());
        assertThat(list, is(Arrays.asList(one, three, four)));
    }

    /**
     * Тест использует переопределенный компаратор ItemDescendingSortByName.
     * Метод демонстрирует сортировку по убыванию.
     */
    @Test
    public void itemSortDescending() {

        Tracker tracker = new Tracker();
        Item four = tracker.add(new Item("test4"));
        Item one = tracker.add(new Item("test1"));
        Item three = tracker.add(new Item("test3"));

        List<Item> list = new ArrayList<>();
        list.add(three);
        list.add(one);
        list.add(four);

        list.sort(new ItemDescendingSortByName());
        assertThat(list, is(Arrays.asList(four, three, one)));
    }
}
