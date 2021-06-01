package ru.job4j.condition;

/**
 * @author Iuriy Gaydarzhi.
 * @since 01.06.2021
 */
public class X2 {

    /**
     * Метод вычисляет значение квадратного уравнения.
     *
     * @param a входящий параметр.
     * @param b входящий параметр.
     * @param c входящий параметр.
     * @param x входящий параметр.
     * @return Результат вычисления.
     */
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    /**
     * Метод Main.
     *
     * @param args входящий аргумент.
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 1;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
    }
}
