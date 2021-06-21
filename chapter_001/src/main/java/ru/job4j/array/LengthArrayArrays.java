package ru.job4j.array;

/**
 * @author Iuriy Gaydarzhi.
 * @since 21.06.2021
 */
public class LengthArrayArrays {
    /**
     * Метод выводит в консоль размерность двухмерного массива.
     *
     * @param args Входящий аргумент.
     */
    public static void main(String[] args) {
        int[][] numbers = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        for (int[] number : numbers) {
            System.out.println(
                    "Размер вложенного массива равен: " + number.length
            );
        }
    }
}
