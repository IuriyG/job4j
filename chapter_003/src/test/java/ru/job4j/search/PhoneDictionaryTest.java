package ru.job4j.search;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        Assert.assertEquals(persons.get(0).getSurname(), ("Arsentev"));
    }

    @Test
    public void whenFindByPartOfSurname() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("tev");
        Assert.assertEquals(persons.get(0).getSurname(), ("Arsentev"));
    }

    @Test
    public void whenFindByPartOfPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("34");
        Assert.assertEquals(persons.get(0).getSurname(), ("Arsentev"));
    }

    @Test
    public void whenFindByPartOfAddress() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("nsk");
        Assert.assertEquals(persons.get(0).getSurname(), ("Arsentev"));
    }
}
