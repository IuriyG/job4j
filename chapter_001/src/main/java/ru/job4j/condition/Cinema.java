package ru.job4j.condition;

/**
 * @author Iuriy Gaydarzhi.
 * @since 04.06.2021
 */
public class Cinema {
    /**
     * Метод выводит на консоль результат переменной age.
     * Если возраст выше 18 лет, то допущен к просмотру фильма, если нет - запрет!
     *
     * @param age Входящий аргумент.
     */
    public static void access(int age) {
        System.out.println("The age of the customer is : " + age);
        if (age > 18) {
            System.out.println("Welcome to the cinema.");
        } else {
            System.out.println("It is not for you.");
        }
    }

    /**
     * Метод выводит на консоль результат переменных.
     * Если обе переменных true, то можно идти, иначе - нет.
     *
     * @param allowByParent входящий аргумент.
     * @param hasMoney      входящий аргумент.
     */
    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("I can't.");
        }
    }

    /**
     * Метод Main.
     *
     * @param args Входящий аргумент.
     */
    public static void main(String[] args) {
        Cinema.access(21);
        Cinema.access(16);

        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
