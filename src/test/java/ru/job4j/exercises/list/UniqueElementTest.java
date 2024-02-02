package ru.job4j.exercises.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class UniqueElementTest {

    @Test
    public void checkListTrue() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        boolean result = UniqueElement.checkList(list, "second");
        assertThat(result).isTrue();
    }

    @Test
    public void checkListFalse() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("second");
        list.add("fourth");
        boolean result = UniqueElement.checkList(list, "second");
        assertThat(result).isFalse();
    }

    @Test
    public void checkListNoContainsElement() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        boolean result = UniqueElement.checkList(list, "fourth");
        assertThat(result).isFalse();
    }
}