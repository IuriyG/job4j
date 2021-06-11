package ru.job4j.condition;

/**
 * @author Iuriy Gaydarzhi.
 * @since 11.06.2021
 */
public class SwitchWeek {
    /**
     * Метод выводит в консоль день недели в зависимости от входного параметра.
     *
     * @param day входной аргумент.
     * @return день недели
     */
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Понедельник";
                break;
            case 2:
                name = "Вторник";
                break;
            case 3:
                name = "Среда";
                break;
            case 4:
                name = "Четверг";
                break;
            case 5:
                name = "Пятница";
                break;
            case 6:
                name = "Суббота";
                break;
            case 7:
                name = "Воскресенье";
                break;
            default:
                name = "Ошибка";
                break;
        }
        return name;
    }
}
