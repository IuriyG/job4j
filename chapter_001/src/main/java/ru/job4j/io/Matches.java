package ru.job4j.io;

import java.util.Scanner;

/**
 * 1. Создайте класс Matches с методом main.
 * 2. В методе main добавьте цикл. Игра заканчивается, когда игрок забрал последние спички. В цикле нужно проверять количество спичек.
 * 3. Сделайте ввод данных от пользователя. По порядку. Сначала первый игрок вводит число от 1 до 3, потом второй и так далее.
 * Когда игрок ввел цифру, нужно показать сколько спичек осталось на столе.
 * 4. Залейте код в репозиторий.
 */
public class Matches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру \"11\"!");
        int total = 11;
        int gamer = 1;
        while (true) {
            System.out.println("Игрок №" + gamer + " выбирает число от 1 до 3." + System.lineSeparator() + "Ваш выбор:");
            int select = Integer.parseInt(sc.nextLine());
            while (select == 0 || select >= 4 || select > total) {
                System.out.println("Нельзя выбрать это число!" + System.lineSeparator() + "Ваш выбор:");
                select = Integer.parseInt(sc.nextLine());
            }
            total = total - select;
            System.out.println("На столе осталось " + total + " спичек.");
            if (total <= 0) {
                System.out.println("Победил игрок №" + gamer + "!");
                break;
            }

            if (gamer % 2 == 0) {
                gamer = 0;
            }
            gamer++;
        }
    }
}
