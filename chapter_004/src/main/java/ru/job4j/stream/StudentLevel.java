package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * <b>Задание.</b>
 * 1. Реализовать фильтрацию учеников по проходному баллу.
 * name - ФИО студента, score - бал аттестата.
 * Необходимо реализовать метод levelOf;
 * Метод должен вернуть список студентов, у которых балл аттестата больше bound.
 * Во входящем списке могут быть null элементы.
 * Порядок действий.
 * - Используя метод filter убрать null;
 * - Отсортировать список;
 * - Используя метод takeWhile, получить нужный поток;
 * - Сохранить поток в List.
 */
public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream().filter(Objects::nonNull).sorted(Comparator.comparingInt(Student::getScore).reversed()).takeWhile(st -> st.getScore() > bound).collect(Collectors.toList());
    }
}
