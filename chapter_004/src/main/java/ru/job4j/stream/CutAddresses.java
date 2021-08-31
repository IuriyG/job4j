package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * В задании про список адресов для туристической фирмы пришло новое требование.
 * 1. Оказалось, что часть людей живет по одному и тому же адресу. Нужно в списке оставить только уникальные элементы.
 * 2. Для быстрого поиска по адресам список нужно было отсортировать.
 * В Stream API есть интересный метод distinct(). Он позволяет убрать дублирующие элементы.
 * <b>Задание.</b>
 * 1. Доработайте задание "Список Адресов", чтобы список элементов был уникальный.
 * Порядок элементов отсортирован по полю String city.
 * 2. Чтобы оставить только уникальные элементы, нужно использовать метод Stream.distinct();
 * Чтобы сравнить объекты класса Address, нужно в классе Address определить два методы equals и hashCode.
 * 3. Для сортировки нужно использовать метод sorted.
 * 4. Загрузите код в репозиторий. Оставьте ссылку на коммит.
 * 5. Переведите на ответственного.
 */
public class CutAddresses {

    public List<Address> sortAddress(List<Address> addresses) {
        return addresses.stream().sorted(Comparator.comparing(Address::getCity)).distinct().collect(Collectors.toList());
    }
}
