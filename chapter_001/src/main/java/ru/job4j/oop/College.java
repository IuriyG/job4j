package ru.job4j.oop;

/**
 * 1. Создайте классы в пакете ru.job4j.oop;
 * В нем сделайте приведение объекта Freshman к Graduate, а потом к Object.
 * 3. Ответьте на вопрос к какому типу приведения это относится?
 * 4. Залейте код в репозиторий
 */

public class College {
    public static void main(String[] args) {

        Freshman fm = new Freshman();

        Graduate gdt = fm;

        Object obj = fm;
    }
}
