package ru.job4j.exercises.loop;

public class Task56 {
    public static void loop(int[] array) {
        int count = 0;
        for (Integer num : array) {
            if (array[0] < num) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] array = new int[]{3, 1, 4, 2, 3};
        loop(array);
    }
}