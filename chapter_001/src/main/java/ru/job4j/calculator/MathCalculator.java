package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

/**
 * @author Iuriy Gaydarzhi.
 * @since 30.05.2021
 */
public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusAndDivision(double first, double second) {
        return minus(first, second)
                + division(first, second);
    }

    public static double sumAllOperation(double first, double second) {
        return sumAndMultiply(first, second) + minus(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + minusAndDivision(10, 20));
        System.out.println("Результат расчета равен: " + sumAllOperation(10, 20));
    }
}
