package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ListToMapTest {
    private final List<Student> students = new ArrayList<>();

    @Before
    public void setUp() {

    }

    @Test
    public void whenTransformTrue() {
        ListToMap listToMap = new ListToMap();
        Student student1 = new Student(10, "Surname1");
        Student student2 = new Student(20, "Surname2");
        Student student3 = new Student(30, "Surname3");
        Student student4 = new Student(40, "Surname4");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        Map<String, Object> expected = Map.of(
                "Surname4", student4,
                "Surname3", student3,
                "Surname2", student2,
                "Surname1", student1);
        Map<String, Object> rsl = listToMap.studentSort(students);

        assertThat(rsl, is(expected));
    }
}
