package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println(System.lineSeparator() + "=== Create a new Item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);

            } else if (select == 1) {
                tracker.findAll();
                System.out.println(System.lineSeparator() + "=== Your Item ===");
                int number = 1;
                for (Item itm : tracker.findAll()) {
                    System.out.println("№" + number + " Item: " + itm);
                    number++;
                }
            } else if (select == 2) {
                System.out.println(System.lineSeparator() + "=== Edit item ===");
                System.out.print("Enter Id: ");
                String id = scanner.nextLine();
                System.out.print("Enter new name of Item: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, tracker.add(item))) {
                    System.out.println("Item replace successfully!");
                } else System.out.println("Invalid Id try again.");

            } else if (select == 3) {
                System.out.println(System.lineSeparator() + "=== Delete Item ===");
                System.out.print("Enter Id: ");
                String id = scanner.nextLine();
                if (tracker.deleteItem(id)) {
                    System.out.println("Item deleted successfully!");
                } else System.out.println("Invalid Id try again.");

            } else if (select == 4) {
                System.out.println(System.lineSeparator() + "=== Find items by Id ===");
                System.out.print("Enter Id: ");
                String searchId = scanner.nextLine();
                System.out.println(System.lineSeparator() + "Find matches: " + tracker.findById(searchId));
            } else if (select == 5) {
                System.out.println(System.lineSeparator() + "=== Find items by name ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] findByName = tracker.findByName(name);
                System.out.println(System.lineSeparator() + "Find matches: " + findByName.length);
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
