package ru.job4j.array;

/**
 * @author Iuriy Gaydarzhi.
 * @since 21.06.2021
 */
public class PrintEvenElements {

    /**
     * Метод обходит массив начиная с последнего элемента и выводит в консоль только элементы с четными индексами.
     *
     * @param args Входящий аргумент.
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers.length - 1 - i) % 2 == 0) {
                System.out.println(
                        "Текущий элемент массива начиная с последнего: "
                                + numbers[numbers.length - 1 - i]
                );
            }
        }
    }
}
