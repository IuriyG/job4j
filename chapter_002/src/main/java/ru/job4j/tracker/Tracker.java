package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * 1. Реализовать класс Tracker. Класс трекер - это обертка над массивом;
 * 2. В классе должно быть поле private Item[] items = new Item[100];
 * 3. Данный класс используется, как хранилище для заявок;
 * 4. В нем должны быть следующие методы:
 * добавление заявок - public Item add(Item item);
 * получение списка всех заявок - public Item[] findAll();
 * получение списка по имени - public Item[] findByName(String key);
 * получение заявки по id - public Item findById(String id);
 * 5. На все методы необходимо написать тесты.
 */

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private Item[] items = new Item[100];
    /**
     * Указатель ячейки для новой заявки.
     */
    private int size = 0;

    public int getSize() {
        return size;
    }

    /**
     * Метод добавления заявки в хранилище.
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.size++] = item;
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
     * Метод возвращает копию массива без null элементов.
     * В мыссиве не будет пустых элементов, поэтому сократили код.
     *
     * @return готовый массив.
     */
    public Item[] findAll() {
        /** Item[] outItem = new Item[this.items.length];
         int size = 0;
         for (int i = 0; i < getPosition(); i++) {
         Item a = this.items[i];
         if (a.getName() != null) {
         outItem[size] = a;
         size++;
         }
         }
         this.items = Arrays.copyOf(outItem, size);
         return this.items;
         */
        return Arrays.copyOf(items, getSize());
    }

    /**
     * Метод сравнивает в цикле все элементы массива с входящим аргументом key. Если есть совпадения копирует в результирующий массив и возвращает его.
     *
     * @param key входной аргумент.
     * @return возвращает массив.
     */
    public Item[] findByName(String key) {
        Item[] outItem = new Item[getSize()];
        int size = 0;
        for (int i = 0; i < getSize(); i++) {
            Item b = this.items[i];
            if (b.getName() != null && b.getName().equals(key)) {
                outItem[size] = b;
                size++;
            }
        }
        return Arrays.copyOf(outItem, size);
    }

    /**
     * Метод проверяет все элементы массива, сравнивая id с аргументом String id и озвращает найденный элемент.
     * Если элемент не найден - возвращает null.
     *
     * @param id входной аргумент.
     * @return возвращает найденый id.
     */
    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < getSize(); i++) {
            if (this.items[i] != null && this.items[i].getId().equals(id)) {
                result = items[i];
                break;
            }
        }
        return result;
    }

    /**
     * Метод удаляет значение в массиве соответствующее входящему аргументу и возвращает массив с null ссылкой вместо элемента.
     *
     * @param id входящий аргумент.
     * @return заканчивает цикл.
     */
    public boolean deleteItem(String id) {
        boolean result = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
                items[i] = null;
                System.arraycopy(items, i + 1, this.items, i, this.size--);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод заменяет элемент в массиве, соответствующий входящему аргументу id, на новый элемент входящего аргументв newItem.
     *
     * @param id      входящий аргумент.
     * @param newItem входящий аргумент.
     * @return оканчивает цикл.
     */
    public boolean replace(String id, Item newItem) {
        boolean result = false;
        for (int i = 0; i < getSize(); i++) {
            Item a = this.items[i];
            if (a.getId().equals(id)) {
                items[i] = newItem;
                items[i].setId(id);
                result = true;
                break;
            }
        }
        return result;
    }
}
