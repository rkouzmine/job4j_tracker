package ru.job4j.exercises.comparator;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class SortMapTest {

    @Test
    public void test() {
        Map<Integer, String> input = Map.of(
                1, "1",
                2, "2",
                3, "3"
        );
        Map<Integer, String> expected = Map.of(
                3, "3",
                2, "2",
                1, "1"
        );
        Map<Integer, String> result = SortMap.sort(input);
        assertThat(expected).isEqualTo(result);
    }
}