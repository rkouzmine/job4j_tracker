package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.action.*;

import static org.assertj.core.api.Assertions.assertThat;

class StartUITest {
    @Test
    void whenCreateItem() {
        Output output = new ConsoleOutput();
        Input in = new MockInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Create(output),
                new Exit(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName()).isEqualTo("Item name");
    }

    @Test
    void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Output output = new ConsoleOutput();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new MockInput(
                new String[]{"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new Replace(output),
                new Exit(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName()).isEqualTo(replacedName);
    }

    @Test
    void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Output output = new ConsoleOutput();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new MockInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new Delete(output),
                new Exit(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId())).isNull();
    }

    @Test
    void whenExit() {
        Output out = new StubOutput();
        Input in = new MockInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString()).isEqualTo(
                "Меню:" + System.lineSeparator()
                        + "0. Завершить программу" + System.lineSeparator()
                        + "=== Завершение программы ===" + System.lineSeparator()
        );
    }

    @Test
    void whenReplaceItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input in = new MockInput(
                new String[]{"0", String.valueOf(one.getId()), replaceName, "1"}
        );
        UserAction[] actions = new UserAction[]{
                new Replace(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Меню:" + ln
                        + "0. Изменить заявку" + ln
                        + "1. Завершить программу" + ln
                        + "=== Редактирование заявки ===" + ln
                        + "Заявка изменена успешно" + ln
                        + "Меню:" + ln
                        + "0. Изменить заявку" + ln
                        + "1. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }

    @Test
    void whenFindAllItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new MockInput(
                new String[]{"0", String.valueOf(one.getId()), "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindAll(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Меню:" + ln
                        + "0. Показать все заявки" + ln
                        + "1. Завершить программу" + ln
                        + "=== Вывод всех заявкок ===" + ln
                        + one + ln
                        + "Меню:" + ln
                        + "0. Показать все заявки" + ln
                        + "1. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }

    @Test
    void whenFindByNameItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new MockInput(
                new String[]{"0", one.getName(), "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindByName(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Меню:" + ln
                        + "0. Показать заявки по имени" + ln
                        + "1. Завершить программу" + ln
                        + "=== Вывод заявок по имени ===" + ln
                        + one + ln
                        + "Меню:" + ln
                        + "0. Показать заявки по имени" + ln
                        + "1. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }

    @Test
    void whenFindByIdItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new MockInput(
                new String[]{"0", String.valueOf(one.getId()), "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindById(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Меню:" + ln
                        + "0. Показать заявку по id" + ln
                        + "1. Завершить программу" + ln
                        + "=== Вывод заявки по id ===" + ln
                        + one + ln
                        + "Меню:" + ln
                        + "0. Показать заявку по id" + ln
                        + "1. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }
}