package ru.job4j.calculator;

/**
 * Class Calculator Класс для работы с арифметическими операциями: сложения, вычитание, умножение и деление.
  * @author IuriyG
 */
public class Calculator {
    /**
     * Медот выполняет сложение первого, второго аргумента и выводит результат.
     * @param first  первый аргумент
     * @param second второй аргумент
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    /**
     * Медот выполняет деление первого аргумента на второй и выводит результат.
     * @param first  первый аргумент
     * @param second второй аргумент
     */
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    /**
     * Медот выполняет умножение первого аргумента на второй и выводит результат.
     * @param first  первый аргумент
     * @param second второй аргумент
     */
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    /**
     * Медот выполняет вычитание из первого аргумента второго и выводит результат.
     * @param first  первый аргумент
     * @param second второй аргумент
     */
    public static void subtrack(double first, double second) {
        double result = first - second;
        System.out.println(first + " * " + second + " = " + result);
    }

    /**
     * Main.
     * @param args args
     * Вызов методов: сложения, вычитание, умножение и деление; с заданными аргументами
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtrack(10, 5);
    }
}
