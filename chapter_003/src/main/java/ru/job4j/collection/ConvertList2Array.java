package ru.job4j.collection;

import java.util.List;

/**
 * В этом задании нужно будет реализовать метод,
 * который преобразует одномерный список в двухмерный массив.
 * Нужно правильно через оператор if увеличивать или обнулять указатели.
 * Реализуйте метод конвертации списка чисел в двухмерный массив чисел.
 */

public class ConvertList2Array {
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            if (cell < cells) {
                array[row][cell] = num;
                cell++;
                if (cell == cells) {
                    row++;
                    cell = 0;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int[][] rsl = toArray(list, 3);
        for (int[] row : rsl) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
