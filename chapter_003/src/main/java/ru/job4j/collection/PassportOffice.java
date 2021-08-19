package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Iuriy Gaydarzhi.
 * @since 19.08.2021
 */
public class PassportOffice {
    private final Map<String, Citizen> citizens = new HashMap<>();

    /**
     * Метод проверяет есть ли такой гражданин, если нет - добавляет.
     *
     * @param citizen Гражданин.
     * @return True если нет гражданина и false если есть.
     */
    public boolean add(Citizen citizen) {
        boolean rsl = false;

        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    /**
     * Метод предоставляет возможность получить данные гражданина по паспорту.
     *
     * @param passport Данные паспорта.
     * @return Полученные данные.
     */
    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}
