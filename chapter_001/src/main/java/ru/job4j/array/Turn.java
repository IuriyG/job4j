package ru.job4j.array;

public class Turn {
    /**
     * Метод переворачивает массив задом наперёд.
     *
     * @param array Входящий массив.
     * @return Перевернутый массив.
     */
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
