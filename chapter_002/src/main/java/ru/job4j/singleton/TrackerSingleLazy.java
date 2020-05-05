package ru.job4j.singleton;

import ru.job4j.tracker.Item;

/**
 * 2. static field. Lazy loading.
 * Ленивая загрузка происходит, когда мы явно обращаемся к объекту. Происходит его загрузка.
 * Для того, чтобы закрыть возможность создавать экземпляр класса,
 * нам нужно явно создать конструктор по умолчанию и присвоить ему модификатор private.
 */

public class TrackerSingleLazy {
    private static TrackerSingleLazy instance;

    private TrackerSingleLazy() {
    }

    public static TrackerSingleLazy getInstance() {
        if (instance == null) {
            instance = new TrackerSingleLazy();
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingleLazy tss = TrackerSingleLazy.getInstance();
    }
}
