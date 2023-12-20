package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemAscByNameTest {

    @Test
    void whenSortByAscendingName() {
        List<Item> items = Arrays.asList(
                new Item("Mikhail"),
                new Item("Ruslan"),
                new Item("Maksim"),
                new Item("Elena")
        );
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("Elena"),
                new Item("Maksim"),
                new Item("Mikhail"),
                new Item("Ruslan")
        );
        assertThat(items).isEqualTo(expected);
    }
}