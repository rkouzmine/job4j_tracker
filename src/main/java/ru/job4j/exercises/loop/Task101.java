package ru.job4j.exercises.loop;

public class Task101 {
    public static void loop(int[] num) {
        int max = num[0];
        int min = num[0];
        for (int i : num) {
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }
        System.out.printf("Max: %d, min: %d%n", max, min);
    }

    public static void main(String[] args) {
        loop(new int[]{10, -6, 23, 0, -4});
    }
}