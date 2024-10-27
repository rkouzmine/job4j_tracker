package ru.job4j.exercises.loop;

public class Task107 {
    public static void loop(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 999) {
                break;
            }
            System.out.println(num);
            count++;
        }
        System.out.printf("Значений: %d%n", count);
    }

    public static void main(String[] args) {
        loop(new int[]{1, 50, 100, 999, 1000});
        loop(new int[]{999, 50, 100, 999, 1000});
    }
}