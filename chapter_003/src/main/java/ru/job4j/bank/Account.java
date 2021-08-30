package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс является моделью данных банковского счета для банковского сервиса.
 *
 * @author Iuriy Gaydarzhi.
 * @since 29.08.2020
 */
public class Account {

    /**
     * Поле реквизитов пользователя.
     */
    private String requisite;

    /**
     * Поле Баланса пользователя.
     */
    private double balance;

    /**
     * Конструктор.
     *
     * @param requisite Входящее поле реквизитов пользователя.
     * @param balance   Входящее поле баланса пользователя.
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Геттер для поля реквизиты пользователя.
     *
     * @return Реквизиты пользователя.
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Сеттер для поля реквизиты пользователя.
     *
     * @param requisite Реквизиты пользователя.
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Геттер для поля баланса пользователя.
     *
     * @return Баланс пользователя.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Сеттер для поля баланса пользователя.
     *
     * @param balance Баланс пользователя.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Переопределенный метод сравнения поля реквизиты пользователя.
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
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Переопределенный метод hashcode для поля реквизиты пользователя.
     *
     * @return Значение хеш-кода для поля реквизиты.
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
