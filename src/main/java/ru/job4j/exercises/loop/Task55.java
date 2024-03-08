package ru.job4j.exercises.loop;

public class Task55 {
    public static void loop(int[] array) {
        int x = 0;
        int y = 0;
        for (Integer num : array) {
            if (num % 2 == 0) {
                x++;
            } else {
                y++;
            }
        }
        System.out.println("Четных: " + x + ", нечетных: " + y);
    }

    public static void main(String[] args) {
        int[] array = new int[]{0, -1, 2};
        loop(array);
        array = new int[]{1, 2, 3};
        loop(array);
        array = new int[]{2, 3, -4};
        loop(array);
    }
}