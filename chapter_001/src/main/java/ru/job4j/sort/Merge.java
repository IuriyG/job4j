package ru.job4j.sort;

import java.util.Arrays;
import static java.lang.System.arraycopy;

public class Merge {

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4});
        System.out.println(Arrays.toString(rsl));
    }

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            rsl[k++] = left[i] < right[j] ? left[i++] : right[j++];
        }
        if (i < left.length) {
            arraycopy(left, i, rsl, k, left.length - i);
        } else if (j < right.length) {
            arraycopy(right, j, rsl, k, right.length - j);
        }
        return rsl;
    }
}
