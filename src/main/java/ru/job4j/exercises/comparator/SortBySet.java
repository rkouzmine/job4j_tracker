package ru.job4j.exercises.comparator;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortBySet {
    public static Set<String> sort(List<String> list) {
        Set<String> sorted = new TreeSet<>(list);
        return sorted;
    }
}
