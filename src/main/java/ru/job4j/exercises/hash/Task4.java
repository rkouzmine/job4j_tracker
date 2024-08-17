package ru.job4j.exercises.hash;

import java.util.*;

public class Task4 {
    public static List<Integer> extractUnique(List<Integer> left, List<Integer> right) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : left) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Integer num : right) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }
        return list;
    }
}