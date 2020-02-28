package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

/**
 * 1. Создайте класс ru.job4j.io.MagicBall.
 * 2. Создайте в нем метод main. В нем попросите пользователя ввести закрытый вопрос. Это вопрос на который можно ответить либо да, либо нет.
 * 3. В методе main должен быть объект Scanner для ввода вопроса от пользователя.
 * 4. Через класс Random сгенерируйте число от 0 до 3.
 * Если ответ равен 0, то на консоль нужно вывести "Да". Если ответ - 1, то на консоль нужно вывести "Нет". Во всех остальных случаях напечатать - "Может быть".
 */
public class MagicBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = new Random().nextInt(3);
        sc.nextLine();
        if (temp == 0) {
            System.out.println("Да");
        } else if (temp == 1) {
            System.out.println("Нет");
        } else System.out.println("Может быть");
    }
}
