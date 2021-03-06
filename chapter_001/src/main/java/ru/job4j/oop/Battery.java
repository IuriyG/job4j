package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int filing) {
        this.load = filing;
    }

    public static void main(String[] args) {
        Battery first = new Battery(100);
        Battery second = new Battery(30);
        first.exchange(second);
        System.out.println(first.load);
        System.out.println(second.load);
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }
}
