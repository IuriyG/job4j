package ru.job4j.ex;

import java.util.Arrays;

/**
 * 1. Исправьте проблему в программе. Залейте код в репозиторий и оставьте ссылку на коммит.
 */

public class BackArray {
    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        int middle = names.length / 2;
        for (int index = 0; index < middle; index++) {
            String temp = names[index];
            names[index] = names[names.length - 1];       //names[index] = names[names.length - index]; исправлено
            names[names.length - 1] = temp;               //names[names.length - index] = temp;         исправлено
        }

        System.out.println(Arrays.toString(names));
    }
}
