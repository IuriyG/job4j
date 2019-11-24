package ru.job4j.condition;

public class SqArea {
    public static int square(int p, int k) {
        /*
        int x = 1;                                    // Вариант№1, решение для задания: 3.8 Площадь треугольника.[#192082]
        int P = (k * x) + (k * x) + x + x;
        int h = P / p;
        int L = h * k;
        return h * L;
         */
        //return Math.pow(p / (2 * (k + 1)), 2) * k; // Вариант№2, решение для задания: 3.8 Площадь треугольника.[#192082]

        int h = p / (2 * (k + 1));
        int w = k * h;
        int s = w * h;
        return s;
    }
/*
    public static void main(String[] args) {        // Необходимо для выполнения условия задания: 3.8 Площадь треугольника.[#192082]
        double result = square(4, 1);
        double result1 = square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
 */
}