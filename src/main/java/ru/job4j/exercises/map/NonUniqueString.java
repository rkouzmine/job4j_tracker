package ru.job4j.exercises.map;

import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        Map<String, Boolean> result = new HashMap<>();
        for (String str : strings) {
            result.put(str, map.get(str) >= 2);
        }
        return result;
    }
}