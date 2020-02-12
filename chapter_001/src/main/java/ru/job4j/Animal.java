package ru.job4j;

public class Animal {

    public Animal() {
        System.out.println(Animal.class);
    }
}

class Predator extends Animal {
    public Predator() {
        super();
        System.out.println(Predator.class);
    }
}

class Tiger extends Predator {
    public Tiger() {
        super();
        System.out.println(Tiger.class);
    }
}
