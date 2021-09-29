package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            /*
                получения минимально элемента в массиве.
             */
            int min = MinDiapason.findMin(data, i, data.length);

        /*
            нужен, чтобы получить индекс элемента.
         */
            int index = FindLoop.indexOf(data, min, i, data.length);
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
        return data;
    }
}
