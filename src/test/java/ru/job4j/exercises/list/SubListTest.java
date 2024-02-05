package ru.job4j.exercises.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SubListTest {

    @Test
    public void getElementsBetweenIndexes() {
     List<String> list = new ArrayList<>();
            list.add("one");
            list.add("two");
            list.add("three");
            list.add("four");
            list.add("five");
            list.add("six");
            list.add("seven");
            list.add("eight");
            list.add("three");
            list.add("ten");
        List<String> result = SubList.getElementsBetweenIndexes(list, "three");
        List<String> expected = List.of("three", "four", "five", "six", "seven", "eight");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void getElementsBetweenIndexesEmptyList() {
      List<String> list = new ArrayList<>();
            list.add("one");
            list.add("two");
            list.add("three");
            list.add("four");
            list.add("five");
            list.add("six");
            list.add("seven");
            list.add("eight");
            list.add("three");
            list.add("ten");
        List<String> result = SubList.getElementsBetweenIndexes(list, "five");
        List<String> expected = List.of();
        assertThat(result).isEqualTo(expected);
    }
}