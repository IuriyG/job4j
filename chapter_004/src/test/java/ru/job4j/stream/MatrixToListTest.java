package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MatrixToListTest {

    @Test
    public void whenTransformTrue() {
        MatrixToList matrixToList = new MatrixToList();

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> rsl = matrixToList.transformToMatrix(matrix);
        List<Integer> expected = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        assertThat(rsl, is(expected));
    }
}
