package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * @author Iuriy Gaydarzhi.
 * @since 05.08.2021
 * Модели данных и HashSet.
 */
public class NotifyAccount {

    /**
     * Метод устраняет дубликаты клиентов по критерию: серия паспорта.
     *
     * @param accounts Аккаунты клиентов.
     * @return Множество с удаленными дубликатами.
     */
    public static HashSet<Account> sent(List<Account> accounts) {
        return new HashSet<>(accounts);
    }
}
