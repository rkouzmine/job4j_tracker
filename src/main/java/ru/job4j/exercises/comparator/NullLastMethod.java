package ru.job4j.exercises.comparator;

import java.util.Comparator;

public class NullLastMethod {
    public static Comparator<String> nullLast() {
        return Comparator.nullsLast(Comparator.naturalOrder());
    }
}
