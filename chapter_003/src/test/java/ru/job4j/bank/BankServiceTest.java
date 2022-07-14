package ru.job4j.bank;

import org.junit.Test;

import java.util.Objects;
import java.util.Optional;

import static org.junit.Assert.*;

public class BankServiceTest {
    @Test
    public void addUser() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        assertEquals(bank.findByPassport("3434"), Optional.of(user));
    }

    @Test
    public void deleteUser() {
        User user = new User("3434", "Petr Arsentev");
        User user1 = new User("33", "George Just");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addUser(user1);
        bank.deleteUser(user1);
        assertEquals(bank.findByPassport("3434"), Optional.of(user));
    }

    @Test
    public void whenEnterInvalidPassport() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertSame(bank.findByRequisite("34", "5546"), Optional.empty());
    }

    @Test
    public void whenEnterInvalidRequisite() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertSame(bank.findByRequisite("3434", "5544"), Optional.empty());
    }

    @Test
    public void addAccount() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertEquals(Objects.requireNonNull(bank.findByRequisite("3434", "5546")).orElseThrow().getBalance(), 150D, 0.0);
    }

    @Test
    public void transferMoney() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 150D);
        assertEquals(bank.findByRequisite(user.getPassport(), "113").orElseThrow().getBalance(), 200D, 0.0);
    }

    @Test
    public void moneyTransferIsNotPossible() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        assertFalse(bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 180D));
    }
}
