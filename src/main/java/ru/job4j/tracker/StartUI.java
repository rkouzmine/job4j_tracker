package ru.job4j.tracker;

import ru.job4j.tracker.action.*;
import java.util.List;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Store tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Выбрать: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Неверный ввод, вы можете выбрать: 0.." + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);

        }
    }

    private void showMenu(List<UserAction> actions) {
        out.println("Меню:");
        for (int i = 0; i < actions.size(); i++) {
            out.println(i + ". " + actions.get(i).name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(
                output, new ConsoleInput()
        );
        try (Store tracker = new SqlTracker()) {
            List<UserAction> actions = List.of(
                    new Create(output),
                    new FindAll(output),
                    new Replace(output),
                    new Delete(output),
                    new FindById(output),
                    new FindByName(output),
                    new Exit(output)
            );
            new StartUI(output).init(input, tracker, actions);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
