package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

/**
 * В этой задаче нам нужно преобразовать одну коллекцию в другую.
 * 1. Реализуйте метод process.
 * 2. Залейте код в репозиторий и оставьте ссылку на коммит в эту задачу.
 * 3. Переведите на ответственного.
 */
public class OrderConvert {
    public static HashMap<String, Order>
    process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order order : orders) {
            map.put(order.getNumber(), order);
        }
        return map;
    }
}
