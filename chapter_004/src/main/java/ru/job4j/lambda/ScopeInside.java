package ru.job4j.lambda;

import java.util.function.Supplier;

/**
 * 1. Ниже приведен код, который складывает числа массива.
 * Код не компилируется.
 * 2. Исправьте ошибку. Загрузите код в репозиторий. Оставьте ссылку на коммит.
 */
public class ScopeInside {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int total = 0;
        for (int num : number) {
            int finalTotal = total;
            total = add(
                    () -> finalTotal + num);
        }
        System.out.println(total);
    }

    private static Integer add(Supplier<Integer> calc) {
        return calc.get();
    }
}
