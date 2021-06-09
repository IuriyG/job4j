package ru.job4j.condition;

/**
 * @author Iuriy Gaydarzhi.
 * @since 09.06.2021
 */
public class PointEq {
    /**
     * Метод eq проверяет, что две точки в системе координат одинаковы.
     *
     * @param x1 1 точка по оси x.
     * @param y1 1 точка по оси y.
     * @param x2 2 точка по оси x.
     * @param y2 2 точка по оси y.
     * @return результат выражения.
     */
    public static boolean eq(int x1, int y1, int x2, int y2) {
        boolean eqX = x1 == x2;
        boolean eqY = y1 == y2;
        return eqX && eqY;
    }

    /**
     * Main.
     *
     * @param args Входящий аргумент.
     */
    public static void main(String[] args) {
        System.out.println(eq(1, 1, 2, 2));
        System.out.println(eq(10, 10, 10, 10));
    }
}
