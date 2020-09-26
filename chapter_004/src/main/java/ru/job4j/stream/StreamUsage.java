package ru.job4j.stream;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <b>Задание.</b>
 * 1. Создайте ArrayList. Заполните его числами Integer.
 * 2. Получите из ArrayList поток данных. Отфильтруйте поток так, чтобы в нем остались только положительные числа.
 * 3. Отфильтрованный поток запишите в List.
 * 4. Загрузите код в репозиторий. Оставьте ссылку на коммит.
 * 5. Переведите на ответственного.
 */
public class StreamUsage {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>() {{
            add(2);
            add(-40);
            add(54);
            add(90);
            add(-61);
            add(11);
        }};

        List<Integer> rsl = arrayList.stream().filter(zero -> zero > 0).collect(Collectors.toList());
        rsl.forEach(System.out::println);
    }
}
