package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Iuriy Gaydarzhi.
 * @since 02.10.2021
 */
public class LambdaUsage {

    public static void main(String[] args) {
        Comparator<String> comparator = (left, right) -> {
            System.out.println("compare - " + right.length() + " : " + left.length());
            return right.length() - left.length();
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
