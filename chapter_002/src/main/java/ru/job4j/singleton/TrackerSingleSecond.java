package ru.job4j.singleton;

import ru.job4j.tracker.Item;

/**
 * 2. static field. Lazy loading.
 * Ленивая загрузка происходит, когда мы явно обращаемся к объекту. Происходит его загрузка.
 * Для того, чтобы закрыть возможность создавать экземпляр класса,
 * нам нужно явно создать конструктор по умолчанию и присвоить ему модификатор private.
 */

public class TrackerSingleSecond {
    private static TrackerSingleSecond instance;

    private TrackerSingleSecond() {
    }

    public static TrackerSingleSecond getInstance() {
        if (instance == null) {
            instance = new TrackerSingleSecond();
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingleSecond tss = TrackerSingleSecond.getInstance();
    }
}
