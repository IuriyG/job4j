package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Представьте, что разработчики JDK не сделали Stream API.
 * В этом задании Вам нужно реализовать каркас упрощенного Stream API.
 * EasyStream работает только с типом Integer. В нем есть четыре метода.
 * В этом задании нужно использовать шаблон Builder.
 * <b>Задание.</b>
 * 1. Реализуйте класс EasyStream. Проверьте реализацию тестами.
 * 2. Загрузите код в репозиторий. Оставьте ссылку на коммит.
 * 3. Переведите на ответственного.
 */
public class EasyStream {
    private final List<Integer> source;

    /**
     * Конструктор.
     *
     * @param source массив из объектов Integer.
     */
    public EasyStream(List<Integer> source) {
        this.source = source;
    }

    /**
     * Метод получает исходные данные.
     *
     * @param source массив из объектов Integer
     * @return новый объект EasyStream с параметрами - source, список из объектов Integer.
     */
    public static EasyStream of(List<Integer> source) {
        return new EasyStream(source);
    }

    /**
     * Метод преобразует число в другое число.
     *
     * @param fun функцию перехода от объекта типа Integer к объекту Integer.
     * @return результат функции в виде нового объект EasyStream с параметрами - list, список из объектов Integer.
     */
    public EasyStream map(Function<Integer, Integer> fun) {
        List<Integer> list = new ArrayList<>();
        for (Integer integer : source) {
            fun.apply(integer);
            list.add(fun.apply(integer));
        }
        return new EasyStream(list);
    }

    /**
     * Метод фильтрует поток элементов.
     *
     * @param fun предикат объекта типа Integer
     * @return результат предиката в виде нового объект EasyStream с параметрами - list, список из объектов Integer.
     */
    public EasyStream filter(Predicate<Integer> fun) {
        List<Integer> list = new ArrayList<>();
        for (Integer integer : source) {
            if (fun.test(integer)) {
                list.add(integer);
            }
        }
        return new EasyStream(list);
    }

    /**
     * Метод собирает все элементы из source по заданным условиям map и filter.
     *
     * @return новый список с параметрами - source, список из объектов Integer.
     */
    public List<Integer> collect() {
        return new ArrayList<>(source);
    }
}
