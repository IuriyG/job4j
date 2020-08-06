package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * В этом задании необходимо реализовать обратную конвертацию двухмерного массива в одномерный список.
 * 1. Реализуйте метод toList.
 * 2. Залейте код в репозиторий и оставьте ссылку на коммит.
 * 3. Переведите ответственного.
 */

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();

        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }
}
