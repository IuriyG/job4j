package ru.job4j.array;

/**
 * @author Iuriy Gaydarzhi.
 * @since 21.06.2021
 */
public class MatrixSum {
    /**
     * Метод вывод в консоль сумму двухмерного массива.
     *
     * @param array Входящий массив.
     * @return Сума массива.
     */
    public static int sum(int[][] array) {
        int rsl = 0;

        for (int[] ints : array) {
            for (int anInt : ints) {
                rsl += anInt;
            }
        }
        return rsl;
    }
}
