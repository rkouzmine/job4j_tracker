package ru.job4j.exercises.comparator;

import java.util.Comparator;

public class ReverseOrder {
    public static Comparator<String> reverseOrder() {
        return Comparator.reverseOrder();
    }
}
