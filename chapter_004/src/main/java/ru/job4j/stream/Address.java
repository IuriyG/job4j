package ru.job4j.stream;

/**
 * Модель для класса Profile.
 */
public class Address {
    private String city;
    private String street;
    private int home;
    private int apartment;


    public void setCity(String city) {
        this.city = city;
    }


    public void setStreet(String street) {
        this.street = street;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }
}
