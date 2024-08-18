package ru.job4j.exercises.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task5 {
    public static List<Integer> multiAssign(List<Task> tasks) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (Task task : tasks) {
            map.put(task.assignId(), map.getOrDefault(task.assignId(), 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                list.add(entry.getKey());
            }
        }
        return list;
    }

    public record Task(Integer taskId, Integer assignId) {}
}