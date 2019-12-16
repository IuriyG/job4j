package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (min >= array[index])    // проверить, что эталон больше, чем элемент. записать в эталон элемент массива.
                min = array[index];
        }
        return min;
    }
}
