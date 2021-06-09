package ru.job4j.condition;

/**
 * @author Iuriy Gaydarzhi.
 * @since 09.06.2021
 */
public class Club {
    /**
     * Метод выводит на консоль, сможем мв пройти или нет.
     * @param hasMoney Входящий аргумент.
     * @param beFriend Входящий аргумент.
     */
    public static void permission(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't.");
        }
    }

    /**
     * Main.
     * @param args Входящий аргумент.
     */
    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
