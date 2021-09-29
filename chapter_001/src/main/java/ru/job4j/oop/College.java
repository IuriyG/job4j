package ru.job4j.oop;

/**
 * 1. Создайте классы в пакете ru.job4j.oop;
 * В нем сделайте приведение объекта Freshman к Graduate, а потом к Object.
 * 3. Ответьте на вопрос к какому типу приведения это относится?
 * 4. Залейте код в репозиторий
 */

public class College {
    public static void main(String[] args) {

        /*
            Создаем объекта класса Car.
         */
        Freshman fm = new Freshman();
        /*
            Делаем приведение к типу родителя Graduate.
         */
        Graduate gdt = fm;
        /*
            Делаем приведение к типу родителя Object.
         */
        Object obj = fm;
    }
}
