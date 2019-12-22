package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int count = 0;
        do {
            for (int index = 0; index < array.length - 1; index++) {
                String cell = array[index];
                if (cell == null) {
                    String temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                    count++;
                }
                System.out.print(array[index] + " ");
            }
        } while (count < array.length *2);
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
