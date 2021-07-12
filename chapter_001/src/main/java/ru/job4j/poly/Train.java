package ru.job4j.poly;

/**
 * @author Iuriy Gaydarzhi.
 * @since 12.07.2021
 */
public class Train implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " - сформированный и сцепленный состав или поезд, передвигается по рельсам.");
    }
}
