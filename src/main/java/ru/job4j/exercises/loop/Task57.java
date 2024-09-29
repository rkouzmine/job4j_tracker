package ru.job4j.exercises.loop;

public class Task57 {
    public static void loop(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        loop(new int[]{0, 2, 1, 1, 2});
        loop(new int[]{4, 3, 2, 1});
        loop(new int[]{-1, -2, -3, 0});
    }
}