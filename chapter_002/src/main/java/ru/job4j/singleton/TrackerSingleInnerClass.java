package ru.job4j.singleton;

import ru.job4j.tracker.Item;

/**
 * 4. private static final class. Lazy loading.
 * Ленивая загрузка происходит, когда мы явно обращаемся к объекту. Происходит его загрузка.
 * Последний вариант объект класса находиться в поле внутреннего класса.
 */

public class TrackerSingleInnerClass {
    private TrackerSingleInnerClass() {
    }

    public static TrackerSingleInnerClass getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final TrackerSingleInnerClass INSTANCE = new TrackerSingleInnerClass();
    }

    public static void main(String[] args) {
        TrackerSingleInnerClass tracker = TrackerSingleInnerClass.getInstance();
    }
}
