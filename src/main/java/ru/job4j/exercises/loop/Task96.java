package ru.job4j.exercises.loop;

public class Task96 {
    public static void loop(int[] num) {
        int result = Integer.MAX_VALUE;
        for (int i : num) {
            if (i < result) {
                result = i;
            }
        }
        System.out.println(result);
    }
}