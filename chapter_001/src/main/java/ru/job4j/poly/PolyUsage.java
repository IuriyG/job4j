package ru.job4j.poly;

/**
 * @author Iuriy Gaydarzhi.
 * @since 12.07.2021
 *
 * 1. Добавьте интерфейс Транспортное средство (Vehicle), определите в нем метод без возвращаемого типа move().
 * 2. Добавьте три реализации - Самолет, Поезд, Судно. В каждом реализуйте метод move() - каждый по своему,
 * поскольку самолет летает по воздуху, поезд передвигается по рельсам, а судно двигается по воде;
 * 3. Создайте несколько объектов каждого класса, при этом приведите их к типу Vehicle.
 * Сложите все объекты в массив, а потом в цикле for() выведите все объекты в консоль с вызовом их методов;
 */
public class PolyUsage {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle hovercraft = new Hovercraft();
        Vehicle train = new Train();

        Vehicle[] vehicles = new Vehicle[]{airplane, hovercraft, train};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
