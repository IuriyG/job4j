package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * В этом задании нужно преобразовать числовую матрицу в список.
 * <b>Задание.</b>
 * 1. Создайте матрицу Integer[][].
 * 2. Напишите преобразование этой матрицы в список чисел.
 * 3. При решении этой задачи нужно использовать методы flatMap, collect, Stream.of.
 */
public class MatrixToList {

    public List<Integer> transformToMatrix(int[][] array) {
        IntStream intStream = Stream.of(array).flatMapToInt(ints -> Arrays.stream(ints).sorted());
        return intStream.boxed().collect(Collectors.toList());
    }
}
