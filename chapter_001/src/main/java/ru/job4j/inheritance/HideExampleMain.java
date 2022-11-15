package ru.job4j.inheritance;

/**
 * Класс демонстрирует результаты работы всех четырех методов:
 *
 * @author Iuriy Gaydarzhi.
 * @since 15.11.2022
 */
public class HideExampleMain {
    public static void main(String[] args) {
        Animal animal = new Animal(); // создаем объект типа Animal
        Animal cat = new Cat(); // создаем объект Cat типа Animal
        animal.instanceInvoke(); // вызов переопределенного метода класса Animal
        cat.instanceInvoke(); // вызов переопределенного метода класса Cat
        Animal.staticInvoke();  // вызов статического метода класса Animal
        Cat.staticInvoke(); // вызов статического метода класса Cat
    }
}
