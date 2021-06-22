package ru.job4j.array;

/**
 * @author Iuriy Gaydarzhi.
 * @since 22.06.2021
 */
public class SkipNegative {
    /**
     * Метод должен заменяет отрицательные значения в массиве на ноль.
     *
     * @param array Входящий массив.
     * @return Измененный массив.
     */
    public static int[][] skip(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }
}
