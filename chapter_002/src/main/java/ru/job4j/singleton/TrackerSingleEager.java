package ru.job4j.singleton;

import ru.job4j.tracker.Item;

/**
 * 3. static final field. Eager loading.
 * Энергичная загрузка - загружает объект сразу после старта виртуальной машины.
 * Этот вариант вариант похож на предыдущей. Основное отличие,
 * мы сразу создаем и инициализируем объект.
 * Это самый простой способ создания одноэлементного класса.
 */

public class TrackerSingleEager {
    private static final TrackerSingleEager INSTANCE = new TrackerSingleEager();

    private TrackerSingleEager() {
    }

    public static TrackerSingleEager getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingleEager tst = TrackerSingleEager.getInstance();
    }
}
