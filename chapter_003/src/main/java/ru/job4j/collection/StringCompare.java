package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int n1 = left.length();
        int n2 = right.length();
        int min = Math.min(n1, n2);
        for (int i = 0; i < min; i++) {
            char c1 = left.charAt(i);
            char c2 = right.charAt(i);
            if (c1 != c2) {
                return c1 - c2;
            }
        }
        return n1 - n2;
    }
}
