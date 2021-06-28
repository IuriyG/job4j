package ru.job4j.sort;

import java.util.Arrays;

/**
 * @author Iuriy Gaydarzhi.
 * @since 24.06.2021
 */
public class Machine {
    /**
     * Метод реализовывает механизм сдачи монет в вендинговых аппаратах.
     *
     * @param money Входящая сумма.
     * @param price Цена покупки.
     * @return Массив сдачи в виде монет разного номинала.
     */
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int sum = money - price;
        for (int coin : coins) {
            while (sum >= coin) {
                sum -= coin;
                rsl[size++] = coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
