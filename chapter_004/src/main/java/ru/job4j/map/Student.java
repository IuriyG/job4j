package ru.job4j.map;

import java.util.Objects;

/**
 * Модель данных Студент.
 *
 * @author Iuriy Gaydarzhi.
 * @since 16.10.2021
 */
public class Student {

    /**
     * Имя студента.
     */
    private final String name;

    /**
     * Аккаунт студента.
     */
    private final String account;

    /**
     * Группа студента.
     */
    private final String group;

    /**
     * Конструктор.
     *
     * @param name    Имя.
     * @param account Аккаунт.
     * @param group   Группа.
     */
    public Student(String name, String account, String group) {
        this.name = name;
        this.account = account;
        this.group = group;
    }

    /**
     * Геттер для имени.
     *
     * @return Имя.
     */
    public String getName() {
        return name;
    }

    /**
     * Геттер для аккаунта.
     *
     * @return Аккаунт.
     */
    public String getAccount() {
        return account;
    }

    /**
     * Геттер для группы.
     *
     * @return Группа.
     */
    public String getGroup() {
        return group;
    }

    /**
     * Перегруженный метод сравнения.
     *
     * @param o Объект.
     * @return Объект сравнения.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(account, student.account);
    }

    /**
     * Перегруженный метод Хеш-код.
     *
     * @return Хэш аккаунта.
     */
    @Override
    public int hashCode() {
        return Objects.hash(account);
    }
}
