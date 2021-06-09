package ru.job4j.condition;

/**
 * @author Iuriy Gaydarzhi.
 * @since 09.06.2021
 */
public class LogicNot {

    /**
     * Метод проверяет, что число четное.
     *
     * @param num число.
     * @return результат выражения.
     */
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    /**
     * Метод проверяет, что число положительное.
     *
     * @param num число.
     * @return результат выражения.
     */
    public static boolean isPositive(int num) {
        return num > 0;
    }

    /**
     * Метод проверяет, что число не четное.
     *
     * @param num число.
     * @return результат выражения.
     */
    public static boolean notEven(int num) {
        return !isEven(num);
    }

    /**
     * Метод проверяет, что число не положительное.
     *
     * @param num число.
     * @return результат выражения.
     */
    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    /**
     * Метод проверяет, что число не четное и положительное.
     *
     * @param num число.
     * @return результат выражения.
     */
    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    /**
     * Метод проверяет, что число четное или не положительное.
     *
     * @param num число.
     * @return результат выражения.
     */
    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }
}
