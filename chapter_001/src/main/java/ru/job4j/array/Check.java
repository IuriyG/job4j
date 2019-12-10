package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean tmp : data) {
            if (data[0] != tmp) {
                result = false;
                break;
            }
        }
        return result;
    }
}
