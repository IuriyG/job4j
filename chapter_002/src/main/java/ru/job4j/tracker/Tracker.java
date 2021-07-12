package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 1. Замените массив на коллекцию java.util.ArrayList в проекте Tracker.
 * 2. Залейте код в репозиторий и оставьте ссылку.
 * 3. Переведите на ответственного.
 */

public class Tracker {
    /**
     * Коллекция для хранения заявок.
     */
    private List<Item> items = new ArrayList<>();

    /**
     * Метод добавления заявки в хранилище.
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items.add(item);
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод сравнивает в цикле все элементы коллекции с входящим аргументом key.
     * Если есть совпадения копирует в результирующую коллекцию и возвращает её.
     *
     * @param key входной аргумент.
     * @return возвращает коллекцию.
     */
    public List<Item> findByName(String key) {
        List<Item> outItem = new ArrayList<>();
        for (Item b : items) {
            if (b.getName() != null && b.getName().equals(key)) {
                outItem.add(b);
            }
        }
        return outItem;
    }

    /**
     * Метод проверяет все элементы коллекции, сравнивая id с аргументом String id
     * и возвращает найденный элемент.
     * Если элемент не найден - возвращает null.
     *
     * @param id входной аргумент.
     * @return возвращает найденный id.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Метод удаляет значение в коллекции соответствующее входящему аргументу и
     * возвращает коллекцию с null ссылкой вместо элемента.
     *
     * @param id входящий аргумент.
     * @return заканчивает цикл.
     */
    public boolean deleteItem(String id) {
        boolean result = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                items.remove(i);
                result = true;
            }
        }
        return result;
    }

    /**
     * Метод возвращает копию коллекции без null элементов.
     *
     * @return готовый массив.
     */
    public List<Item> findAll() {
        return List.copyOf(items);
    }

    /**
     * Метод заменяет элемент в коллекции, соответствующий входящему аргументу id,
     * на новый элемент входящего аргумента newItem.
     *
     * @param id      входящий аргумент.
     * @param newItem входящий аргумент.
     * @return оканчивает цикл.
     */
    public boolean replace(String id, Item newItem) {
        boolean result = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                newItem.setId(id);
                items.set(i, newItem);
                result = true;
                break;
            }
        }
        return result;
    }
}
