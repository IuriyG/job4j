package ru.job4j.tracker;

import java.util.List;
public class FindItemByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        List<Item> findByName = tracker.findByName(name);
        System.out.println(System.lineSeparator() + "Find matches: ");
        int number = 1;
        for (Item findName : findByName) {
            System.out.println("№" + number + " Item: " + findName);
            number++;
        }
        return true;
    }
}
