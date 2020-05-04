package ru.job4j.singleton;

import ru.job4j.tracker.Item;

/**
 * 3. static final field. Eager loading.
 * Энергичная загрузка - загружает объект сразу после старта виртуальной машины.
 * Этот вариант вариант похож на предыдущей. Основное отличие,
 * мы сразу создаем и инициализируем объект.
 * Это самый простой способ создания одноэлементного класса.
 */

public class TrackerSingleThird {
    private static final TrackerSingleThird INSTANCE = new TrackerSingleThird();

    private TrackerSingleThird() {
    }

    public static TrackerSingleThird getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingleThird tst = TrackerSingleThird.getInstance();
    }
}
