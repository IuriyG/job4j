package ru.job4j.array;

/**
 * @author Iuriy Gaydarzhi.
 * @since 17.06.2021
 */
public class ArrayLoop {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
