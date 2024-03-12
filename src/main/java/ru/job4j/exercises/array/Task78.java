package ru.job4j.exercises.array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringJoiner;

public class Task78 {
    public static void array(int[] nums) {
        StringJoiner sj = new StringJoiner(" ");
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int count = map.getOrDefault(nums[i], 0);
            map.put(nums[i], count + 1);
        }

        for (Map.Entry<Integer, Integer> integer : map.entrySet()) {
            if (integer.getValue() == 1) {
                sj.add(String.valueOf(integer.getKey()));
            }
        }
        System.out.println(sj);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 5, 4, 3, 3, 1};
        array(nums);
    }
}