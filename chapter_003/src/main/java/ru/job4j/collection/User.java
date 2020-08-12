package ru.job4j.collection;

import java.util.Objects;
import java.lang.Integer;

/**
 * Нужно осуществить сортировку для модели ru.job4j.collection.User.
 * В модели должны быть поля: имя и возраст.
 * Предусмотреть ситуацию, когда два пользователя имеют одинаковое имя.
 * В этом случае нужно сравнить их возраст.
 * Класс User должен реализовать интерфейс Comparable.
 * В этом классе нужно реализовать метод compareTo,
 * он должен сравнить имена, если они равны, то сравнить возраст.
 */
public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = Integer.compare(this.age, o.age);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
