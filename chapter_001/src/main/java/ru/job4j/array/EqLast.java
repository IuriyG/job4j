package ru.job4j.array;

/**
 * @author Iuriy Gaydarzhi.
 * @since 20.06.2021
 */
public class EqLast {
    /**
     * Метод сравнивает последние элементы массивов.
     *
     * @param left  Первый входящий массив.
     * @param right Второй входящий массив.
     * @return Результат сравнения.
     */
    public static boolean check(int[] left, int[] right) {

        return (left[left.length - 1] == right[right.length - 1]);
    }
}

