package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left;
        return result > right ? left : right;
        // return left > right ? left : right; Или одной строкой.
    }
}
