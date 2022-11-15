package ru.job4j.inheritance;

/**
 * Класс Animal.
 *
 * @author Iuriy Gaydarzhi.
 * @since 15.11.2022
 */
public class Animal {

    public void instanceInvoke() {
        System.out.println("Вызов метода экземпляра Animal");
    }

    public static void staticInvoke() {
        System.out.println("Вызов статического метода Animal");
    }
}
