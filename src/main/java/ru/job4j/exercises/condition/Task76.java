package ru.job4j.exercises.condition;

import java.util.HashMap;
import java.util.Map;

public class Task76 {
    public static void sameNumAmount(int num) {
        String strNum = String.valueOf(num);
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : strNum.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int maxCount = 0;
        for (int count : map.values()) {
            if (count > 1) {
                maxCount = Math.max(maxCount, count);
            }
        }
        System.out.println(maxCount);
    }

    public static void main(String[] args) {
        sameNumAmount(331);
        sameNumAmount(123);
        sameNumAmount(122333);
    }
}