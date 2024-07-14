package ru.job4j.exercises.array;

import java.util.*;

public class Task75 {
    public static void array(int[] arr) {
        StringJoiner sj = new StringJoiner(", ");
        StringJoiner sjZero = new StringJoiner(" ");
        StringJoiner sjMin = new StringJoiner(" ");
        StringJoiner sjMax = new StringJoiner(" ");

        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 1; i <= 9; i++) {
            map.put(i, 0);
        }
        for (Integer num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        map.forEach((k, v) -> sj.add(k + ": " + v));
        System.out.println(sj);

        int maxValue = Collections.max(map.values());
        int minValue = Collections.min(map.values());
        if (minValue == 0) {
            minValue = 1;
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                sjZero.add(entry.getKey().toString());
            }
            if (entry.getValue() == minValue) {
                sjMin.add(entry.getKey().toString());
            }
            if (entry.getValue() == maxValue) {
                sjMax.add(entry.getKey().toString());
            }
        }
        if (arr.length == 2) {
            System.out.println("Чаще: " + (0)
                    + ", отсутствует: " + (sjZero.length() > 0 ? sjZero : "0")
                    + ", реже: " + (0));
        } else {
            System.out.println("Чаще: " + (maxValue != minValue ? sjMax : 0)
                    + ", отсутствует: " + (sjZero.length() > 0 ? sjZero : "0")
                    + ", реже: " + (sjMin.length() == 0 || minValue == maxValue ? 0 : sjMin));
        }
    }

    public static void main(String[] args) {
        int[] arr2 = new int[]{1, 1};
        array(arr2);
    }
}