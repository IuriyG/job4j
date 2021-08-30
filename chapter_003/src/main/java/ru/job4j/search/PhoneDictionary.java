package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * 1. Вернемся к заданию "Телефонный справочник". Условие задания. Есть список абонентов.
 * Нужно их отфильтровать по ключу. Метод поиска должен фильтровать все поля модели.
 * Этот блок кода можно заменить на функцию высшего порядка.
 * Применим функциональный интерфейс java.util.function. Predicate и метода or.
 * 2. Допишите метод find с использованием функции высшего порядка.
 * 3. Залейте код в репозиторий. Оставьте ссылку на коммит. Переведите ответственного
 */
public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();


    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержит key в любых полях.
     *
     * @param key Ключ поиска.
     * @return возвращаем список соответствующих пользователей.
     */
    public ArrayList<Person> find(String key) {

        Predicate<Person> compareName = cn -> cn.getName().contains(key);
        Predicate<Person> compareSurname = cs -> cs.getSurname().contains(key);
        Predicate<Person> comparePhone = cp -> cp.getPhone().contains(key);
        Predicate<Person> compareAddress = ca -> ca.getAddress().contains(key);
        Predicate<Person> combine = compareName.or(compareSurname).or(comparePhone).or(compareAddress);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
