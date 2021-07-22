package ru.job4j.ex;

/**
 * @author Iuriy Gaydarzhi.
 * @since 21.07.2021
 *
 * 1. Запустите код вычисления факториала через рекурсию.
 */
public class FactRec {
    /**
     * Метод вычисляет факториала через рекурсию.
     *
     * @param n Входящее число.
     * @return Результат.
     */
    public static int calc(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return calc(n - 1) * n;
    }

    /**
     * Main.
     *
     * @param args Входящие аргументы.
     */
    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}
