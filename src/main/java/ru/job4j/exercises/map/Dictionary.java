package ru.job4j.exercises.map;

import java.util.*;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String str : strings) {
            String s = String.valueOf(str.charAt(0));
            rsl.put(s, Arrays.stream(strings)
                    .filter(x -> x.startsWith(s))
                    .toList());
        }
        return rsl;
    }
}