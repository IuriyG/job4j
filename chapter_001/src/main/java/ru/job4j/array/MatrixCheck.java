package ru.job4j.array;

/**
 * Класс для работы с символом в двумерном массиве. Определение ячеек заполненных символом.
 *
 * @author IuriyG
 */
public class MatrixCheck {
    /**
     * Метод проверяет наличие символа 'X' по вертикали или по горизонтали.
     *
     * @param board первый аргумент.
     * @return в зависимости от результата возвращает true или false.
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (monoHorizontal(board, i) || monoVertical(board, i)) {
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод проверяет наличие символа по диагонали.
     *
     * @param board первый аргумент.
     * @return в зависимости от результата возвращает true или false.
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i <= board.length - 1; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    /**
     * Метод проверяет наличие символа 'X' по горизонтали.
     *
     * @param board первый аргумент.
     * @param row   второй аргумент.
     * @return в зависимости от результата возвращает true или false.
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 'X') {
                count++;
            }
        }
        return count == board.length;
    }

    /**
     * Метод проверяет наличие символа 'X' по вертикали.
     *
     * @param board  первый аргумент.
     * @param column второй аргумент.
     * @return в зависимости от результата возвращает true или false.
     */
    public static boolean monoVertical(char[][] board, int column) {
        int count = 0;
        for (char[] chars : board) {
            if (chars[column] == 'X') {
                count++;
            }
        }
        return count == board.length;
    }
}
