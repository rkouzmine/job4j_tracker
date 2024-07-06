package ru.job4j.exercises.map;

import java.util.*;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> result = new HashMap<>();
        for (String str : strings) {
            String key = String.valueOf(str.charAt(0));
            result.putIfAbsent(key, new ArrayList<>());
            result.get(key).add(str);
        }
        return result;
    }
}