package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Карты наиболее удобный структуры данных. Часто возникает ситуацию преобразования списка в карту.
 * Для этого нужно использовать collect c аргументов Collectors.toMap.
 * <b>Задание.</b>
 * 1. Создать список учеников. Класс Student взять из задания "Фильтрация учеников"
 * 2. Преобразовать список учеников в Map.
 * 3. В качестве ключа использовать фамилию ученика.
 * 4. В качестве значение использовать объект ученика.
 * 5. В карте могут появиться дубликаты, этого нужно избежать, используйте перегруженный toMap() с тремя параметрами.
 */
public class ListToMap {

    public Map<String, Student> studentSort(List<Student> list) {

        return list.stream().collect(Collectors.toMap(Student::getSurname, student -> student, (t, t2) -> t));
    }
}
