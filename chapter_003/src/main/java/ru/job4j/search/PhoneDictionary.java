package ru.job4j.search;

import java.util.ArrayList;

/**
 * 1. Доработайте требуемый функционал.
 * 2. Залейте код в репозиторий.
 * 3. Выполните начать.
 * 4. Выставите ответственного.
 * 5. Приложите ссылку на коммит.
 */
public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();


    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержит key в любых полях.
     * @param key Ключ поиска.
     * @return Список подошедших пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().contains(key) || person.getSurname().contains(key) || person.getPhone().contains(key) || person.getAddress().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }
}
