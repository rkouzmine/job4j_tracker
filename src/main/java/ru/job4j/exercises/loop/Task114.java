package ru.job4j.exercises.loop;

public class Task114 {
    public static void loop(int[] nums) {
        int sum = nums[0];
        for (int i = nums[1]; i < nums.length; i++) {
                if (nums[i - 1] != nums[i]) {
                    sum += nums[i - 1];
                }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        loop(new int[]{1, 2, 3, 4, 5, 5, 7});
        loop(new int[]{1, 1});
    }
}
