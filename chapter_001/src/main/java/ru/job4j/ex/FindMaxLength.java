package ru.job4j.ex;

/**
 * @author Iuriy Gaydarzhi.
 * @since 13.07.2021
 * <p>
 * 1. Ниже представлен класс ru.job4j.ex.FindMaxLength. Запустите этот класс.
 * 2. Вам нужно поправить проблему.
 * 3. Залейте код в репозиторий, оставить ссылку на коммит и перевести на ответственного.
 */
public class FindMaxLength {

    public static void main(String[] args) {
        String[] shops = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (String el : shops) {
            if (el != null) {
                if (el.length() > max) {
                    max = el.length();
                }
            }
        }
        System.out.println("Max length : " + max);
    }
}
