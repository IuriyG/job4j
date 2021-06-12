package ru.job4j.condition;

/**
 * @author Iuriy Gaydarzhi.
 * @since 12.06.2021
 */
public class MultipleSwitchWeek {
    /**
     * Метод выводит в консоль день недели в виде числа.
     *
     * @param name входной аргумент.
     * @return день недели.
     */
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> -1;
        };
    }
}
