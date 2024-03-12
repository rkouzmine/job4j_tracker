package ru.job4j.exercises.array;

import java.util.StringJoiner;

public class Task78 {
    public static void array(int[] nums) {
        StringJoiner sj = new StringJoiner(" ");

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                sj.add(String.valueOf(nums[i]));
            }
        }
        System.out.println(sj);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 5, 4, 3, 3, 1};
        array(nums);
    }
}