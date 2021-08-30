package ru.job4j.bank;

import java.util.*;

/**
 * Класс демонстрирует работу простейшего банковского сервиса в котором можно:
 * 1. Регистрировать пользователя.
 * 2. Удалять пользователя.
 * 3. Добавлять пользователю банковский счет. Счетов может быть несколько.
 * 4. Осуществлять перевод с одного банковского счёта на другой.
 *
 * @author Iuriy Gaydarzhi.
 * @since 29.08.2020
 */
public class BankService {

    /**
     * Поле содержит всех пользователей и привязанных к ним счетам.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет нового пользователя.
     *
     * @param user Новый пользователь.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет пользователю новый аккаунт. Предварительно проверяя отсутствие данного аккаунта.
     * Если совпадений не найдено, тогда добавляет.
     *
     * @param passport Паспорт пользователя.
     * @param account  Аккаунт пользователя.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accountList = users.get(user);
            if (!accountList.contains(account)) {
                accountList.add(account);
            }
        }
    }

    /**
     * Метод удаляет пользователя.
     *
     * @param user Пользователь.
     */
    public void deleteUser(User user) {
        users.remove(user);
    }

    /**
     * Метод ищет пользователя по паспорту.
     * Использовать Steam API.
     *
     * @param passport Паспорт пользователя.
     * @return Возвращает пользователя или null, если пользователь не найден.
     */
    public User findByPassport(String passport) {
        return users.keySet().stream().filter(e -> e.getPassport().equals(passport)).findFirst().orElse(null);
    }

    /**
     * Метод ищет пользователя по паспорту и реквизитам.
     * Использовать Steam API.
     *
     * @param passport  Паспорт пользователя.
     * @param requisite Реквизиты пользователя.
     * @return Возвращает пользователя или null, если пользователь не найден.
     */
    public Account findByRequisite(String passport, String requisite) {
        return users.getOrDefault(findByPassport(passport), Collections.emptyList()).stream().filter(account -> account.getRequisite().equals(requisite)).findFirst().orElse(null);
    }

    /**
     * Метод переводит денежные средства с одного счета на другой. При этом проверяет,
     * существуют ли счета и достаточно ли денежных средств на счете отправителя.
     *
     * @param srcPassport   Паспорт пользователя откуда будет производиться перечисление.
     * @param srcRequisite  Реквизиты пользователя откуда будет производиться перечисление.
     * @param destPassport  Паспорт пользователя куда будет производиться перечисление.
     * @param destRequisite Реквизиты пользователя куда будет производиться перечисление.
     * @param amount        Сумма перечисления.
     * @return Возвращает результат перевода.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            return true;
        }
        return false;
    }
}
