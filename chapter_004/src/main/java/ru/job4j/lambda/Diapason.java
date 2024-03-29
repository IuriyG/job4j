package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * 1. Реализовать метод подсчета функции в диапазоне.
 * 2. Реализации функций в тестах.
 *     - линейная.
 *     - квадратичная.
 *     - показательная. (y = a^x, где a - постоянная)
 * 3. Необходимо использовать только встроенные функциональные интерфейсы
 */
public class Diapason {

    List<Double> diapason(int start, int end, Function<Double, Double> func) {

        List<Double> list = new ArrayList<>();
        for (int i = start; i < end; i++) {
            list.add(func.apply((double) i));
        }
        return list;
    }
}
