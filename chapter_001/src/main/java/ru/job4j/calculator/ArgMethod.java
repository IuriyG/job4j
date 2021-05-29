package ru.job4j.calculator;

/**
 * @author Iuriy Gaydarzhi.
 * @since 28.05.2021
 */
public class ArgMethod {

    /**
     * Метод выводит в консоль входящие переменные.
     *
     * @param name имя.
     * @param age  возраст.
     */
    public static void hello(String name, int age) {
        System.out.println("Hello, " + "My name is " + name + " and I`m " + age + " years old");
    }

    /**
     * Метод вызывает hello с заданными переменными.
     *
     * @param args аргументы.
     */
    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;
        ArgMethod.hello(name, age);
    }
}
