package ru.job4j.exercises.comparator;

import java.util.Comparator;

public class NullFirstMethod {
    public static Comparator<String> nullFirst() {
        return Comparator.nullsFirst(Comparator.naturalOrder());
    }
}
