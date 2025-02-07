package ru.job4j.tracker.action;

import ru.job4j.tracker.*;

public class Replace implements UserAction {
    private final Output out;

    public Replace(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Изменить заявку";
    }

    @Override
    public boolean execute(Input input, Store memTracker) {
        out.println("=== Редактирование заявки ===");
        int id = input.askInt("Введите id: ");
        String name = input.askStr("Введите новое имя: ");
        Item item = new Item(name);
        memTracker.replace(id, item);
        if (memTracker.replace(id, item)) {
            out.println("Заявка изменена успешно");
        } else {
            out.println("Ошибка замены заявки");
        }
        return true;
    }
}
