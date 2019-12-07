package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1;   // если элемента нет в массиве, то возвращаем -1.
        int index;
        for (int i = 0; i < data.length; i++) {
            index = i;
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
