package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CutAddressesTest {

    List<Address> addressList = new ArrayList<>();
    List<Address> expected = new ArrayList<>();

    @Before
    public void setUp() {
        Address dom1 = new Address();
        dom1.setCity("St. Petersburg");
        dom1.setStreet("Somewhere");
        dom1.setHome(1);
        dom1.setApartment(33);

        Address dom3 = new Address();
        dom3.setCity("Bellevue");
        dom3.setStreet("Somewhere");
        dom3.setHome(3);
        dom3.setApartment(30);

        Address dom2 = new Address();
        dom2.setCity("St. Petersburg");
        dom2.setStreet("Somewhere");
        dom2.setHome(2);
        dom2.setApartment(20);

        Address dom4 = new Address();
        dom4.setCity("Lakewood");
        dom4.setStreet("Somewhere");
        dom4.setHome(4);
        dom4.setApartment(40);

        addressList.add(dom1);
        addressList.add(dom2);
        addressList.add(dom3);
        addressList.add(dom4);

        expected.add(dom3);
        expected.add(dom4);
        expected.add(dom1);
    }

    @Test
    public void whenCutAddressTrue() {
        CutAddresses cutAddresses = new CutAddresses();
        List<Address> rsl = cutAddresses.sortAddress(addressList);
        assertThat(rsl, is(expected));
    }
}
