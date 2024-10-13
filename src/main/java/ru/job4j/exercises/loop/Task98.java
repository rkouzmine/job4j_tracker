package ru.job4j.exercises.loop;

public class Task98 {
    public static void loop(int[] num) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i : num) {
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }
        int result = (max + min) / 2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        loop(new int[]{4, 1, 2, 9, 6});
    }
}