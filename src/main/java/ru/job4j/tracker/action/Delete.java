package ru.job4j.tracker.action;

import ru.job4j.tracker.*;

public class Delete implements UserAction {
    private final Output out;

    public Delete(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Удалить заявку";
    }

    @Override
    public boolean execute(Input input, Store memTracker) {
        out.println("=== Удаление заявки ===");
        int id = input.askInt("Введите id: ");
        Item item = memTracker.findById(id);
        memTracker.delete(id);
        out.println(item != null ? "Заявка удалена успешно."
                : "Ошибка удаления заявки.");
        return true;
    }
}
