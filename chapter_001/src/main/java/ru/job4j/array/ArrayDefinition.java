package ru.job4j.array;

/**
 * @author Iuriy Gaydarzhi.
 * @since 17.06.2021
 */
public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);

        String[] names = new String[4];
        names[0] = "Keanu Reeves";
        names[1] = "Michael Nyqvist";
        names[2] = "Adrianne Palicki";
        names[3] = "Ian McShane";

        for (String name : names) {
            System.out.println(name);
        }
    }
}
