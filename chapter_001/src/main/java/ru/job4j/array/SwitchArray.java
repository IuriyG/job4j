package ru.job4j.array;

/**
 * @author Iuriy Gaydarzhi.
 * @since 18.06.2021
 */
public class SwitchArray {
    /**
     * Метод реализует обратную сортировку массива.
     *
     * @param array  Входящий массив.
     * @param source Указывает на индекс элемента, который будет записан в ячейку с индексом dest.
     * @param dest   Указывает на индекс элемента, который будет записан в ячейку с индексом source.
     * @return Отсортированный массив.
     */
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;

        return array;
    }

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
