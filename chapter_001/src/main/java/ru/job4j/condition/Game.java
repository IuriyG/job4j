package ru.job4j.condition;

/**
 * @author Iuriy Gaydarzhi.
 * @since 05.06.2021
 */
public class Game {
    /**
     * Метод выводит на консоль название игры, которое совпадает с вводящей переменной.
     *
     * @param name входящая переменная.
     */
    public static void menu(String name) {
        if (name.equals("super mario")) { /* сравниваем переменную name с "super mario" */
            System.out.println("Start - super mario");
        }
        if (name.equals("tanks")) { /* Сравнить переменную name с "tanks" */
            System.out.println("Start - tanks");
        }
        if (name.equals("tetris")) { /* Сравнить переменную name с "tetris" */
            System.out.println("Start - tetris");
        }
    }

    /**
     * Метод Main.
     *
     * @param args Входящие аргумент.
     */
    public static void main(String[] args) {
        Game.menu("tanks");
    }
}
