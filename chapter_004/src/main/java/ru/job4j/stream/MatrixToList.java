package ru.job4j.stream;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * В этом задании нужно преобразовать числовую матрицу в список.
 * <b>Задание.<b/>
 * 1. Создайте матрицу Integer[][].
 * 2. Напишите преобразование этой матрицы в список чисел.
 * 3. При решении этой задачи нужно использовать методы flatMap, collect, Stream.of.
 */
public class MatrixToList {

    public List<Integer> transformToMatrix(List<List<Integer>> list) {
        return list.stream().flatMap(Collection::stream).collect(Collectors.toList());
    }
}
