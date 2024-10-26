package ru.job4j.exercises.loop;

public class Task106 {
    public static void loop(int[] nums) {
        for (int num : nums) {
            if (num == 0) {
                break;
            }
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        loop(new int[]{-5, 2, 40, 0, 19});
    }
}