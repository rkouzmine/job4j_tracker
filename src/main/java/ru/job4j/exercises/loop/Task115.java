package ru.job4j.exercises.loop;

public class Task115 {
    public static void loop(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                sum += nums[i];
                break;
            }
            sum += nums[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        loop(new int[]{1, 2, 3, 4, 2, 6});
    }
}