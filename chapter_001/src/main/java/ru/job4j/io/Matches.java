package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру \"11\"");
        int total = 11;

        while (true) {
            System.out.println("Игрок №1 выбирает число от 1 до 3!" + System.lineSeparator() + "Ваш выбор:");
            int select = Integer.parseInt(sc.nextLine());
            while (select == 0 || select >= 4 || select > total) {
                System.out.println("Нельзя выбрать это число!" + System.lineSeparator() + "Ваш выбор:");
                select = Integer.parseInt(sc.nextLine());
            }
            System.out.println("На столе осталось " + (total -= select) + " спичек.");
            if (total <= 0) {
                System.out.println("Игрок №1 выиграл!");
                break;
            }
            System.out.println("Игрок №2 выбирает число от 1 до 3!" + System.lineSeparator() + "Ваш выбор:");
            int select2 = Integer.parseInt(sc.nextLine());
            while (select2 == 0 || select2 >= 4 || select2 > total) {
                System.out.println("Нельзя выбрать это число!" + System.lineSeparator() + "Ваш выбор:");
                select2 = Integer.parseInt(sc.nextLine());
            }
            System.out.println("На столе осталось " + (total -= select2) + " спичек.");
            if (total <= 0) {
                System.out.println("Игрок №2 выиграл!");
                break;
            }
        }
    }
}
