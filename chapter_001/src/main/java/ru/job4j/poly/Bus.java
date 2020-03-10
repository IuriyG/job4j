package ru.job4j.poly;

/**
 * 1. Создайте интерфейс транспорт ru.job4j.poly.Transport;
 * Этот интерфейс будет определять любой вид транспорта.
 * 2. В интерфейсе объявите три метода: ехать (без параметров, без возвращаемого типа), пассажиры (принимает
 * число пассажиров, без возвращаемого типа), заправить (принимает кол-во топлива, возвращает цену).
 * 3. Реализуйте этот интерфейс в классе ru.job4j.poly.Bus.
 * Внутри методов напишите минимально требуемый код.
 * 4. Добавьте ссылку с коммитом на эту задачу.
 */
public class Bus implements Transport {

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.drive();
        bus.passengers(55);
        System.out.println("Минимальная сумма для поездки: " + bus.fill(80) + " руб.");
    }

    @Override
    public void drive() {
        System.out.println("Сегодня едем на экскурсию.");

    }

    @Override
    public void passengers(int numbers) {
        if (numbers >= 30 && numbers <= 40) {
            System.out.println("На автобусе - Shen Long.");
        } else if (numbers >= 40 && numbers <= 60) {
            System.out.println("На автобусе - Zonda.");
        }
    }

    @Override
    public int fill(int fuel) {
        return fuel * 47;
    }
}
