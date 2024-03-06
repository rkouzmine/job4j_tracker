package ru.job4j.exercises.loop;

public class Task54 {
    public static void loop(int[] array) {
        int count = 0;
        for (Integer num : array) {
            if (num > 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, -2, -1};
        loop(array);
        array = new int[]{1, 2, 3};
        loop(array);
    }
}