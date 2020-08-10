package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    /**
     * Тест для метода add.
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test1"));
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
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
     *
     */
    @Test
    public void whenFindByNameReturnCopyArray() {
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Item two = tracker.add(new Item(null));
        Item three = tracker.add(new Item("test1"));
        Item four = tracker.add(new Item("test3"));
        Item five = tracker.add(new Item(null));
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
        Item item = tracker.add(new Item("test1"));
        Item item2 = tracker.add(new Item(null));
        Item item3 = tracker.add(new Item("test2"));
        Item item4 = tracker.add(new Item("test3"));
        Item item5 = tracker.add(new Item(null));
        assertThat(tracker.findById(item3.getId()), is(item3));
    }

    /**
     * Тест для метода findById, при котором отсутствует входной аргумент в коллекции и метод возвращает null.
     */
    @Test
    public void whenFindByIdIsFalse() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test1"));
        Item item2 = tracker.add(new Item(null));
        Item item3 = new Item("test2");
        assertThat(tracker.findById(item3.getId()), is(nullValue()));
    }
}