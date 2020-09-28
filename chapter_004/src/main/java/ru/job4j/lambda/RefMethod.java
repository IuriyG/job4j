package ru.job4j.lambda;

import java.util.*;
import java.util.function.Consumer;

/**
 * 1. Ниже приведен код. Класс выводит на консоль список имен.
 * Если имя больше 10 символов, то вывод обрезается.
 */
public class RefMethod {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Ivan",
                "Petr Arsentev"
        );
        Consumer<String> out = RefMethod::cutOut;
        names.forEach(out);
    }

    public static void cutOut(String value) {
        if (value.length() > 10) {
            System.out.println(value.substring(0, 10) + "..");
        } else {
            System.out.println(value);
        }
    }
}
