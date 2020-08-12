package ru.job4j.tracker;

import java.util.Comparator;

/**
 * 1. Создайте для модели данных ru.job4j.tracker.Item компаратор, который сортирует данные по возрастанию.
 * 2. Напишите тесты с демонстрацией сортировки по возрастанию и убыванию.
 * 3. Залейте код в репозиторий, переведите на ответственного.
 */

public class ItemSortAscendingByName implements Comparator<Item> {

    /**
     * Переопределение метода compare интерфейса java.util.Comparator
     * Метод сортирует по возрастанию элементы типа Item.
     * @param first первый входящий аргумент метода
     * @param second второй входящий аргумент метода
     * @return возвращает результат сравнения первого с вторым методами.
     */

    @Override
    public int compare(Item first, Item second) {
        return first.getName().compareTo(second.getName());
    }
}
