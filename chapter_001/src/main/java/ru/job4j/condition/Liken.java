package ru.job4j.condition;

/**
 * @author Iuriy Gaydarzhi.
 * @since 03.06.2021
 */
public class Liken {

    public static void main(String[] args) {
        int first = 10;
        int second = 9;

        boolean result = first > second;
        System.out.println(result);

        result = first < second;
        System.out.println(result);

        result = first == second;
        System.out.println(result);
    }
}
