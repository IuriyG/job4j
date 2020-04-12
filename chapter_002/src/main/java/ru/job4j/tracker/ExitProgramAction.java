package ru.job4j.tracker;

public class ExitProgramAction implements UserAction {

    @Override
    public String name() {
        return "=== Exit program ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Goodbye!");
        return false;
    }
}
