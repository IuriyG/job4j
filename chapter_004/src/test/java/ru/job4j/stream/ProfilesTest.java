package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {

    List<Profile> allProfiles = new ArrayList<>();
    List<Address> addressList = new ArrayList<>();

    @Before
    public void setUp() {
        Profile ru = new Profile();
        Address dom1 = new Address();
        dom1.setCity("Moscow");
        dom1.setStreet("Somewhere");
        dom1.setHome(1);
        dom1.setApartment(33);
        ru.setAddress(dom1);

        Profile com = new Profile();
        Address dom3 = new Address();
        dom3.setCity("Seattle");
        dom3.setStreet("Somewhere");
        dom3.setHome(3);
        dom3.setApartment(30);
        com.setAddress(dom3);

        Profile ua = new Profile();
        Address dom2 = new Address();
        dom2.setCity("Odessa");
        dom2.setStreet("Somewhere");
        dom2.setHome(2);
        dom2.setApartment(20);
        ua.setAddress(dom2);

        allProfiles.add(ru);
        allProfiles.add(com);
        allProfiles.add(ua);

        addressList.add(dom1);
        addressList.add(dom3);
        addressList.add(dom2);
    }

    @Test
    public void whenAddressMatch() {
        Profiles profiles = new Profiles();
        List<Address> rsl = profiles.collect(allProfiles);
        assertThat(rsl, is(addressList));
    }
}
