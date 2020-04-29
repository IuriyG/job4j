package ru.job4j.ex;

import java.util.Arrays;

/**
 * 1. Исправьте проблему в программе. Залейте код в репозиторий и оставьте ссылку на коммит.
 */

public class BackArray {
    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        int middle = names.length / 2;
        for (int index = 1; index < middle; index++) {          //index <= middle исправлено
            String temp = names[index];
            names[index] = names[names.length - index - 1];     //names.length - index
            names[names.length - index - 1] = temp;             //names.length - index
        }
        System.out.println(Arrays.toString(names));
    }
}
