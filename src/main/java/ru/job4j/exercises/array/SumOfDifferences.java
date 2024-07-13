package ru.job4j.exercises.array;

public class SumOfDifferences {
    public static int sum(int[] nums) {
        return nums[0] - nums[nums.length - 1];
    }
}