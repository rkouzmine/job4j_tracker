package ru.job4j.exercises.comparator;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class ReverseOrderTest {

    @Test
    public void test() {
        assertEquals(Comparator.reverseOrder(), ReverseOrder.reverseOrder());
    }
}