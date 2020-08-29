package ru.job4j.bank;

import java.util.*;

public class BankService {
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
     * Если совпадений не найдено, то добавляет.
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
     *
     * @param passport Паспорт пользователя.
     * @return Возвращает пользователя или null, если пользователь не найден.
     */
    public User findByPassport(String passport) {
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                return key;
            }
        }
        return null;
    }

    /**
     * Метод ищет пользователя по паспорту и реквизитам.
     *
     * @param passport  Паспорт пользователя.
     * @param requisite Реквизиты пользователя.
     * @return Возвращает пользователя или null, если пользователь не найден.
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accountList = users.get(user);
            for (Account list : accountList) {
                if (list.getRequisite().equals(requisite)) {
                    return list;
                }
            }
        }
        return null;
    }

    /**
     * Метод переводит денежные средства с одного счета на другой. При этом проверяет,
     * существуют ли счета и достаточно ли денежных средств на счете отправителя.
     *
     * @param srcPassport   Паспорт пользователя откуда будет производится перечисление.
     * @param srcRequisite  Реквизиты пользователя откуда будет производится перечисление.
     * @param destPassport  Паспорт пользователя куда будет производится перечисление.
     * @param destRequisite Реквизиты пользователя куда будет производится перечисление.
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
