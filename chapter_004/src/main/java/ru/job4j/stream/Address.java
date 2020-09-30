package ru.job4j.stream;

import java.util.Objects;

/**
 * Модель для класса Profile.
 */
public class Address {
    private String city;
    private String street;
    private int home;
    private int apartment;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Address address = (Address) o;

        return Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return city != null ? city.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Address{"
                + "city='" + city + '\''
                + ", street='" + street + '\''
                + ", home=" + home
                + ", apartment=" + apartment
                + '}';
    }

    public String getCity() {
        return city;
    }

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
