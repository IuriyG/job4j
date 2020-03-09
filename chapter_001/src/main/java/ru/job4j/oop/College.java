package ru.job4j.oop;

/**
 * 1. Создайте классы в пакете ru.job4j.oop;
 * Object > Graduate > Freshman
 * 2. Создайте класс ru.job4j.oop.College с методом main.
 * В нем сделайте приведение объекта Freshman к Graduate, а потом к Object.
 * 3. Ответьте на вопрос к какому типу приведения это относится?
 * 4. Залейте код в репозиторий
 */

public class College {
    public static void main(String[] args) {

        // создаем объекта класса Car.
        Freshman fm = new Freshman();
        // делаем приведение к типу родителя Graduate.
        Graduate gdt = fm;
        // делаем приведение к типу родителя Object.
        Object obj = fm;
    }
}
