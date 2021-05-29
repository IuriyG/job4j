package ru.job4j.condition;

/**
 * @author Iuriy Gaydarzhi.
 * @since 28.05.2021
 */
public class Greeting {

    /**
     * Метод выводит в консоль значение переменных.
     *
     * @param args аргументы.
     */
    public static void main(String[] args) {

        String idea = "I like Java!";
        System.out.println(idea);
        String noob = idea + " But I am a newbie. ";
        int year = 2021;
        String engineer = noob + year;
        System.out.println(engineer);
    }
}
