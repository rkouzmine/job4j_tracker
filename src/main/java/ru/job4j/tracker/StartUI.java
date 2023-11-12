package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        System.out.println("Текущие дата и время: " + item.getCreated());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormatter = item.getCreated().format(formatter);
        System.out.println("Текущие дата и время после форматирования: "
                + currentDateTimeFormatter);
    }
}