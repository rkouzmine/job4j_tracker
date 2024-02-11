package ru.job4j.exercises.set;

import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean checkString(String s) {
        String str = s.toLowerCase();
        char[] chars = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for (Character character : chars) {
            set.add(character);
        }
        return set.size() == str.length();
    }
}