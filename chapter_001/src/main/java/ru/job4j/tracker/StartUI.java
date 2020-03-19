package ru.job4j.tracker;

public class StartUI {

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showAllItem(Tracker tracker) {
        tracker.findAll();
        System.out.println(System.lineSeparator() + "=== Your Item ===");
        int number = 1;
        for (Item itm : tracker.findAll()) {
            System.out.println("№" + number + " Item: " + itm);
            number++;
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println(System.lineSeparator() + "=== Edit item ===");
        String id = input.askStr("Enter Id: ");
        String name = input.askStr("Enter a new name of item: ");
        Item item = new Item(name);
        item.setId(id);
        if (tracker.replace(id, item)) {
            System.out.println("Item replace successfully!");
        } else {
            System.out.println("Invalid Id try again.");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println(System.lineSeparator() + "=== Delete Item ===");
        String id = input.askStr("Enter Id: ");
        if (tracker.deleteItem(id)) {
            System.out.println("Item deleted successfully!");
        } else {
            System.out.println("Invalid Id try again.");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println(System.lineSeparator() + "=== Find items by Id ===");
        String searchId = input.askStr("Enter Id: ");
        System.out.println(System.lineSeparator() + "Find matches: " + tracker.findById(searchId));
    }

    public static void findItemByName(Input input, Tracker tracker) {
        System.out.println(System.lineSeparator() + "=== Find items by name ===");
        String name = input.askStr("Enter name: ");
        Item[] findByName = tracker.findByName(name);
        System.out.println(System.lineSeparator() + "Find matches: ");
        int number = 1;
        for (Item findName : findByName) {
            System.out.println("№" + number + " Item: " + findName);
            number++;
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.parseInt(input.askStr("Select: "));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAllItem(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemByName(input, tracker);
            } else if (select == 6) {
                run = false;
                System.out.println(System.lineSeparator() + "Exit program");
            }
            System.out.println();
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }
}
