package ru.job4j.search;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("Petr");
        Assert.assertEquals(persons.get(0).getSurname(), ("Arsentev"));
    }

    @Test
    public void whenFindByPartOfSurname() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("tev");
        Assert.assertEquals(persons.get(0).getSurname(), ("Arsentev"));
    }

    @Test
    public void whenFindByPartOfPhone() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("34");
        Assert.assertEquals(persons.get(0).getSurname(), ("Arsentev"));
    }

    @Test
    public void whenFindByPartOfAddress() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("nsk");
        Assert.assertEquals(persons.get(0).getSurname(), ("Arsentev"));
    }
}
