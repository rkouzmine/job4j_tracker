package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountTest {
    @Test
    public void whenException() {
        int start = 0;
        int finish = 3;
        int expected = 3;
        int result = Count.add(start, finish);
        assertThat(result).isEqualTo(expected);
    }
}