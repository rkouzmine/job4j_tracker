package ru.job4j.exercises.array;

public class SumOfDifferences {
    public static int sum(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i - 1] - nums[i];
        }
        return sum;
    }
}