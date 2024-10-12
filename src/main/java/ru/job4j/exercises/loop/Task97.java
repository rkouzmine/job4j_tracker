package ru.job4j.exercises.loop;

public class Task97 {
    public static void loop(int[] num) {
        int result = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < result) {
                result = num[i];
                index = i;
            }
        }
        System.out.printf("Время: %d, номер: %d%n", result, index);
    }

    public static void main(String[] args) {
        loop(new int[]{21, 23, 27, 19, 22});
        loop(new int[]{21, 23, 27, 19, 10});
    }
}