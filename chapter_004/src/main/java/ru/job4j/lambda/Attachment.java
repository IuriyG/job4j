package ru.job4j.lambda;

/**
 * Модель данных для класса AttachmentSort.
 *
 * @author Iuriy Gaydarzhi.
 * @since 24.09.2021
 */
public class Attachment {
    private final String name;
    private final int size;

    /**
     * Конструктор.
     *
     * @param name Входящий аргумент Имя.
     * @param size Входящий аргумент Размер.
     */
    public Attachment(String name, int size) {
        this.name = name;
        this.size = size;
    }

    /**
     * Геттеры для поля Имя.
     *
     * @return Имя.
     */
    public String getName() {
        return name;
    }

    /**
     * Геттеры для поля Размер.
     *
     * @return Размер
     */
    public int getSize() {
        return size;
    }

    /**
     * Переопределенный метод, возвращающий строку.
     *
     * @return Имя и Размер объекта.
     */
    @Override
    public String toString() {
        return "{"
                + "name='"
                + name
                + '\''
                + ", size="
                + size
                + '}';
    }
}
