package ru.job4j.exercises.loop;

public class Task102 {
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
        String strMax = max > 0 ? String.valueOf(max) : "Нет";
        String strMin = min < 0 ? String.valueOf(min) : "Нет";
        System.out.printf("Max: %s, min: %s%n", strMax, strMin);
    }

    public static void main(String[] args) {
        loop(new int[]{0, 1, 2, 3, 4});
    }
}