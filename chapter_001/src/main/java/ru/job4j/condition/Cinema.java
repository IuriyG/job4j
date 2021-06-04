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
     * Метод Main.
     *
     * @param args Входящий аргумент.
     */
    public static void main(String[] args) {
        Cinema.access(21);
        Cinema.access(16);
    }
}
