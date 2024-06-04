package ru.job4j.exercises.array;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        int positive = 0;
        int negative = 0;
        boolean result = false;
        for (int num : data) {
            if (num > 0) {
                positive++;
            } else {
                negative--;
            }
            if (negative % 2 != 0) {
                result = true;
            } else if (positive % 2 == 0) {
                result = false;
            }
        }
        return result;
    }
}