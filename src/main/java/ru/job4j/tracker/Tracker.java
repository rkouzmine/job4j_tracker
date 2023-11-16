package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] names = items;
        Item[] rsl = new Item[names.length];
        int size = 0;
        for (int i = 0; i < names.length; i++) {
            Item name = names[i];
            if (name != null) {
                rsl[size] = name;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public Item[] findByName(String key) {
        Item[] names = items;
        Item[] rsl = new Item[names.length];
        int count = 0;
        for (int i = 0; i < size; i++) {
            Item name = names[i];
            if (name.getName().equals(key)) {
                rsl[count] = name;
                count++;
            }
        }
        return Arrays.copyOf(rsl, count);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}