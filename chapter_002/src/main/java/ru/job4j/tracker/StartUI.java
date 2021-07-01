package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class StartUI {

    public static void main(String[] args) {
        Item item = new Item("Date");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = item.getCreated().format(formatter);
        System.out.println(currentDateTimeFormat);
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction());
        actions.add(new ShowAllItemAction());
        actions.add(new ReplaceAction());
        actions.add(new DeleteAction());
        actions.add(new FindItemByIdAction());
        actions.add(new FindItemByNameAction());
        actions.add(new ExitProgramAction());
        new StartUI().init(validate, tracker, actions);
    }

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        System.out.println("Menu." + System.lineSeparator());
        for (int index = 0; index < actions.size(); index++) {
            System.out.println(index + ". " + actions.get(index).name());
        }
    }
}
