package ru.job4j.exercises.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch != ' ') {
                map.putIfAbsent(ch, new ArrayList<>());
                map.get(ch).add(i);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String strFirst = "Hello World";
        String strSecond = "Hello Java";
        System.out.println(collectCharacters(strFirst));
        System.out.println(collectCharacters(strSecond));
    }
}