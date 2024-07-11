package ru.job4j.exercises.array;

import java.util.*;

public class Task76 {
    public static void array(int[] arr) {
        StringJoiner sj = new StringJoiner(", ");
        Map<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 1; i <= 5; i++) {
            map.put(i, 0);
        }
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        map.forEach((k, v) -> sj.add(k + ": " + v));
        System.out.println(sj);
    }
}