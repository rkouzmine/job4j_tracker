package ru.job4j.tracker.action;

import ru.job4j.tracker.*;

public class Create implements UserAction {
    private final Output out;

    public Create(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Добавить новую заявку";
    }

    @Override
    public boolean execute(Input input, Store memTracker) {
        out.println("=== Создание новой заявки ===");
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        memTracker.add(item);
        out.println("Заявка добавлена: " + item);
        return true;
    }
}
