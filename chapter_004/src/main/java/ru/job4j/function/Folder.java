package ru.job4j.function;

import java.util.Objects;

/**
 * Модель данных.
 *
 * @author Iuriy Gaydarzhi.
 * @since 01.10.2021
 */
public class Folder {

    private final String name;
    private final int size;

    /**
     * Конструктор.
     *
     * @param name Входящее имя.
     * @param size Входящий размер.
     */
    public Folder(String name, int size) {
        this.name = name;
        this.size = size;
    }

    /**
     * Геттер для имени.
     *
     * @return Возвращает имя.
     */
    public String getName() {
        return name;
    }

    /**
     * Геттер для размера.
     *
     * @return Возвращает размер.
     */
    public int getSize() {
        return size;
    }

    /**
     * Переопределенное сравнение.
     *
     * @param o Входящий объект.
     * @return Результат сравнения.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Folder folder = (Folder) o;
        return size == folder.size && Objects.equals(name, folder.name);
    }

    /**
     * Переопределенный хэш-код.
     *
     * @return Хэш-код.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }

    /**
     * Переопределенный вывод строки.
     *
     * @return Строку.
     */
    @Override
    public String toString() {
        return "Folder{"
                + "name='" + name + '\''
                + ", size=" + size
                + '}';
    }
}
