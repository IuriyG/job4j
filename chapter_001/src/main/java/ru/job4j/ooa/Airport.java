package ru.job4j.ooa;


/**
 * @author Iuriy Gaydarzhi.
 * @since 24.07.2021
 */
public class Airport {

    public static void main(String[] args) {
        final Airbus airbus = new Airbus("A300");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine();

        System.out.println();

        airbus.setName("A380");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine();

        System.out.println();

        airbus.setName("A330");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine();
    }
}
