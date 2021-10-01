package ru.job4j.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

/**
 * @author Iuriy Gaydarzhi.
 * @since 28.09.2021
 */
public class FunctionalInterfaces {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = map::put;

        biCon.accept(1, "one");
        biCon.accept(2, "two");
        biCon.accept(3, "three");
        biCon.accept(4, "four");
        biCon.accept(5, "five");
        biCon.accept(6, "six");
        biCon.accept(7, "seven");

        BiPredicate<Integer, String> biPre = (i, s) -> i % 2 == 0 || s.length() == 4;
        for (Integer i : map.keySet()) {
            System.out.println("key and value: " + biPre.test(i, map.get(i)));
        }

        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());
        Consumer<List<String>> con = (s) -> System.out.println("s: " + s);
        con.accept(sup.get());
        Function<String, String> func = (String::toUpperCase);
        System.out.println("Func.toString: " + func.apply(map.values().toString()));
    }
}
