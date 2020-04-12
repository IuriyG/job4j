package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete Item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter Id: ");
        if (tracker.deleteItem(id)) {
            System.out.println("Item deleted successfully!");
        } else {
            System.out.println("Invalid Id try again.");
        }
        return true;
    }
}
