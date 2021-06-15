package ru.job4j.loop;

public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        for (; start <= finish; start++) {
            if (start % 2 == 0) {
                sum += start;
            }
        }
        return sum;
    }

    /**
     * Метод суммирует значение чисел.
     * @param start Суммирование начинается с этой переменной.
     * @param finish Суммирование завершается включая эту.
     * @return Сумма чисел.
     */
    public static int sum(int start, int finish) {
        int sum = 0;
        for (; start <= finish; start++) {
            sum = sum + start;
        }
        return sum;
    }

    /**
     * Main.
     * @param args Входящий аргумент.
     */
    public static void main(String[] args) {
        System.out.println(sum(0, 5));
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(2, 12));
        System.out.println(sum(0, 16));
    }
}
