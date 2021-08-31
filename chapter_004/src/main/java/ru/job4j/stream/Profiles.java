package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * В туристической компании появилась задача составить список адресов клиентов.
 * В анкете у клиента, есть адрес проживания.
 * Public class Profile {}
 * Public class Address {}
 * <b>Задание.</b>
 * 1. Создать класс Profiles и метод collect;
 * * 2. При решении задания нужно использовать Stream API, метод map, метод collect;
 * 3. Метод Stream.map - принимает элемент потока и возвращает другой элемент.
 */
public class Profiles {

    public List<Address> collect(List<Profile> profiles) {

        return profiles.stream().map(Profile::getAddress).collect(Collectors.toList());
    }
}
