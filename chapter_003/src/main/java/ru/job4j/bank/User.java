package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс является моделью данных пользователя для банковского сервиса.
 *
 * @author Iuriy Gaydarzhi.
 * @since 29.08.2020
 */
public class User {

    /**
     * Поле номер паспорта пользователя.
     */
    private String passport;

    /**
     * Поле ФИО пользователя.
     */
    private String username;

    /**
     * Конструктор.
     *
     * @param passport Входящее поле номера паспорта пользователя.
     * @param username Входящее поле ФИО пользователя.
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Геттер для поля номер паспорта пользователя.
     *
     * @return Номер паспорта пользователя.
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Сеттер для поля номер паспорта пользователя.
     *
     * @param passport Номер паспорта пользователя.
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Геттер для поля ФИО пользователя.
     *
     * @return ФИО пользователя.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Сеттер для поля ФИО пользователя.
     *
     * @param username ФИО пользователя.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Переопределенный метод сравнения поля номер паспорта пользователя.
     *
     * @param o Входящий объект сравнения.
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
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Переопределенный метод hashcode для поля номер паспорта пользователя.
     *
     * @return Значение хеш-кода для поля номер паспорта пользователя.
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
