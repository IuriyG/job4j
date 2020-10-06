package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * 1. Реализовать метод подсчета функции в диапазоне.
 * List<Double> diapason(int start, int end, Function<Double, Double> func);
 * 2. Реализации функций в тестах.
 *     - линейная.
 *     - квадратичная.
 *     - показательная. (y = a^x, где a - постоянная)
 *     Пример:
 *     "@Test
 * public void whenLinearFunctionThenLinearResults() {
 *     List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
 *     List<Double> expected = Arrays.asList(11D, 13D, 15D);
 *     assertThat(result, is(expected));
 * }
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
