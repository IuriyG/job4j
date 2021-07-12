package ru.job4j.poly;

/**
 * @author Iuriy Gaydarzhi.
 * @since 12.07.2021
 */
public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " - воздушное судно, предназначенное для полетов в атмосфере.");
    }
}
