package ru.job4j.ex;

/**
 * @author Iuriy Gaydarzhi.
 * @since 15.07.2021
 *
 * 1. Посмотрите на класс вычисления факториала.
 */
public class Fact {

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The variable 'n' must be greater than 0");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
