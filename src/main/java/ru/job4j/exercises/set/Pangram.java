package ru.job4j.exercises.set;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static boolean checkString(String s) {
        s = s.toLowerCase();
        String str = s.replaceAll(" ", "");
        char[] chars = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for (Character character : chars) {
            set.add(character);
        }
        return set.size() == 26;
    }
}
