package ru.job4j.exercises.loop;

public class Task98 {
    public static void loop(int[] num) {
        int max = num[0];
        int min = num[0];
        for (int i : num) {
            max = Math.max(i, max);
            min = Math.min(i, min);
        }
        int result = (max + min) / 2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        loop(new int[]{4, 1, 2, 9, 6});
    }
}