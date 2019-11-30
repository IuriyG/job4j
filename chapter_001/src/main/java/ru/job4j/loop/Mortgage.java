package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double debt;
        while (amount >= 0) {
            debt = amount + amount * (percent / 100);
            amount = (int) (debt - salary);
            year++;
        }
        return year;
    }
}
