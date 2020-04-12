package ru.job4j.tracker;

public class FindItemByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by Id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String searchId = input.askStr("Enter Id: ");
        System.out.println(System.lineSeparator() + "Match found: " + tracker.findById(searchId));
        return true;
    }
}
