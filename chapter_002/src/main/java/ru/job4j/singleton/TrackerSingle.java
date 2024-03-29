package ru.job4j.singleton;

import ru.job4j.tracker.Item;

/**
 * 1. enum. Eager loading.
 * Энергичная загрузка - загружает объект сразу после старта виртуальной машины.
 * В JDK 1.5 появилось новое ключевое слово enum. Оно используется для создания ограниченного количество объектов.
 */

public enum TrackerSingle {
    /**
     * Здесь мы указываем перечисления.
     */
    INSTANCE;

    public static void main(String[] args) {
        TrackerSingle tsf = TrackerSingle.INSTANCE;
    }

    /**
     * Конструкторы и методы.
     */
    public Item add(Item model) {
        return model;
    }
}
