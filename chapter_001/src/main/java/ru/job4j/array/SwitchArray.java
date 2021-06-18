package ru.job4j.array;

/**
 * @author Iuriy Gaydarzhi.
 * @since 18.06.2021
 */
public class SwitchArray {
    /**
     * Метод меняет местами нулевой элемент и последний элемент в массиве.
     *
     * @param array Входящий массив.
     * @return Измененный массив.
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    /**
     * Main.
     *
     * @param args Входящий аргумент.
     */
    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(num);
        for (int i : rsl) {
            System.out.println(i);
        }
    }
}
