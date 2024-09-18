package ru.job4j.exercises.condition;

import java.util.HashSet;
import java.util.Set;

public class Task77 {
    public static void diffNumAmount(int num) {
        String strNum = String.valueOf(num);
        Set<Character> set = new HashSet<>();
        for (char ch : strNum.toCharArray()) {
            set.add(ch);
        }
        int result = set.size() == 1 ? 0 : set.size();
        System.out.println(result);
    }
}