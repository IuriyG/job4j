package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ListToMapTest {

    @Test
    public void whenTransformWithDuplicateKeysTrue() {
        List<Student> students = new ArrayList<>();

        ListToMap listToMap = new ListToMap();
        Student student1 = new Student(10, "Surname1");
        Student student2 = new Student(20, "Surname2");
        Student student25 = new Student(25, "Surname2");
        Student student3 = new Student(30, "Surname3");
        Student student4 = new Student(40, "Surname4");
        Student student5 = new Student(40, "Surname4");
        students.add(student1);
        students.add(student2);
        students.add(student25);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Map<String, Object> expected = new HashMap<>(Map.of(
                "Surname3", student3,
                "Surname4", student4,
                "Surname1", student1,
                "Surname2", student2));
        Map<String, Student> rsl = listToMap.studentSort(students);
        assertThat(rsl, is(expected));
    }
}
