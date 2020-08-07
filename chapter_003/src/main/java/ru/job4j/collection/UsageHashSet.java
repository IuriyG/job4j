package ru.job4j.collection;

import java.util.HashSet;

/**
 * 1. Создайте класс ru.job4j.collection.UsageHashSet. В методе main допишите код.
 * 2. Добавьте в коллекцию autos марки машин: Lada, BMW, Volvo, Toyota.
 * 3. Добавьте цикл for-each и выведите элементы коллекции HashSet на консоль.
 * 4. Залейте код в репозиторий, оставьте ссылку на коммит и переведите на ответственного.
 */

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<>();

        autos.add("Lada");
        autos.add("BMW");
        autos.add("Volvo");
        autos.add("Toyota");

        for (String auto : autos) {
            System.out.println(auto);
        }
    }
}
