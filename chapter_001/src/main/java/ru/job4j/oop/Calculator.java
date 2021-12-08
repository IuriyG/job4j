package ru.job4j.oop;

/**
 * Демонстрация отличия между статическими и не статическими методами.
 *
 * @author Iuriy Gaydarzhi.
 * @since 08.12.2021
 */
public class Calculator {
    /**
     * Пле класса.
     */
    private static final int X = 5;

    /**
     * Метод суммирует аргументы.
     *
     * @param y Входящий аргумент.
     * @return Результат сложения.
     */
    public static int sum(int y) {
        return X + y;
    }

    /**
     * Метод находит разницу между входящим аргументом и полем Х.
     *
     * @param a Входящий аргумент.
     * @return Результат вычитания.
     */
    public static int minus(int a) {
        return a - X;
    }

    /**
     * Метод Main. Демонстрирует работы методов.
     *
     * @param args Входящие аргументы.
     */
    public static void main(String[] args) {
        Calculator cl = new Calculator();
        System.out.println("Multiply: " + cl.multiply(5));
        System.out.println("Sum: " + Calculator.sum(10));
        System.out.println("Divide: " + cl.divide(10));
        System.out.println("SumAllOperation: " + cl.sumAllOperation(10));
    }

    /**
     * Метод умножает входящий аргумент и поле Х.
     *
     * @param a Входящий аргумент.
     * @return Результат умножения.
     */
    public int multiply(int a) {
        return X * a;
    }

    /**
     * Метод делит входящий аргумент и поле Х.
     *
     * @param a Входящий аргумент.
     * @return Результат деления.
     */
    public int divide(int a) {
        return a / X;
    }

    /**
     * Метод суммирует методы: sum(), multiply(), minus(), divide().
     *
     * @param a Входящий аргумент.
     * @return Результат суммирования.
     */
    public int sumAllOperation(int a) {
        return sum(a) + minus(a) + multiply(a) + divide(a);
    }
}
