package ru.job4j.collection;

import java.util.ArrayList;

/**
 * 1. Создайте класс ru.job4j.collection.UsageArrayList.
 * 2. В нем создайте метод main.
 * 3. В методе main создайте объект ArrayList с типом String. Добавьте в него 3 имени:
 * Petr, Ivan, Stepan. Далее через цикл for-each выведите все элементы на консоль.
 * 4. Залейте код в репозиторий, оставьте ссылку на коммит и переведите на ответственного.
 */

public class UsageArrayList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Petr");
        list.add("Ivan");
        list.add("Stepan");

        for (String names : list) {
            System.out.println(names);
        }
    }
}
