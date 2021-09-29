package ru.job4j.array;

/*
 * Проверить, что эталон больше, чем элемент в массиве, записать в эталон элемент массива.
 */
public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (min >= array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}
