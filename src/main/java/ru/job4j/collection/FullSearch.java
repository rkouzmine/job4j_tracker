package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> result = new HashSet<>();
        for (Task task : list) {
            result.add(task.getNumber());
        }
        return result;
    }
}