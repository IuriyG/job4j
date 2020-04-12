package ru.job4j.tracker;

public class ShowAllItemAction implements UserAction {
    @Override
    public String name() {
        return "=== Your Item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        tracker.findAll();
        int number = 1;
        for (Item itm : tracker.findAll()) {
            System.out.println("№" + number + " Item: " + itm);
            number++;
        }
        return true;
    }
}
