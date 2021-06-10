package ru.job4j.condition;

import static java.lang.Math.abs;

/**
 * @author Iuriy Gaydarzhi.
 * @since 10.06.2021
 */
public class ChessBoard {
    /**
     * Метод возвращает количество клеток, которое проходит слон во время движения по доске.
     *
     * @param x1 Начальные координаты по оси х.
     * @param y1 Начальные координаты по оси y.
     * @param x2 Конечные координаты по оси х.
     * @param y2 Конечные координаты по оси y.
     * @return УКоличество клеток или 0.
     */
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isDiagonal(x1, y1, x2, y2) && coordinatLimit(x1, y1, x2, y2)) {
            rsl = abs(x2 - x1);
        }
        return rsl;
    }

    /**
     * Метод проверяет ходит ли слон по вертикали или нет.
     *
     * @param x1 Начальные координаты по оси х.
     * @param y1 Начальные координаты по оси y.
     * @param x2 Конечные координаты по оси х.
     * @param y2 Конечные координаты по оси y.
     * @return Возвращает true или false.
     */
    public static boolean isDiagonal(int x1, int y1, int x2, int y2) {
        return abs(x2 - x1) == abs(y2 - y1);
    }

    /**
     * Метод проверяет чтобы входящие координаты x и y находились в пределах от 0 до 7 (размер шахматной доски).
     *
     * @param x1 Начальные координаты по оси х.
     * @param y1 Начальные координаты по оси y.
     * @param x2 Конечные координаты по оси х.
     * @param y2 Конечные координаты по оси y.
     * @return Возвращает true или false.
     */
    public static boolean coordinatLimit(int x1, int y1, int x2, int y2) {
        return x2 <= 7 && x1 >= 0 && y2 <= 7 && y1 >= 0;
    }
}
