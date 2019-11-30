package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        boolean number;
        for (int i = 2; i <= finish; i++) {
            number = true;
            for (int j = 2; j <= i / j; j++)
                if (i % j == 0) {
                    number = false;
                    break;
                }

            if (number) count++;
        }
        return count;
    }
}
/*
//  Более простой вариант
public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
            if (checkPrimeNumber.check(i)) count++;
        }
        return count;
    }
}
 */

