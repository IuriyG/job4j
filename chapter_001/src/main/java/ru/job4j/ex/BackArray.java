package ru.job4j.ex;

import java.util.Arrays;

/**
 * 1. Исправьте проблему в программе. Залейте код в репозиторий и оставьте ссылку на коммит.
 */

public class BackArray {
    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        int middle = names.length / 2;
        for (int index = 1; index < middle; index++) {
            String temp = names[index];
            names[index] = names[names.length - index - 1];
            names[names.length - index - 1] = temp;
        }
        System.out.println(Arrays.toString(names));
    }
}
