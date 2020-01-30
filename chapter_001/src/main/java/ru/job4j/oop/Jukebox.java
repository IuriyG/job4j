package ru.job4j.oop;

import java.util.Scanner;

/**
 * Класс проигрыватель-автомат, при вводе номера композиции, проигрывает иелодию, существует только 2 мелодии)
 * @author IuriyG
 */
public class Jukebox {

    /**
     * Основной метод.
     * @param args первый аргумент.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        Jukebox song = new Jukebox();
        song.music(number);
    }

    /**
     * Метод "проигрывает" мелодию в зависимости от выбранного значения, есть только мелодия №1 и мелодия №2, свыше №2 песен нет.
     * @param position первый аргумент.
     */
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else System.out.println("Песня не найдена");
    }
}
