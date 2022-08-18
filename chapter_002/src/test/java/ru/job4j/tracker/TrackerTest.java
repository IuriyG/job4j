package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TrackerTest {
    /**
     * Тест для метода add.
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test1"));
        Item result = tracker.findById(item.getId());
        assertEquals(result.getName(), item.getName());
    }

    /**
     * Тест для метода findAll. Метод возвращает копию коллекции без null элементов.
     */
    @Test
    public void whenFindAllReturnCopyArrayWithoutNull() {
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Item three = tracker.add(new Item("test2"));
        Item four = tracker.add(new Item("test3"));
        List<Item> expected = new ArrayList<>();
        expected.add(one);
        expected.add(three);
        expected.add(four);
        Assert.assertEquals(tracker.findAll(), (expected));
    }

    /**
     * Тест для метода findByName. Метод возвращает найденный в коллекции элемент по входящему аргументу.
     */
    @Test
    public void whenFindByNameReturnCopyArray() {
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Item three = tracker.add(new Item("test1"));
        List<Item> expected = new ArrayList<>();
        expected.add(one);
        expected.add(three);
        Assert.assertEquals(tracker.findByName("test1"), expected);
    }

    /**
     * Тест для метода findById, при котором находится входной аргумент в коллекции, метод возвращает найденный элемент.
     */
    @Test
    public void whenFindByIdIsTrue() {
        Tracker tracker = new Tracker();
        Item item3 = tracker.add(new Item("test2"));
        assertEquals(tracker.findById(item3.getId()), item3);
    }

    /**
     * Тест для метода findById, при котором отсутствует входной аргумент в коллекции и метод возвращает null.
     */
    @Test
    public void whenFindByIdIsFalse() {
        Tracker tracker = new Tracker();
        Item item3 = new Item("test2");
        assertNull(tracker.findById(item3.getId()));
    }
}