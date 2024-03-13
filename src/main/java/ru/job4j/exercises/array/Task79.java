package ru.job4j.exercises.array;

import java.util.*;

public class Task79 {
    public static void array(int[] nums) {
        StringJoiner sj = new StringJoiner(" ");
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : nums) {
            int count = map.getOrDefault(num, 0);
            map.put(num, count + 1);
        }
        for (Map.Entry<Integer, Integer> integer : map.entrySet()) {
            if (integer.getValue() > 1) {
                sj.add(String.valueOf(integer.getKey()));
            }
        }
        if (sj.toString().isEmpty()) {
            System.out.print(sj);
        } else {
            System.out.println(sj);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 5, 4, 3, 3, 1};
        array(nums);

        nums = new int[]{};
        array(nums);

        nums = new int[]{1, 5, 3};
        array(nums);
    }
}