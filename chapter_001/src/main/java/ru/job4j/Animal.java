package ru.job4j;

public class Animal {
    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }
}

class Predator extends Animal {
    public Predator() {
    }

    public Predator(String name) {
        super(name);
    }
}

class Tiger extends Predator {
    public Tiger() {
    }

    public Tiger(String name) {
        super(name);
    }
}
