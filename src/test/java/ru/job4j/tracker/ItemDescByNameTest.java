package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ItemDescByNameTest {

    @Test
    void whenSortByDescendingName() {
        List<Item> items = Arrays.asList(
                new Item("Mikhail"),
                new Item("Ruslan"),
                new Item("Maksim"),
                new Item("Elena")
        );
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item("Ruslan"),
                new Item("Mikhail"),
                new Item("Maksim"),
                new Item("Elena")
        );
        assertThat(items).isEqualTo(expected);
    }
}