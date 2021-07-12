package ru.job4j.poly;

/**
 * @author Iuriy Gaydarzhi.
 * @since 12.07.2021
 */
public class Hovercraft implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " - судно на воздушной подушке - передвигается по воде.");
    }
}
