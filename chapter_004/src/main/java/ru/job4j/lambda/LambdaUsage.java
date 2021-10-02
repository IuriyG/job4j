package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * В классе приводится пример использования лямбды с выводом отладочной инфы на консоль.
 *
 * @author Iuriy Gaydarzhi.
 * @since 02.10.2021
 */
public class LambdaUsage {

    /**
     * Метод сравнивает длину строк.
     *
     * @param args Входящий аргумент.
     */
    public static void main(String[] args) {
        Comparator<String> comparator = (left, right) -> {
            System.out.println("compare - " + right + " : " + left);
            return Integer.compare(right.length(), left.length());
        };
        String[] str = new String[]{
                "A",
                "Polo",
                "Backs",
                "Bo",
                "Benji"
        };
        Arrays.sort(str, comparator);
    }
}
