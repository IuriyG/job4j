package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Iuriy Gaydarzhi.
 * @since 21.06.2021
 */
public class Sequence {
    /**
     * Метод заполняет двухмерный массив от 1 до 9.
     *
     * @param args Входящий аргумент.
     */
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        array[0][0] = 1;
        int add = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = add;
                add++;
            }
        }

        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
