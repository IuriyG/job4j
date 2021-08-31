package ru.job4j.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * В школе пришло требование разделить 9А класс на три класса.
 * У каждого ученика есть общий балл по всем предметам.
 * Score - может быть в диапазоне от 0 до 100.
 * Учеников нужно поделить на следующие группы.
 * 10А диапазон балла [70: 100],
 * 10Б диапазон балла [50: 70);
 * 10B диапазон балла (0: 50);
 * <b>Задание.</b>
 * 1. Создайте класс Student. В классе Student должны быть два поля: int score и String surname;
 * 2. Создайте класс School c методом collect;
 * 3. Создайте класс - тест SchoolTest с тремя методами для получения списка учеников для классов: А, B, C.
 * Каркас класса представлен ниже, В нем необходимо дописать Predicate с помощью лямбда.
 * 4. В этом задании нужно использовать Stream API. Метод filter и метод collect(Collectors.toList())
 */
public class School {

    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }
}
