package ru.job4j.inheritance;

/**
 * Класс Cat.
 *
 * @author Iuriy Gaydarzhi.
 * @since 15.11.2022
 */
public class Cat extends Animal {

    @Override
    public void instanceInvoke() {
        System.out.println("Вызов метода экземпляра Cat");
    }

    public static void staticInvoke() {
        System.out.println("Вызов статического метода Cat");
    }
}
