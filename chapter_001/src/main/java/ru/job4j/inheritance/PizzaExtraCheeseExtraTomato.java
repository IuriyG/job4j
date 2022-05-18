package ru.job4j.inheritance;

/**
 * @author Iuriy Gaydarzhi.
 * @since 18.05.2022
 */
public class PizzaExtraCheeseExtraTomato extends Pizza {
    @Override
    public String name() {
        return super.name() + " + with cheese + tomato";
    }
}
